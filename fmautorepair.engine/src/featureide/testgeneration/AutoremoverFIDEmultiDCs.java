package featureide.testgeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import testgeneration.OracleFIDE;

public abstract class AutoremoverFIDEmultiDCs extends AlgorithmUsingFIDE {

	protected int desiredNumOfDCs = 3;

	protected AutoremoverFIDEmultiDCs(IFeatureModel fm, OracleFIDE o, int desiredNumOfDCs) {
		super(fm, o);
		this.desiredNumOfDCs = desiredNumOfDCs;
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDEmultiDCs.class);
	private List<ConfigurationWValidity> DCs;
	private int numGeneratedDCs;

	/**
	 * dato il candidato iniziale e l'oracolo, trova il modello piu' conforme
	 * all'oracolo
	 * 
	 * @throws TimeoutException
	 */
	@Override
	public IFeatureModel bestModel() throws UnsupportedModelException, IOException, TimeoutException {
		// take all the mutations
		// FM4Testgeneration fm4tg = new FM4Testgeneration(candidate, false);
		logger.debug("candidate " + candidate);
		Iterator<FMMutation> mutants = getMutants(candidate);
		// insieme delle dc cosrtuite finora
		DCs = new ArrayList<ConfigurationWValidity>();
		numGeneratedDCs = 0;
		while (mutants.hasNext()) {
			// System.err.println("ITERATION");
			// take one
			FMMutation next = mutants.next();
			if (next == null)
				continue; // necessario per errore nel nostro iterator filtered
			IFeatureModel fmP = next.getFirst();
			logger.debug("dcs: " + DCs.size() + DCs.toString());// +" mutants: "
																// +
																// mutants.size());
			logger.debug("mutant " + fmP + " mutation " + next.getSecond());
			// try to kill with existing tests
			boolean removeFM = false;
			for (ConfigurationWValidity d : DCs) {
				if (killed(fmP, d)) {
					// mutants.remove();
					removeFM = true;
					logger.debug("mutant killed by existing tests");
					break;
				}
			}
			// TODO use label instead
			if (removeFM) {
				continue;
			}

			Set<ConfigurationWithHash> newDCs = generateDcs(getCandidate(), fmP, desiredNumOfDCs);
			// equivalent found
			if (newDCs == null) {
				continue;
			}
			numGeneratedDCs += newDCs.size();
			logger.debug("test " + newDCs);
			// Set<ConfigurationWithHash> testsOKonCurrentCandidate = new
			// HashSet<ConfigurationWithHash>();
			// Set<ConfigurationWithHash> testsOKonCurrentMutant = new
			// HashSet<ConfigurationWithHash>();
			List<ConfigurationWValidity> testsOKonCurrentCandidate = new ArrayList<ConfigurationWValidity>();
			List<ConfigurationWValidity> testsOKonCurrentMutant = new ArrayList<ConfigurationWValidity>();
			for (ConfigurationWithHash newDC : newDCs) {
				boolean validity = getOracle().validity(newDC);
				ConfigurationWValidity cv = new ConfigurationWValidity(newDC, validity);
				if (killed(fmP, cv)) {
					// if it kills the mutant, it is ok with the candidate
					testsOKonCurrentCandidate.add(cv);
				} else {
					// the configuration is ok for the mutant
					testsOKonCurrentMutant.add(cv);
				}
				/*
				 * if (killed(fmP, newDC, getOracle())) { //if it kills the
				 * mutant, it is ok with the candidate
				 * testsOKonCurrentCandidate.add(newDC); } else { //the
				 * configuration is ok for the mutant
				 * testsOKonCurrentMutant.add(newDC); }
				 */
			}
			if (testsOKonCurrentMutant.size() > testsOKonCurrentCandidate.size()) {
				// if we select the mutant as new candidate, we add to the test
				// suites the
				// generated configurations that are ok for the mutant
				DCs.addAll(testsOKonCurrentMutant);
				// change candidate and mutants
				setCandidate(fmP);
				logger.debug("changed candidate " + getCandidate());
				mutants = getMutants(candidate);
			} else {
				// if we do not select the mutant as new candidate, we add to
				// the test suites the
				// generated configurations that are ok for the current
				// candidate
				DCs.addAll(testsOKonCurrentCandidate);
			}
		}
		return getCandidate();
	}

	protected abstract Iterator<FMMutation> getMutants(IFeatureModel candidate);

	protected Set<ConfigurationWithHash> generateDcs(IFeatureModel candidate, IFeatureModel fmP, int numDCs)
			throws UnsupportedModelException, IOException, TimeoutException {
		return new DCGeneratorByComparator().generateDCs(candidate, fmP, numDCs);
	}

	@Override
	public int numberOfUsedDCs() {
		return DCs.size();
	}

	@Override
	public int numberOfGeneratedDCs() {
		return numGeneratedDCs;
	}
	
	@Override
	public String getName() {
		return super.getName() + "_" + desiredNumOfDCs;
	}
	
}