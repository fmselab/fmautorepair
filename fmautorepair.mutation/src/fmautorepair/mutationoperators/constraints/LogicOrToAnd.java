package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.And;
import org.prop4j.Node;
import org.prop4j.Or;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class LogicOrToAnd extends ConstraintsMutator {
	public static FMMutator instance = new LogicOrToAnd();

	@Override
	protected Node modify(Constraint c, FeatureModel fm2) {
	
		Node and = new And(((Or) c.getNode()).getChildren());
		return and;
	}

	@Override
	protected boolean isModifiable(Constraint c) {
		if (!(c.getNode() instanceof Or))
			return false;
		Node[] subnodes = ((Or) c.getNode()).getChildren();
//		if (subnodes.length != 2)
//			return false;
//		if (subnodes[0] instanceof Literal && subnodes[1] instanceof Literal){
//			return true;
//		}
		return true;
	}

	
	static {
		logger = Logger.getLogger(LogicOrToAnd.class);

	}

}
