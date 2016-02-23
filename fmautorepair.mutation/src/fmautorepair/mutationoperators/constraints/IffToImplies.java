package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Equals;
import org.prop4j.Implies;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class IffToImplies extends ConstraintsMutator {

	public static FMMutator instance = new IffToImplies();

	@Override
	protected Node modify(Constraint c, FeatureModel fm2) {
		Node[] subnodes = ((Equals) c.getNode()).getChildren();
		
		//  not a1 and a2
		Node implies = new Implies(subnodes[0],subnodes[1]);
		return implies;
	}

	@Override
	protected boolean isModifiable(Constraint c) {
		if (!(c.getNode() instanceof Equals))
			return false;
		Node[] subnodes = ((Equals) c.getNode()).getChildren();
		if (subnodes.length != 2)
			return false;
		
		return true;
	}

	
	static {
		logger = Logger.getLogger(IffToImplies.class);

	}


}
