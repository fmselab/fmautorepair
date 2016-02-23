package fmautorepair.mutationoperators.fmovers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.utils.CartesianIterator;
import fmautorepair.utils.Filter;
import fmautorepair.utils.FilteredIterator;
import fmautorepair.utils.Pair;

/** transform alternative to AND */
public class MoveFeature extends FMMutator {

	private static Logger logger = Logger.getLogger(MoveFeature.class);

	public static FMMutator instance = new MoveFeature();

	@Override
	public final Iterator<FMMutation> mutate(final FeatureModel fm) {
		logger.debug("mutating " + fm.toString());
		// iterator over the feature to be removed
		// source (to be moved) and destination 
		Filter<Pair<Feature,Feature>> filter = new Filter<Pair<Feature,Feature>>() {
			@Override
			public boolean matches(Pair<Feature,Feature> ff) {
				Feature featuretobemoved = ff.getFirst();
				Feature destination = ff.getSecond();
				// root cannot be moved
				if (featuretobemoved.isRoot()){
					logger.debug(featuretobemoved + " is root, cannot be moved");
					return false;
				}
				// the new parent is a child of the featuretobemoved
				// cannot move a feature to one of its descedant
				if (isAnchestor(featuretobemoved,destination)){
					logger.debug(featuretobemoved + " cannot be moved to its descedant " + destination);
					return false;
				}
				// the feature is already a child of a feature destination 
				if (featuretobemoved.getParent() == destination){
					return false;
				}
				if (featuretobemoved == destination) return false;
				return true;
			}
		};
		List<Feature> featuresList = new ArrayList<>(fm.getFeatures());
		// get the cartesian product of the features
		final CartesianIterator<Feature> fListIterator = new CartesianIterator<Feature>(featuresList,featuresList);
		// as interator over pairs
		final Iterator<Pair<Feature,Feature>> fPairIterator = new Iterator<Pair<Feature,Feature>>(){
			@Override
			public boolean hasNext() {
				return fListIterator.hasNext();
			}
			@Override
			public Pair<Feature, Feature> next() {
				List<Feature> l = fListIterator.next();
				return new Pair<Feature,Feature>(l.get(0),l.get(1));
			}
		};
		// filter the pairs
		final FilteredIterator<Pair<Feature,Feature>> featurePairs = new FilteredIterator<>(fPairIterator, filter);
		return new Iterator<FMMutation>() {
			@Override
			public boolean hasNext() {
				return featurePairs.hasNext();
			}
			@Override
			public FMMutation next() {
				logger.debug("searching for next feature to be moved");				
				Pair<Feature, Feature> pair = featurePairs.next();
				return moveFeatureTo(fm, pair.getFirst(), pair.getSecond());
			}
		};

	}
	// 
	/**
	 * move a feature to a new feature (ad child of a new parent)
	 *
	 * @param fm the fm
	 * @param featuretobemoved the featuretobemoved
	 * @param newParent the new parent
	 * @return the FM mutation
	 */
	static FMMutation moveFeatureTo(FeatureModel fm, Feature featuretobemoved,
			Feature newParent) {
		logger.debug("moving feature " + featuretobemoved + " to " + newParent);
		assert ! isAnchestor(featuretobemoved,newParent);
		String fName = featuretobemoved.getName();
		String pName = newParent.getName();
		String description = "moved " + fName + " as child of " + pName;
		// System.err.println(fm);
		FeatureModel fm2 = fm.deepClone();
		if (fm.getFeatures().size() != fm2.getFeatures().size()){
			logger.error("fm  " + fm + " " + fm.getFeatureNames());
			logger.error("fm2 " + fm2 + " "+ fm2.getFeatureNames());
			assert false;			
		}
		Feature movedfeature = fm2.getFeature(fName);
		assert movedfeature!= null : "feature " + fName + " is not in " + fm.toString() + " " + fm.getFeatureNames(); 
		Feature oldParent = movedfeature.getParent();
		assert oldParent!= null : "feature " + movedfeature + " has no parent "; 
		oldParent.removeChild(movedfeature);
		movedfeature.setParent(fm2.getFeature(pName));
		fm2.getFeature(pName).addChild(movedfeature);
		//logger.debug(description + "\n" + fm2.toString());
		assert fm.getFeatures().size() == fm2.getFeatures().size();
		return new FMMutation(fm2, MoveFeature.class, description);

	}

	/**
	 * 
	 * @param featuretobemoved
	 * @param newParent
	 * @return true if featutertobe moved is anchestor of new Parent
	 */
	static boolean isAnchestor(Feature featuretobemoved,Feature newParent){
		// if newparent is a child of feature to be moved
		if (featuretobemoved.getChildren().contains(newParent))
			return true;
		// or one of th evhild is anchestof of teh new parent
		for (Feature f: featuretobemoved.getChildren()){
			if (isAnchestor(f, newParent))
				return true;
		}
		return false;		
	}
	
}
	


