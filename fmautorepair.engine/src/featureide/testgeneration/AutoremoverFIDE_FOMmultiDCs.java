package featureide.testgeneration;

import java.util.Iterator;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutationProcess;
import testgeneration.OracleFIDE;

public class AutoremoverFIDE_FOMmultiDCs extends AutoremoverFIDEmultiDCs {

	public static AutoremoverFIDEFactory factory(final int n) {
		return new AutoremoverFIDEFactory() {

			@Override
			public AlgorithmUsingFIDE getAutoremover(FeatureModel fm, OracleFIDE o) {
				return new AutoremoverFIDE_FOMmultiDCs(fm, o, n);
			}

			@Override
			public String getAlgorithmName() {
				return AutoremoverFIDE_FOMmultiDCs.class.getSimpleName() + n;
			}
		};
	}

	public AutoremoverFIDE_FOMmultiDCs(FeatureModel fm, OracleFIDE o, int n) {
		super(fm, o, n);
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDE_FOMmultiDCs.class);

	@Override
	protected Iterator<FMMutation> getMutants(FeatureModel candidate) {
		return FMMutationProcess.getAllMutantsRndOrderFOM(candidate);
	}
	

}