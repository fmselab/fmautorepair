package featureide.testgeneration;

import java.util.Iterator;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import testgeneration.OracleFIDE;

public class AutoremoverFIDE_FOMmultiDCs extends AutoremoverFIDEmultiDCs {

	public static AutoremoverFIDEFactory factory(final int n) {
		return new AutoremoverFIDEFactory() {

			@Override
			public AlgorithmUsingFIDE getAutoremover(IFeatureModel fm, OracleFIDE o) {
				return new AutoremoverFIDE_FOMmultiDCs(fm, o, n);
			}

			@Override
			public String getAlgorithmName() {
				return AutoremoverFIDE_FOMmultiDCs.class.getSimpleName() + n;
			}
		};
	}

	public AutoremoverFIDE_FOMmultiDCs(IFeatureModel fm, OracleFIDE o, int n) {
		super(fm, o, n);
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDE_FOMmultiDCs.class);

	@Override
	protected Iterator<FMMutation> getMutants(IFeatureModel candidate) {
		return FMMutationProcess.getAllMutantsRndOrderFOM(candidate);
	}
	

}