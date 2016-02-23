package testgeneration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;

/**
 * compute the validity of a configuration calling cmake: the configuration is
 * valid if the cmake produces ??? and it corresponds to the given configuration
 * 
 * 
 * @author garganti
 *
 */
public class OracleFidebyCMake extends OracleFIDE {

	// allow that the model contains only a subseto fthe features
	private static final boolean allowsubset = true;

	static Logger logger = Logger.getLogger(OracleFidebyCMake.class);
	
	HashMap<String, String> confString2Feature = new HashMap<>();

	private File buildDir;
	private String srcDir; /// as string for simplicity it can be relative

	/**
	 * 
	 * @param the
	 *            directory
	 */
	public OracleFidebyCMake(String buildir, String srcDir) {
		File file = new File(buildir);
		assert file.exists() && file.isDirectory();
		this.buildDir = file;
		this.srcDir = srcDir;
	}

	@Override
	public boolean validity(Configuration configuration) {
		// clean the buildir
		logger.debug("cleaning " + buildDir.getAbsolutePath());
		purgeDirectory(buildDir);
		//
		Collection<String> featureNames = new ArrayList<>(configuration.getFeatureModel().getFeatureNames());
		featureNames.remove(configuration.getFeatureModel().getRoot().getName());
		Set<String> selected = configuration.getSelectedFeatureNames();
		// building the process
		// add the options for the selected features
		// -DWITH_ZLIB=OFF
		List<String> commands = new ArrayList<>();
		commands.add("cmake");
		commands.add(srcDir);		
		for(String f: featureNames){
			if (selected.contains(f)){
				commands.add("-D"+f+"=ON");
			}else{
				commands.add("-D"+f+"=OFF");				
			}
		}
		ProcessBuilder pb = new ProcessBuilder(commands);
		// change to the build dir
		pb.directory(buildDir);
		try {
			// call cmake
			logger.debug("executing " + pb.command());
			Process p = pb.start();
			// read the output
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			HashMap<String, Boolean> selectedFeatures = new HashMap<>();
			String line;
			while ((line = reader.readLine()) != null) {
				// get the lines like:
				// -- zlib support: ON				
				if (line.contains("support")){
					// get the feature name
					String featureComment = line.substring(3, line.indexOf(' ', 3));
					// using con2String
					// String feature = confString2Feature.get(featureComment);
					// or using a convention (require a modification of the CMAKELIST
					String feature = "WITH_" +featureComment.toUpperCase();
					assert feature != null: "feature " + featureComment + " not found";
					if (line.contains(": ON"))
						selectedFeatures.put(feature, true);
					else{
						assert line.contains(": OFF");
						selectedFeatures.put(feature, false);
					}
				}
			}
			// check that the result is correct
			//
			// search for keywords for features
			for (Entry<String, Boolean> entry: selectedFeatures.entrySet()){
				String feature = entry.getKey();
				// every feature must be in the model
				assert allowsubset || featureNames.contains(feature) : "feature " + feature + " not found";
				// every selected feature must be in the cmake config file
				if (selected.contains(feature) && ! entry.getValue()){
					logger.debug("feature " + feature + " is selected in conf but not in cmake");
					return false;
				}				
				if (! selected.contains(feature) && entry.getValue()){
					logger.debug("feature " + feature + " is selected cmake but not in config");
					return false;
				} 
			}
			return true;			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void addString2Feature(String comment, String feature){
		confString2Feature.put(comment,feature);
	}
	
	static void purgeDirectory(File dir) {
		for (File file : dir.listFiles()) {
			if (file.isDirectory())
				purgeDirectory(file);
			file.delete();
		}
	}

	@Override
	public FeatureModel getFeatureModel() throws FileNotFoundException,
			UnsupportedModelException {
		// TODO Auto-generated method stub
		return null;
	}

}
