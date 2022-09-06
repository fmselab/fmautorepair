package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
import fmautorepair.utils.Utils;

public class AlternativeToAndOptTest {
	static {
		LibraryManager.registerLibrary(FMCoreLibrary.getInstance());
	}

	@Test
	public void testMutation() throws FileNotFoundException, UnsupportedModelException {
		IFeatureModel fmodel = Utils
				.readModel(Consts.EXAMPLE_DIR + "examples_fmsfrompreprocessor/TKESSPLC11/Figure4_pv3.xml");
		assertNotNull(fmodel);
		List<FMMutation> res = CollectionsUtil.listFromIterator(AlternativeToAndOpt.instance.mutate(fmodel));
		assertEquals(1, res.size());
		System.out.println("ORIGINAL " + fmodel);
		System.out.println("RESULT " + res.get(0).getFirst());

	}

}