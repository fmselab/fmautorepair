package testgeneration;

import org.prop4j.ConfEvaluator;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;

/** oracle when the oracle is another feature model
 * 
 * @author garganti
 *
 */
public class OracleFIDEbyFM extends OracleFIDE {
	private FeatureModel oracle;

	public OracleFIDEbyFM(FeatureModel oracle) {
		this.oracle = oracle;
	}

	@Override
	public boolean validity(Configuration conf) {
		ConfEvaluator oracleConf = new ConfEvaluator(conf);
		boolean isValid = oracleConf.isValidForModel(oracle);
		//assert isValid == (new Configuration(ev.getConfiguration(), oracle).isValid() && oracle.getFeatureNames().containsAll(ev.getConfiguration().getSelectedFeatureNames()));
		return isValid;
	}

	@Override
	public FeatureModel getFeatureModel() {
		return oracle;
	}
}