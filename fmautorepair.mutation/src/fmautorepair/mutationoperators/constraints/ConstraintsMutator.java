package fmautorepair.mutationoperators.constraints;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.base.FeatureUtils;
import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.utils.Filter;
import fmautorepair.utils.FilteredIterator;

/**
 * take all the constraints and apply this mutation
 * 
 */
public abstract class ConstraintsMutator extends FMMutator {

	static protected Logger logger;

	@Override
	public final Iterator<FMMutation> mutate(final IFeatureModel fm) {
		// TODO in old code, redudn constraints were considered 
//		FeatureModelAnalyzer analyzer = new FeatureModelAnalyzer(fm);
//		List<IConstraint> redConstraints = analyzer.getRedundantConstraints(null);
		
		// take only modifiable constraints
		Filter<IConstraint> filter = new Filter<IConstraint>() {
			@Override
			public boolean matches(IConstraint c) {
				if (isModifiable(c)) {
					return true;
				} else {
					return false;
				}
			}
		};
		// take all the mutable constraints 
		final Iterator<IConstraint> ic = new FilteredIterator<>(fm.getConstraints().iterator(), filter);
		final Class<? extends ConstraintsMutator> mutOpertorClass = this.getClass();
		// compute the mutations
		return new Iterator<FMMutation>() {

			@Override
			public boolean hasNext() {
				return ic.hasNext();
			}

			@Override
			public FMMutation next() {
				IConstraint c = ic.next();
				int i = fm.getConstraintIndex(c);
				// logger.debug("modifying " + i);
				// build a copy (deep) of the model to be mutated
				IFeatureModel fm2 = fm.clone();
				Node modified = modify(c, fm2);
				if (modified != null) {
					FeatureUtils.replacePropNode(fm, i, modified); 
				} else {
					fm2.removeConstraint(fm2.getConstraints().get(i));
				}
				return new FMMutation(fm2, mutOpertorClass,
						mutOpertorClass.getSimpleName()
								+ "  "
								+ c.getNode());
			}

		};
	}

	protected abstract Node modify(IConstraint c, IFeatureModel fm2);

	protected abstract boolean isModifiable(IConstraint c);
}
