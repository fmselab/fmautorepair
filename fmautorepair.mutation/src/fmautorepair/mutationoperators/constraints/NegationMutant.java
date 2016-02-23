package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Node;
import org.prop4j.Not;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class NegationMutant extends ConstraintsMutator {

	public static FMMutator instance = new NegationMutant();

	@Override
	protected Node modify(Constraint c, FeatureModel fm2) {
		// TODO Auto-generated method stub
		return new Not(c.getNode());
	}

	@Override
	protected boolean isModifiable(Constraint c) {
		
		return true;
	}

	
	static {
		logger = Logger.getLogger(NegationMutant.class);
	}

}
