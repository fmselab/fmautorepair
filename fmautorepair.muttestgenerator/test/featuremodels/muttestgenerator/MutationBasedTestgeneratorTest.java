package featuremodels.muttestgenerator;

import static org.junit.Assert.*;

import org.junit.Test;

import de.ovgu.featureide.fm.core.init.FMCoreLibrary;

public class MutationBasedTestgeneratorTest {

	@Test
	public void testMain() {
		FMCoreLibrary.getInstance().install();
		String oldFMPathStr = "models/aircraft_v1.xml";
		new MutationBasedTestgenerator().generate(oldFMPathStr);
	}

}
