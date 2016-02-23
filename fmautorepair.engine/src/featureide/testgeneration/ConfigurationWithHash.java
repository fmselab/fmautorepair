package featureide.testgeneration;

import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.ConfigurationWriter;
import de.ovgu.featureide.fm.core.configuration.SelectableFeature;
import de.ovgu.featureide.fm.core.configuration.Selection;

// per sostuire le configuration di FIDE che non funzionano
public class ConfigurationWithHash extends Configuration {

	protected ConfigurationWithHash(Configuration configuration) {
		super(configuration);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		ConfigurationWithHash s;
		s = (ConfigurationWithHash) o;
		ConfigurationWriter cwthis = new ConfigurationWriter(this);
		ConfigurationWriter cwo = new ConfigurationWriter(s);
		String sthis =cwthis.writeIntoString();
		String sobject =cwo.writeIntoString();
		if (sobject == null) {
			if (sthis != null)
				return false;
		}
		
		return sthis.equals(sobject);
		
	}

	@Override
	public int hashCode() {
		ConfigurationWriter cw = new ConfigurationWriter(this);
		String hash = cw.writeIntoString();
		///System.err.println(hash);
		if (hash == null || hash == "") {
			hash = "EMPTY";
		}
		return hash.hashCode();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("{");
		for (SelectableFeature feature : getFeatures()) {
			if (feature.getSelection() == Selection.SELECTED && feature.getFeature().isConcrete()) {
				builder.append(feature.getFeature().getName());
				builder.append(",");
			}
		}
		builder.deleteCharAt(builder.length()-1);
		builder.append("}");
		return builder.toString();
	}
	
}
