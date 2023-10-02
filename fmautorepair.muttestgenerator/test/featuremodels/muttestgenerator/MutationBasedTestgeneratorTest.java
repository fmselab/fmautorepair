package featuremodels.muttestgenerator;

import static org.junit.Assert.*;

import org.junit.Test;

import de.ovgu.featureide.fm.core.init.FMCoreLibrary;

public class MutationBasedTestgeneratorTest {

	@Test
	public void testMainConfigurations() {
		FMCoreLibrary.getInstance().install();
		String oldFMPathStr = "models/aircraft_v1.xml";
		new MutationBasedTestgenerator().generate(oldFMPathStr, false);
	}
	
	@Test
	public void testMainTests() {
		FMCoreLibrary.getInstance().install();
		String oldFMPathStr = "models/aircraft_v1.xml";
		new MutationBasedTestgenerator().generate(oldFMPathStr, true);
	}

}
