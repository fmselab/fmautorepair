package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.init.LibraryManager;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.Consts;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

// alt to AND --> lla children mandatory
public class AlternativeToAndTest {

	static {
		LibraryManager.registerLibrary(FMCoreLibrary.getInstance());
	}

	
	@Test
	public void test() throws FileNotFoundException, UnsupportedModelException {
		IFeatureModel fm = Utils.readModel(Consts.EXAMPLE_DIR + "models/model1fi.xml");
		assertTrue(fm.getStructure().getRoot().isAlternative());
		List<FMMutation> res = CollectionsUtil.listFromIterator(AlternativeToAnd.instance.mutate(fm));
		// only one mutation
		assertEquals(1, res.size());
		// the original is not mutated
		assertTrue(fm.getStructure().getRoot().toString() + " " + fm.getStructure().getRoot().isAnd() + " " + fm.getStructure().getRoot().isOr(), fm.getStructure().getRoot().isAlternative());
		// the mutated is 
		Pair<IFeatureModel, String> fmm = res.get(0);
		assertNotSame(fmm, fm);
		// 
		IFeatureModel fmmm = fmm.getFirst();
		assertTrue(fmmm.getStructure().getRoot().isAnd());
		assertTrue(fmmm.getStructure().getRoot().getChildren().size() == 3);
		assertTrue(fmmm.getStructure().getRoot().getChildren().get(0).isMandatory());
		assertTrue(fmmm.getStructure().getRoot().getChildren().get(1).isMandatory());
		assertTrue(fmmm.getStructure().getRoot().getChildren().get(2).isMandatory());
		
		
	}

}
