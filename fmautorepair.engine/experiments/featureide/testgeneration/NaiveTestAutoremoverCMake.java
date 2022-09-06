package featureide.testgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelWriter;
import fmautorepair.mutationoperators.constraints.ConstraintAdder;
import fmautorepair.utils.Utils;
import testgeneration.OracleFidebyCMake;

public class NaiveTestAutoremoverCMake {
	 static String CURRENTDIR;

	@BeforeClass
	public static void setUpOp() {

		// Logger.getLogger(NodeToExpression.class).setLevel(Level.OFF);
		// Logger.getLogger(FeatureIDEtoATGT.class).setLevel(Level.OFF);
		// Logger.getLogger(TestFMFromCppCode.class).setLevel(Level.OFF);
		// Logger.getLogger(AutoremoverFIDE.class).setLevel(Level.DEBUG);
		// Logger.getLogger(EqAutoFIDE.class).setLevel(Level.DEBUG);
		// Logger.getLogger(FM4Testgeneration.class).setLevel(Level.DEBUG);
		Logger.getLogger("mutationoperators").setLevel(Level.OFF);
		Logger.getLogger(OracleFidebyCMake.class).setLevel(Level.OFF);
		Logger.getLogger(AutoremoverFIDECollect.class).setLevel(Level.DEBUG);
		Logger.getLogger(ConstraintAdder.class).setLevel(Level.DEBUG);
		File dir = new File(System.getProperty("user.dir")).getParentFile();
		String a = null;
		try {
			a = URLDecoder.decode(dir.getAbsolutePath()+"/fmautorepair.models", "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("user.dir", a);
		//System.out.println(new File(System.getProperty("user.dir")).canRead());
	    CURRENTDIR=a;
	}

	@Test
	public void testLibSSH() throws Exception {
		IFeatureModel res = test("models/libssh/libssh_noconstraints.xml");
		//XmlFeatureModelWriter w = new XmlFeatureModelWriter(res);
		//w.writeToFile(new File("models/libssh_noconstraints2.xml"));
	}

	@Test
	public void testLibSSHRepair1() throws Exception {
		IFeatureModel res = test("models/libssh/libssh_wrong1.xml");
		XmlFeatureModelWriter w = new XmlFeatureModelWriter(res);
		w.writeToFile(new File("models/libssh_repaired1.xml"));		
	}
	// QUELLI SMALL NON FUNZIONANO TANTO PERCHE' LE FEATURE NON PRESENTI POTREBBERO ESSERE SELEZIONATE DAL CMAKE
	@Test
	public void testLibSSHSmall() throws Exception {
		test("models/libssh_small.xml");
	}

	@Test
	public void testLibSSHSmall2() throws Exception {
		test("models/libssh_small2.xml");
	}

	@Test // simplest possible
	public void testLibSSHSmall3() throws Exception {
		test("models/libssh_small3.xml");
	}

	
	//
	private IFeatureModel test(String model) throws FileNotFoundException, UnsupportedModelException, Exception {
		OracleFidebyCMake oracle = new OracleFidebyCMake("/home/garganti/Downloads/experiments_source_fm/libssh_build",
				"../libssh");
		IFeatureModel libssh = Utils.readModel(model);
		AutoremoverFIDECollect autorem = (AutoremoverFIDECollect) AutoremoverFIDECollect.factory.getAutoremover(libssh,
				oracle);

		IFeatureModel result = autorem.bestModel();
		System.out.println("final result " + result);
		System.out.println("generated dcs " + autorem.numberOfGeneratedDCs());
		// compare them
		ModelComparator comparator = new ModelComparator(1000000);
		Comparison comparison = comparator.compare(result, libssh);
		System.out.println(comparison.toString());
		for (Object d : autorem.dcs) {
			System.out.println(d);
		}
		return result;

	}

}