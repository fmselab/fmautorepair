package testgeneration;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.sxfm.SXFMWriter;
import fmautorepair.utils.Utils;
import net.sf.javabdd.BDD;
import splar.core.fm.FeatureModelException;
import splar.core.fm.XMLFeatureModel;
import splar.core.fm.configuration.ConfigurationEngineException;
import splar.plugins.configuration.bdd.javabdd.BDDConfigurationEngine;
import splar.plugins.reasoners.bdd.javabdd.FMReasoningWithBDD;

public class CountConfigurationsTest {

	@Test
	public void testEqualsNoConstraints() throws UnsupportedModelException, FeatureModelException, ConfigurationEngineException, IOException {
		IFeatureModel eq1= Utils.readModel("toyExamples/equals1.xml");
		IFeatureModel eq2 = Utils.readModel("toyExamples/equals2.xml");
		
		/* use spar to count the valid configurations */
		SXFMWriter sxfmWriter = new SXFMWriter(eq1);
		File temp = File.createTempFile("tempfile", ".temp");
		sxfmWriter.writeToFile(temp);
		splar.core.fm.IFeatureModel IFeatureModel = new XMLFeatureModel(temp.getAbsolutePath(),
				XMLFeatureModel.USE_VARIABLE_NAME_AS_ID);
		IFeatureModel.loadModel();
		BDDConfigurationEngine confEngine = new BDDConfigurationEngine(temp.getAbsolutePath());
		confEngine.reset();
		FMReasoningWithBDD reasoner = confEngine.getReasoner();
		BDD bdd1 = reasoner.getBDD();
		//
		//System.out.println(bdd1.satCount());
	}

	@Test
	public void testEqualsNoConstraints2() throws UnsupportedModelException, FeatureModelException, ConfigurationEngineException, IOException {
		IFeatureModel eq1= Utils.readModel("toyExamples/equals1.xml");
		IFeatureModel eq2 = Utils.readModel("toyExamples/equals2.xml");
		int num1 = CompareOracleMutantBDD.getBddsCount(eq1);
		int num2 = CompareOracleMutantBDD.getBddsCount(eq2);
		assertEquals(num1, num2);
	}

	@Test
	public void testGeneralizationAlt2() throws UnsupportedModelException, FeatureModelException, ConfigurationEngineException, IOException {
		IFeatureModel fm1 = Utils.readModel("toyExamples/alt2.xml");
		IFeatureModel fm2 = Utils.readModel("toyExamples/alt2Mutant.xml");
		assertEquals(2, CompareOracleMutantBDD.getGeneralizationDifference(fm1, fm2));
	}

	@Test
	public void testSpecializationAlt2() throws UnsupportedModelException, FeatureModelException, ConfigurationEngineException, IOException {
		IFeatureModel fm1 = Utils.readModel("toyExamples/alt2.xml");
		IFeatureModel fm2 = Utils.readModel("toyExamples/alt2Mutant.xml");
		assertEquals(2, CompareOracleMutantBDD.getSpecializationDifference(fm2, fm1));
	}

	@Test
	public void testGeneralizationAlt4() throws UnsupportedModelException, FeatureModelException, ConfigurationEngineException, IOException {
		IFeatureModel fm1 = Utils.readModel("toyExamples/alt4.xml");
		IFeatureModel fm2 = Utils.readModel("toyExamples/alt4Mutant.xml");
		assertEquals(12, CompareOracleMutantBDD.getGeneralizationDifference(fm1, fm2));
	}

	@Test
	public void testSpecializationAlt4() throws UnsupportedModelException, FeatureModelException, ConfigurationEngineException, IOException {
		IFeatureModel fm1 = Utils.readModel("toyExamples/alt4.xml");
		IFeatureModel fm2 = Utils.readModel("toyExamples/alt4Mutant.xml");
		assertEquals(12, CompareOracleMutantBDD.getSpecializationDifference(fm2, fm1));
	}

	@Test
	public void testArbitraryEdit() throws UnsupportedModelException, FeatureModelException, ConfigurationEngineException, IOException {
		IFeatureModel fm1 = Utils.readModel("toyExamples/alt2.xml");
		IFeatureModel fm2 = Utils.readModel("toyExamples/alt2Mutant2.xml");
		ModelComparator comparator = new ModelComparator(1000000);
		Comparison comparison = comparator.compare(fm1, fm2);
		System.out.println(comparison);
		assertEquals(3, CompareOracleMutantBDD.getArbitraryEditDifference(fm1, fm2));
	}
}
