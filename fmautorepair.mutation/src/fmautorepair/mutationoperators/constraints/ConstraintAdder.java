package fmautorepair.mutationoperators.constraints;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.prop4j.And;
import org.prop4j.Equals;
import org.prop4j.Implies;
import org.prop4j.Literal;
import org.prop4j.Node;
import org.prop4j.Not;
import org.prop4j.Or;

import de.ovgu.featureide.fm.core.base.FeatureUtils;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.utils.Utils;

// 
public class ConstraintAdder extends FMMutator {

	private static Logger logger = Logger.getLogger(ConstraintAdder.class);

	public static FMMutator instance = new ConstraintAdder();

	public final static int minLiterals = 1;
	public final static int maxLiterals = 5;

	static Random random = new Random(2);

	@Override
	public Iterator<FMMutation> mutate(IFeatureModel fm) {
		IFeatureModel fm2 = fm.clone();
		ArrayList<FMMutation> list = null;
		generateConstraints(fm2, random, 1);
		list = new ArrayList<>();
		list.add(new FMMutation(fm2, ConstraintAdder.class, "adding a constraint"));
		return list.iterator();
	}

	void generateConstraints(IFeatureModel fm, Random random, int numberOfConstraints) {

		Set<String> namesSet = Utils.getFeatureNames(fm);
		// copy the IFeature names
		ArrayList<String> names = new ArrayList<String>(namesSet);
		// remove the root
		names.remove(fm.getStructure().getRoot().getFeature().getName());
		logger.debug("adding a constraint names of features " + names);
		//
		for (int i = 0; i < numberOfConstraints; i++) {
			Node node = getRandomLiteral(names, random);
			for (int j = random.nextInt(maxLiterals - minLiterals) + minLiterals; j > 0; j--) {
				// the last number is exluded
				switch (random.nextInt(5)) {
				case 0:
					node = new And(node, getRandomLiteral(names, random));
					break;
				case 1:
					node = new Or(node, getRandomLiteral(names, random));
					break;
				case 2:
					node = new Implies(node, getRandomLiteral(names, random));
					break;
				case 3:
					node = new Equals(node, getRandomLiteral(names, random));
					break;
				default:
					node = new Not(node);
				} 
			}
			FeatureUtils.addPropositionalNode(fm, node);
		}

	}

	private static Literal getRandomLiteral(ArrayList<String> names, Random random) {
		int index = random.nextInt(names.size());
		return new Literal(names.get(index), random.nextBoolean());
	}
}
