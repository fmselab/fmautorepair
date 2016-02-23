package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.Equals;
import org.prop4j.Implies;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class ImpliesToIff extends ConstraintsMutator {

	

	public static FMMutator instance = new ImpliesToIff();

	

    @Override
	protected Node modify(Constraint c, FeatureModel fm2) {
		Node[] subnodes = ((Implies) c.getNode()).getChildren();
		
		//  not a1 and a2
		Node iff = new Equals(subnodes[0],subnodes[1]);
		return iff;
	}

    @Override
	protected boolean isModifiable(Constraint c) {
		if (!(c.getNode() instanceof Implies))
			return false;
		Node[] subnodes = ((Implies) c.getNode()).getChildren();
		if (subnodes.length != 2)
			return false;
	
		return true;
	}
    
	static {
		logger = Logger.getLogger(ImpliesToIff.class);
		
	}
}
