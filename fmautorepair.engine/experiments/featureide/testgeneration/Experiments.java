package featureide.testgeneration;

import static featureide.testgeneration.NaiveTestAutoremover.testAllMutantsMT;

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
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import featureide.testgeneration.AlgorithmUsingFIDE.AutoremoverFIDEFactory;
import splar.core.fm.FeatureModelException;
import splar.core.fm.configuration.ConfigurationEngineException;


public class Experiments {
	
	private static final String FMAUTOREPAIR_MODELS = "/fmautorepair.models";
	static private DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HHmmss");

	public static void main(String[] args)
			throws UnsupportedModelException, IOException, TimeoutException, FeatureModelException,
			ConfigurationEngineException, ExecutionException, InterruptedException {
		
		File dir = new File(System.getProperty("user.dir")).getParentFile();
		String a = null;
		try {
			a = URLDecoder.decode(dir.getAbsolutePath()+FMAUTOREPAIR_MODELS, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("user.dir", a);
		NaiveTestAutoremover.CURRENTDIR=a;
		//System.out.println(new File(System.getProperty("user.dir")).canRead());
		
		Logger.getLogger(AlgorithmUsingFIDE.class).setLevel(Level.OFF);
		Logger.getLogger("mutationoperators").setLevel(Level.OFF);
		Date date = new Date();
		String folder = "splotmodels_new/featureIDE2/";		
		//String folder = "models/libssh/";
		String resultfilename = "exp_results_" + dateFormat.format(date) + ".txt";
		PrintStream results;
		results = new PrintStream(new BufferedOutputStream(new FileOutputStream(resultfilename)));
		//results = System.out;
		int nruns = 1;
		int secondsTIMEOUT = 3;
		int nsThread = 20;
		// write the columns
		List<AlgorithmUsingFIDE.AutoremoverFIDEFactory> algs = new ArrayList<>(); 
		// INIZA DA QUELLI PIU' COMPLESSI
		// SOM in order
		algs.add(AutoremoverFIDE_SOM_InOrder.factory);
		// SOM a and half
		//algs.add(AutoremoverFIDE_SOMEq.factory);
		// con multiple DC
		/*int multipledc[] = {2,3,4,5,7};
		for (int i : multipledc) {
			algs.add(AutoremoverFIDE_FOMmultiDCs.factory(i));
			algs.add(AutoremoverFIDE_FOMmultiDCsWithKilled.factory(i));
		}*/
		algs.add(AutoremoverFIDE_FOMmultiDCs.factory(3));
		// collect
		algs.add(AutoremoverFIDECollect.factory);
		// NAIVE
		algs.add(AutoremoverFIDE_FOM.factory);
		// run the experiments
		GeneratorThread.printColumns(results);		
		AutoremoverFIDEFactory[] algsArray = new AlgorithmUsingFIDE.AutoremoverFIDEFactory[algs.size()];
		System.out.println("PROVA");
		testAllMutantsMT(folder, secondsTIMEOUT, nsThread, 1, nruns,results, algs.toArray(algsArray));
		// close
		results.close();
	}


}