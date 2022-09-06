package fmautorepair.mutationoperators;

import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.init.LibraryManager;

public class Consts {

	static {
		LibraryManager.registerLibrary(FMCoreLibrary.getInstance());
	}

	
	static public final String EXAMPLE_DIR = "../fmautorepair.models/";
}
