package featureide.testgeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import testgeneration.OracleFIDE;

public abstract class AutoremoverFIDE extends AlgorithmUsingFIDE {

	protected AutoremoverFIDE(IFeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}	

	static private Logger logger = Logger.getLogger(AutoremoverFIDE.class);

	// insieme delle dc costruite finora
	List<ConfigurationWValidity> DCs = new ArrayList<>();

	@Override
	public int numberOfUsedDCs() {
		return DCs.size();
	}

	@Override
	public int numberOfGeneratedDCs() {
		return DCs.size();
	}

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
		logger.debug("candidate " + candidate);
		Iterator<FMMutation> mutants = getMutants(candidate);
		//
		while (mutants.hasNext()) {
			// System.err.println("ITERATION");
			// take one
			FMMutation next = mutants.next();
			if (next == null)
				continue; // necessario per errore nel nostro iterator filtered
			IFeatureModel fmP = next.getFirst();
			logger.debug("dcs: " + DCs.size() + DCs.toString());// +" mutants: " +
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
			if (removeFM)
				continue;
			// generate the dc
			Configuration test = generateDc(getCandidate(), fmP);
			//Pair<Configuration, Boolean> DcsAndValidity = new DCGeneratorByComparator().generateDCandValidity(candidate,fmP);
			//Configuration Dcs = DcsAndValidity!=null?DcsAndValidity.getFirst():null; 
			// get validity			
			// equivalent found
			if (test == null) {
				// mutants.remove();
				continue;
			}
			// check that 
			// the dc is an actual distinguishing configuration
			// in the mutation is valid only if it is valid and all the feature in the dcs are contained also in fmP	
			if (this.getClass().desiredAssertionStatus()) {
				try {
					boolean conatinsAllFNames = fmP.getFeatureNames().containsAll(test.getSelectedFeatureNames());
					boolean validDCInMut = new Configuration(test, fmP).isValid() && conatinsAllFNames;
					if (validDCInMut == new Configuration(test, candidate).isValid()) {
						System.err.print("candidate " + candidate);
						System.err.println(new Configuration(test, candidate).isValid());
						System.err.print("mutation  " + fmP);
						System.err.print(" conf val " + new Configuration(test, fmP).isValid());
						System.err.println(" contains " + conatinsAllFNames);
						System.err.println(new ConfigurationWithHash(test));
						throw new RuntimeException();
					}
				}
				catch(Throwable e) {
					assert false: "Error in exception";
				}
			}
			//
			boolean validity = getOracle().validity(test);
			ConfigurationWValidity cv = new ConfigurationWValidity(test, validity);

			//ConfigurationWitHHash tests = new ConfigurationWitHHash(Dcs);
			DCs.add(cv);			
			logger.debug("test " + test);
			if (killed(fmP, cv)) {
			//if (killedWithValidity(tests, DcsAndValidity.getSecond(), getOracle())) {
				logger.debug("mutant wrong");
				// mutants.remove();
			} else {
				// change candidate and mutants
				setCandidate(fmP);
				logger.debug("changed candidate " + getCandidate());
				// fm4tg = new FM4Testgeneration(fmP, false);
				mutants = getMutants(candidate);
			}
		}		
		return getCandidate();
	}

	protected abstract Iterator<FMMutation> getMutants(IFeatureModel candidate);
}