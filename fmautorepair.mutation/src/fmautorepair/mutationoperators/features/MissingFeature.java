package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** remove a IFeature */
public class MissingFeature extends FeatureMutator {

	private static Logger logger = Logger.getLogger(MissingFeature.class.getName());

	public static FMMutator instance = new MissingFeature();

	@Override
	String mutate(IFeatureModel fm, IFeature feature) {
		boolean res = fm.deleteFeature(feature);
		
		assert res;
		logger.info("mutating IFeature " + feature.getName() + " DELETED");
		return (feature.getName() + " DELETED");
	}

	@Override
	boolean isMutable(IFeatureModel fm, IFeature tobemutated) {
		boolean containedInCon=false;
		if(fm.getConstraints().size()>0)
		for (IConstraint c : fm.getConstraints()) {
			if (c.getContainedFeatures().contains(tobemutated)) {
				containedInCon=true;
				break;
			}
		}
		return (!tobemutated.getStructure().hasChildren() && tobemutated.getStructure().getParent() != null && !tobemutated.getStructure().getParent().isFirstChild(tobemutated.getStructure())&&!containedInCon);
	}
}