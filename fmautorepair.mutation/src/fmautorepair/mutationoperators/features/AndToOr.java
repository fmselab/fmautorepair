package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform And to or */
public class AndToOr extends FeatureMutator {

	private static Logger logger = Logger.getLogger(AndToOr.class.getName());

	public static FMMutator instance = new AndToOr();

	@Override
	String mutate(FeatureModel fm, Feature tobemutated) {
		// if has more than one child or one child but optional
		tobemutated.changeToOr();
		logger.info("mutating feature " + tobemutated.getName()	+ " from AND TO OR");
		return (tobemutated.getName() + " from AND TO OR");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		int size = tobemutated.getChildren().size();		
		return (tobemutated.isAnd() && size >0);
	}
}
