package fmautorepair.mutationoperators.constraints;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.prop4j.Literal;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.utils.Utils;

public class LiteralChanger extends ConstraintsMutator {

	static Random random = new Random(2);
	
	public static FMMutator instance = new LiteralChanger();

	private static Literal getRandomLiteral(ArrayList<String> names, Random random) {
		int index = random.nextInt(names.size());
		return new Literal(names.get(index), random.nextBoolean());
	}

	@Override
	protected Node modify(IConstraint  c, IFeatureModel fm2) {
		Set<String> namesSet = Utils.getFeatureNames(fm2);
		ArrayList<String> names = new ArrayList<String>(namesSet);
		// remove the root
		names.remove(fm2.getStructure().getRoot().getFeature().getName());
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
	protected boolean isModifiable(IConstraint  c) {
		// TODO Auto-generated method stub
		return true;
	}

}
