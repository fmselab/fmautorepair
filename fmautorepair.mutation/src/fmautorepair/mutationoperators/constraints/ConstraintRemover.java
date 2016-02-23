package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class ConstraintRemover extends ConstraintsMutator {

	public static FMMutator instance = new ConstraintRemover();
	static {
		logger = Logger.getLogger(ConstraintRemover.class);
	}

	@Override
	protected Node modify(Constraint c, FeatureModel fm2) {

		return null;
	}

	@Override
	protected boolean isModifiable(Constraint c) {
		return true;
	}
}
