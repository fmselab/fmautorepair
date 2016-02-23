package featureide.testgeneration;

import java.util.Iterator;

import org.apache.log4j.Logger;

import de.ovgu.featureide.fm.core.FeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationprocess.FMMutationProcess;
import testgeneration.OracleFIDE;

/** first order mutants naive implementation */
public class AutoremoverFIDE_FOM extends AutoremoverFIDE {

	public static AutoremoverFIDEFactory factory = new AutoremoverFIDEFactory() {
		@Override
		public AutoremoverFIDE getAutoremover(FeatureModel fm, OracleFIDE o) {
			return new AutoremoverFIDE_FOM(fm, o);
		}

		@Override
		public String getAlgorithmName() {
			return AutoremoverFIDE_FOM.class.getSimpleName();
		}
	};

	private AutoremoverFIDE_FOM(FeatureModel fm, OracleFIDE o) {
		super(fm, o);
	}

	static private Logger logger = Logger.getLogger(AutoremoverFIDE_FOM.class);

	@Override
	protected Iterator<FMMutation> getMutants(FeatureModel candidate) {
		return FMMutationProcess.getAllMutantsRndOrderFOM(candidate);
	}
}