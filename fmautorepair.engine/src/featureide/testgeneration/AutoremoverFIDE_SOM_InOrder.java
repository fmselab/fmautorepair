package featureide.testgeneration;

import java.util.Iterator;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutationProcess;
import testgeneration.OracleFIDE;

public class AutoremoverFIDE_SOM_InOrder extends AutoremoverFIDE{
	
	public static AutoremoverFIDEFactory factory =  new AutoremoverFIDEFactory(){
		@Override
		public AutoremoverFIDE_SOM_InOrder getAutoremover(FeatureModel fm, OracleFIDE o){
			return new AutoremoverFIDE_SOM_InOrder(fm,o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDE_SOM_InOrder.class.getSimpleName();
		}
	};

	public AutoremoverFIDE_SOM_InOrder(FeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDE_SOM_InOrder.class);

	@Override
	protected Iterator<FMMutation> getMutants(FeatureModel candidate) {
		return FMMutationProcess.getAllMutantsRndOrderHOM2inOrder(candidate);
	}
}