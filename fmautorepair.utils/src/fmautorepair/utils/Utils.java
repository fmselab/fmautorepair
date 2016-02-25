package fmautorepair.utils;

import java.io.File;
import java.io.FileNotFoundException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.AbstractFeatureModelReader;
import de.ovgu.featureide.fm.core.io.FeatureModelReaderIFileWrapper;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.guidsl.GuidslReader;
import de.ovgu.featureide.fm.core.io.sxfm.SXFMReader;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelReader;
import splar.core.fm.FeatureModelException;
import splar.core.fm.FeatureModelStatistics;
import splar.core.fm.XMLFeatureModel;

/** fmautorepair.utils to read models */
public class Utils{

	/** read models from the model project */
	
	static public FeatureModel readModel(String path) throws FileNotFoundException, UnsupportedModelException {
		FeatureModel fm = new FeatureModel();
		AbstractFeatureModelReader reader = new XmlFeatureModelReader(fm);
		reader.readFromFile(new File(path));
		return fm;
	}

	static public FeatureModel readSPLOTModel(String path) throws FileNotFoundException, UnsupportedModelException {
		FeatureModel fm = new FeatureModel();
		AbstractFeatureModelReader reader = new SXFMReader(fm);
		reader.readFromFile(new File(path));
		return fm;

	}

	static public FeatureModel readSGUIDSL(String path) throws FileNotFoundException, UnsupportedModelException {
		FeatureModel fm = new FeatureModel();
		GuidslReader guidslReader = new GuidslReader(fm);
		FeatureModelReaderIFileWrapper reader = new FeatureModelReaderIFileWrapper(guidslReader);
		reader.readFromFile(new File(path));
		return fm;

	}

	static public splar.core.fm.FeatureModel getSplotModel(String featureModelPath) throws FeatureModelException {
		// Create feature model object from an XML file (SXFM format - see
		// www.splot-research.org for details)
		// If an identifier is not provided for a feature use the feature name
		// as id
		splar.core.fm.FeatureModel featureModel = new XMLFeatureModel(featureModelPath,
				XMLFeatureModel.USE_VARIABLE_NAME_AS_ID);
		// load feature model from
		featureModel.loadModel();
		// Now, let's print some statistics about the feature model
		FeatureModelStatistics stats = new FeatureModelStatistics(featureModel);
		stats.update();

		// stats.dump();
		return featureModel;
	}

}
