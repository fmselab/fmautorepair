package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform And to or */
public class AndToOr extends FeatureMutator {

	private static Logger logger = Logger.getLogger(AndToOr.class.getName());

	public static FMMutator instance = new AndToOr();

	@Override
	String mutate(IFeatureModel fm, IFeature tobemutated) {
		// if has more than one child or one child but optional
		tobemutated.getStructure().changeToOr();
		logger.info("mutating IFeature " + tobemutated.getName()	+ " from AND TO OR");
		return (tobemutated.getName() + " from AND TO OR");
	}

	@Override
	boolean isMutable(IFeatureModel fm, IFeature tobemutated) {
		int size = tobemutated.getStructure().getChildren().size();		
		return (tobemutated.getStructure().isAnd() && size >0);
	}
}
