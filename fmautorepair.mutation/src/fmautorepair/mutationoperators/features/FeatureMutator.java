package fmautorepair.mutationoperators.features;

import java.util.Iterator;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.utils.Filter;
import fmautorepair.utils.FilteredIterator;

/**
 * given a feature model, it mutates it
 * 
 * @author garganti
 *
 */
abstract class FeatureMutator extends FMMutator{
	
	private static Logger logger = Logger.getLogger(FeatureMutator.class);
	
	/**
	 * 
	 * @param fm
	 *            original model
	 * @return the list of mutated models
	 */
	@Override
	public final Iterator<FMMutation> mutate(final FeatureModel fm) {
		// filter the feature the can be mutated (by name)
		Filter<String> filterF = new Filter<String>() {			
			@Override
			public boolean matches(String featureName) {
				Feature tobemutated = fm.getFeature(featureName);
				// do not mutate the root
				if (tobemutated == fm.getRoot()) return false;
				return isMutable(fm, tobemutated);
			}
		};
		// get all the names
		final Iterator<String> featureNames = new FilteredIterator<String>(fm.getFeatureNames().iterator(), filterF);
		//
		final Class<? extends FeatureMutator> mutationClazz = this.getClass();
		//
		return new Iterator<FMMutation>() {			
			@Override
			public FMMutation next() {
				String featureName = featureNames.next();
				// build a copy (deep) of the model to be mutated
				FeatureModel fm2 = fm.deepClone();
				// get the same feature in the model
				assert fm2.getFeatureNames().contains(featureName);
				Feature tobemutated = fm2.getFeature(featureName);
				// mutate the cloned model
				String result = mutate(fm2, tobemutated);
				assert result != null;
				// System.out.println(fm2.getRoot().isOr());
				// System.out.println(fm2.toString());
				// add some description or the mutation in the model
				fm2.addComment("mutation " + result);				
				// 
				return new FMMutation(fm2, mutationClazz, result);
			}
			@Override
			public boolean hasNext() {
				return featureNames.hasNext();				
			}
		};
	}

	abstract boolean isMutable(FeatureModel fm, Feature tobemutated);

	/**
	 * 
	 * @param fm
	 *            feature model to be mutated (already copied - no need to be copied again)
	 * @param tobemutated
	 *            the feature to be mutated
	 * @return the name of the mutation (null if)
	 */
	abstract String mutate(FeatureModel fm, Feature tobemutated);

}
