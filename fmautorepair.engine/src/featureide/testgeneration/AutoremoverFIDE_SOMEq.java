package featureide.testgeneration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.apache.log4j.Logger;
import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import fmautorepair.utils.JoinedIterator;
import testgeneration.OracleFIDE;

/**
 * the second order whose first order is equivcalent 
 *
 */
public class AutoremoverFIDE_SOMEq extends AutoremoverFIDE{

	public static AutoremoverFIDEFactory factory =  new AutoremoverFIDEFactory(){
		@Override
		public AutoremoverFIDE getAutoremover(FeatureModel fm, OracleFIDE o){
			return new AutoremoverFIDE_SOMEq(fm,o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDE_SOMEq.class.getSimpleName();
		}
	};

	List<FeatureModel> equivalent;

	protected AutoremoverFIDE_SOMEq(FeatureModel fm, OracleFIDE o) {
		super(fm, o);
		equivalent = new ArrayList<>();
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDE_SOMEq.class);

	@Override
	protected Iterator<FMMutation> getMutants(FeatureModel fmModel) {
		// costruisco tutte quelle del primo ordine come lista
		final Iterator<FMMutation> all1ordermutations = FMMutationProcess.getAllMutantsRndOrderFOM(fmModel);		
		return new MyIterator(all1ordermutations);
	}
	
	@Override
	protected Configuration generateDc(FeatureModel candidate, FeatureModel fmP)
			throws UnsupportedModelException, IOException, TimeoutException {
		// call the super method
		Configuration test = super.generateDc(candidate, fmP);
		// if the test is equivalent, it means that the fmP is equivalent
		if (test == null){
			equivalent.add(fmP);
		}
		return test;
	}
	
	@Override
	public void setCandidate(FeatureModel candidate) {
		logger.debug("resetting the candidate, empty the equivalent");
		super.setCandidate(candidate);
		// reset the equivalent
		if (equivalent!= null) equivalent.clear();
	}
	
	// my own iterator
	class MyIterator implements Iterator<FMMutation> {
		
		private static final boolean USE_ONE_EQ = false;
		
		// numbe rof eq jumps, otherwise it won't finish
		int nEqJumps = 0;
		Random rnd = new Random();
		
		private FMMutation nextElement;
		private boolean hasNext;
		Iterator<FMMutation> all1ordermutations;
		Iterator<FMMutation> secOrdmutations;	

		MyIterator(Iterator<FMMutation> all1ordermutations) {
			this.all1ordermutations = all1ordermutations;
			secOrdmutations = null;
			nextMatch();
		}

		@Override
		public boolean hasNext() {
			return hasNext;
		}

		@Override
		public FMMutation next() {
			if (!hasNext) {
				throw new NoSuchElementException();
			}
			return nextMatch();
		}

		private FMMutation nextMatch() {
			FMMutation oldMatch = nextElement;
			//if there are still 1storder elements
			if (all1ordermutations.hasNext()){
				hasNext = true;
				nextElement = all1ordermutations.next();
				return oldMatch;
			}
			if (secOrdmutations == null){
				// 	1st order element are finished
				// take the second order of one equivalent
				if (equivalent.isEmpty() || nEqJumps > 15){
					hasNext = false;
					return oldMatch;
				}
				nEqJumps ++;
				// get one of the equialent (teh first???)
				if (USE_ONE_EQ){
					FeatureModel firstEq = equivalent.get(rnd.nextInt(equivalent.size()));
					logger.debug("considering the second order now starting from " + " n jumps : " + nEqJumps);
					// get the second orders for this
					secOrdmutations = FMMutationProcess.getAllMutantsRndOrderFOM(firstEq);
				} else{
					List<Iterator<FMMutation>> secondorder = new ArrayList<>();
					// use all eq
					for (FeatureModel eq: equivalent){
						secondorder.add(FMMutationProcess.getAllMutantsRndOrderFOM(eq));
					}
					secOrdmutations = new JoinedIterator<>(secondorder);
				}
			}
			// take the next of second order
			hasNext = secOrdmutations.hasNext();
			if (hasNext) nextElement = secOrdmutations.next();
			return oldMatch;
		}

		@Override
		public void remove() {
			throw new RuntimeException();
		}		
	}
}
