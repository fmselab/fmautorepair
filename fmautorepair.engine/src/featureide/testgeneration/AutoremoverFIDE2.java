package featureide.testgeneration;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutationProcess;
import testgeneration.OracleFIDE;

public class AutoremoverFIDE2 extends AlgorithmUsingFIDE {

	public static AutoremoverFIDEFactory factory =  new AutoremoverFIDEFactory(){
		@Override
		public AutoremoverFIDE2 getAutoremover(FeatureModel fm, OracleFIDE o){
			return new AutoremoverFIDE2(fm,o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDE2.class.getSimpleName();
		}
	};

	public AutoremoverFIDE2(FeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}

	// insieme delle dc costruite finora
	Set<Configuration> DC = new HashSet<Configuration>();

	@Override
	public int numberOfUsedDCs() {
		return numberOfGeneratedDCs();
	}

	@Override
	public int numberOfGeneratedDCs() {
		return DC.size();
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDE2.class);

	// E' RISULTATO ESSERE UGUALE AL PRIMO ALGORITMO
	/**
	 * dato il candidato iniziale e l'oracolo, trova il modello piu' conforme
	 * all'oracolo
	 * 
	 * @throws TimeoutException
	 */

	private int fitness(FeatureModel fmP, Set<Configuration> dC, OracleFIDE o)
			throws UnsupportedModelException, IOException {
		int fitness = 0;
		for (Configuration dc : dC) {

			if (!killed(fmP, dc, o))
				fitness++;

		}
		return fitness;
	}

	@Override
	public FeatureModel bestModel() throws UnsupportedModelException, IOException, TimeoutException {
		// take alla the mutations
		// FM4Testgeneration fm4tg = new FM4Testgeneration(candidate, false);
		logger.debug("candidate " + getCandidate());
		Iterator<FMMutation> mutants = FMMutationProcess.getAllMutants(getCandidate());
		int fitnessCandidate = 0;
		while (mutants.hasNext()) {
			// take one
			FMMutation next = mutants.next();
			if (next == null)
				continue; // necessario per errore nel nostro iterator filtered
			FeatureModel fmP = next.getFirst();
			logger.debug("dcs: " + DC.size());// +" mutants: " + mutants.size());
			logger.debug("mutant " + fmP + " mutation " + next.getSecond());
			// try to kill with existing tests
			int fitnessFmp = fitness(fmP, DC, getOracle());
			if (fitnessFmp < fitnessCandidate) {
				continue;
			} else {
				// generate the dc
				Configuration tests = generateDc(getCandidate(), fmP);
				if ((tests == null))
					continue;
				else {
					DC.add(tests);
					if (!killed(getCandidate(), tests, getOracle()))
						fitnessCandidate++;
					else
						fitnessFmp++;
					if (fitnessFmp <= fitnessCandidate) {
						logger.debug("mutant wrong");
						continue;
					} else {
						// change candidate and mutants
						setCandidate(fmP);
						logger.debug("changed candidate " + getCandidate());
						mutants = FMMutationProcess.getAllMutants(getCandidate());
						fitnessCandidate = fitnessFmp;
						
					}
				}
			}
		}
		return getCandidate();
	}

}
