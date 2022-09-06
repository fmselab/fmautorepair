package fmautorepair.mutationoperators.constraints;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;
import org.prop4j.NodeToString;

import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

public class LiteralChangerTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
		public void testMutateFaulty() throws FileNotFoundException, UnsupportedModelException {
			IFeatureModel fm = Utils.readModel("models/Example1_FAULTY.xml");
			List<FMMutation> res = CollectionsUtil.listFromIterator(LiteralChanger.instance.mutate(fm));
			// only one mutation
			assertEquals(2, res.size());
			// the original is not mutated
			assertTrue(fm.getConstraints().size() == 2);
			// the mutated is
			Pair<IFeatureModel, String> fmm = res.get(0);
			assertNotSame(fmm, fm);
			//
			IFeatureModel fmmm = fmm.getFirst();
			List<IConstraint> cc = fmmm.getConstraints();
			assertTrue(cc.size() == 2);
		//	assertTrue(cc.get(1).getNode() instanceof Implies);
			System.out.println(NodeToString.nodeToStrings((cc.get(0).getNode())));
			//assertEquals("[( fosd10_ex1 =>  BYE)]",NodeToString.nodeToStrings(cc.get(1).getNode()).toString());
		}
	

}
