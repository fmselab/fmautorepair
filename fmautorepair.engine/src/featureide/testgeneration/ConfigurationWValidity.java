package featureide.testgeneration;

import de.ovgu.featureide.fm.core.configuration.Configuration;
import fmautorepair.utils.Pair;

/** configuration with its validity wrt the oracle
 * 
 * @author garganti
 *
 */
public class ConfigurationWValidity  extends Pair<Configuration, Boolean>{

	public ConfigurationWValidity(Configuration s, Boolean a) {
		super(s, a);
	}

	@Override
	public String toString() {
		return getFirst().getSelectedFeatureNames() + " in oracle " + getSecond();
	}
	
}
