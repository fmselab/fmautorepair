package featuremodels.muttestgenerator;

import java.io.File;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

import org.prop4j.FMToBDD;
import org.prop4j.Node;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
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
		generate(file.getAbsolutePath());
		return null;
	}

	void generate(String oldFMPathStr) {
		System.out.println("generating tests from " + oldFMPathStr);
		Path oldFMPath = Path.of(oldFMPathStr);
		IFeatureModel oldFM = FeatureModelManager.load(oldFMPath);
		List<String> features = oldFM.getFeatureOrderList();

		FMToBDD f2bdd = new FMToBDD(features);
		// create the bdd
		Node createNodes = NodeCreator.createNodes(oldFM);
		BDD bdd = f2bdd.nodeToBDD(createNodes);
		// get the mutations
		Iterator<FMMutation> mutants = FMMutationProcess.getAllMutantsRndOrderFOM(oldFM);
		// test suite
		Set<Test> testSuite = new HashSet<>();
		while (mutants.hasNext()) {
			FMMutation next = mutants.next();
			System.out.print("mutation " + next.getSecond());
			try {
				BDD bddM = f2bdd.nodeToBDD(NodeCreator.createNodes(next.getFirst()));
				// do the xor
				BDD xorBdd = bdd.xorWith(bddM);
				int num = (int) xorBdd.satCount();
				if (num == 0)
					System.out.println(" -- equivalent mutant");
				else {
					AllSatIterator it = bdd.allsat();
					Test test = new Test(it.nextSat());
					System.out.print(" test: " + test);
					if (check_duplicates) {
						if (testSuite.contains(test))
							System.out.print(" duplicated");
					}
					testSuite.add(test);
					System.out.println();
				}
			} catch (java.lang.ArrayStoreException e) {
				System.out.println(" error");
				e.printStackTrace();
			}
		}
		System.out.println(testSuite.size() + " tests are generated:");
		for (Test t : testSuite) {
			System.out.println(t);
		}
	}
}
