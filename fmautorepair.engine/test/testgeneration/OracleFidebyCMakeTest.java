package testgeneration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.configuration.Configuration;
import de.ovgu.featureide.fm.core.configuration.Selection;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import fmautorepair.utils.Utils;

public class OracleFidebyCMakeTest {
	

	static OracleFidebyCMake oracle = new OracleFidebyCMake("/home/garganti/Downloads/experiments_source_fm/libssh_build","../libssh");
	/*o.addString2Feature("zlib", "WITH_ZLIB");
	o.addString2Feature("libgcrypt", "WITH_GCRYPT");
	o.addString2Feature("GSSAPI","WITH_GSSAPI");
	o.addString2Feature("SSH-1","WITH_SSH1");
	o.addString2Feature("SFTP","WITH_SFTP");
	o.addString2Feature("Server","WITH_SERVER");
	o.addString2Feature("WITH_DEBUG_CRYPTO");
	o.addString2Feature("WITH_DEBUG_CALLTRACE");
	o.addString2Feature("WITH_GCRYPT");
	o.addString2Feature("Pcap","WITH_PCAP");
	o.addString2Feature("WITH_INTERNAL_DOC");
	o.addString2Feature("WITH_CLIENT_TESTING");
	o.addString2Feature("WITH_EXAMPLES");
	o.addString2Feature("libnacl","WITH_NACL");
	o.addString2Feature("WITH_BENCHMARKS");
	o.addString2Feature("WITH_TESTING");
	o.addString2Feature("WITH_STATIC_LIB");*/

	
	static FeatureModel libssh;
	
	@BeforeClass
	public static void setup() throws FileNotFoundException, UnsupportedModelException{
		Logger.getLogger(OracleFidebyCMake.class).setLevel(Level.DEBUG);		
		//libssh =  Utils.readModel("models/libssh.xml");
//		libssh =  Utils.readModel("models/libssh_noconstraints.xml");
		libssh =  Utils.readModel("models/libssh_small3.xml");
	}

	@Test
	public final void testValidConf() throws FileNotFoundException, UnsupportedModelException {
		Configuration c = new Configuration(libssh);
		//c.setManual("WITH_BENCHMARKS", Selection.SELECTED);
		c.setManual("WITH_ZLIB", Selection.SELECTED);
		assertTrue(oracle.validity(c));
	}
	@Test
	public final void testInValidConf() throws FileNotFoundException, UnsupportedModelException {
		// invalid beacuse when beanchamrk is slected also testing is slected
		Configuration c = new Configuration(libssh,false);
		c.setManual("WITH_BENCHMARKS", Selection.SELECTED);
		c.setManual("WITH_TESTING", Selection.UNSELECTED);
		assertFalse(oracle.validity(c));
	}
	
	@Test// testing can be true
	public final void testValidConftesting() throws FileNotFoundException, UnsupportedModelException {
		Configuration c = new Configuration(libssh,false);
		c.setManual("WITH_BENCHMARKS", Selection.SELECTED);
		c.setManual("WITH_TESTING", Selection.SELECTED);
		c.setManual("WITH_STATIC_LIB", Selection.SELECTED);
		assertTrue(oracle.validity(c));
	}
	@Test// STATIC lib can be false
	public final void testStatic() throws FileNotFoundException, UnsupportedModelException {
		Configuration c = new Configuration(libssh,false);
		c.setManual("WITH_STATIC_LIB", Selection.UNSELECTED);
		assertTrue(oracle.validity(c));
	}

}
