package fmautorepair.mutationoperators.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.beans.Expression;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.Feature;
import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.features.MandatoryToOptional;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Utils;


public class MandatoryToOptionalTest {

	@Test
	public void testFalseMandatory() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("models/modelfman.xml");
		// a1 is mandatory ma non reale (non mutare)
		Feature a1 = fmodel.getFeature("a1");
		assertTrue(a1.isMandatory());
		assertFalse(MandatoryToOptional.isTrueMandatory(a1));
		// B is mandatory reale (da mutare)
		Feature B = fmodel.getFeature("B");
		assertTrue(B.isMandatory());
		assertTrue(MandatoryToOptional.isTrueMandatory(B));
		// f is optional
		Feature f = fmodel.getFeature("f");
		assertFalse(f.isMandatory());
		// d is mandatory reale (da mutare)
		Feature d = fmodel.getFeature("d");
		assertTrue(d.isMandatory());
		assertTrue(MandatoryToOptional.isTrueMandatory(d));
		//
		Feature c1 = fmodel.getFeature("c1");
		assertTrue(c1.isMandatory());
		assertFalse(MandatoryToOptional.isTrueMandatory(c1));
		Feature c2 = fmodel.getFeature("c2");
		assertTrue(c2.isMandatory());
		assertFalse(MandatoryToOptional.isTrueMandatory(c2));
		Feature g = fmodel.getFeature("g");
		assertTrue(g.isMandatory());
		assertFalse(MandatoryToOptional.isTrueMandatory(g));
		// i is mandatoria reale
		Feature i = fmodel.getFeature("i");
		assertTrue(i.isMandatory());
		assertTrue(MandatoryToOptional.isTrueMandatory(i));
		// w is not mandatory
		Feature w = fmodel.getFeature("w");
		assertTrue(w.isMandatory());
		assertFalse(MandatoryToOptional.isTrueMandatory(w));
	}

	@Test
	public void testMutation() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("models/modelfman.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(MandatoryToOptional.instance.mutate(fmodel));	
		assertEquals(4,res.size());		
	}

	@Test
	public void testMutation4() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("models/model4.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(MandatoryToOptional.instance.mutate(fmodel));	
		assertEquals(2,res.size());		
	}
	
	@Test
	public void testMutation1Mandatory() throws FileNotFoundException,
			UnsupportedModelException {
		FeatureModel fmodel = Utils.readModel("models/model_one_mandatory.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(MandatoryToOptional.instance.mutate(fmodel));	
		assertEquals(1,res.size());
		// converto
		Node ffm = NodeCreator.createNodes(fmodel,false);
		//IdExpressionCreator iec = new IdExpressionCreator();		
		// constraints impliciti ed ecpliciti (TUTTI)
		//ArrayList<Expression> constraints = new ArrayList<>(NodeToExpression.nodeToConstraints(ffm,iec));
		//System.out.println(constraints);
	}
}
