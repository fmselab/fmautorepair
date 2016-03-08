package splr.tst;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import splr.diff.DiffEngine;
import splr.diff.FeatureChangeRepository;
import splr.extractor.UndertakerModelExtractor;

public class ChangeRepoTest
{
	
	@Test
	public void testCompareModels() throws Exception
	{
		FeatureChangeRepository repo = new FeatureChangeRepository("x86","2.6.38","2.6.39");

		
		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/undertaker_models/x86_V2.6.38.rsf" , "x86" , "V2.6.38" );
		ResourceSet res1 = ex.getModel();
		int nbFeatBefore = ex.getNbFeatures();
		
		ex = new UndertakerModelExtractor( "test_data/undertaker_models/x86_V2.6.39.rsf" , "x86" , "V2.6.39" );
		ResourceSet res2 = ex.getModel();
		int nbFeatAfter = ex.getNbFeatures();
		
		DiffEngine model = new DiffEngine(repo);
		model.initModelFromXsd();
		model.setOldModel( res1 );
		model.setNewModel( res2 );
		model.getDiff();
		
//		BufferedWriter wr = new BufferedWriter( new FileWriter( "output.csv" ));
//		
//		wr.append( "nb features before,"+nbFeatBefore+",nb features after,"+nbFeatAfter +"\n" );
//		wr.flush();
//		
//		repo.dumpCSV(wr,true);
//		
//		wr.flush();
//		wr.close();
		
	}
	
}
