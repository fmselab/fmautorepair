package fmautorepair.utils;

import static org.junit.Assert.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.prop4j.FMToBDD;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.CoreFactoryWorkspaceLoader;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.impl.FMFactoryManager;
import de.ovgu.featureide.fm.core.base.impl.FMFormatManager;
import de.ovgu.featureide.fm.core.base.impl.MultiFeatureModelFactory;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelFormat;
import net.sf.javabdd.BDD;

public class CountTest {

	@Test
	public void count() {
		//FMCoreLibrary.getInstance().install();
		FMFactoryManager.getInstance().addExtension(DefaultFeatureModelFactory.getInstance());
		FMFactoryManager.getInstance().addExtension(MultiFeatureModelFactory.getInstance());
		FMFormatManager.getInstance().addExtension(new XmlFeatureModelFormat());
		FMFactoryManager.getInstance().setWorkspaceLoader(new CoreFactoryWorkspaceLoader());
		//Path path = Path.of("../fmautorepair.models/models/example_2.xml");
		Path path = Path.of("berkeleyDBModel.xml");
		assertTrue(Files.exists(path));
		IFeatureModel fm = FeatureModelManager.load(path);
		
		List<String> featureList = fm.getFeatures().stream().map(t -> t.getName()).collect(Collectors.toList());

		long initialTime = System.currentTimeMillis();

		// BDD Builder. It must be used for creating all BDDs in order to maintain the
		// same origin structure
		FMToBDD bdd_builder = new FMToBDD(featureList);
		// Convert the FM into its corresponding BDD
		BDD bddNew = bdd_builder.nodeToBDD(NodeCreator.createNodes(fm));		
		//System.out.println(bddNew.pathCount());
		System.out.println(bddNew.satCount());

	}
	
}
