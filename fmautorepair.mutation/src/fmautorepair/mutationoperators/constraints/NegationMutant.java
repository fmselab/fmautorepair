package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Node;
import org.prop4j.Not;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class NegationMutant extends ConstraintsMutator {

	public static FMMutator instance = new NegationMutant();

	@Override
	protected Node modify(IConstraint  c, IFeatureModel fm2) {
		// TODO Auto-generated method stub
		return new Not(c.getNode());
	}

	@Override
	protected boolean isModifiable(IConstraint  c) {
		
		return true;
	}

	
	static {
		logger = Logger.getLogger(NegationMutant.class);
	}

}
