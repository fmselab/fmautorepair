package fmautorepair.mutationoperators;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.utils.Pair;

public class FMMutation extends Pair<IFeatureModel, String> {

	/**
	 * 
	 * @param s
	 * @param mutationClass
	 *            TODO
	 * @param a
	 *            a string describing the mutation
	 */
	private Class<? extends FMMutator> mutationClass = null;

	public FMMutation(IFeatureModel s, Class<? extends FMMutator> mutationClass, String a) {
		super(s, a);
		this.mutationClass = mutationClass;
	}

	public Class<? extends FMMutator> getMutationClass() {
		return mutationClass;
	}
}
