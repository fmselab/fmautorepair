package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** mandatory to optional */
public class MandatoryToOptional extends FeatureMutator {

	private static Logger logger = Logger.getLogger(MandatoryToOptional.class
			.getName());

	public static FMMutator instance = new MandatoryToOptional();

	@Override
	String mutate(FeatureModel fm, Feature feature) {
		feature.setMandatory(false);
		logger.info("mutating feature " + feature.getName()
				+ " from MANDATORY TO OPTIONAL");
		return feature.getName() + " from MANDATORY TO OPTIONAL";
	}

	/**
	 * 
	 * @param feature
	 * @return true if it is really mandatory
	 */
	static boolean isTrueMandatory(Feature feature) {
		assert feature.isMandatory();
		Feature parent = feature.getParent();
		// if the parent is alternative, or , and and has 0 child
		if ((!parent.isAnd()))
			return false;
		else
			return true;
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		Feature parent= tobemutated.getParent();
		return (parent != null && parent.isAnd() && tobemutated.isMandatory());
	}

}
