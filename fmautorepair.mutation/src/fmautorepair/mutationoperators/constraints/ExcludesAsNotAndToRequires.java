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

public class ExcludesAsNotAndToRequires extends ConstraintsMutator {
	public static FMMutator instance = new ExcludesAsNotAndToRequires();

	@Override
	protected Node modify(Constraint c, FeatureModel fm2) {

		// not a1 and a2
		Node[] subnodes = ((Not) c.getNode()).getChildren();
		Node[] subsubnodes = subnodes[0].getChildren();
		Node requires = new Implies(subsubnodes[0], subsubnodes[1]);
		return requires;
	}

	@Override
	protected boolean isModifiable(Constraint c) {
		if (!(c.getNode() instanceof Not))
			return false;
		/* consider only literals */
		Node[] subnodes = ((Not) c.getNode()).getChildren();
		if (subnodes.length != 1)
			return false;
		// not (a and b)
		if (subnodes[0] instanceof And) {
			Node[] subsubnodes = subnodes[0].getChildren();
			if (subsubnodes.length == 2)
				if (subsubnodes[0] instanceof Literal
						&& subsubnodes[1] instanceof Literal) {
					return true;
				}

		}
		return false;

	}

	
	static {
		logger = Logger.getLogger(ExcludesAsNotAndToRequires.class);

	}

}
