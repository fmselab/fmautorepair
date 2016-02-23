package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.features.OptionalToMandatory;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Utils;


public class OptionalToMandatoryTest {

	@Test
	public void testOr2Mandatory() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("models/modelfman.xml");
		// take a feature with an or
		Feature g = fmodel.getFeature("g");
	}

	@Test
	public void testMutation() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("models/modelfman.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(OptionalToMandatory.instance.mutate(fmodel));	
		assertEquals(1,res.size());		
	}

	@Test
	public void testMutation2() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("models/model3.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(OptionalToMandatory.instance.mutate(fmodel));	
		assertEquals(2,res.size());		
	}

	
}
