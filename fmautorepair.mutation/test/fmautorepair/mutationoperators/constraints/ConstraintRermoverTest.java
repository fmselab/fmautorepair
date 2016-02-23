package fmautorepair.mutationoperators.constraints;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.constraints.ConstraintRemover;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

public class ConstraintRermoverTest {
	@Test
	public void testMutate() throws FileNotFoundException, UnsupportedModelException {
		FeatureModel fm = Utils.readModel("models/model_and.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(ConstraintRemover.instance.mutate(fm));
		// only one mutation
		assertEquals(1, res.size());
		// the original is not mutated
		assertTrue(fm.getConstraints().size() == 1);
		// the mutated is
		Pair<FeatureModel, String> fmm = res.get(0);
		assertNotSame(fmm, fm);
		//
		FeatureModel fmmm = fmm.getFirst();
		
		
		
		assertEquals(fmmm.getConstraints().size(),fm.getConstraints().size()-1);
	}
}
