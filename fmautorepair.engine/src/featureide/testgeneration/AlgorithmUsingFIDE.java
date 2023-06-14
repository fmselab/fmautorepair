package featureide.testgeneration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.prop4j.ConfEvaluator;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModelAnalyzer;
import de.ovgu.featureide.fm.core.analysis.FeatureProperties.FeatureStatus;
import de.ovgu.featureide.fm.core.base.FeatureUtils;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import splar.core.fm.FeatureModelException;
import splar.core.fm.configuration.ConfigurationEngineException;
import testgeneration.CompareOracleMutantBDD;
import testgeneration.Conformance;
import testgeneration.OracleFIDE;

/**
 * 
 *
 */
public abstract class AlgorithmUsingFIDE implements Callable<IFeatureModel> {
	
	// the factory for this class
	public static abstract class AutoremoverFIDEFactory{
		// return the algorithm
		abstract public AlgorithmUsingFIDE getAutoremover(IFeatureModel fm, OracleFIDE o);
		// return the name of the algorithm
		abstract public String getAlgorithmName();
	};

	// the candidate
	protected IFeatureModel candidate;
	// the oracle
	private OracleFIDE oracle;
	private Conformance originalConformance;
	private Conformance newConformance;
	private ExecutorService es = Executors.newSingleThreadScheduledExecutor();
	private Future<IFeatureModel> futureBest;
	
	private float execTime;
	public Comparison comparison;

	/**
	 * 
	 * @param candidate initial candidate
	 * @param o oracle
	 */
	public AlgorithmUsingFIDE(IFeatureModel candidate, OracleFIDE o) {
		// do some prechecks
		//assert precheck(candidate,o);
		this.setCandidate(candidate);
		oracle = o;
	}
	
	public String getName() {
		return this.getClass().getSimpleName();
	}	


