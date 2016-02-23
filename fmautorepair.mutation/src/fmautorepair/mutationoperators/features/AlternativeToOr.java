package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform alternative to or */
public class AlternativeToOr extends FeatureMutator {

	private static Logger logger = Logger.getLogger(AlternativeToOr.class);

	public static FMMutator instance = new AlternativeToOr();

	@Override
	String mutate(FeatureModel fm, Feature feature) {
		feature.changeToOr();
		assert feature.isOr();
		logger.info("mutating feature " + feature.getName() + " from ALT TO OR");
		logger.debug("mmm" + fm.toString());
		return (feature.getName() + " from ALT TO OR");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		// alternative, but more than one child
		// with one child it is equivalent already to OR - avoid equivalent
		// mutants
		return (tobemutated.isAlternative() && tobemutated.getChildren().size()>0);
	}

}
