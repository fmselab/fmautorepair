package fmautorepair.mutationoperators.fmovers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.IFeatureStructure;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.utils.CartesianIterator;
import fmautorepair.utils.Filter;
import fmautorepair.utils.FilteredIterator;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

/** move a feature */
public class MoveFeature extends FMMutator {

	private static Logger logger = Logger.getLogger(MoveFeature.class);

	public static FMMutator instance = new MoveFeature();

	@Override
	public final Iterator<FMMutation> mutate(final IFeatureModel fm) {
		logger.debug("mutating " + fm.toString());
		// iterator over the IFeature to be removed
		// source (to be moved) and destination 
		Filter<Pair<IFeature,IFeature>> filter = new Filter<Pair<IFeature,IFeature>>() {
			@Override
			public boolean matches(Pair<IFeature,IFeature> ff) {
				IFeature featuretobemoved = ff.getFirst();
				IFeature destination = ff.getSecond();
				// root cannot be moved
				if (featuretobemoved.getStructure().isRoot()){
					logger.debug(featuretobemoved + " is root, cannot be moved");
					return false;
				}
				// the new parent is a child of the featuretobemoved
				// cannot move a IFeature to one of its descedant
				if (isAnchestor(featuretobemoved,destination)){
					logger.debug(featuretobemoved + " cannot be moved to its descedant " + destination);
					return false;
				}
				// the IFeature is already a child of a IFeature destination 
				if (featuretobemoved.getStructure().getParent() == destination){
					return false;
				}
				if (featuretobemoved == destination) return false;
				return true;
			}
		};
		List<IFeature> featuresList = new ArrayList<>(fm.getFeatures());
		// get the cartesian product of the features
		final CartesianIterator<IFeature> fListIterator = new CartesianIterator<IFeature>(featuresList,featuresList);
		// as interator over pairs
		final Iterator<Pair<IFeature,IFeature>> fPairIterator = new Iterator<Pair<IFeature,IFeature>>(){
			@Override
			public boolean hasNext() {
				return fListIterator.hasNext();
			}
			@Override
			public Pair<IFeature, IFeature> next() {
				List<IFeature> l = fListIterator.next();
				return new Pair<IFeature,IFeature>(l.get(0),l.get(1));
			}
		};
		// filter the pairs
		final FilteredIterator<Pair<IFeature,IFeature>> featurePairs = new FilteredIterator<>(fPairIterator, filter);
		return new Iterator<FMMutation>() {
			@Override
			public boolean hasNext() {
				return featurePairs.hasNext();
			}
			@Override
			public FMMutation next() {
				logger.debug("searching for next IFeature to be moved");				
				Pair<IFeature, IFeature> pair = featurePairs.next();
				return moveFeatureTo(fm, pair.getFirst(), pair.getSecond());
			}
		};

	}
	// 
	/**
	 * move a IFeature to a new IFeature (ad child of a new parent)
	 *
	 * @param fm the fm
	 * @param featuretobemoved the featuretobemoved
	 * @param newParent the new parent
	 * @return the FM mutation
	 */
	static FMMutation moveFeatureTo(IFeatureModel fm, IFeature featuretobemoved,
			IFeature newParent) {
		logger.debug("moving IFeature " + featuretobemoved + " to " + newParent);
		assert ! isAnchestor(featuretobemoved,newParent);
		String fName = featuretobemoved.getName();
		String pName = newParent.getName();
		String description = "moved " + fName + " as child of " + pName;
		// System.err.println(fm);
		IFeatureModel fm2 = fm.clone();
		if (fm.getFeatures().size() != fm2.getFeatures().size()){
			logger.error("fm  " + fm + " " + Utils.getFeatureNames(fm));
			logger.error("fm2 " + fm2 + " "+ Utils.getFeatureNames(fm2));
			assert false;			
		}
		IFeature movedfeature = fm2.getFeature(fName);
		assert movedfeature!= null : "IFeature " + fName + " is not in " + fm.toString() + " " + Utils.getFeatureNames(fm); 
		IFeatureStructure oldParent = movedfeature.getStructure().getParent();
		assert oldParent!= null : "IFeature " + movedfeature + " has no parent "; 
		oldParent.removeChild(movedfeature.getStructure());
		movedfeature.getStructure().setParent(fm2.getFeature(pName).getStructure());
		fm2.getFeature(pName).getStructure().addChild(movedfeature.getStructure());
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
	static boolean isAnchestor(IFeature featuretobemoved,IFeature newParent){
		// if newparent is a child of IFeature to be moved
		if (featuretobemoved.getStructure().getChildren().contains(newParent.getStructure()))
			return true;
		// or one of th evhild is anchestof of teh new parent
		for (IFeatureStructure f: featuretobemoved.getStructure().getChildren()){
			if (isAnchestor(f.getFeature(), newParent))
				return true;
		}
		return false;		
	}
	
}
	


