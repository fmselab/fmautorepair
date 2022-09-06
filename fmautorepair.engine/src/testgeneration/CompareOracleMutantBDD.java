package testgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.prop4j.FMToBDD;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.sxfm.SXFMWriter;
import fmautorepair.utils.Utils;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDD.AllSatIterator;
import splar.core.fm.FeatureModelException;
import splar.core.fm.XMLFeatureModel;
import splar.core.fm.configuration.ConfigurationEngineException;
import splar.plugins.configuration.bdd.javabdd.BDDConfigurationEngine;
import splar.plugins.reasoners.bdd.javabdd.FMReasoningWithBDD;

public class CompareOracleMutantBDD {
	
	private static IFeatureModel readModel(String modelPath) throws FileNotFoundException, UnsupportedModelException {
		try {
			return Utils.readModel(modelPath);
		}
		catch(UnsupportedModelException e) {}
		try {
			return Utils.readSPLOTModel(modelPath);
		}
		catch(UnsupportedModelException e) {
			throw e;
		}
	}

	public static Conformance getConformance(OracleFIDE oracle, IFeatureModel mutant) throws TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		if(oracle instanceof OracleFIDEbyFM) {
			return getConformance(((OracleFIDEbyFM) oracle).getFeatureModel(), mutant);
		}
		if(oracle instanceof OracleFidebyCpp) {
			try {
				return getConformance(((OracleFidebyCpp) oracle).getFeatureModel(), mutant);
			} catch (UnsupportedModelException e) {
				e.printStackTrace();
			}
		}
		else {
			throw new Error("I don't know how to compute the conformance for oracles of type " + oracle.getClass().getSimpleName());
		}
		return null;
	}

	public static Conformance getConformance(String oracle, String mutant) throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		return getConformance(readModel(oracle), readModel(mutant));
	}

	public static Conformance getConformance(IFeatureModel oracle, IFeatureModel mutant) throws TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		// assumiamo che il mutant non abbia MAI piu' features dell'oracolo???
		// AG
		assert oracle.getFeatureNames().containsAll(mutant.getFeatureNames());
		assert oracle.getNumberOfFeatures() <= 64;
		long numConfigurations = (long)Math.pow(2, oracle.getNumberOfFeatures() - 1);

		//PA 13/10/2015
		//The mutant and the oracle may have a different number of features
		/*int oracleNumFeatures = oracle.getNumberOfFeatures();
		int mutantNumFeatures = mutant.getNumberOfFeatures();
		long numConfigurations = (long)Math.pow(2, Math.max(oracleNumFeatures, mutantNumFeatures) - 1);*/

		ModelComparator comparator = new ModelComparator(1000000);
		Comparison comparison = comparator.compare(oracle, mutant);
		if(comparison == Comparison.REFACTORING) {
			return new Conformance(numConfigurations, numConfigurations);
		}
		else {
			int confsNotJudgedCorrectly;
			switch(comparison) {
				case GENERALIZATION:
					confsNotJudgedCorrectly = getGeneralizationDifference(oracle, mutant);
					break;
				case SPECIALIZATION:
					confsNotJudgedCorrectly = getSpecializationDifference(oracle, mutant);
					break;
				case ARBITRARY:
					confsNotJudgedCorrectly = getArbitraryEditDifference(oracle, mutant);
					break;
				default:
					throw new Error("Comparison failed! Result = " + comparison.toString());
			}
			/*for(MyConfiguration mc: confsNotJudgedCorrectly) {
				System.out.println(mc);
			}*/
			return new Conformance(numConfigurations, numConfigurations - confsNotJudgedCorrectly);
		}
	}

	public static void main(String[] args) throws UnsupportedModelException, IOException, TimeoutException, FeatureModelException, ConfigurationEngineException {
		/*System.out.println(getConformance("toyExamples/man.xml", "toyExamples/opt.xml"));
		System.out.println(getConformance("toyExamples/opt.xml", "toyExamples/man.xml"));
		System.out.println(getConformance("toyExamples/opt.xml", "toyExamples/opt.xml"));*/
		System.out.println(getConformance("toyExamples/alt4Mutant.xml", "toyExamples/alt4.xml"));
		System.out.println(getConformance("toyExamples/alt4.xml", "toyExamples/alt4Mutant.xml"));
		System.out.println(getConformance("toyExamples/alt4Mutant.xml", "toyExamples/alt4Mutant.xml"));
		/*File[] mutants = new File("mutants_model_20091225_1547989376/depth2/").listFiles();
		for(File mutant: mutants) {
			System.out.println(mutant.getAbsolutePath());
			System.out.println(getConformance("splotmodels_new/model_20091225_1547989376.xml", mutant.getAbsolutePath()));
		}*/		
	}

	public static int getGeneralizationDifference(IFeatureModel fm1, IFeatureModel fm2) throws IOException, FeatureModelException, ConfigurationEngineException {
		return getDifference(fm1, fm2);
	}

	public static int getSpecializationDifference(IFeatureModel fm1, IFeatureModel fm2) throws IOException, FeatureModelException, ConfigurationEngineException {
		return getDifference(fm2, fm1);
	}

	private static int getDifference(IFeatureModel fm1, IFeatureModel fm2) throws IOException, FeatureModelException, ConfigurationEngineException {
		int bdd1 = getBddsCount(fm1);
		int bdd2 = getBddsCount(fm2);
		return (bdd2 - bdd1);
	}

	public static int getArbitraryEditDifference(IFeatureModel fm1, IFeatureModel fm2) throws IOException, FeatureModelException, ConfigurationEngineException {
		return getBddsCountDiff(fm1, fm2);
	}

	public static int getBddsCount(IFeatureModel fm) throws IOException, FeatureModelException, ConfigurationEngineException {
		//BDD bdd = CompareOracleMutantBDD.getBDD(fm);
		FMToBDD f2bdd = new FMToBDD(fm.getFeatureOrderList());
		BDD bdd = f2bdd.nodeToBDD(NodeCreator.createNodes(fm));
		int num = (int)bdd.satCount();
		return num;
	}

	public static BDD getBDD(IFeatureModel fm) throws IOException,
			FeatureModelException, ConfigurationEngineException {
		/* use splar to count the valid configurations */
		SXFMWriter sxfmWriter = new SXFMWriter(fm);
		File temp = File.createTempFile("tempfile", ".temp");
		sxfmWriter.writeToFile(temp);
		splar.core.fm.IFeatureModel IFeatureModel = new XMLFeatureModel(temp.getAbsolutePath(), XMLFeatureModel.USE_VARIABLE_NAME_AS_ID);
		IFeatureModel.loadModel();
		BDDConfigurationEngine confEngine = new BDDConfigurationEngine(temp.getAbsolutePath());
		confEngine.reset();
		FMReasoningWithBDD reasoner = confEngine.getReasoner();
		temp.delete();
		BDD bdd = reasoner.getBDD();
		return bdd;
	}

	public static int getBddsCountDiff(IFeatureModel fm, IFeatureModel fm2) throws IOException, FeatureModelException, ConfigurationEngineException {
		// nuovo modo (AG)
		/*FMToBDD f2bdd = new FMToBDD(fm.getFeatureOrderList());
		BDD bdd = f2bdd.nodeToBDD(NodeCreator.createNodes(fm));
		BDD bdd2 = f2bdd.nodeToBDD(NodeCreator.createNodes(fm2));*/

		//OR as follows??? (PA 13/10/2015)
		//it does not work because of remove
		/*List<String> fmVars = fm.getFeatureOrderList();
		List<String> fm2Vars = fm2.getFeatureOrderList();
		//fm must be the oracle and the mutant must contain
		//all the variables of the oracle
		assert fm2Vars.containsAll(fmVars): "\nfm = " + fm + "\nfmVars = " + fmVars + "\nfm2 = " + fm2 + "\nfm2Vars = " + fm2Vars;
		FMToBDD f2bdd = new FMToBDD(fm2Vars);
		BDD bdd = f2bdd.nodeToBDD(NodeCreator.createNodes(fm));
		BDD bdd2 = f2bdd.nodeToBDD(NodeCreator.createNodes(fm2));*/


		//OR as follows??? (PA 14/10/2015)
		List<String> fmVars = fm.getFeatureOrderList();
		List<String> fm2Vars = fm2.getFeatureOrderList();
		//fm must be the oracle and the mutant must contain
		//all the variables of the oracle
		assert fm2Vars.containsAll(fmVars) || fmVars.containsAll(fm2Vars): "\nfm = " + fm + "\nfmVars = " + fmVars + "\nfm2 = " + fm2 + "\nfm2Vars = " + fm2Vars;
		FMToBDD f2bdd = null;
		if(fm2Vars.containsAll(fmVars)) {
			f2bdd = new FMToBDD(fm2Vars);
		}
		else {
			f2bdd = new FMToBDD(fmVars);
		}
		BDD bdd = f2bdd.nodeToBDD(NodeCreator.createNodes(fm));
		BDD bdd2 = f2bdd.nodeToBDD(NodeCreator.createNodes(fm2));




		/*System.out.println("bdd = " + bdd + "\tsatCount = " + bdd.satCount() + "\tnodeCount = " + bdd.nodeCount() + "\tpathCount = " + bdd.pathCount());
		bdd.printDot();
		printSolutions(bdd);
		System.out.println("bdd2 = " + bdd2 + "\tsatCount = " + bdd2.satCount() + "\tnodeCount = " + bdd2.nodeCount() + "\tpathCount = " + bdd2.pathCount());
		bdd2.printDot();
		printSolutions(bdd2);*/
		
		
		/*BDD bdd = getBDD(fm);
		System.out.println("bdd = " + bdd + "\tsatCount = " + bdd.satCount() + "\tnodeCount = " + bdd.nodeCount() + "\tpathCount = " + bdd.pathCount());
		printSolutions(bdd);
		bdd.printDot();
		System.out.println();
		BDD bdd2 = getBDD(fm2);
		System.out.println("bdd2 = " + bdd2 + "\tsatCount = " + bdd2.satCount() + "\tnodeCount = " + bdd2.nodeCount() + "\tpathCount = " + bdd2.pathCount());
		printSolutions(bdd2);
		bdd2.printDot();
		System.out.println();*/
		
		//
		/*BDD firstBdd = bdd.getFactory().ithVar(bdd.var());
		BDD secondBdd = bdd2.getFactory().ithVar(bdd2.var());
		BDD and = bdd.getFactory().one();*/
		
		
		BDD and = bdd.and(bdd2);
		int diff = (int)((bdd.satCount() - and.satCount()) +
					 (bdd2.satCount() - and.satCount()) );
		/*System.out.println("AND pathCount " + and.pathCount() + " satCount " + and.satCount());
		and.printDot();
		printSolutions(and);
		System.out.println(diff);*/
		return diff;
	}

	private static void printSolutions(BDD bdd) {
		AllSatIterator it = bdd.allsat();
		while(it.hasNext()) {
			System.out.println(Arrays.toString(it.nextSat()));
		}
	}
}