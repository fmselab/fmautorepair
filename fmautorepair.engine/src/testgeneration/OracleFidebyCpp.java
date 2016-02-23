package testgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.utils.Utils;

public class OracleFidebyCpp extends OracleFIDE {
	static Logger logger = Logger.getLogger(OracleFidebyCpp.class);
	private String name;
	private File file;

	/**
	 * 
	 * @param file
	 *            of the feature model. The program c/c++ file to be compiled
	 *            must have the same name (with extension c or c++) and be in
	 *            the same directory
	 */
	public OracleFidebyCpp(File file) {
		this.file = file;
		if(file.getName().endsWith(".c"))
		name = file.getName().replace(".c", "");else
			name = file.getName().replace(".cpp","");

	}

	@Override
	public FeatureModel getFeatureModel() throws FileNotFoundException,
			UnsupportedModelException {
		String splotmodel = file.getParent() + File.separator
				+ name+"_oracle.xml";
		FeatureModel oracleFM = Utils.readModel(splotmodel);
		if (oracleFM.getRoot().isAbstract())
			oracleFM.getRoot().setAbstract(false);

		if (oracleFM.getComments().size() == 0) {

			oracleFM.addComment(name);

		}

		return oracleFM;

	}

	@Override
	public boolean validity(Configuration configuration) {
		CompilationResult compResult = compileProduct(configuration,
				file.getParent(), name);
		// if it is compiled retrun true (the configuration is valid)
		if (compResult == CompilationResult.SUCCESS) {
			logger.info("SUCCEDED");
			return true;
		} else {
			logger.info("ERROR  " + compResult);
			return false;
		}
	}
	static CompilationResult compileProduct(Configuration configuration, String dir,
			String name) {
		// check the source code
		String path = dir + File.separator;
		File cFile = new File(path + name + ".c");
		File cppFile = new File(path + name + ".cpp");
		LANG l;
		if (cFile.exists())
			l = LANG.C;
		else {
			assert cppFile.exists();
			l = LANG.CPP;
		}
		// build the options for the compiler
		List<String> compileOptions = new ArrayList<>();
		// first add the compiler
		compileOptions.add(l.compiler);
		// add the features which ar true
		// for(String entry: t.getFirst()){
		// compileOptions.add("-D"+entry);
		// }
		Set<String> DsList = configuration.getSelectedFeatureNames();
		//DsList.remove(0);
		// DsList.remove(0);
		for (String c : DsList) {

			compileOptions.add("-D" + c);

		}
		logger.info(compileOptions);
		// add the output
		compileOptions.add("-o");
		// TODO in windows avoid the .exe
		// use exe to exclude *.exe from svn
		compileOptions.add(name + ".exe");
		// add the name of the file to compile
		compileOptions.add(name + "." + l.extension);

		// compute the directory in which to compile
		File parentDir = new File(dir);
		assert parentDir.exists() && parentDir.isDirectory();
		// start compilation
		ProcessBuilder pb = new ProcessBuilder(compileOptions);
		pb.directory(parentDir);
		pb.redirectErrorStream(true);
		// check is the output file exists
		try {
			Process p = pb.start();

			// add a sleep since it seems that waitfor is not enough
			Thread.sleep(200);
			p.waitFor();
			// 0 indicates normal termination
			if (p.exitValue() != 0)
				return CompilationResult.EXIT_ERROR;
			else {
				// remove the exec
				String execname = path + name + ".exe";
				File execFile = new File(execname);
				assert (execFile.exists()) : execname;
				assert execFile.delete();
				return CompilationResult.SUCCESS;
			}
		} catch (IOException e) {
			System.err.println("ERRORE");
			e.printStackTrace();
			return CompilationResult.IOException;
		} catch (InterruptedException e) {
			System.err.println("ERRORE");
			e.printStackTrace();
			return CompilationResult.InterruptedException;
		}
	}

	enum CompilationResult {
		EXIT_ERROR, SUCCESS, IOException, InterruptedException;
	}

	enum LANG {
		C("gcc", "c"), CPP("g++", "cpp");
		String compiler;
		String extension;

		LANG(String compiler, String ext) {
			this.compiler = compiler;
			this.extension = ext;
		}
	}

}
