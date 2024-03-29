package featureide.testgeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.prop4j.Node;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import testgeneration.OracleFIDE;

public class EqAutoFIDE extends AlgorithmUsingFIDE {

	
	public static AutoremoverFIDEFactory factory =  new AutoremoverFIDEFactory(){
		@Override
		public EqAutoFIDE getAutoremover(IFeatureModel fm, OracleFIDE o){
			return new EqAutoFIDE(fm,o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDEFactory.class.getSimpleName();
		}
	};


	@Override
	public int numberOfUsedDCs() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int numberOfGeneratedDCs() {
		// TODO Auto-generated method stub
		return 0;
	}

	public EqAutoFIDE(IFeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}


	static private Logger logger = Logger.getLogger(EqAutoFIDE.class);

	/**
	 * dato il candidato iniziale e l'oracolo, trova il modello piu' conforme
	 * all'oracolo
	 * 
	 * @throws TimeoutException
	 */
	@Override
	public IFeatureModel bestModel() throws UnsupportedModelException, IOException, TimeoutException {
		// take alla the mutations
		// FM4Testgeneration fm4tg = new FM4Testgeneration(candidate, false);
		logger.debug("candidate " + getCandidate());
		Iterator<FMMutation> mutants = FMMutationProcess.getAllMutants(getCandidate());
		List<FMMutation> Eqmutants = new ArrayList<FMMutation>();
		// insieme delle dc cosrtuite finora
		Set<ConfigurationWithHash> dc = new HashSet<ConfigurationWithHash>();
		IFeatureModel original = getCandidate().deepClone();
		while (mutants.hasNext()) {
			// System.err.println("ITERATION");
			// take one
			FMMutation next = mutants.next();
			if (next == null)
				continue; // necessario per errore nel nostro iterator filtered
			IFeatureModel fmP = next.getFirst();
			logger.debug("dcs: " + dc.size());// +" mutants: " + mutants.size());
			logger.debug("mutant " + fmP + " mutation " + next.getSecond());
			// try to kill with existing tests
			boolean removeFM = false;
			for (Configuration d : dc) {
				if (killed(fmP, d, getOracle())) {
					// mutants.remove();
					removeFM = true;
					logger.debug("mutant killed by existing tests");
					break;
				}
			}
			// TODO use label instead
			if (removeFM)
				continue;
			// generate the dc
			Configuration conf = generateDc(getCandidate(), fmP);
			// equivalent found
			ConfigurationWithHash tests =null;
			if (conf !=null)
				tests= new ConfigurationWithHash(conf);
			if (tests == null) {
				Eqmutants.add(next);
				continue;
			}
			dc.add(tests);
			if (killed(fmP, tests, getOracle())) {
				logger.debug("mutant wrong");
				// mutants.remove();
			} else {
				// change candidate and mutants
				setCandidate(fmP);
				logger.debug("changed candidate " + getCandidate());
				// fm4tg = new FM4Testgeneration(fmP, false);
				mutants = FMMutationProcess.getAllMutants(getCandidate());
			}

		}
		Node originalONE = NodeCreator.createNodes(original, false);
		Node bestONE = NodeCreator.createNodes(getCandidate(), false);
		if (originalONE.equals(bestONE)) {
			Random rnd = new Random();
			this.setCandidate(Eqmutants.get(rnd.nextInt(Eqmutants.size() - 1)).getFirst());
			return bestModel();
		} else
			return getCandidate();

	}

}
