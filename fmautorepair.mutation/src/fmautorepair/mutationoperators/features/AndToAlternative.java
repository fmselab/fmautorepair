package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform AND to alternative */
public class AndToAlternative extends FeatureMutator {

	private static Logger logger = Logger.getLogger(AndToAlternative.class);

	public static FMMutator instance = new AndToAlternative();

	@Override
	String mutate(FeatureModel fm, Feature tobemutated) {
		// if has more than one child or one child but not mandatory

		logger.info("mutating tobemutated " + tobemutated.getName()
				+ " from AND to alternative");
		tobemutated.changeToAlternative();
		return (tobemutated.getName() + " from AND TO ALT");

	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		int size = tobemutated.getChildren().size();
		return (tobemutated.isAnd() && size >0);
	}
}
