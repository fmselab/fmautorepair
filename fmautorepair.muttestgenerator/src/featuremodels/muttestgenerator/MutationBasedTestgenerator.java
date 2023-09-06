package featuremodels.muttestgenerator;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.prop4j.And;
import org.prop4j.FMToBDD;
import org.prop4j.Literal;
import org.prop4j.Node;
import org.prop4j.Not;


import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.Feature;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDD.AllSatIterator;
import net.sf.javabdd.BDD.BDDIterator;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;


@Command(name = "mutfmtg", description = "mutatation based test generation for feature models")
public class MutationBasedTestgenerator implements Callable<Void> {

	static Logger LOG = Logger.getLogger(MutationBasedTestgenerator.class);

	@Parameters(index = "0", description = "the feature model  (xmi featureide format)")
	private File file;

	private static final boolean check_duplicates = true;

	// this example implements Callable, so parsing, error handling and handling
	// user
	// requests for usage help or version help can be done with one line of code.
	public static void main(String... args) {
		int exitCode = new CommandLine(new MutationBasedTestgenerator()).execute(args);
		System.exit(exitCode);
	}

	@Override
	public Void call() throws Exception {
		FMCoreLibrary.getInstance().install();
		String absolutePath = file.getAbsolutePath();
		System.out.println("generating tests from " + absolutePath);
		generate(absolutePath);
		return null;
	}

	void generate(String fmPathStr) {
		Path oldFMPath = Path.of(fmPathStr);
		IFeatureModel oldFM = FeatureModelManager.load(oldFMPath);
		List<String> features = oldFM.getFeatureOrderList();

		FMToBDD f2bdd = new FMToBDD(features);
		// create the bdd
		Node createNodes = NodeCreator.createNodes(oldFM);
		BDD bdd = f2bdd.nodeToBDD(createNodes);
		// get the mutations
		Iterator<FMMutation> mutants = FMMutationProcess.getAllMutantsRndOrderFOM(oldFM);
		// test suite
		Set<FMTest> testSuite = new HashSet<>();
		while (mutants.hasNext()) {
			FMMutation next = mutants.next();
			LOG.debug("mutation " + next.getSecond());
			try {
				IFeatureModel mutFM = next.getFirst();
				Node mutNodes = NodeCreator.createNodes(mutFM);
				// get the feature name since it may have been changed
				Set<IFeature> deletedfeatures = new HashSet<>(oldFM.getFeatures());
				deletedfeatures.removeAll(mutFM.getFeatures());
				//System.err.println(deletedfeatures);
				assert deletedfeatures.size() <= 1;
				if (deletedfeatures.size() == 1) {
					IFeature removedFeature = deletedfeatures.iterator().next();
					mutNodes = new And(new Not(new Literal(removedFeature)),mutNodes);
				}
				//
				BDD bddM = f2bdd.nodeToBDD(mutNodes);
				// do the xor
				BDD xorBdd = bdd.xorWith(bddM);
				int num = (int) xorBdd.satCount();
				if (num == 0)
					LOG.debug(" -- equivalent mutant");
				else {
					AllSatIterator it = bdd.allsat();
					FMTest test = new FMTest(it.nextSat());
					System.out.print(" test: " + test);
					if (check_duplicates) {
						if (testSuite.contains(test))
							LOG.debug(" duplicated");
					}
					testSuite.add(test);
					LOG.debug("\n");
				}
			} catch (java.lang.ArrayStoreException e) {
				System.out.println(" error");
				e.printStackTrace();
			}
		}
		System.out.println(testSuite.size() + " tests are generated:");
		for (FMTest t : testSuite) {
			System.out.println(t);
		}
		List<FMTest> tsmerge = mergeTests(testSuite);
		System.out.println(tsmerge.size() + " tests are merged:");
		for (FMTest t : tsmerge) {
			System.out.println(t);
		}
	}

	private List<FMTest> mergeTests(Set<FMTest> testSuite) {
		List<FMTest> ts = new ArrayList<>(testSuite);
		for(int i = 0; i < ts.size(); i++) {
			FMTest t1 = ts.get(i);
			if (t1 == null) continue;
			for(int j = i+1; j < ts.size(); j++) {
				FMTest t2 = ts.get(j);
				if (t2 == null) continue;
				if (t1.merge(t2)) {
					// remove t2
					ts.set(j,null);
				}	
			}
		}
		ts.removeAll(Collections.singletonList(null));
		return ts;
	}
}
