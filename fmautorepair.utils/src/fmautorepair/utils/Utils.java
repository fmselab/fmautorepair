package fmautorepair.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.ovgu.featureide.fm.core.FeatureModelAnalyzer;
import de.ovgu.featureide.fm.core.base.IConstraint;
import de.ovgu.featureide.fm.core.base.IFeature;
import de.ovgu.featureide.fm.core.base.IFeatureModel;
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory;
import de.ovgu.featureide.fm.core.base.impl.FMFactoryManager;
import de.ovgu.featureide.fm.core.base.impl.FMFormatManager;
import de.ovgu.featureide.fm.core.init.FMCoreLibrary;
import de.ovgu.featureide.fm.core.init.LibraryManager;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager;
import de.ovgu.featureide.fm.core.io.manager.FileHandler;
import de.ovgu.featureide.fm.core.io.sxfm.SXFMFormat;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelFormat;

/** fmautorepair.utils to read models */
public class Utils{
	
	static {
		//FMFormatManager.getInstance().addExtension(new XmlFeatureModelFormat());
		//LibraryManager.registerLibrary(FMCoreLibrary.getInstance());
		FMFactoryManager.getInstance().addExtension(DefaultFeatureModelFactory.getInstance());
	}


	static public IFeatureModel readSPLOTModel(String path) throws FileNotFoundException, UnsupportedModelException {
		// see
		// https://github.com/FeatureIDE/FeatureIDE/blob/develop/tests/de.ovgu.featureide.fm.core-test/src/de/ovgu/featureide/fm/core/io/sxfm/Experiment_ConvertSPLOTmodels.java
		// read the same SPLOT file using the FeatureiDE reader
		final IFeatureModel fm_original = DefaultFeatureModelFactory.getInstance().create();
		SXFMFormat format = new SXFMFormat();
//		final ProblemList problems = 
		FileHandler.load(new File(path).toPath(), fm_original, format);
		return fm_original;
	}

	static public IFeatureModel readModel(String path) throws FileNotFoundException, UnsupportedModelException {
		assert new File(path).exists();
		assert FeatureModelManager.isFileSupported(new File(path).toPath());
		IFeatureModel fh = FeatureModelManager.load(new File(path).toPath());
		return fh;
	}

	public static Set<String> getFeatureNames(IFeatureModel fm) {
		Set<String> fnames = new HashSet<>();
		for (IFeature a : fm.getFeatures())
			fnames.add(a.getName());
		return fnames;
	}

	/**
	 * If the candidate has no dead features, no redundant constraints
	 * 
	 * @param candidate the candidate mutated model
	 * @return if the mutation is valid
	 */
	public static boolean isOk(IFeatureModel candidate) {
		FeatureModelAnalyzer analyzer = new FeatureModelAnalyzer(candidate);
		List<IConstraint> redConstraints = analyzer.getRedundantConstraints(null);
		if (!redConstraints.isEmpty()) {
			return false;
		}
		if (analyzer.getDeadFeatures(null).size() > 0) {
			// System.out.println("Dead features:
			// "+candidate.model.getAnalyser().getDeadFeatures().size());
			return false;
		}
//			for (IConstraint ctr : candidate.getConstraints()) {
//				if (ctr.getConstraintAttribute()==ConstraintAttribute.REDUNDANT) {
//					return false;
//				}
//			}
		return true;
	}

}
