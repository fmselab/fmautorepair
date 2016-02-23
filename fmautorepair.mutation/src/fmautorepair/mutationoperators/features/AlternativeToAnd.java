package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

/** transform alternative to AND */
public class AlternativeToAnd extends FeatureMutator {

	private static Logger logger = Logger.getLogger(AlternativeToAnd.class);

	public static FMMutator instance = new AlternativeToAnd();
	
	protected boolean convertToOpt;
	
	protected AlternativeToAnd(){
		convertToOpt = false;
	}
	
	@Override
	String mutate(FeatureModel fm, Feature feature) {
		feature.changeToAnd();
		if (convertToOpt){
			for (Feature child : feature.getChildren()) {
				child.setMandatory(false);
			}
		}
		logger.info("mutating feature " + feature.getName()+ " from alternative to AND" + (convertToOpt? " to OPT" : ""));
		return feature.getName() + " from ALT TO AND" + (convertToOpt? " to OPT": "");
	}

	@Override
	boolean isMutable(FeatureModel fm, Feature tobemutated) {
		// alternative, but more than one child 
		// with one child it is equivalent already to And - avoid equivalent mutants
		return (tobemutated.isAlternative()  && tobemutated.getChildren().size()>0);
	}

}
