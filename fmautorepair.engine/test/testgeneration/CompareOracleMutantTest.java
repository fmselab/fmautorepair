package testgeneration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.prop4j.Node;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import splar.core.fm.FeatureModelException;
import splar.core.fm.configuration.ConfigurationEngineException;
import fmautorepair.utils.Utils;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompareOracleMutantTest {

	@Test
	public void testAlt2() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/alt2.xml", "toyExamples/alt2Mutant.xml");
		assertEquals(4, adequacy.getNumConfigurations());
		assertEquals(2, adequacy.getNumConfsJudgedCorrectly());
	}

	@Test
	public void testAlt3() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/alt3.xml", "toyExamples/alt3Mutant.xml");
		assertEquals(8, adequacy.getNumConfigurations());
		assertEquals(3, adequacy.getNumConfsJudgedCorrectly());
	}

	@Test
	public void testAlt4() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/alt4.xml", "toyExamples/alt4Mutant.xml");
		assertEquals(16, adequacy.getNumConfigurations());
		assertEquals(4, adequacy.getNumConfsJudgedCorrectly());
	}

	@Test
	public void testAndAlt() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/andAlt.xml", "toyExamples/andAltMutant.xml");
		assertEquals(16, adequacy.getNumConfigurations());
		assertEquals(13, adequacy.getNumConfsJudgedCorrectly());

		adequacy = CompareOracleMutantBDD.getConformance("toyExamples/andAltMutant.xml", "toyExamples/andAlt.xml");
		assertEquals(16, adequacy.getNumConfigurations());
		assertEquals(13, adequacy.getNumConfsJudgedCorrectly());
	}

	@Test
	public void testOptMan_manOpt() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/optMan.xml", "toyExamples/manOpt.xml");
		assertEquals(4, adequacy.getNumConfigurations());
		assertEquals(2, adequacy.getNumConfsJudgedCorrectly());

		adequacy = CompareOracleMutantBDD.getConformance("toyExamples/manOpt.xml", "toyExamples/optMan.xml");
		assertEquals(4, adequacy.getNumConfigurations());
		assertEquals(2, adequacy.getNumConfsJudgedCorrectly());	
	}

	@Test
	public void testMan2Opt2_Opt2Man2() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/man2Opt2.xml", "toyExamples/opt2Man2.xml");
		assertEquals(16, adequacy.getNumConfigurations());
		assertEquals(10, adequacy.getNumConfsJudgedCorrectly());

		adequacy = CompareOracleMutantBDD.getConformance("toyExamples/opt2Man2.xml", "toyExamples/man2Opt2.xml");
		assertEquals(16, adequacy.getNumConfigurations());
		assertEquals(10, adequacy.getNumConfsJudgedCorrectly());
	}

	@Test
	public void testAlt4_alt4Mutant2() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/alt4.xml", "toyExamples/alt4Mutant2.xml");
		assertEquals(16, adequacy.getNumConfigurations());
		assertEquals(6, adequacy.getNumConfsJudgedCorrectly());

		adequacy = CompareOracleMutantBDD.getConformance("toyExamples/alt4Mutant2.xml", "toyExamples/alt4.xml");
		assertEquals(16, adequacy.getNumConfigurations());
		assertEquals(6, adequacy.getNumConfsJudgedCorrectly());
	}

	// with some extra features
	@Test
	public void testAltExtra() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		// the second one has an extra features
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/alt2_extraf.xml","toyExamples/alt2.xml");
		assertEquals(8, adequacy.getNumConfigurations());
		assertEquals(7, adequacy.getNumConfsJudgedCorrectly());
		// the other way around
		try{
			adequacy = CompareOracleMutantBDD.getConformance("toyExamples/alt2.xml", "toyExamples/alt2_extraf.xml");
			fail("");
		} catch(Throwable e){}
	}

	@Test
	public void testAndExtra() throws UnsupportedModelException, TimeoutException, IOException, FeatureModelException, ConfigurationEngineException {
		// the second one has an extra features
		Conformance adequacy = CompareOracleMutantBDD.getConformance("toyExamples/and_extraf.xml","toyExamples/and.xml");
		assertEquals(8, adequacy.getNumConfigurations());
		assertEquals(7, adequacy.getNumConfsJudgedCorrectly());
		// the other way around
		try{
			adequacy = CompareOracleMutantBDD.getConformance("toyExamples/and.xml", "toyExamples/and_extraf.xml");
			fail("");
		} catch(Throwable e){}
	}



	@Test
	public void testEqualsNoConstraints() throws FileNotFoundException, UnsupportedModelException {
		FeatureModel eq1= Utils.readModel("toyExamples/equals1.xml");
		FeatureModel eq2 = Utils.readModel("toyExamples/equals2.xml");
		
		System.out.println(eq1.equals(eq2));
		
		System.out.println(eq1.hashCode());
		System.out.println(eq2.hashCode());
		
		Node eq1N = NodeCreator.createNodes(eq1,false);
		Node eq2N = NodeCreator.createNodes(eq2,false);
		
		System.out.println(eq1N.equals(eq2N));
		
		System.out.println(eq2N.toCNF());
//		for(Node c: eq2N.getChildren()){
//			System.out.print(c);
//		}
//		System.out.println();
		
		System.out.println(eq1N.toCNF());
//		for(Node c: eq1N.getChildren()){
//			System.out.print(c);
//		}
	
	} 
	@Test
	public void testEqualsConstraints() throws FileNotFoundException, UnsupportedModelException {
		FeatureModel eq1= Utils.readModel("toyExamples/equals1c.xml");
		FeatureModel eq2 = Utils.readModel("toyExamples/equals2c.xml");
		
		System.out.println(eq1.equals(eq2));
		
		System.out.println(eq1.hashCode());
		System.out.println(eq2.hashCode());
		
		Node eq1N = NodeCreator.createNodes(eq1,false);
		Node eq2N = NodeCreator.createNodes(eq2,false);
		
		System.out.println(eq1N.equals(eq2N));

		System.out.println(eq1N.hashCode());
		System.out.println(eq2N.hashCode());

		
		System.out.println(eq2N.toCNF());
//		for(Node c: eq2N.getChildren()){
//			System.out.print(c);
//		}
//		System.out.println();
		
		System.out.println(eq1N.toCNF());
//		for(Node c: eq1N.getChildren()){
//			System.out.print(c);
//		}
	
	} 
}
