package testgeneration;

import java.io.FileNotFoundException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;

public abstract class OracleFIDE {
	
	public abstract boolean validity(Configuration conf);
	
	public abstract FeatureModel getFeatureModel() throws FileNotFoundException, UnsupportedModelException;

}