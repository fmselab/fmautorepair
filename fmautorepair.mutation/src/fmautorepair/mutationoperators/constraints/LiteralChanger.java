package fmautorepair.mutationoperators.constraints;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.prop4j.Literal;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutator;

public class LiteralChanger extends ConstraintsMutator {

	static Random random = new Random(2);
	
	public static FMMutator instance = new LiteralChanger();

	private static Literal getRandomLiteral(ArrayList<String> names, Random random) {
		int index = random.nextInt(names.size());
		return new Literal(names.get(index), random.nextBoolean());
	}

	@Override
	protected Node modify(Constraint c, FeatureModel fm2) {
		Set<String> namesSet = fm2.getFeatureNames();
		ArrayList<String> names = new ArrayList<String>(namesSet);
		// remove the root
		names.remove(fm2.getRoot().getName());
		//
		Node[] children = c.getNode().getChildren();
		if (children == null)
			return getRandomLiteral(names, random);
		Node[] Nchildren = new Node[children.length];
		System.arraycopy(children, 0, Nchildren, 0, children.length);
		Nchildren[random.nextInt(children.length)] = getRandomLiteral(names, random);

		Node n = c.getNode().clone();
		n.setChildren(Nchildren);

		return n;
	}

	@Override
	protected boolean isModifiable(Constraint c) {
		// TODO Auto-generated method stub
		return true;
	}

}
