package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class ConstraintRemover extends ConstraintsMutator {

	public static FMMutator instance = new ConstraintRemover();
	static {
		logger = Logger.getLogger(ConstraintRemover.class);
	}

	@Override
	protected Node modify(IConstraint  c, IFeatureModel fm2) {

		return null;
	}

	@Override
	protected boolean isModifiable(IConstraint  c) {
		return true;
	}
}
