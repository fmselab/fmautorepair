package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureStructure;
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
	String mutate(IFeatureModel fm, IFeature feature) {
		feature.getStructure().changeToAnd();
		if (convertToOpt){
			for (IFeatureStructure child : feature.getStructure().getChildren()) {
				child.setMandatory(false);
			}
		}
		logger.info("mutating IFeature " + feature.getName()+ " from alternative to AND" + (convertToOpt? " to OPT" : ""));
		return feature.getName() + " from ALT TO AND" + (convertToOpt? " to OPT": "");
	}

	@Override
	boolean isMutable(IFeatureModel fm, IFeature tobemutated) {
		// alternative, but more than one child 
		// with one child it is equivalent already to And - avoid equivalent mutants
		return (tobemutated.getStructure().isAlternative()  && tobemutated.getStructure().getChildren().size()>0);
	}

}
