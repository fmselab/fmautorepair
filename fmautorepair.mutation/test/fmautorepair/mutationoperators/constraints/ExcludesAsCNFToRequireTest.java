package fmautorepair.mutationoperators.constraints;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;
import org.prop4j.Implies;
import org.prop4j.NodeToString;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.constraints.ExcludesAsCNFToRequires;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

public class ExcludesAsCNFToRequireTest {

	@Test
	public void testMutate() throws FileNotFoundException, UnsupportedModelException {
		FeatureModel fm = Utils.readModel("models/model_excCNF.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(ExcludesAsCNFToRequires.instance.mutate(fm));
		// only one mutation
		assertEquals(1, res.size());
		// the original is not mutated
		assertTrue(fm.getConstraints().size() == 1);
		// the mutated is
		Pair<FeatureModel, String> fmm = res.get(0);
		assertNotSame(fmm, fm);
		//
		FeatureModel fmmm = fmm.getFirst();
		List<Constraint> cc = fmmm.getConstraints();
		assertTrue(cc.size() == 1);
		assertTrue(cc.get(0).getNode() instanceof Implies);
		System.out.println(NodeToString.nodeToStrings((cc.get(0).getNode())));
		assertEquals("( a1 =>  a2)",NodeToString.nodeToStrings(cc.get(0).getNode()).get(0).toString());
	}

}
