package featureide.testgeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.prop4j.ConfEvaluator;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import testgeneration.OracleFIDE;

/**
 * multiple candidates
 * 
 * @author garganti
 *
 */
public class AutoremoverFIDEMultipleCandidates extends AlgorithmUsingFIDE {

	public static AutoremoverFIDEFactory factory =  new AutoremoverFIDEFactory(){
		@Override
		public AutoremoverFIDEMultipleCandidates getAutoremover(IFeatureModel fm, OracleFIDE o){
			return new AutoremoverFIDEMultipleCandidates(fm,o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDEMultipleCandidates.class.getSimpleName();
		}
	};	

	protected AutoremoverFIDEMultipleCandidates(IFeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDEMultipleCandidates.class);

	// insieme delle dc costruite finora
	List<ConfigurationWValidity> DC = new ArrayList<>();

	// all these candidates are equally good (the are eual to the oracle the same numebr of times)
	// but thery are NOT equivalent (if a mutation is equivalent is not added)
	List<IFeatureModel> candidates = new ArrayList<>();
	int scoreCandidates = 0; // number of dcs in which all the candidates concide con l'oracolo 
	
	@Override
	public int numberOfUsedDCs() {
		return DC.size();
	}

	@Override
	public int numberOfGeneratedDCs() {
		return DC.size();
	}

	/**
	 * dato il candidato iniziale e l'oracolo, trova il modello piu' conforme
	 * all'oracolo
	 * 
	 * @throws TimeoutException
	 */
	@Override
	public IFeatureModel bestModel() throws UnsupportedModelException, IOException, TimeoutException {
		for(;;){
			logger.debug("candidate " + candidates);
			//
			// PHASE 1
			// generate all the dc for all the mutants
			// take all the mutations
			Iterator<FMMutation> mutants = getMutantsFromCandidates();
			checkMutant:
			while (mutants.hasNext()) {
				// System.err.println("ITERATION");
				// take one
				FMMutation next = mutants.next();
				if (next == null)
					continue; // necessario per errore nel nostro iterator
								// filtered
				IFeatureModel fmP = next.getFirst();
				//logger.debug("dcs: " + dcs.size()+ dcs.toString());// +" mutants:
																	// " +
																	// mutants.size());
				logger.debug("mutant " + fmP + " mutation " + next.getSecond());
				// check if a dc exists already for this one
				// se esiste un canditato per cui 
				boolean skipFM = false;
				for (int i = 0; i < DC.size(); i++) {
					ConfigurationWValidity d = DC.get(i);
					ConfEvaluator ce = new ConfEvaluator(d.getFirst());
					Boolean validForModel = ce.isValidForModel(fmP);
					for (IFeatureModel c: candidates){
						// if it is a distinguishing configuration
						if (validForModel != ce.isValidForModel(c)) {
							logger.debug("mutant is already distinguished by a configuration by an oracle");
							continue checkMutant;
						}
					}
				}
				// se arrivo qui non c'� nessuna dcs che lo distingue (ha validt� uguale a tutti i candidati sulle dcs geneate)
				// generate the dc for one canidates
				// attenzione potrebbe essere equivalente ad un altro candidato.. non av bene	
				Configuration test = null;
				for (IFeatureModel c: candidates){				
					test = generateDc(c, fmP);
					// non equivalent found
					if (test != null) break; 
					// else go to the next candidate
				}
				if (test == null) {
					logger.debug("equivalent found wrt all the candidates");
					continue;
				}
				logger.debug("dc found, with selected features: " + test.getSelectedFeatureNames());
				//
				boolean validity = getOracle().validity(test);
				ConfigurationWValidity cv = new ConfigurationWValidity(test, validity);
				DC.add(cv);
			}
			// phase 2:
			// controlla se questa 
			int scoreToBeat = 0;
			for (int i = 0; i < DC.size(); i++) {
				ConfigurationWValidity d = DC.get(i);
				//if (dcValwrtCandidate.get(i) == d.getSecond())
					scoreToBeat++;
			}
			// consider all the mutation and take the best
			// take all the mutations
			mutants = getMutants(candidate);
			boolean betterFound = false;
			while (mutants.hasNext()) {
				IFeatureModel fm = mutants.next().getFirst();
				int score = 0;
				for (ConfigurationWValidity d : DC) {
					ConfEvaluator ce = new ConfEvaluator(d.getFirst());
					if (ce.isValidForModel(fm) == d.getSecond())
						score++;
				}
				if (score > scoreToBeat) {
					scoreToBeat = score;
					candidate = fm;
					betterFound = true;
				}
			}
			if (!betterFound) break;
			// the candidate has changed !
			// change dcValwrtCandidate
			logger.debug("*** candidate changed recomputing dcValwrtCandidate");
			for (int i = 0; i < DC.size(); i++) {
				ConfEvaluator ce = new ConfEvaluator(DC.get(i).getFirst());
				//dcValwrtCandidate.set(i, ce.isValidForModel(candidate));
			}
		} 
		return getCandidate();
	}
	
	private Random random = new Random();
	
	private Iterator<FMMutation> getMutantsFromCandidates() {
		// take only for the first one
		return FMMutationProcess.getAllMutantsRndOrderFOM(candidates.get(random.nextInt(candidates.size())));
	}

	protected Iterator<FMMutation> getMutants(IFeatureModel candidate){
		assert false;
		return FMMutationProcess.getAllMutantsRndOrderFOM(candidate);
	}
}
