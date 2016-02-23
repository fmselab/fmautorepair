package fmautorepair.mutationoperators;

import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.utils.Pair;

public class FMMutation extends Pair<FeatureModel, String> {

	/**
	 * 
	 * @param s
	 * @param mutationClass
	 *            TODO
	 * @param a
	 *            a string describing the mutation
	 */
	private Class<? extends FMMutator> mutationClass = null;

	public FMMutation(FeatureModel s, Class<? extends FMMutator> mutationClass, String a) {
		super(s, a);
		this.mutationClass = mutationClass;
	}

	public Class<? extends FMMutator> getMutationClass() {
		return mutationClass;
	}
}
