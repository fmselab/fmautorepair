package fmautorepair.mutationoperators.constraints;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
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
	public final Iterator<FMMutation> mutate(final FeatureModel fm) {
		fm.getAnalyser().calculateRedundantConstraints = true;
		// take only modifiable constraints
		Filter<Constraint> filter = new Filter<Constraint>() {
			@Override
			public boolean matches(Constraint c) {
				if (isModifiable(c)) {
					return true;
				} else {
					return false;
				}
			}
		};
		// take all the mutable constraints 
		final Iterator<Constraint> ic = new FilteredIterator<>(fm
				.getConstraints().iterator(), filter);
		final Class<? extends ConstraintsMutator> mutOpertorClass = this
				.getClass();
		// compute the mutations
		return new Iterator<FMMutation>() {

			@Override
			public boolean hasNext() {
				return ic.hasNext();
			}

			@Override
			public FMMutation next() {
				Constraint c = ic.next();
				int i = fm.getConstraintIndex(c);
				// logger.debug("modifying " + i);
				// build a copy (deep) of the model to be mutated
				FeatureModel fm2 = fm.deepClone();
				Node modified = modify(c, fm2);
				if (modified != null) {
					fm2.replacePropNode(i, modified);
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

	protected abstract Node modify(Constraint c, FeatureModel fm2);

	protected abstract boolean isModifiable(Constraint c);
}
