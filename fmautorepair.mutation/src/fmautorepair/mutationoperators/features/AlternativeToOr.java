package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform alternative to or */
public class AlternativeToOr extends FeatureMutator {

	private static Logger logger = Logger.getLogger(AlternativeToOr.class);

	public static FMMutator instance = new AlternativeToOr();

	@Override
	String mutate(IFeatureModel fm, IFeature feature) {
		feature.getStructure().changeToOr();
		assert feature.getStructure().isOr();
		logger.info("mutating IFeature " + feature.getName() + " from ALT TO OR");
		logger.debug("mmm" + fm.toString());
		return (feature.getName() + " from ALT TO OR");
	}

	@Override
	boolean isMutable(IFeatureModel fm, IFeature tobemutated) {
		// alternative, but more than one child
		// with one child it is equivalent already to OR - avoid equivalent
		// mutants
		return (tobemutated.getStructure().isAlternative() && tobemutated.getStructure().getChildren().size()>0);
	}

}
