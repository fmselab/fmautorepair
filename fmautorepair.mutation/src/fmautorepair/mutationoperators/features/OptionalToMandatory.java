package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** optional to mandatory */
public class OptionalToMandatory extends FeatureMutator {

	private static Logger logger = Logger.getLogger(OptionalToMandatory.class
			.getName());

	public static FMMutator instance = new OptionalToMandatory();

	@Override
	String mutate(IFeatureModel fm, IFeature feature) {
		assert !feature.getStructure().isMandatory();
		feature.getStructure().setMandatory(true);
		logger.info("mutating IFeature " + feature.getName()
				+ " from OPTIONAL TO MANDATORY");
		return (feature.getName() + " from OPTIONAL TO MANDATORY");
	}

	@Override
	boolean isMutable(IFeatureModel fm, IFeature tobemutated) {
		IFeature parent= tobemutated.getStructure().getParent().getFeature();
		return (parent != null &&  parent.getStructure().isAnd()  && !tobemutated.getStructure().isMandatory());
	}

}
