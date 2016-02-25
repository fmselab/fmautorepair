package featureide.testgeneration;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
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
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sat4j.specs.TimeoutException;

import com.sun.prism.impl.ps.CachingRoundRectRep;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import featureide.testgeneration.AlgorithmUsingFIDE.AutoremoverFIDEFactory;
import fmautorepair.utils.Utils;
import splar.core.fm.FeatureModelException;
import splar.core.fm.XMLFeatureModel;
import splar.core.fm.configuration.ConfigurationEngineException;
import splar.core.heuristics.FTPreOrderSortedECTraversalHeuristic;
import splar.core.heuristics.VariableOrderingHeuristic;
import splar.core.heuristics.VariableOrderingHeuristicsManager;
import splar.plugins.reasoners.bdd.javabdd.FMReasoningWithBDD;
import splar.plugins.reasoners.bdd.javabdd.ReasoningWithBDD;
import testgeneration.CompareOracleMutantBDD;
import testgeneration.OracleFIDEbyFM;
import testgeneration.OracleFidebyCpp;

public class NaiveTestAutoremover {
	private static final String FMAUTOREPAIR_MODELS = "/fmautorepair.models";
	static private DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HHmmss");
    static String CURRENTDIR;
	@BeforeClass
	public static void setUpOp() {

		// Logger.getLogger(NodeToExpression.class).setLevel(Level.OFF);
		// Logger.getLogger(FeatureIDEtoATGT.class).setLevel(Level.OFF);
		// Logger.getLogger(TestFMFromCppCode.class).setLevel(Level.OFF);
		// Logger.getLogger(AutoremoverFIDE.class).setLevel(Level.DEBUG);
		// Logger.getLogger(EqAutoFIDE.class).setLevel(Level.DEBUG);
		// Logger.getLogger(FM4Testgeneration.class).setLevel(Level.DEBUG);
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
		//System.out.println(new File(System.getProperty("user.dir")).canRead());
	    CURRENTDIR=a;
	}

	private void testCouple(String cand, String or, boolean firstOrder) throws Exception {
		cand=CURRENTDIR+"/"+cand;
		or=CURRENTDIR+"/"+or;
		if (firstOrder) {
			testAgaintsOracle(cand, or, AutoremoverFIDE_FOM.factory);
		} else {
			testAgaintsOracle(cand, or, AutoremoverFIDE_SOM.factory);
		}
	}

	private void testAgaintsOracle(String cand, String or, AutoremoverFIDEFactory factory)
			throws FileNotFoundException, UnsupportedModelException, Exception, TimeoutException, IOException,
			FeatureModelException, ConfigurationEngineException {
		FeatureModel candidate = Utils.readModel(cand);
		FeatureModel oracle = Utils.readModel(or);
		AlgorithmUsingFIDE auto = null;
		auto = factory.getAutoremover(candidate, new OracleFIDEbyFM(oracle));
		FeatureModel bestModel = auto.bestModel();
		System.out.println("starting " + CompareOracleMutantBDD.getConformance(oracle, candidate));
		System.out.println("best " + CompareOracleMutantBDD.getConformance(oracle, bestModel));
	}

	private void testCoupleC(String cand, String or) throws Exception {
		cand=CURRENTDIR+"/"+cand;
		or=CURRENTDIR+"/"+or;
		FeatureModel candidate = Utils.readModel(cand);
		AlgorithmUsingFIDE auto = null;
		File file = new File(or);
		auto = AutoremoverFIDE_SOM_InOrder.factory.getAutoremover(candidate, new OracleFidebyCpp(file));

		FeatureModel bestModel = auto.bestModel();
		// System.out.println("starting " +
		// CompareOracleMutantBDD.getAdequacy(oracle, candidate));
		// System.out.println("best " +
		// CompareOracleMutantBDD.getAdequacy(oracle, bestModel));
	}

	@Test
	public void testFaulty() throws Exception {
		testCoupleC("examples_fmsfrompreprocessor/colligens/Figure1_pa2.xml",
				"examples_fmsfrompreprocessor/colligens/Figure1.c");
	}

	@Test
	public void getData() throws FileNotFoundException, UnsupportedModelException {
		getModelData("splotmodels_new/featureIDE/");
	}

