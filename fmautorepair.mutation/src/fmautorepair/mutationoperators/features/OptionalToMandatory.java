package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** optional to mandatory */
public class OptionalToMandatory extends FeatureMutator {

	private static Logger logger = Logger.getLogger(OptionalToMandatory.class
			.getName());

	public static FMMutator instance = new OptionalToMandatory();

	@Override
	String mutate(FeatureModel fm, Feature feature) {
		assert !feature.isMandatory();
		feature.setMandatory(true);
		logger.info("mutating feature " + feature.getName()
				+ " from OPTIONAL TO MANDATORY");
		return (feature.getName() + " from OPTIONAL TO MANDATORY");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		Feature parent= tobemutated.getParent();
		return (parent != null &&  parent.isAnd()  && !tobemutated.isMandatory());
	}

}
