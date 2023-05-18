package featureide.testgeneration;

import java.util.Iterator;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import testgeneration.OracleFIDE;

public class AutoremoverFIDE_SOM extends AutoremoverFIDE{

	public static AutoremoverFIDEFactory factory =  new AutoremoverFIDEFactory(){
		@Override
		public AutoremoverFIDE getAutoremover(IFeatureModel fm, OracleFIDE o){
			return new AutoremoverFIDE_SOM(fm,o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDE_SOM.class.getSimpleName();
		}
		
		
	};

	protected AutoremoverFIDE_SOM(IFeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDE_SOM.class);

	@Override
	protected Iterator<FMMutation> getMutants(IFeatureModel candidate) {
		return FMMutationProcess.getAllMutantsRndOrderHOM2(candidate);
	}
}