	@Test
	public void testAlg1Fide() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		featureide.testgeneration.AlgorithmUsingFIDE.AutoremoverFIDEFactory auto1 = AutoremoverFIDE_FOM.factory;
		testAllMutantsMT("splotmodels_new/featureIDE/", auto1, 3600, 10, 1);
	}

	@Test
	public void testAlg1FideMultiDCs3() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		// AutoremoverFIDEmultiDCs.desiredNumOfDCs = 3;
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_FOMmultiDCs.factory(3), 3600, 10, 1);
	}

	@Test
	public void testAlg1FideMultiDCs5() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		// AutoremoverFIDEmultiDCs.desiredNumOfDCs = 5;
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_FOMmultiDCs.factory(5), 3600, 10, 1);
	}

	@Test
	public void testAlg1FideMultiDCs7() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		// AutoremoverFIDEmultiDCs.desiredNumOfDCs = 7;
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_FOMmultiDCs.factory(7), 3600, 10, 1);
	}

	@Test
	public void testAlg1FideMultiDCs9() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		// AutoremoverFIDEmultiDCs.desiredNumOfDCs = 9;
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_FOMmultiDCs.factory(9), 3600, 10, 1);
	}

	@Test
	public void testAlg1FideCollect() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDECollect.factory, 3600, 10, 1);
	}

	@Test
	public void testAlg1FideOneDCwithKilled()
			throws UnsupportedModelException, IOException, TimeoutException,  FeatureModelException,
			ConfigurationEngineException, ExecutionException, InterruptedException {
		// AutoremoverFIDEmultiDCsWithKilled.desiredNumOfDCs = 1;
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_FOMmultiDCsWithKilled.factory(1), 3600, 10, 1);
	}

	@Test
	public void testAlg1FideMultiDCs3WithKilled()
			throws UnsupportedModelException, IOException, TimeoutException,  FeatureModelException,
			ConfigurationEngineException, ExecutionException, InterruptedException {
		// AutoremoverFIDEmultiDCsWithKilled.desiredNumOfDCs = 3;
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_FOMmultiDCsWithKilled.factory(3), 3600, 10, 1);
	}

	@Test
	public void testAlg1Fide2() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE2.factory, 3600, 10, 1);
	}

	@Test
	public void testAlg1FideHOMinOrder()
			throws UnsupportedModelException, IOException, TimeoutException,  FeatureModelException,
			ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_SOM_InOrder.factory, 3600, 10, 1);
	}

	@Test
	public void testAlg1Eq() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {

		testAllMutantsMT("splotmodels_new/featureIDE/", EqAutoFIDE.factory, 3600, 10, 1);
	}

	@Test
	public void testAlg1EqSOM() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutantsMT("splotmodels_new/featureIDE/", EqAutoFIDEHOM.factory, 3600, 10, 1);
	}

	@Test
	public void testAlg1FideHOM() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutantsMT("splotmodels_new/featureIDE/", AutoremoverFIDE_SOM.factory, 3600, 10, 1);
	}

	@Test
	public void testAlg1Quarantena() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutantsMT("splotmodels_new/Quarantena/", AutoremoverFIDE_SOM.factory, 2, 10, 1);
	}

	@Test
	public void testAll_LibSSH() throws Exception {
		testAllMutantsMT("models/libssh/", AutoremoverFIDE_SOM.factory, 2, 10, 1);
	}

	@Test
	public void testAlg1FideProblemsCar10() throws Exception {
		testCouple("splotmodels_new/featureIDE/car_fm/car_fm_numMutations10.xml",
				"splotmodels_new/featureIDE/car_fm.xml", false);
	}

	@Test
	public void testAlg1FideProblemsAircraft10() throws Exception {
		testCouple("splotmodels_new/featureIDE/aircraft_fm/aircraft_fm_numMutations10.xml",
				"splotmodels_new/featureIDE/aircraft_fm.xml", false);
	}

	@Test
	public void testSecondOrderMonitorEngine01() throws Exception {
		testCouple(
				"splotmodels_new/featureIDE/model_20101120_2091447559_monitor_engine/model_20101120_2091447559_monitor_engine_numMutations_01.xml",
				"splotmodels_new/featureIDE/model_20101120_2091447559_monitor_engine.xml", false);
	}

	@Test
	public void testSecondOrderAircraft06() throws Exception {
		testCouple("splotmodels_new/featureIDE/aircraft_fm/aircraft_fm_numMutations06.xml",
				"splotmodels_new/featureIDE/aircraft_fm.xml", false);
	}

	@Test
	public void testSecondOrderMonitorEngine05() throws Exception {
		testCouple(
				"splotmodels_new/featureIDE/model_20101120_2091447559_monitor_engine/model_20101120_2091447559_monitor_engine_numMutations_05.xml",
				"splotmodels_new/featureIDE/model_20101120_2091447559_monitor_engine.xml", false);
	}

	@Test
	public void testSecondOrderMonitorFameDBMS02() throws Exception {
		testCouple("splotmodels_new/featureIDE/fame_dbms_fm/fame_dbms_fm_numMutations_02.xml",
				"splotmodels_new/featureIDE/fame_dbms_fm.xml", false);
	}

	@Test
	public void testAlg1FideSmall() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutants("splotmodels_new/SmallExs/", AutoremoverFIDE_FOM.factory, 60);
	}

	@Test
	public void testAlg1FideSmallSOM() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutants("splotmodels_new/SmallExs/", AutoremoverFIDE_SOM.factory, 60);
	}

	@Test
	public void testAlg1andhelfSmall() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutantsMT("splotmodels_new/SmallExs/", AutoremoverFIDE_SOMEq.factory, 60, 10, 10);
	}

	@Test
	public void testAlgEqMutantsFide() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutants("splotmodels_new/featureIDE/", EqAutoFIDE.factory, 2);
	}

	@Test
	public void testAlg2Fide() throws UnsupportedModelException, IOException, TimeoutException, 
			FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		testAllMutants("splotmodels_new/featureIDE/", AutoremoverFIDE2.factory, 2);
	}

	@Test
	public void testSSH() throws Exception {
		PrintStream res = System.out;
		String folder = "models/libssh/";
		int nruns = 1;
		int nsThread = 15;

		testAllMutantsMT(folder, 3600, nsThread, 1, nruns, res, AutoremoverFIDE_FOM.factory);
		testAllMutantsMT(folder, 3600, nsThread, 1, nruns, res, AutoremoverFIDE_FOMmultiDCs.factory(3));
		testAllMutantsMT(folder, 3600, nsThread, 1, nruns, res, AutoremoverFIDE_FOMmultiDCs.factory(5));
		testAllMutantsMT(folder, 3600, nsThread, 1, nruns, res, AutoremoverFIDE_FOMmultiDCs.factory(7));
		testAllMutantsMT(folder, 3600, nsThread, 1, nruns, res, AutoremoverFIDE_SOM_InOrder.factory);
		testAllMutantsMT(folder, 3600, nsThread, 1, nruns, res, AutoremoverFIDECollect.factory);
	}

	public void testAllMutants(String folder, AutoremoverFIDEFactory factory, int minutesTIMEOUT)
			throws UnsupportedModelException, IOException,  TimeoutException, FeatureModelException,
			ConfigurationEngineException, ExecutionException, InterruptedException {
		String className = factory.getAlgorithmName();
		folder=CURRENTDIR+"/"+folder;
		File file = new File(folder);
		String[] names = file.list();
		System.out.println(" aaa"+file.list().length);
		ArrayList<String> list = new ArrayList<>();
		for (String name : names) {
			if (new File(folder + name).isDirectory()) {
				list.add(name);
			}
		}
		Date date = new Date();
		AlgorithmUsingFIDE auto1 = null;
		// factory.getClass() da cambire che � sempre quella con la factory
		String resultfilename = "results/exp_results" + dateFormat.format(date) + className + ".txt";
		PrintStream results = new PrintStream(new BufferedOutputStream(new FileOutputStream(resultfilename)));
		results.print("*model*\t");
		results.print("*old adeguacy*\t");
		results.print("*old Comparison*\t");
		results.print("*time*\t");
		results.print("*new adeguacy*\t");
		results.print("*new Comparison*\t");
		results.println();
		results.flush();
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		for (String base : list) {

			String folderMutants = folder + base;
			File dir = new File(folderMutants);
			assert dir.isDirectory();

			String splotmodel = folder + base + ".xml";
			FeatureModel oracleFM = Utils.readModel(splotmodel);
			OracleFIDEbyFM oracle = new OracleFIDEbyFM(oracleFM);
			FeatureModel best = null;
			for (File file2 : dir.listFiles()) {
				if (file2.isDirectory())
					break;
				FeatureModel mutant2 = Utils.readModel(file2.getAbsolutePath());
				ModelComparator comp = new ModelComparator(100000000);
				auto1 = factory.getAutoremover(mutant2, oracle);
				results.print(file2.getName() + "\t");
				results.flush();
				results.print(CompareOracleMutantBDD.getConformance(oracleFM, mutant2) + "\t");
				results.print(comp.compare(mutant2, oracleFM) + "\t");

				final Future<FeatureModel> handler = executor.submit(auto1);
				executor.schedule(new Runnable() {
					@Override
					public void run() {
						handler.cancel(true);
					}
				}, minutesTIMEOUT, TimeUnit.MINUTES);

				try {
					long startTime = System.currentTimeMillis();
					best = handler.get();
					long stopTime = System.currentTimeMillis();
					long elapsedTime = stopTime - startTime;
					results.print(elapsedTime + "\t");
					results.print(CompareOracleMutantBDD.getConformance(oracleFM, best) + "\t");
					results.println(comp.compare(best, oracleFM));

					results.flush();
				} catch (CancellationException e) {
					results.println("TIMEOUT");
					results.flush();
					continue;
				}
			}
		}
		results.close();
	}

	/**
	 * Test all mutants mt.
	 *
	 * @param folder
	 *            the folder
	 * @param alg
	 *            the auto1
	 * @param secondsTIMEOUT
	 *            the seconds timeout
	 * @param nsThread
	 *            the ns thread
	 * @param Nruns
	 *            the nruns
	 * @param className
	 *            the class name
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
	static void testAllMutantsMT(String folder, AlgorithmUsingFIDE.AutoremoverFIDEFactory alg, int secondsTIMEOUT,
			int nsThread, int Nruns) throws UnsupportedModelException, IOException,  TimeoutException,
					FeatureModelException, ConfigurationEngineException, ExecutionException, InterruptedException {
		String className = alg.getAlgorithmName();
		Date date = new Date();
		String resultfilename = "results/exp_results" + dateFormat.format(date) + className + ".txt";
		PrintStream results;
		results = new PrintStream(new BufferedOutputStream(new FileOutputStream(resultfilename)));
		// write the columns
		GeneratorThread.printColumns(results);
		testAllMutantsMT(folder, secondsTIMEOUT, nsThread, 1, Nruns, results, alg);
		results.close();
	}

	// come il precedente ma questo chiede anche il nome del file
	/**
	 * Test all mutants mt.
	 *
	 * @param folder the folder
	 * @param secondsTIMEOUT the seconds timeout
	 * @param nsThread the ns thread
	 * @param startRun the start run (from 1 and so on)
	 * @param Nruns the nruns from startrun to startru + Nruns C(ompreso)
	 * @param results the results
	 * @param algs the algs
	 */
	// non scrive le colonne
	static void testAllMutantsMT(String folder, int secondsTIMEOUT, int nsThread, int startRun, int Nruns,
			PrintStream results, AlgorithmUsingFIDE.AutoremoverFIDEFactory... algs) {
		folder=CURRENTDIR+"/"+folder;
		File file = new File(folder);
		String[] names = file.list();
	
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
        System.out.println("AAAAAAAAAAA "+names.length);
		ArrayList<String> list = new ArrayList<>();
		for (String name : names) {
			if (new File(folder + name).isDirectory()) {
				list.add(name);
				System.out.println("----");
			}
		}
		GeneratorThread t;
		try {
			// for every run
			for (int i = startRun; i < startRun + Nruns; i++) {
				// for every algorithm
				for (AlgorithmUsingFIDE.AutoremoverFIDEFactory alg : algs) {
					// for every model
					for (String base : list) {
						// legge la directory che contiene tutte le mutazioni
						String folderMutants = folder + base;
						File dir = new File(folderMutants);
						assert dir.isDirectory();
						// legge l'oracolo
						String splotmodel = folder + base + ".xml";
						FeatureModel oracleFM = Utils.readModel(splotmodel);
						OracleFIDEbyFM oracle = new OracleFIDEbyFM(oracleFM);
						for (File file2 : dir.listFiles()) {
							if (file2.isDirectory() == false) {
								String absolutePath2 = file2.getAbsolutePath();
								FeatureModel mutant2 = Utils.readModel(absolutePath2);
								t = new GeneratorThread(absolutePath2, alg, results, mutant2, oracle, secondsTIMEOUT,
										i);
								while (GeneratorThread.nRunningThreads >= nsThread)
									Thread.sleep(1000);
								// run in parallel
								t.start();
							}
						}
					}
				}
			}
			Thread.sleep(10);
			// wait for all to finish
			while (GeneratorThread.nRunningThreads >= 1) {
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.err.println(e.getStackTrace());
			return;
		}
	}

	@Test
	public void testAllMutantsFIDE() throws UnsupportedModelException, IOException,  TimeoutException {
		test("examples_fmsfrompreprocessor/mutants_model_20091225_1547989376/depth2",
				"splotmodels_new/model_20091225_1547989376.xml");
	}

	private void test(String folderMutants, String oracleS)
			throws FileNotFoundException, UnsupportedModelException, IOException, TimeoutException {
		PrintStream fileStdOutput = new PrintStream(new BufferedOutputStream(new FileOutputStream("results_size.txt")));
		folderMutants=CURRENTDIR+"/"+folderMutants;
		File dir = new File(folderMutants);
		assert dir.isDirectory();
		ModelComparator comparator = new ModelComparator(1000000);
		int counter = 0;
		int tests = 0;
		FeatureModel oracle = Utils.readSPLOTModel(oracleS);

		fileStdOutput.print("*model*\t");
		fileStdOutput.print("*result*\t");
		fileStdOutput.println();
		fileStdOutput.flush();
		for (File file2 : dir.listFiles()) {
			tests++;
			fileStdOutput.print(file2.getName() + "\t");
			fileStdOutput.flush();
			FeatureModel mutant2 = Utils.readModel(file2.getAbsolutePath());
			AutoremoverFIDE auto1 = (AutoremoverFIDE) AutoremoverFIDE_FOM.factory.getAutoremover(mutant2,
					new OracleFIDEbyFM(oracle));
			FeatureModel best = auto1.bestModel();
			Comparison comparison = comparator.compare(best, oracle);
			fileStdOutput.println(comparison.toString());

			if (comparison == Comparison.REFACTORING) {
				counter++;
				// file2.delete();
			}
		}
		fileStdOutput.close();
		System.out.println(counter / tests * 100);
	}

	private void getModelData(String folderMutants) throws FileNotFoundException, UnsupportedModelException {
		PrintStream fileStdOutput = new PrintStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
		folderMutants=CURRENTDIR+"/"+folderMutants;
		File dir = new File(folderMutants);
		assert dir.isDirectory();
		File file = new File(folderMutants);
		System.err.println(file.getParentFile().getAbsolutePath()+"   "+file.listFiles().length);
		String[] names = file.list();
		
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		ArrayList<String> list = new ArrayList<>();

		for (String name : names) {
			if (new File(folderMutants + name).isDirectory()) {
				list.add(name);
			}
		}

		fileStdOutput.print("*model*\t");
		fileStdOutput.print("*NFeatures*\t");
		fileStdOutput.print("*NConstraints*\t");
		fileStdOutput.print("*Nproducts\t");
		fileStdOutput.println();
		fileStdOutput.flush();
		for (String base : list) {

			String splotmodel = folderMutants + base + ".xml";
			FeatureModel oracleFM = Utils.readModel(splotmodel);

			fileStdOutput.print(base + "\t");
			fileStdOutput.print(oracleFM.getFeatures().size() + "\t");
			fileStdOutput.print(oracleFM.getConstraints().size() + "\t");
			String featureModelPath = splotmodel.replace("/featureIDE/", "/");
			splar.core.fm.FeatureModel featureModel;
			try {
				featureModel = getSplotModel(featureModelPath);

				new FTPreOrderSortedECTraversalHeuristic("Pre-CL-MinSpan", featureModel,
						FTPreOrderSortedECTraversalHeuristic.FORCE_SORT);
				VariableOrderingHeuristic heuristic = VariableOrderingHeuristicsManager.createHeuristicsManager()
						.getHeuristic("Pre-CL-MinSpan");

				// Creates the BDD reasoner
				ReasoningWithBDD reasoner = new FMReasoningWithBDD(featureModel, heuristic, 50000, 50000, 60000,
						"pre-order");

				// Initialize the reasoner (BDD is created at this moment)

				reasoner.init();
				fileStdOutput.print(reasoner.countValidConfigurations());

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fileStdOutput.println();

		}
		fileStdOutput.close();
	}

	protected splar.core.fm.FeatureModel getSplotModel(String featureModelPath) throws Exception {
		// Create feature model object from an XML file (SXFM format - see
		// www.splot-research.org for details)
		// If an identifier is not provided for a feature use the feature name
		// as id
		splar.core.fm.FeatureModel featureModel = new XMLFeatureModel(featureModelPath,
				XMLFeatureModel.USE_VARIABLE_NAME_AS_ID);
		// load feature model from
		featureModel.loadModel();

		return featureModel;
	}

}