package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class OrToAndOpt  extends FeatureMutator {

	private static Logger logger = Logger.getLogger(OrToAndOpt.class.getName());

	public static FMMutator instance = new OrToAndOpt();

	@Override
	String mutate(FeatureModel fm, Feature feature) {
			feature.changeToAnd();
		for(Feature child: feature.getChildren()){
			child.setMandatory(false);
			
		}		
		logger.info("mutating feature " + feature.getName() + " from OR to AND in OPT");
		return (feature.getName() + " from OR TO AND in OPT");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		// accettiamo solo con piu' di un figlio
		return (tobemutated.isOr() && tobemutated.getChildren().size()>0 );
	}
}