package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform alternative to or */
public class OrToAltenative extends FeatureMutator {

	private static Logger logger = Logger.getLogger(OrToAltenative.class
			.getName());

	public static FMMutator instance = new OrToAltenative();

	@Override
	String mutate(IFeatureModel fm, IFeature feature) {
		assert feature.getStructure().isOr();
		feature.getStructure().changeToAlternative();
		logger.info("mutating IFeature " + feature.getName()
				+ " from OR to Alternative");
		return (feature.getName() + " from OR TO ALTERNATIVE");
	}

	@Override
	boolean isMutable(IFeatureModel fm, IFeature tobemutated) {
		// accettiamo solo con piu' di un figlio
		return (tobemutated.getStructure().isOr() && tobemutated.getStructure().getChildren().size() >0);
	}
}
