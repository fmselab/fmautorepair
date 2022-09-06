package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.And;
import org.prop4j.Literal;
import org.prop4j.Node;
import org.prop4j.Not;
import org.prop4j.Or;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/**
 * transform a requires to exclude a1 => a2 with a1 and a2 literals
 * */
public class RequiresAsCnfToExcludes extends ConstraintsMutator {

	public static FMMutator instance = new RequiresAsCnfToExcludes();

	@Override
	protected Node modify(IConstraint  c, IFeatureModel fm2) {
		// not (a1 and a2)
		Node[] subnodes = ((Or) c.getNode()).getChildren();
		Node node = subnodes[0];
		Node excludes = new Not(new And(node.getChildren()[0],subnodes[1]));
		return excludes;
	}

	@Override
	protected boolean isModifiable(IConstraint  c) {
		if (!(c.getNode() instanceof Or))
			return false;
		/* consider only literals */
		Node[] subnodes = ((Or) c.getNode()).getChildren();
		if (subnodes.length != 2)
			return false;
		Node node = subnodes[0];
		if (node instanceof Not && node.getChildren().length == 1
				&& node.getChildren()[0] instanceof Literal
				&& subnodes[1] instanceof Literal) {
			return true;
		}
		return false;
	}

	
	static {
		logger = Logger.getLogger(RequiresAsCnfToExcludes.class);

	}

}
