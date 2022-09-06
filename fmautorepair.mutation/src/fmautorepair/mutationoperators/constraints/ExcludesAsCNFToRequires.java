package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Implies;
import org.prop4j.Literal;
import org.prop4j.Node;
import org.prop4j.Not;
import org.prop4j.Or;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class ExcludesAsCNFToRequires extends ConstraintsMutator {
	public static FMMutator instance = new ExcludesAsCNFToRequires();

	@Override
	protected Node modify(IConstraint  c, IFeatureModel fm2) {

		// not a1 and a2
		Node[] subnodes = ((Or) c.getNode()).getChildren();
		Node[] subsubnodesA = subnodes[0].getChildren();
		Node[] subsubnodesB = subnodes[1].getChildren();
		Node requires = new Implies(subsubnodesA[0], subsubnodesB[0]);
		return requires;
	}

	@Override
	protected boolean isModifiable(IConstraint  c) {
		if (!(c.getNode() instanceof Or))
			return false;
		/* consider only literals */
		Node[] subnodes = ((Or) c.getNode()).getChildren();
		if (subnodes.length != 2)
			return false;
		// not (a and b) = not a or not b
		if (subnodes[0] instanceof Not && subnodes[1] instanceof Not) {
			Node[] subsubnodesA = subnodes[0].getChildren();
			Node[] subsubnodesB = subnodes[1].getChildren();
			if (subsubnodesA[0] instanceof Literal
						&& subsubnodesB[0] instanceof Literal) {
					return true;
				}

		}
		return false;

	}

	static {
		logger = Logger.getLogger(ExcludesAsCNFToRequires.class);
	}

}
