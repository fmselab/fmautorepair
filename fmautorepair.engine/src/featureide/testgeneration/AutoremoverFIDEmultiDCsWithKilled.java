package featureide.testgeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import testgeneration.OracleFIDE;

public abstract class AutoremoverFIDEmultiDCsWithKilled extends AlgorithmUsingFIDE {

	protected int desiredNumOfDCs;

	protected AutoremoverFIDEmultiDCsWithKilled(FeatureModel fm, OracleFIDE o, int n) {
		super(fm, o);
		desiredNumOfDCs = n;
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDEmultiDCsWithKilled.class);

	private List<Configuration> DCsOKcandidate;
	private List<Configuration> DCsKillingCandidate;

	/**
	 * dato il candidato iniziale e l'oracolo, trova il modello piu' conforme
	 * all'oracolo
	 * 
	 * @throws TimeoutException
	 */
	@Override
	public FeatureModel bestModel() throws UnsupportedModelException, IOException, TimeoutException {
		// take alla the mutations
		// FM4Testgeneration fm4tg = new FM4Testgeneration(candidate, false);
		logger.debug("candidate " + candidate);
		Iterator<FMMutation> mutants = getMutants(candidate);

		DCsOKcandidate = new ArrayList<Configuration>();
		DCsKillingCandidate = new ArrayList<Configuration>();
		//
		while (mutants.hasNext()) {
			// take one
			FMMutation next = mutants.next();
			if (next == null)
				continue; // necessario per errore nel nostro iterator filtered
			FeatureModel fmP = next.getFirst();
			logger.debug("dcs: " + DCsOKcandidate.size() + DCsOKcandidate.toString());// +"
																						// mutants:
																						// "
																						// +
			// mutants.size());
			logger.debug("mutant " + fmP + " mutation " + next.getSecond());
			// try to kill with existing tests
			List<Configuration> DCsOKmutant = new ArrayList<Configuration>();
			List<Configuration> DCsKillingMutant = new ArrayList<Configuration>();
			for (Configuration dc : DCsOKcandidate) {
				if (killed(fmP, dc, getOracle())) {
					DCsKillingMutant.add(dc);
				} else {
					DCsOKmutant.add(dc);
				}
			}
			for (Configuration dc : DCsKillingCandidate) {
				if (killed(fmP, dc, getOracle())) {
					DCsKillingMutant.add(dc);
				} else {
					DCsOKmutant.add(dc);
				}
			}
			assert DCsOKmutant.size() + DCsKillingMutant.size() == DCsOKcandidate.size() + DCsKillingCandidate.size();
			if (DCsOKmutant.size() < DCsOKcandidate.size()) {
				continue;
			}

			Set<ConfigurationWithHash> newDCs = generateDcs(getCandidate(), fmP, desiredNumOfDCs);
			// equivalent found
			if (newDCs == null) {
				continue;
			}
			logger.debug("test " + newDCs);
			for (ConfigurationWithHash newDC : newDCs) {
				if (killed(fmP, newDC, getOracle())) {
					// if it kills the mutant, it is ok with the candidate
					DCsOKcandidate.add(newDC);
					DCsKillingMutant.add(newDC);
				} else {
					// the configuration is ok for the mutant
					DCsOKmutant.add(newDC);
					DCsKillingCandidate.add(newDC);
				}
			}
			assert DCsOKmutant.size() + DCsKillingMutant.size() == DCsOKcandidate.size() + DCsKillingCandidate.size();
			if (DCsOKmutant.size() > DCsOKcandidate.size()) {
				// change candidate and mutants
				setCandidate(fmP);
				DCsOKcandidate = DCsOKmutant;
				DCsKillingCandidate = DCsKillingMutant;

				logger.debug("changed candidate " + getCandidate());
				mutants = getMutants(candidate);
			}
		}
		return getCandidate();
	}

	protected abstract Iterator<FMMutation> getMutants(FeatureModel candidate);

	protected Set<ConfigurationWithHash> generateDcs(FeatureModel candidate, FeatureModel fmP, int numDCs)
			throws UnsupportedModelException, IOException, TimeoutException {
		return new DCGeneratorByComparator().generateDCs(candidate, fmP, numDCs);
	}

	@Override
	public int numberOfUsedDCs() {
		return numberOfGeneratedDCs();
	}

	@Override
	public int numberOfGeneratedDCs() {
		return DCsOKcandidate.size() + DCsKillingCandidate.size();
	}

	@Override
	public String getName() {
		return super.getName() + "_" + desiredNumOfDCs;
	}

}