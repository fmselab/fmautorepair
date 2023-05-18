package featureide.testgeneration;

import java.io.IOException;
import java.io.PrintStream;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import featureide.testgeneration.AlgorithmUsingFIDE.AutoremoverFIDEFactory;
import splar.core.fm.FeatureModelException;
import splar.core.fm.configuration.ConfigurationEngineException;
import testgeneration.Conformance;
import testgeneration.OracleFIDE;

/**
 * executes threads in parallel and keeps track of the number of threads that
 * are launched by it.
 *
 */
public class GeneratorThread extends Thread {

	// number of running threads
	static Integer nRunningThreads = 0;
	private AlgorithmUsingFIDE generator;
	private PrintStream output;
	private IFeatureModel model;
	private int timeOutInSeconds;
	private int run;

	/**
	 * 
	 * @param str
	 * @param auto1
	 * @param model
	 * @param output
	 * @param i
	 * @param runNumber
	 */
	public GeneratorThread(String str, AutoremoverFIDEFactory auto1, PrintStream output, IFeatureModel model,
			OracleFIDE oracle, int timeoutSeconds, int run) {
		super(str);
		this.generator = auto1.getAutoremover(model, oracle);
		this.model = model;
		this.timeOutInSeconds = timeoutSeconds;
		this.output = output;
		this.run = run;
	}

	public static void printColumns(PrintStream results) {
		results.print("run\t");
		results.print("algorithm\t");
		results.print("model\t");
		results.print("time\t");
		results.print("oldAd\t");
		results.print("newAd\t");
		results.print("oldNConfsOk\t");
		results.print("newNConfsOk\t");
		results.print("nConfs\t");
		results.print("oldAd(P)\t");
		results.print("newAd(P)\t");
		results.print("gap(P)\t");
		results.print("NDCs\t");
		results.print("NDCsGen\t");
		results.print("Nconfs\t");
		results.print("DCs(P)\t");
		results.print("DCsGen(P)\t");
		results.print("notes");
		results.println();
		results.flush();
	}

	@Override
	public void run() {
		synchronized (nRunningThreads) {
			nRunningThreads++;
		}
		try {
			assert (generator != null);
			IFeatureModel best = generator.generateBestAndInfo(timeOutInSeconds);
			// synchronize when writing the results
			synchronized (output) {
				output.flush();
				output.print(run + "\t");
				// add the algorithm name
				output.print(generator.getName() + "\t");
				// write model name
				String modelName = model.getComments().size() > 0 ? model.getComments().get(0)
						: model.getRoot().getName();
				output.print(modelName + "\t");
				output.print(generator.getExecTime() + "\t");
				Conformance originalConf = generator.getOriginalConf();
				output.print(originalConf + "\t");
				Conformance newConf = generator.getNewConf();
				output.print(newConf + "\t");
				//
				output.print(originalConf.getNumConfsJudgedCorrectly() + "\t");
				output.print(newConf.getNumConfsJudgedCorrectly() + "\t");
				output.print(newConf.getNumConfigurations() + "\t");
				//
				output.print(originalConf.percConfsJudgedCorrectly() * 100 + "\t");
				output.print(newConf.percConfsJudgedCorrectly() * 100 + "\t");
				long numConfigurations = newConf.getNumConfigurations();
				long finalModelNumConfsJudgedCorrectly = newConf.getNumConfsJudgedCorrectly();
				long origModelNumConfsJudgedCorrectly = originalConf.getNumConfsJudgedCorrectly();
				if (origModelNumConfsJudgedCorrectly < numConfigurations) {
					output.print((finalModelNumConfsJudgedCorrectly - origModelNumConfsJudgedCorrectly) * 100
							/ (double) (numConfigurations - origModelNumConfsJudgedCorrectly) + "\t");
				} else {
					assert finalModelNumConfsJudgedCorrectly == numConfigurations : "\norigModelNumConfsJudgedCorrectly = "
							+ origModelNumConfsJudgedCorrectly + "\nfinalModelNumConfsJudgedCorrectly = "
							+ finalModelNumConfsJudgedCorrectly + "\nnumConfigurations = " + numConfigurations;
					output.print("100\t");
				}
				output.print(generator.numberOfUsedDCs() + "\t");
				output.print(generator.numberOfGeneratedDCs() + "\t");
				output.print(numConfigurations + "\t");
				output.print(generator.numberOfUsedDCs() * 100 / (double) numConfigurations + "\t");
				output.print(generator.numberOfGeneratedDCs() * 100 / (double) numConfigurations + "\t");
				if (finalModelNumConfsJudgedCorrectly == numConfigurations) {
					output.print("\tCONV");
				}
				if (generator.getExecTime() == timeOutInSeconds) {
					output.print("\tTIMEOUT");
				}
				if (this.getClass().desiredAssertionStatus()) {
					// if the conformity � 100%, si tratta di refactoring 
					if (finalModelNumConfsJudgedCorrectly == numConfigurations) {
						try {
							ModelComparator comp = new ModelComparator(100000000);
							Comparison comparison = comp.compare(best, this.generator.getOracle().getFeatureModel());							
							if (comparison != Comparison.REFACTORING) {
								System.err.println("comparison " + comparison);
								System.err.println("generator.comparison " + generator.comparison);
								System.err.println("model " + modelName);
								System.err.println("features in oracle "
										+ this.generator.getOracle().getFeatureModel().getFeatures().size());
								System.err.println("features in model " + model.getFeatures().size());
								throw new RuntimeException(finalModelNumConfsJudgedCorrectly + "=="
										+ numConfigurations + " and not refactory");
							}
						} catch (UnsupportedModelException e) {
							e.printStackTrace();
						}
					}
				}
				output.println();
				output.flush();
			}
		} catch (org.sat4j.specs.TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FeatureModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConfigurationEngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (nRunningThreads) {
			nRunningThreads--;
		}

	}
}
