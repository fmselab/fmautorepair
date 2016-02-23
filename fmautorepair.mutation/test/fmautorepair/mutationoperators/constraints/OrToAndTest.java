package fmautorepair.mutationoperators.constraints;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;
import org.prop4j.And;
import org.prop4j.NodeToString;

import de.ovgu.featureide.fm.core.Constraint;
import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.constraints.LogicOrToAnd;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

public class OrToAndTest  {
		@Test
		public void testMutate() throws FileNotFoundException, UnsupportedModelException {
			FeatureModel fm = Utils.readModel("models/model_or.xml");
			List<FMMutation> res = CollectionsUtil.listFromIterator(LogicOrToAnd.instance.mutate(fm));
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
			assertTrue(cc.get(0).getNode() instanceof And);
			
			System.out.println(NodeToString.nodeToStrings((cc.get(0).getNode())) );
			
			
		}

}
