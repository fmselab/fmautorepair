package featureide.testgeneration;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.utils.Utils;
import splar.core.fm.FeatureModelException;
import splar.core.fm.configuration.ConfigurationEngineException;
import testgeneration.OracleFidebyCpp;

public class ExperimentsCpp {
	private static final String FMAUTOREPAIR_MODELS = "/fmautorepair.models";
	static private DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HHmmss");

	public static void main(String[] args) throws UnsupportedModelException, IOException, TimeoutException,
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		Logger.getLogger(AlgorithmUsingFIDE.class).setLevel(Level.OFF);
		Logger.getLogger("mutationoperators").setLevel(Level.OFF);
		
		File dir = new File(System.getProperty("user.dir")).getParentFile();
		String a = null;
		try {
			a = URLDecoder.decode(dir.getAbsolutePath()+FMAUTOREPAIR_MODELS, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("user.dir", a);
		// System.out.println("Starting");
		//
		// testAllMutantsMT("examples_fmsfrompreprocessor/",
		// AutoremoverFIDECollect.factory, 3600, 1, "Collect", 10, false);
		testAllMutantsMT(a+"/"+"examples_fmsfrompreprocessor/", AutoremoverFIDE_FOM.factory, 3600, 1, "ONEDC", 10, false);
		// testAllMutantsMT("examples_fmsfrompreprocessor/",
		// AutoremoverFIDE_SOM_InOrder.factory, 3600, 10, "SecondOrder", 1,
		// false);
		// testAllMutantsMT("examples_fmsfrompreprocessor/",
		// AutoremoverFIDE_FOMmultiDCs.factory(3), 3600, 10, "Multi", 1, false);
	}

	/**
	 * Test all mutants mt.
	 *
	 * @param folder
	 *            the folder
	 * @param auto1
	 *            the auto1
	 * @param secondsTIMEOUT
	 *            the seconds timeout
	 * @param nsThread
	 *            the ns thread
	 * @param className
	 *            the class name
	 * @param Nruns
	 *            the nruns
	 * @param stdoutput
	 *            TODO
	 * @throws UnsupportedModelException
	 *             the unsupported model exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ParseException
	 *             the parse exception
	 * @throws TimeoutException
	 *             the timeout exception
	 * @throws FeatureModelException
	 *             the feature model exception
	 * @throws ConfigurationEngineException
	 *             the configuration engine exception
	 * @throws ExecutionException
	 *             the execution exception
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public static void testAllMutantsMT(String folder, AlgorithmUsingFIDE.AutoremoverFIDEFactory auto1,
			int secondsTIMEOUT, int nsThread, String className, int Nruns, boolean stdoutput)
					throws UnsupportedModelException, IOException,
					TimeoutException, FeatureModelException, ConfigurationEngineException, ExecutionException,
					InterruptedException {
		try {

			File file = new File(folder);
			String[] names = file.list();
			Arrays.sort(names, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.compareToIgnoreCase(o2);
				}
			});
			ArrayList<String> list = new ArrayList<>();
			GeneratorThread t = null;
			for (String name : names) {
				if (new File(folder + name).isDirectory()) {
					list.add(name);
				}
			}

			Date date = new Date();
			String resultfilename = "CPP__" + dateFormat.format(date) + className + ".txt";
			PrintStream results;
			if (stdoutput) {
				results = new PrintStream(System.out);
			} else {
				results = new PrintStream(new BufferedOutputStream(new FileOutputStream(resultfilename)));
			}
			/*
			 * results.print("run\t"); results.print("model\t");
			 * results.print("time\t"); results.print("oldAd\t");
			 * results.print("newAd\t"); results.print("oldAd(%)\t");
			 * results.print("newAd(%)\t"); results.print("gap(%)\t");
			 * results.print("#DCs\t"); results.print("#DCsGen\t");
			 * results.print("#confs\t"); results.print("DCs(%)\t");
			 * results.print("DCsGen(%)\t"); results.print("notes");
			 * results.println(); results.flush();
			 */
			GeneratorThread.printColumns(results);
			for (int i = 0; i < Nruns; i++) {
				for (String base : list) {
					OracleFidebyCpp oracle = null;
					String folderMutants = folder + base;
					File dir = new File(folderMutants);
					if (!dir.isDirectory())
						continue;
					List<File> oraclesInDir = new ArrayList<>();
					for (File file1 : dir.listFiles()) {
						if (file1.isDirectory() == false && (file1.getName().endsWith(".c"))) {
							System.out.println(file1);
							oraclesInDir.add(file1);
						}
					}
					System.out.println(oraclesInDir.size());
					for (File oracleName : oraclesInDir) {
						oracle = new OracleFidebyCpp(oracleName);
						System.out.println(oracleName.getName());
						String baseOracle = oracleName.getName().substring(0, oracleName.getName().lastIndexOf('.'));
						for (File file2 : dir.listFiles()) {

							if (file2.isDirectory() == false && file2.getName().endsWith(".xml")
									&& !file2.getName().contains("oracle")) {
								String baseXml = file2.getName().substring(0, file2.getName().lastIndexOf('_'));
								if (baseXml.equals(baseOracle)) {
									FeatureModel mutant2 = Utils.readModel(file2.getAbsolutePath());
									if (mutant2.getRoot().isAbstract())
										mutant2.getRoot().setAbstract(false);

									if (mutant2.getComments().size() == 0) {

										mutant2.addComment(file2.getName());

									}
									t = new GeneratorThread(file2.getAbsolutePath(), auto1, results, mutant2, oracle,
											secondsTIMEOUT, i);
									while (GeneratorThread.nRunningThreads >= nsThread)
										Thread.sleep(10);
									// run in parallel
									t.start();

								}
							}
						}
					}
				}
			}
			Thread.sleep(10);
			while (GeneratorThread.nRunningThreads >= 1) {
				Thread.sleep(100);
			}
			results.close();
		} catch (Exception e) {
			for (StackTraceElement a : e.getStackTrace()) {
				System.err.println(a);
			}
			return;
		}
	}

}
