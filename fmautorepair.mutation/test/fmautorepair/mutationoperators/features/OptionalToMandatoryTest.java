package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Utils;


public class OptionalToMandatoryTest {

	@Test
	public void testOr2Mandatory() throws FileNotFoundException,
			UnsupportedModelException {
		IFeatureModel fmodel = Utils.readModel("models/modelfman.xml");
		// take a IFeature with an or
		IFeature g = fmodel.getFeature("g");
	}

	@Test
	public void testMutation() throws FileNotFoundException,
			UnsupportedModelException {
		IFeatureModel fmodel = Utils.readModel("models/modelfman.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(OptionalToMandatory.instance.mutate(fmodel));	
		assertEquals(1,res.size());		
	}

	@Test
	public void testMutation2() throws FileNotFoundException,
			UnsupportedModelException {
		IFeatureModel fmodel = Utils.readModel("models/model3.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(OptionalToMandatory.instance.mutate(fmodel));	
		assertEquals(2,res.size());		
	}

	
}
