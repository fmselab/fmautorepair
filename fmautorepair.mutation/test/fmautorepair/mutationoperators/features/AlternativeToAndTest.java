package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.features.AlternativeToAnd;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

// alt to AND --> lla children mandatory
public class AlternativeToAndTest {

	@Test
	public void test() throws FileNotFoundException, UnsupportedModelException {
		FeatureModel fm = Utils.readModel("models/model1fi.xml");
		assertTrue(fm.getRoot().isAlternative());
		List<FMMutation> res = CollectionsUtil.listFromIterator(AlternativeToAnd.instance.mutate(fm));
		// only one mutation
		assertEquals(1, res.size());
		// the original is not mutated
		assertTrue(fm.getRoot().toString() + " " + fm.getRoot().isAnd() + " " + fm.getRoot().isOr(), fm.getRoot().isAlternative());
		// the mutated is 
		Pair<FeatureModel, String> fmm = res.get(0);
		assertNotSame(fmm, fm);
		// 
		FeatureModel fmmm = fmm.getFirst();
		assertTrue(fmmm.getRoot().isAnd());
		assertTrue(fmmm.getRoot().getChildren().size() == 3);
		assertTrue(fmmm.getRoot().getChildren().get(0).isMandatory());
		assertTrue(fmmm.getRoot().getChildren().get(1).isMandatory());
		assertTrue(fmmm.getRoot().getChildren().get(2).isMandatory());
		
		
	}

}
