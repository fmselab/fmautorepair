package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** mandatory to optional */
public class MandatoryToOptional extends FeatureMutator {

	private static Logger logger = Logger.getLogger(MandatoryToOptional.class
			.getName());

	public static FMMutator instance = new MandatoryToOptional();

	@Override
	String mutate(IFeatureModel fm, IFeature feature) {
		feature.getStructure().setMandatory(false);
		logger.info("mutating IFeature " + feature.getName()
				+ " from MANDATORY TO OPTIONAL");
		return feature.getName() + " from MANDATORY TO OPTIONAL";
	}

	/**
	 * 
	 * @param feature
	 * @return true if it is really mandatory
	 */
	static boolean isTrueMandatory(IFeature feature) {
		assert feature.getStructure().isMandatory();
		IFeature parent = feature.getStructure().getParent().getFeature();
		// if the parent is alternative, or , and and has 0 child
		if ((!parent.getStructure().isAnd()))
			return false;
		else
			return true;
	}

	@Override
	boolean isMutable(IFeatureModel fm, IFeature tobemutated) {
		IFeature parent= tobemutated.getStructure().getParent().getFeature();
		return (parent != null && parent.getStructure().isAnd() && tobemutated.getStructure().isMandatory());
	}

}
