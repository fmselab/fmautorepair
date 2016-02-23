package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.And;
import org.prop4j.Implies;
import org.prop4j.Literal;
import org.prop4j.Node;
import org.prop4j.Not;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/**
 * transform a requires to exclude a1 => a2 with a1 and a2 literals
 * */
public class RequiresToExcludes extends ConstraintsMutator {

	public static FMMutator instance = new RequiresToExcludes();

	@Override
	protected Node modify(Constraint c, FeatureModel fm2) {
		// not a1 and a2
		Node excludes = new Not(new And(((Implies) c.getNode()).getChildren()));
		return excludes;
	}

	@Override
	protected boolean isModifiable(Constraint c) {
		if (!(c.getNode() instanceof Implies))
			return false;
		/* consider only literals */
		Node[] subnodes = ((Implies) c.getNode()).getChildren();
		if (subnodes.length != 2)
			return false;
		if (subnodes[0] instanceof Literal && subnodes[1] instanceof Literal) {
			return true;
		}
		return false;
	}

	static {
		logger = Logger.getLogger(RequiresToExcludes.class);
	}

}
