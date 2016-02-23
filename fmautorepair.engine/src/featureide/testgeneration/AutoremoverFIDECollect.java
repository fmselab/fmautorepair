package featureide.testgeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.prop4j.ConfEvaluator;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import testgeneration.OracleFIDE;

/**
 * change the candidate only after having generated all the dc for all the
 * mutants
 * 
 * @author garganti
 *
 */
public class AutoremoverFIDECollect extends AlgorithmUsingFIDE {

	public static AutoremoverFIDEFactory factory =  new AutoremoverFIDEFactory(){
		@Override
		public AutoremoverFIDECollect getAutoremover(FeatureModel fm, OracleFIDE o){
			return new AutoremoverFIDECollect(fm,o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDECollect.class.getSimpleName();
		}
	};	

	/**
	 * Instantiates a new autoremover fide collect.
	 *
	 * @param fm the feature model to start with
	 * @param o the oracle
	 */
	protected AutoremoverFIDECollect(FeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDECollect.class);

	// insieme delle dc cosrtuite finora
	List<ConfigurationWValidity> dcs = new ArrayList<>();
	// insieme delle validitï¿½ del candidato per evitare di controllare due volte
	List<Boolean> dcValwrtCandidate = new ArrayList<>();
	// numero di Dc per il candidato è conforme con l'oracolo
	int scoreCandidate = 0; 

	@Override
	public int numberOfUsedDCs() {
		return dcs.size();
	}

	@Override
	public int numberOfGeneratedDCs() {
		return dcs.size();
	}

	/**
	 * dato il candidato iniziale e l'oracolo, trova il modello piu' conforme
	 * all'oracolo
	 * 
	 * @throws TimeoutException
	 */
	@Override
	public FeatureModel bestModel() throws UnsupportedModelException, IOException, TimeoutException {
		for(;;){
			logger.debug("candidate " + candidate);
			//
			// PHASE 1
			// generate all the dc for all the mutants
			// take all the mutations
			Iterator<FMMutation> mutants = getMutants(candidate);
			while (mutants.hasNext()) {
				// System.err.println("ITERATION");
				// take one
				FMMutation next = mutants.next();
				if (next == null)
					continue; // necessario per errore nel nostro iterator
								// filtered
				FeatureModel fmP = next.getFirst();
				//logger.debug("dcs: " + dcs.size()+ dcs.toString());// +" mutants:
																	// " +
																	// mutants.size());
				logger.debug("mutant " + fmP + " mutation " + next.getSecond());
				// check if a dc exists already for this one
				boolean skipFM = false;
				for (int i = 0; i < dcs.size(); i++) {
					ConfigurationWValidity d = dcs.get(i);
					ConfEvaluator ce = new ConfEvaluator(d.getFirst());
					// if it is a distinguishing configuration
					if (ce.isValidForModel(fmP) != dcValwrtCandidate.get(i)) {
						skipFM = true;
						logger.debug("mutant is already distinguished by a configuration");
						break;
					}
				}
				// TODO use label instead
				if (skipFM)
					continue;
				// generate the dc
				Configuration test = generateDc(getCandidate(), fmP);
				// Pair<Configuration, Boolean> DcsAndValidity = new
				// DCGeneratorByComparator().generateDCandValidity(candidate,fmP);
				// Configuration Dcs =
				// DcsAndValidity!=null?DcsAndValidity.getFirst():null;
				// get validity
				// equivalent found
				if (test == null) {
					// mutants.remove();
					logger.debug("equivalent found");
					continue;
				}
				logger.debug("dc found, with selected features: " + test.getSelectedFeatureNames());
				//
				ConfEvaluator ev = new ConfEvaluator(test);
				boolean validity = getOracle().validity(test);
				ConfigurationWValidity cv = new ConfigurationWValidity(test, validity);
				dcs.add(cv);
				Boolean validForCandidate = ev.isValidForModel(candidate);
				dcValwrtCandidate.add(validForCandidate);
				// basta tenere lo score del candidato e incrementarlo se
				if (validForCandidate == validity){
					scoreCandidate++;
				}
			}
			// phase 2:
			// take the score to beat ad the score of the candidate
			// consider all the mutation and take the best
			// take all the mutations
			mutants = getMutants(candidate);
			boolean betterFound = false;
			while (mutants.hasNext()) {
				FeatureModel fm = mutants.next().getFirst();
				int score = 0;
				for (ConfigurationWValidity d : dcs) {
					ConfEvaluator ce = new ConfEvaluator(d.getFirst());
					if (ce.isValidForModel(fm) == d.getSecond())
						score++;
				}
				if (score > scoreCandidate) {
					scoreCandidate = score;
					candidate = fm;
					betterFound = true;
				}
			}
			// no more improvements, exit
			if (!betterFound) break;
			// the candidate has changed !
			// change dcValwrtCandidate
			logger.debug("*** candidate changed recomputing dcValwrtCandidate");
			for (int i = 0; i < dcs.size(); i++) {
				ConfEvaluator ce = new ConfEvaluator(dcs.get(i).getFirst());
				dcValwrtCandidate.set(i, ce.isValidForModel(candidate));
			}
		} 
		return getCandidate();
	}

	protected Iterator<FMMutation> getMutants(FeatureModel candidate){
		return FMMutationProcess.getAllMutantsRndOrderFOM(candidate);
	}
}
