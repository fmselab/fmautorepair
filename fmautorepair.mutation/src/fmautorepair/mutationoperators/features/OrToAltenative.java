package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform alternative to or */
public class OrToAltenative extends FeatureMutator {

	private static Logger logger = Logger.getLogger(OrToAltenative.class
			.getName());

	public static FMMutator instance = new OrToAltenative();

	@Override
	String mutate(FeatureModel fm, Feature feature) {
		assert feature.isOr();
		feature.changeToAlternative();
		logger.info("mutating feature " + feature.getName()
				+ " from OR to Alternative");
		return (feature.getName() + " from OR TO ALTERNATIVE");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		// accettiamo solo con piu' di un figlio
		return (tobemutated.isOr() && tobemutated.getChildren().size() >0);
	}
}
