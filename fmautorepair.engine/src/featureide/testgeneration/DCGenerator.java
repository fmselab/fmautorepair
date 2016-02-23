package featureide.testgeneration;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.prop4j.Equals;
import org.prop4j.Node;
import org.prop4j.Not;
import org.prop4j.SatSolver;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.ConfigurationReader;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.utils.Pair;

// generate a 
abstract class DCGenerator {

	abstract Configuration generateDC(FeatureModel f, FeatureModel fmP) throws UnsupportedModelException, IOException, TimeoutException;

	abstract Set<ConfigurationWithHash> generateDCs(FeatureModel f, FeatureModel fmP, int numDCs)  throws TimeoutException;
	

	abstract Pair<Configuration, Boolean> generateDCandValidity(FeatureModel f, FeatureModel fmP) throws TimeoutException;
	
}

// using the comparator to generate a distinguishing configuration
class DCGeneratorByComparator extends DCGenerator {
	private static Random rnd = new Random();
	//private Configuration conf;

	@Override
	Configuration generateDC(FeatureModel f, FeatureModel fmP)
			throws UnsupportedModelException, IOException, TimeoutException {
		ModelComparator comparator = new ModelComparator(1000000);
		Comparison comparison = comparator.compare(f, fmP);
		if (comparison.equals(Comparison.REFACTORING)) {
			return null;
		}
		if (comparison.equals(Comparison.SPECIALIZATION)) {
			return comparator.calculateExample(false);
		}
		if (comparison.equals(Comparison.GENERALIZATION)) {
			return comparator.calculateExample(true);
		}
		if (comparison.equals(Comparison.ARBITRARY)) {
			return comparator.calculateExample(rnd.nextBoolean());
		}
		assert false;
		return null;
	}

	@Override
	Set<ConfigurationWithHash> generateDCs(FeatureModel f, FeatureModel fmP, int numDCs) throws TimeoutException {
		ModelComparator comparator = new ModelComparator(1000000);
		Comparison comparison = comparator.compare(f, fmP);
		if (comparison.equals(Comparison.REFACTORING)) {
			return null;
		}
		Set<ConfigurationWithHash> dcs = new HashSet<ConfigurationWithHash>();
		while(numDCs > 0) {
			Configuration dc = null;
			if (comparison.equals(Comparison.SPECIALIZATION)) {
				dc = comparator.calculateExample(false);
			}
			if (comparison.equals(Comparison.GENERALIZATION)) {
				dc = comparator.calculateExample(true);
			}
			if (comparison.equals(Comparison.ARBITRARY)) {
				dc = comparator.calculateExample(rnd.nextBoolean());
			}
			if(dc != null) {
				ConfigurationWithHash dcWithHash = new ConfigurationWithHash(dc);
				/*if(dcs.add(dcWithHash)) {
					numDCs--;
				}
				else {
					System.err.println("GENERATING EQUAL DCs");
				}*/
				if(!dcs.add(dcWithHash)) {
					System.err.println("GENERATING EQUAL DCs");
				}
				numDCs--;
			}
			else {
				break;
			}
		}
		assert dcs.size() > 0: "dcs.size() = " + dcs.size();
		return dcs;
	}

	/* 
	 * @return the configuration and a boolean saying whether the configuration is valid over the mutant
	 */
	@Override
	Pair<Configuration, Boolean> generateDCandValidity(FeatureModel f, FeatureModel fmP) throws TimeoutException {
		ModelComparator comparator = new ModelComparator(1000000);
		Comparison comparison = comparator.compare(f, fmP);
		if (comparison.equals(Comparison.REFACTORING)) {
			return null;
		}
		boolean selectFromMutant = false;
		if (comparison.equals(Comparison.SPECIALIZATION)) {
			selectFromMutant = false;
		}
		if (comparison.equals(Comparison.GENERALIZATION)) {
			selectFromMutant = true;
		}
		if (comparison.equals(Comparison.ARBITRARY)) {
			selectFromMutant = rnd.nextBoolean();
		}
		return new Pair<Configuration, Boolean>(comparator.calculateExample(selectFromMutant), selectFromMutant);
	}

	
}


