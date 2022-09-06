package fmautorepair.mutationoperators.constraints;

import org.apache.log4j.Logger;
import org.prop4j.And;
import org.prop4j.Node;
import org.prop4j.Or;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class LogicAndToOr  extends ConstraintsMutator {
		public static FMMutator instance = new LogicAndToOr();

		static {
			logger = Logger.getLogger(LogicAndToOr.class);
		}

		@Override
		protected Node modify(IConstraint  c, IFeatureModel fm2) {
			
			Node or= new Or(((And) c.getNode()).getChildren());
			return or;
		}

		@Override
		protected boolean isModifiable(IConstraint  c) {
			if (!(c.getNode() instanceof And))
				return false;
			
			
			return true;
		}


	

}
