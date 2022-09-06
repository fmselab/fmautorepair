package fmautorepair.mutationoperators.constraints;

import java.util.ArrayList;
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

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.utils.Utils;

public class ConstraintSubstitute extends ConstraintsMutator {
	public static FMMutator instance = new ConstraintSubstitute();

	static {
		logger = Logger.getLogger(ConstraintSubstitute.class);
	}

	public final static int minLiterals = 1;
	public final static int maxLiterals = 5;

	Random random = new Random(5);

	private static Literal getRandomLiteral(ArrayList<String> names, Random random) {
		int index = random.nextInt(names.size());
		return new Literal(names.get(index), random.nextBoolean());
	}

	Node generateConstraints(IFeatureModel fm, Random random, int numberOfConstraints) {
		Node node = null;
		Set<String> namesSet = Utils.getFeatureNames(fm);
		// copy the IFeature names 
		ArrayList<String> names = new ArrayList<String>(namesSet);
		// remove the root
		names.remove(fm.getStructure().getRoot().getFeature().getName());
		for (int i = 0; i < numberOfConstraints; i++) {
			node = getRandomLiteral(names, random);

			for (int j = random.nextInt(maxLiterals - minLiterals) + minLiterals; j > 0; j--) {
				if (random.nextBoolean()) {
					if (random.nextBoolean())
						node = new And(node, getRandomLiteral(names, random));
					else
						node = new Or(node, getRandomLiteral(names, random));
				} else {
					if (random.nextBoolean())
						node = new Implies(node, getRandomLiteral(names, random));
					else
						node = new Equals(node, getRandomLiteral(names, random));
				}
				if (random.nextBoolean() && random.nextBoolean())
					node = new Not(node);
			}

		}
		return node;

	}

	@Override
	protected Node modify(IConstraint  c, IFeatureModel fm2) {

		Node node = generateConstraints(fm2, random, 1);
		return node;

	}

	@Override
	protected boolean isModifiable(IConstraint  c) {
		// TODO Auto-generated method stub
		return true;
	}

}
