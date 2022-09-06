package testgeneration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.utils.Utils;

public class CompareOracleMutant {
	
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

	public static Conformance getAdequacy(String oracle, String mutant) throws FileNotFoundException, UnsupportedModelException, TimeoutException {
		return getAdequacy(readModel(oracle), readModel(mutant));
	}

	public static Conformance getAdequacy(IFeatureModel oracle, IFeatureModel mutant) throws TimeoutException {
		// assumiamo che il mutant non abbia MAI piu' features dell'oracolo!!!
		// AG
		assert oracle.getFeatureNames().containsAll(mutant.getFeatureNames());
		//
		int numConfigurations = (int)Math.pow(2, oracle.getNumberOfFeatures() - 1);
		ModelComparator comparator = new ModelComparator(1000000);
		Comparison comparison = comparator.compare(oracle, mutant);
		if(comparison == Comparison.REFACTORING) {
			return new Conformance(numConfigurations, numConfigurations);
		}
		else {
			Set<MyConfiguration> confsNotJudgedCorrectly;
			switch(comparison) {
				case GENERALIZATION:
					confsNotJudgedCorrectly = getConfNotJudgedCorrectly(comparator, true);
					break;
				case SPECIALIZATION:
					confsNotJudgedCorrectly = getConfNotJudgedCorrectly(comparator, false);
					break;
				case ARBITRARY:
					confsNotJudgedCorrectly = getConfNotJudgedCorrectly(comparator, true);
					confsNotJudgedCorrectly.addAll(getConfNotJudgedCorrectly(comparator, false));
					break;
				default:
					throw new Error("Comparison failed! Result = " + comparison.toString());
			}
			/*for(MyConfiguration mc: confsNotJudgedCorrectly) {
				System.out.println(mc);
			}*/
			return new Conformance(numConfigurations, numConfigurations - confsNotJudgedCorrectly.size());
		}
	}

	private static Set<MyConfiguration> getConfNotJudgedCorrectly(ModelComparator comparator, boolean added) throws TimeoutException {
		Set<MyConfiguration> confsNotJudgedCorrectly = new HashSet<MyConfiguration>();
		Configuration c;
		while((c = comparator.calculateExample(added)) != null) {
			//System.out.println(c);
			confsNotJudgedCorrectly.add(new MyConfiguration(c));
		}
		return confsNotJudgedCorrectly;
	}

	public static void main(String[] args) throws UnsupportedModelException, IOException, TimeoutException {
		/*System.out.println(getAdequacy("toyExamples/man.xml", "toyExamples/opt.xml"));
		System.out.println(getAdequacy("toyExamples/opt.xml", "toyExamples/man.xml"));
		System.out.println(getAdequacy("toyExamples/opt.xml", "toyExamples/opt.xml"));*/
		System.out.println(getAdequacy("toyExamples/alt4Mutant.xml", "toyExamples/alt4.xml"));
		System.out.println(getAdequacy("toyExamples/alt4Mutant.xml", "toyExamples/alt4Mutant.xml"));
		/*File[] mutants = new File("mutants_model_20091225_1547989376/depth2/").listFiles();
		for(File mutant: mutants) {
			System.out.println(mutant.getAbsolutePath());
			System.out.println(getAdequacy("splotmodels_new/model_20091225_1547989376.xml", mutant.getAbsolutePath()));
		}*/		
	}
}



class MyConfiguration {
	private Configuration conf;

	public MyConfiguration(Configuration c) {
		this.conf = c;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyConfiguration) {
			Configuration conf2 = ((MyConfiguration)obj).conf;
			List<Feature> selectedFeatures = conf.getSelectedFeatures();
			List<Feature> selectedFeatures2 = conf2.getSelectedFeatures();
			if(selectedFeatures.size() == selectedFeatures2.size()) {
firstLoop:		for(Feature f: selectedFeatures) {
					if(!selectedFeatures2.contains(f)) {
						return false;
					}
					/*for(Feature f2: selectedFeatures2) {
						if(f2.getName().equals(f.getName())) {
							continue firstLoop;
						}
					}
					return false;*/
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public String toString() {
		return conf.toString();
	}
}