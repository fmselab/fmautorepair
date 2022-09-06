package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertNotNull;

import java.io.FileNotFoundException;
import java.util.Iterator;

import org.junit.Test;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.utils.Utils;

public class MissingFeatureTest {

	@Test
	public void testMutateFeatureModelFeature() throws FileNotFoundException,
			UnsupportedModelException {
		IFeatureModel fmodel = Utils
				.readSPLOTModel("splotmodels_new/model_20091129_1734444143.xml");
		assertNotNull(fmodel);
		Node original = NodeCreator.createNodes(fmodel);
		System.err.println(original.toString());
		Iterator<FMMutation> mutations = MissingFeature.instance.mutate(fmodel);
		while(mutations.hasNext()){
			FMMutation mutation = mutations.next();
			Node ffm = NodeCreator.createNodes(mutation.getFirst());
			System.out.println(ffm.toString());	
		}
	}

}
