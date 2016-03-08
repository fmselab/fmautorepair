package splr.tst;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import splr.diff.DBWriter;
import splr.diff.DiffEngine;
import splr.diff.FeatureChangeRepository;
import splr.diff.FeatureModelDiff;
import splr.extractor.UndertakerModelExtractor;

public class UndertakerModelExtractorTest
{

	@Test
	/**
	 * Simple test of the Model extractor and comparison engine. 
	 * The changes expected are one extract attribute and one extra reference. 
	 * The test will fail if an exception is thrown.
	 * 
	 * @throws Exception
	 */
	public void basic() throws Exception
	{
		System.out.println( "Basic changes test - expecting 1 attr change, and 1 reference add." );

		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/basic_1.rsf" , "test1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/basic_2.rsf" , "test1" , "1" );
		ResourceSet res2 = ex.getModel();
		
		
		FeatureChangeRepository repo = new FeatureChangeRepository("basic","basic","2");
		DiffEngine model = new DiffEngine(repo);
		model.initModelFromXsd();
		model.setOldModel( res1 );
		model.setNewModel( res2 );
		model.getDiff();
		repo._nbFeatures = ex.getNbFeatures();
		
//		DBWriter db = new DBWriter();
//		repo.recordDiff( db );
//		db.disconnect();
		
	}

	@Test
	public void random() throws IOException, InterruptedException
	{
		System.out.println( "Random changes." );
		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/sample_init.rsf" , "test1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/sample_modif.rsf" , "test1" , "2" );
		ResourceSet res2 = ex.getModel();

		FeatureModelDiff.compare( res1 , res2 );
	}

	@Test
	public void attributeChange() throws Exception
	{
		System.out.println( "Adding - Removing attribute test." );

		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/sample_init.rsf" , "attributeChange1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/sample_add_attr.rsf" , "attributeChange2" , "2" );
		ResourceSet res2 = ex.getModel();

		System.out.println( "1) Adding" );
		FeatureChangeRepository repo = new FeatureChangeRepository("attributeChange","test1","1");
		DiffEngine model = new DiffEngine(repo);
		model.initModelFromXsd();
		model.setOldModel( res1 );
		model.setNewModel( res2 );
		model.getDiff();
		repo._nbFeatures = ex.getNbFeatures();

		System.out.println( "2) Removing" );
		FeatureChangeRepository repo2 = new FeatureChangeRepository("attributeChange","test1","2");
		model = new DiffEngine(repo2);
		model.initModelFromXsd();
		model.setOldModel( res2 );
		model.setNewModel( res1 );
		model.getDiff();
		repo2._nbFeatures = ex.getNbFeatures();
		
	}

	@Test
	public void selectChange() throws Exception
	{
		System.out.println( "Adding - Removing select statement." );

		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/sample_init.rsf" , "test1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/sample_add_select.rsf" , "test1" , "2" );
		ResourceSet res2 = ex.getModel();

		System.out.println( "1) Adding" );
		FeatureModelDiff.compare( res1 , res2 );

		System.out.println( "2) Removing" );
		FeatureModelDiff.compare( res2 , res1 );
	}

	@Test
	public void sanityCheck() throws Exception
	{
		System.out.println( " Comparing 2 identical models. Should have no output whatsoever" );

		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/sample_init.rsf" , "test1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/sample_init.rsf" , "test1" , "1" );
		ResourceSet res2 = ex.getModel();

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut( new PrintStream( outContent ) );

		FeatureModelDiff.compare( res1 , res2 );
		FeatureModelDiff.compare( res2 , res1 );

		assertEquals( 0 , outContent.toString().length() );

	}

	@Test
	public void sanityCheck2() throws Exception
	{

		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/complex_org.rsf" , "test1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/complex_org.rsf" , "test1" , "1" );
		ResourceSet res2 = ex.getModel();

		System.out.println( " Comparing 2 identical models. Should have no output whatsoever" );
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut( new PrintStream( outContent ) );

		FeatureModelDiff.compare( res1 , res2 );
		FeatureModelDiff.compare( res2 , res1 );

		assertEquals( 0 , outContent.toString().length() );

	}

	@Test
	public void sanityCheckWithLargeModel() throws Exception
	{
		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/undertaker_models/arm_V2.6.38.rsf" , "arm" , "V2.6.38" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/undertaker_models/arm_V2.6.38.rsf" , "arm" , "V2.6.38" );
		ResourceSet res2 = ex.getModel();

		System.out.println( "Database insert test. " );
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut( new PrintStream( outContent ) );

		DiffEngine model = new DiffEngine();
		model.initModelFromXsd();
		model.setOldModel( res1 );
		model.setNewModel( res2 );
		model.getDiff();
		
		FeatureChangeRepository repo = model.getRepo();
		repo._nbFeatures = ex.getNbFeatures();
		
		DBWriter db = new DBWriter();
		repo.recordDiff( db );
		db.disconnect();

		assertEquals( 0 , outContent.toString().length() );
	}
	
	
	public void firstEvolutionTest() throws Exception
	{
		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/undertaker_models/arm_V2.6.38.rsf" , "arm" , "V2.6.38" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/undertaker_models/arm_V2.6.39.rsf" , "arm" , "V2.6.39" );
		ResourceSet res2 = ex.getModel();

		FeatureModelDiff.compare( res1 , res2 );
	}

	@Test
	public void multiDefaultTest() throws Exception
	{
		System.out.println( " Testing multiple default value changes. " );

		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/multi_default_1.rsf" , "test1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/multi_default_2.rsf" , "test1" , "2" );
		ResourceSet res2 = ex.getModel();

		DiffEngine model = new DiffEngine();
		model.initModelFromXsd();
		model.setOldModel( res1 );
		model.setNewModel( res2 );
		model.getDiff();
	}
	
	@Test
	public void defaultReferencesTest() throws Exception
	{
		System.out.println( " Testing multiple default value changes. " );

		UndertakerModelExtractor ex = new UndertakerModelExtractor( "test_data/multi_default_1.rsf" , "test1" , "1" );
		ResourceSet res1 = ex.getModel();

		ex = new UndertakerModelExtractor( "test_data/multi_default_2.rsf" , "test1" , "2" );
		ResourceSet res2 = ex.getModel();
		
		
		FeatureChangeRepository repo = new FeatureChangeRepository("basic","basic","2");
		DiffEngine model = new DiffEngine(repo);
		model.initModelFromXsd();
		model.setOldModel( res1 );
		model.setNewModel( res2 );
		model.getDiff();
		repo._nbFeatures = ex.getNbFeatures();
		
		repo.consoleDump();
	}	
}
