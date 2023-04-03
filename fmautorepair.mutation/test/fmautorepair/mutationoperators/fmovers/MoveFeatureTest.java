package fmautorepair.mutationoperators.fmovers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.io.FileNotFoundException;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Pair;
import fmautorepair.utils.Utils;

public class MoveFeatureTest {
	
	@BeforeClass
	public static void setup() {
		Logger.getLogger(MoveFeature.class).setLevel(Level.DEBUG);
	}	

	@Test
	public void testMutate() throws FileNotFoundException, UnsupportedModelException {		
		IFeatureModel fm = Utils.readModel("examples_fmsfrompreprocessor/nadi_icse14/Example1_pa.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(MoveFeature.instance.mutate(fm));
		IFeatureModel fmm = res.get(0).getFirst();
		assertNotSame(fmm, fm);
	}

	
	@Test
	public void testIteratorNull0() throws FileNotFoundException, UnsupportedModelException {
		// questo da errore per via degli iterator che
		// ha solo una IFeature 
		IFeatureModel fm = Utils.readModel("models/Example1_pa.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(MoveFeature.instance.mutate(fm));
		for (FMMutation f: res){
			System.out.println(f);
		}
		assertEquals(0,res.size());		
	}
	
	@Test
	public void testMutate2features() throws FileNotFoundException, UnsupportedModelException {		
		IFeatureModel fm = Utils.readModel("models/example_2.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(MoveFeature.instance.mutate(fm));
		Pair<IFeatureModel, String> fmm = res.get(0);
		assertNotSame(fmm, fm);
		
	}
	
	@Test
	public void testSecondOrder() throws FileNotFoundException, UnsupportedModelException{
		IFeatureModel a = Utils.readModel("examples_fmsfrompreprocessor/nadi_icse14/listing2_ash_busybox_ag2.xml");
		List<FMMutation> res = CollectionsUtil.listFromIterator(MoveFeature.instance.mutate(a));
		//
		for(FMMutation p: res){
			System.out.println("****" + p.getFirst() + " " + p.getSecond());
			res = CollectionsUtil.listFromIterator(MoveFeature.instance.mutate(p.getFirst()));
		}
	}
	@Test
	public void testMove() throws FileNotFoundException, UnsupportedModelException{
		IFeatureModel a = Utils.readModel("examples_fmsfrompreprocessor/nadi_icse14/listing2_ash_busybox_ag2.xml");
		FMMutation res = MoveFeature.moveFeatureTo(a, a.getFeature("ASH"), a.getFeature("EDITING_VI"));
		System.out.println(res.getFirst() + "\n " + Utils.getFeatureNames(res.getFirst()));
	}
	
}

