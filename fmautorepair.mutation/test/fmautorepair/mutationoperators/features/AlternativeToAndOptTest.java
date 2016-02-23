package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.features.AlternativeToAndOpt;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Utils;

public class AlternativeToAndOptTest {

	
	@Test
	public void testMutation() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("examples_fmsfrompreprocessor/TKESSPLC11/Figure4_pv3.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(AlternativeToAndOpt.instance.mutate(fmodel));

		assertEquals(1,res.size());
		System.out.println("ORIGINAL "+fmodel);
		System.out.println("RESULT "+res.get(0).getFirst());
		
	}

}