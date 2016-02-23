package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** remove a feature */
public class MissingFeature extends FeatureMutator {

	private static Logger logger = Logger.getLogger(MissingFeature.class
			.getName());

	public static FMMutator instance = new MissingFeature();

	@Override
	String mutate(FeatureModel fm, Feature feature) {
		boolean res = fm.deleteFeature(feature);
		
		assert res;
		logger.info("mutating feature " + feature.getName() + " DELETED");
		return (feature.getName() + " DELETED");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		boolean containedInCon=false;
		if(fm.getConstraints().size()>0)
		for (Constraint c : fm.getConstraints()) {
			if (c.getContainedFeatures().contains(tobemutated)) {
				containedInCon=true;
				break;
			}
		}
		return (!tobemutated.hasChildren() && tobemutated.getParent() != null && !tobemutated.getParent().isFirstChild(tobemutated)&&!containedInCon);
	}
}