//using the SAT solver to generate a distinguishing configuration
// ATTENZIONE NON FUNZIONA
// IDEA: usare dirattamente SAT solver senza passare da comparator 
// ma e' molto piu' lento e non so se funziona 11 sett 15 AG
class DCGeneratorBySAT extends DCGenerator {

	
	@Override
	Configuration generateDC(FeatureModel fm, FeatureModel fmP)
			throws UnsupportedModelException, IOException, TimeoutException {
		HashMap<Object, Node> oldMap = NodeCreator.calculateReplacingMap(fm);
		HashMap<Object, Node> newMap = NodeCreator.calculateReplacingMap(fmP);
		optimizeReplacingMaps(oldMap, newMap);

		Node oldRoot = NodeCreator.createNodes(fm, oldMap);
		Node newRoot = NodeCreator.createNodes(fmP, newMap);
		Node xor = new Not(new Equals(oldRoot,newRoot));
		//Node xor = new Or(new And(fnode, new Not(fmNode)),new And(new Not(fnode), fmNode));
		SatSolver exampleSolver = new SatSolver(xor, 10000);
		String solution = exampleSolver.getSolution();
		if (solution == null) {
			return null;
		}
		// convert solution to configuration 
		Configuration configuration = new Configuration(fm, false);
		ConfigurationReader reader = new ConfigurationReader(configuration);
		reader.readFromString(solution);
		return configuration;
	}
	
	private void optimizeReplacingMaps(HashMap<Object, Node> oldMap, HashMap<Object, Node> newMap) {
		List<Object> toBeRemoved = new LinkedList<Object>();
		for (Entry<Object, Node> entry : oldMap.entrySet()) {
			Object var = entry.getKey();
			if (newMap.containsKey(var)) {
				Node oldRepl = entry.getValue();
				Node newRepl = newMap.get(var);
				if (oldRepl != null && oldRepl.equals(newRepl))
					toBeRemoved.add(var);
			}
		}
		for (Object var : toBeRemoved) {
			oldMap.remove(var);
			newMap.remove(var);
		}
	}

	@Override
	Pair<Configuration, Boolean> generateDCandValidity(FeatureModel f, FeatureModel fmP) throws TimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Set<ConfigurationWithHash> generateDCs(FeatureModel f, FeatureModel fmP, int numDCs) {
		// TODO Auto-generated method stub
		return null;
	}

	

}

class DCGeneratorByComparatorIncremental {
	private static Random rnd = new Random();
	private ModelComparator comparator;
	private Comparison comparison;

	DCGeneratorByComparatorIncremental(FeatureModel f, FeatureModel fmP) {
		comparator = new ModelComparator(1000000);
		comparison = comparator.compare(f, fmP);
	}

	Configuration generateNextDC() throws TimeoutException {
		switch (comparison) {
			case SPECIALIZATION:
				return comparator.calculateExample(false);
			case GENERALIZATION:
				return comparator.calculateExample(true);
			case ARBITRARY:
				return comparator.calculateExample(rnd.nextBoolean());
			default:
				return null;
		}
	}

	Set<ConfigurationWithHash> generateDCs(int numDesiredDCs) throws TimeoutException {
		Set<ConfigurationWithHash> dcs = new HashSet<ConfigurationWithHash>(); 
		if(comparison != Comparison.REFACTORING) {
			Configuration currDcs = null;
			do {
				currDcs = generateNextDC();
				numDesiredDCs--;
				if(currDcs != null) {
					dcs.add(new ConfigurationWithHash(currDcs));
				}
			}
			while(numDesiredDCs > 0 && currDcs != null);
		}
		return dcs;
	}

	 public Comparison getComparison() {
		return comparison;
	}
}