package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Implies;
import org.prop4j.Literal;
import org.prop4j.Node;
import org.prop4j.Not;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class ExcludesToRequires extends ConstraintsMutator {
	public static FMMutator instance = new ExcludesToRequires();

	@Override
	protected Node modify(IConstraint  c, IFeatureModel fm2) {
		Node requires = null;
		// not a1 and a2
		Node[] subnodes = ((Implies) c.getNode()).getChildren();
		
			requires = new Implies(subnodes[0],
					( subnodes[1]).getChildren()[0]);
		return requires;
	}

	@Override
	protected boolean isModifiable(IConstraint  c) {
		// a implies not b
		if (!(c.getNode() instanceof Implies))
			return false;
		/* consider only literals */
		Node[] subnodes = ((Implies) c.getNode()).getChildren();
		if (subnodes.length != 2)
			return false;
		if ((subnodes[1] instanceof Not
				&& subnodes[1].getChildren().length == 1
				&& subnodes[1].getChildren()[0] instanceof Literal && subnodes[0] instanceof Literal)) {
			return true;
		}
		return false;

	}

	
	static {
		logger = Logger.getLogger(ExcludesToRequires.class);

	}

}
