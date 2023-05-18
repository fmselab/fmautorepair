package testgeneration;

import java.io.FileNotFoundException;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;

public abstract class OracleFIDE {
	
	public abstract boolean validity(Configuration conf);
	
	public abstract IFeatureModel getFeatureModel() throws FileNotFoundException, UnsupportedModelException;

}