	private boolean precheck(IFeatureModel candidate, OracleFIDE o) {
		// all the features must be present in the candidate
		try {
			FeatureUtils.getFeatureNames(o.getFeatureModel()).containsAll(FeatureUtils.getFeatureNames(candidate);
		} catch (FileNotFoundException | UnsupportedModelException e) {
			e.printStackTrace();
			return false;
		}
		// the candidate cannot have anomalies
		FeatureModelAnalyzer analyzer = candidate.getAnalyser();
	    analyzer.calculateFeatures=true;
	    analyzer.calculateRedundantConstraints=true;
		HashMap<Object, Object> results = analyzer.analyzeFeatureModel(null);
		// if an error is found, stop, print and return false
		for(Entry<Object, Object> e: results.entrySet()){
	    	if ((e.getKey() instanceof Feature) && e.getValue() != FeatureStatus.NORMAL){
	    		System.err.println(e);
	    		System.err.println(candidate.getRoot().getName());
	    		System.err.println(candidate.getComments());
	    		return false;
	    	}
	    }
		// the candidate should not be a refactoring
		try {
			ModelComparator comp = new ModelComparator(100000000);
			comparison = comp.compare(candidate, o.getFeatureModel());
			if (comparison == Comparison.REFACTORING)
				System.err.println("model " + candidate.getComments() + " is a refactoring");
		} catch (FileNotFoundException | UnsupportedModelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return true;		
	}

	/** 
	 * 
	 * @return the best model it can find
	 * 
	 * @throws Exception
	 */
	abstract public IFeatureModel bestModel() throws Exception;

	/**
	 * 
	 * @return the number of used DCs
	 */
	abstract public int numberOfUsedDCs();

	/**
	 * 
	 * @return the number of generated DCs
	 */
	abstract public int numberOfGeneratedDCs();

	@Override
	public final IFeatureModel call() throws Exception {
		return bestModel();
	}

	final public IFeatureModel generateBestAndInfo(int timeOutInSeconds)
			throws  IOException, FeatureModelException,
			ConfigurationEngineException, TimeoutException {
		long time = System.currentTimeMillis();
		futureBest = es.submit(this);
		IFeatureModel best = null;
		originalConformance = CompareOracleMutantBDD.getConformance(oracle, candidate);
		// take the test suite generate by the generator
		try {
			best = futureBest.get(timeOutInSeconds, TimeUnit.SECONDS);

			// register
			long delta = System.currentTimeMillis() - time;
			// System.out.println(String.valueOf(delta));
			// convert from missecs to secs
			this.setGeneratorTime((float) (delta / 1000.0));
			newConformance = CompareOracleMutantBDD.getConformance(oracle, best);
			if (this.getClass().desiredAssertionStatus()) {
				try {
					ModelComparator comp = new ModelComparator(100000000);
					comparison = comp.compare(best, oracle.getFeatureModel());
					assert comparison != null: "comparison is null";
				}
				catch (UnsupportedModelException e) {
					e.printStackTrace();
				}
			}
		} catch (ExecutionException | InterruptedException e) {
			if (e.getCause() instanceof java.lang.OutOfMemoryError)
				throw (java.lang.OutOfMemoryError) e.getCause();
		}	
		catch (java.util.concurrent.TimeoutException e) {
			this.setGeneratorTime(timeOutInSeconds);
			newConformance = CompareOracleMutantBDD.getConformance(oracle,candidate);	
			this.stopGeneration();
			best = candidate;
		} finally {
			es.shutdown();
		}
		return best;
	}

	public IFeatureModel getCandidate() {
		return candidate;
	}

	public float getExecTime() {
		return execTime;
	}

	public Conformance getNewConf() {
		return newConformance;
	}

	public OracleFIDE getOracle() {
		return oracle;
	}

	public Conformance getOriginalConf() {
		return originalConformance;
	}

	/**
	 * controlla che la dc non sia valida per l'oracolo e il mutante fmP. Se la
	 * validita' � diversa, fmP � killed da dc
	 * 
	 * @param fmP
	 *            feature model
	 * @param dc
	 * @param ora
	 * @return
	 * @throws UnsupportedModelException
	 * @throws IOException
	 */
	boolean killed(IFeatureModel fmP, Configuration dc, OracleFIDE ora) throws UnsupportedModelException, IOException {
		//Configuration fmPconf = new Configuration(dc, fmP);
		ConfEvaluator ev = new ConfEvaluator(dc);
		// if fmPconf is valid, it cannot contain extra features
		// because isValid can return true even if a configuration contains other features
		// instead in that case, it must return false
//		boolean fmPconfIsValid = fmPconf.isValid() && fmP.getFeatureNames().containsAll(dc.getSelectedFeatureNames());
		//boolean fmPconfIsValid = ev.isValidForModel(fmP) && fmP.getFeatureNames().containsAll(dc.getSelectedFeatureNames());
		boolean fmPconfIsValid = ev.isValidForModel(fmP);
		//assert fmPconfIsValid == (new Configuration(ev.getConfiguration(), fmP).isValid() && fmP.getFeatureNames().containsAll(ev.getConfiguration().getSelectedFeatureNames()));
		return ora.validity(dc) != fmPconfIsValid;
	}
	
	protected boolean killed(IFeatureModel fmP, ConfigurationWValidity d) {
		ConfEvaluator ev = new ConfEvaluator(d.getFirst());
		boolean fmPconfIsValid = ev.isValidForModel(fmP);
		return d.getSecond() != fmPconfIsValid;
	}

	protected void setCandidate(IFeatureModel candidate) {
		this.candidate = candidate;
	}

	private void setGeneratorTime(float time) {
		this.execTime = time;
	}

	public final void stopGeneration() {
		assert(futureBest != null && es != null);
		if (!futureBest.isDone()) {
			futureBest.cancel(true);
			es.shutdown();
			// System.out.println("shutting down");
			// es.shutdownNow();
			// System.out.println("es.isShutdown()" +es.isShutdown());
			// while(!es.isTerminated()) System.out.print('.');
			// System.out.println(futureTS.isCancelled() + " " +
			// futureTS.isDone());
		}
	}

	protected Configuration generateDc(IFeatureModel candidate, IFeatureModel fmP) throws UnsupportedModelException, IOException, TimeoutException {
		return new DCGeneratorByComparator().generateDC(candidate,fmP);
		//return new DCGeneratorBySAT().generateDC(candidate,fmP);
	}

}