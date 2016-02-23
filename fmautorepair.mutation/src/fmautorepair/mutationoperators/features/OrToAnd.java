package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform or to AND */
public class OrToAnd extends FeatureMutator {

	private static Logger logger = Logger.getLogger(OrToAnd.class.getName());

	public static FMMutator instance = new OrToAnd();

	@Override
	String mutate(FeatureModel fm, Feature feature) {
		feature.changeToAnd();
		logger.info("mutating feature " + feature.getName() + " from OR to AND");
		return (feature.getName() + " from OR TO AND");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		// accettiamo solo con piu' di un figlio
		return (tobemutated.isOr() && tobemutated.getChildren().size() >0);
	}

}
