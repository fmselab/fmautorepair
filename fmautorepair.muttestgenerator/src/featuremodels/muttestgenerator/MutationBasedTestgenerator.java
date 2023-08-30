package featuremodels.muttestgenerator;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.prop4j.FMToBDD;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.editing.NodeCreator;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import net.sf.javabdd.BDD;
import net.sf.javabdd.BDD.AllSatIterator;
import net.sf.javabdd.BDD.BDDIterator;

public class MutationBasedTestgenerator {

	
	static class Test{

		private byte[] test;
		
		public Test(byte[] test) {
			this.test = test;
		}
		@Override
		public String toString() {
			 return Arrays.toString(test);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Test) {
				return Arrays.equals(this.test, ((Test)obj).test);
			}
			return false;
		}
		
		@Override
		public int hashCode() {
			return Arrays.hashCode(test);
		}
	}


	private static final boolean check_duplicates = true;
	
	
	public static void main(String[] args) {
		FMCoreLibrary.getInstance().install();
		String oldFMPathStr = "models/aircraft_v1.xml";
		Path oldFMPath = Path.of(oldFMPathStr);
		IFeatureModel oldFM = FeatureModelManager.load(oldFMPath);
		List<String> features = oldFM.getFeatureOrderList();

		FMToBDD f2bdd = new FMToBDD(features);
		// create the bdd
		BDD bdd = f2bdd.nodeToBDD(NodeCreator.createNodes(oldFM));
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
					System.out.println("equivalent ");
				else {
					AllSatIterator it = bdd.allsat();
					Test test = new Test(it.nextSat());
					System.out.print(" test: " + test);
					if (check_duplicates) {
						if (testSuite.contains(test))
							System.out.println(" duplicated");
					}
					testSuite.add(test);
					
				}
			} catch (java.lang.ArrayStoreException e) {
				System.out.println(" error");
			}
		}
		System.out.println(testSuite.size());
	}

}
