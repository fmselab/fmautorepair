package testgeneration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.sat4j.specs.TimeoutException;

import de.ovgu.featureide.fm.core.FeatureModel;
import de.ovgu.featureide.fm.core.editing.Comparison;
import de.ovgu.featureide.fm.core.editing.ModelComparator;
import de.ovgu.featureide.fm.core.io.UnsupportedModelException;
import de.ovgu.featureide.fm.core.io.xml.XmlFeatureModelWriter;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.mutationoperators.features.AlternativeToAnd;
import fmautorepair.mutationoperators.features.AlternativeToAndOpt;
import fmautorepair.mutationoperators.features.AlternativeToOr;
import fmautorepair.mutationoperators.features.AndToAlternative;
import fmautorepair.mutationoperators.features.AndToOr;
import fmautorepair.mutationoperators.features.MandatoryToOptional;
import fmautorepair.mutationoperators.features.OptionalToMandatory;
import fmautorepair.mutationoperators.features.OrToAltenative;
import fmautorepair.mutationoperators.features.OrToAnd;
import fmautorepair.mutationoperators.features.OrToAndOpt;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.Utils;
import splar.core.fm.FeatureModelException;
import splar.core.fm.configuration.ConfigurationEngineException;

public class GenerateMutants {
	static FMMutator[] mutators = new FMMutator[]{AlternativeToAnd.instance, AlternativeToAndOpt.instance, AlternativeToOr.instance,
													AndToAlternative.instance, AndToOr.instance, MandatoryToOptional.instance,
													/*MissingFeature.instance,*/ OptionalToMandatory.instance, OrToAltenative.instance,
													OrToAnd.instance, OrToAndOpt.instance};
	static Random rnd = new Random();

	public static void init() {
		org.apache.log4j.Logger.getRootLogger().setLevel(org.apache.log4j.Level.OFF);
	}

	/*public static Set<MyFMMutation> generateMutantsWithSet(FeatureModel fmodel, int depth, double percSelect) {
		assert depth > 0: "depth must be greater than 0 - depth = " + depth;
		Set<MyFMMutation> currMutants = new HashSet<MyFMMutation>();
		for(FMMutator mutator: mutators) {
			List<FMMutation> res = CollectionsUtil.listFromIterator(mutator.mutate(fmodel));
			for(FMMutation r: res) {
				currMutants.add(new MyFMMutation(r));
			}
		}

		int toRemove = (int)(currMutants.size()*(1 - percSelect));
		for(int i = 0; i < toRemove; i++) {
			currMutants.remove(rnd.nextInt(currMutants.size()));
		}
		Set<MyFMMutation> mutants = new HashSet<MyFMMutation>();
		if(depth == 1) {
			mutants.addAll(currMutants);
		}
		else {
			for(MyFMMutation currMutant: currMutants) {
				FeatureModel fmMut = currMutant.getMutation();
				mutants.addAll(generateMutantsWithSet(fmMut, depth - 1, percSelect));
			}
		}
		return mutants;
	}*/

	public static List<FMMutation> generateMutantsNoSet(FeatureModel fmodel, int depth, double percSelect) {
		assert depth > 0: "depth must be greater than 0 - depth = " + depth;
		assert percSelect > 0 && percSelect <= 1: "percSelect not allowed: " + percSelect;
		//System.err.println("depth = " + depth);
		List<FMMutation> mutants = new ArrayList<FMMutation>();
		for(FMMutator mutator: mutators) {
			List<FMMutation> currMutants = CollectionsUtil.listFromIterator(mutator.mutate(fmodel));
			
			
			int toRemove = (int)(currMutants.size()*(1 - percSelect));
			for(int i = 0; i < toRemove; i++) {
				currMutants.remove(rnd.nextInt(currMutants.size()));
			}
			
			/*if(currMutants.size() > 2 ) {
				List<FMMutation> selected = new ArrayList<FMMutation>();
				for(int i = 0; i < 2; i++) {
					selected.add(currMutants.get(rnd.nextInt(currMutants.size())));
				}
				currMutants = selected;
			}*/
			
			
			if(depth == 1) {
				mutants.addAll(currMutants);
			}
			else {
				for(FMMutation currMutant: currMutants) {
					FeatureModel fmMut = currMutant.getFirst();
					mutants.addAll(generateMutantsNoSet(fmMut, depth - 1, percSelect));
				}
			}
		}
		return mutants;
	}

	private static void saveMutatedModel(FeatureModel featureModel, String name, boolean description) throws IOException {
		if(description) {
			for(String comment: featureModel.getComments()) {
				if(comment.contains(" from ")) {
					name = name + "_" + comment.replace("mutation ", "").replaceAll(" from ", "_").replaceAll(" ", "");
				}
			}
		}
		//SXFMWriter writer = new SXFMWriter(mutatedModel);
		XmlFeatureModelWriter writer = new XmlFeatureModelWriter(featureModel);
		//System.out.println(writer.writeToString());
		FileWriter fw = new FileWriter(new File(name + ".xml"));
		fw.write(writer.writeToString());
		fw.close();
	}

	private static void saveMutatedModel(FMMutation mutation, String name, boolean description) throws IOException {
		saveMutatedModel(mutation.getFirst(), name, description);
	}

	public static void removeEquivalents(String model, String folderMutants) throws FileNotFoundException, UnsupportedModelException {
		FeatureModel fm = Utils.readSPLOTModel(model);
		File dir = new File(folderMutants);
		assert dir.isDirectory();
		ModelComparator comparator = new ModelComparator(1000000);
		int counter = 0;
		for(File file: dir.listFiles()) {
			FeatureModel mutant = Utils.readModel(file.getAbsolutePath());
			Comparison comparison = comparator.compare(fm, mutant);
			if(comparison == Comparison.REFACTORING) {
				counter++;
				file.delete();
			}
		}
		System.out.println(counter);
	}

	public static void removeEquivalents(String folderMutants) throws FileNotFoundException, UnsupportedModelException {
		File dir = new File(folderMutants);
		assert dir.isDirectory();
		ModelComparator comparator = new ModelComparator(1000000);
		int counter = 0;
		for(File file: dir.listFiles()) {
			if(!file.exists()) continue; 
			FeatureModel mutant = Utils.readModel(file.getAbsolutePath());
			File sameDir = new File(folderMutants);
			for(File file2: sameDir.listFiles()) {
				if(!file2.getName().equals(file.getName())) {
					FeatureModel mutant2 = Utils.readModel(file2.getAbsolutePath());
					Comparison comparison = comparator.compare(mutant, mutant2);
					if(comparison == Comparison.REFACTORING) {
						counter++;
						file2.delete();
					}
				}
			}
		}
		System.out.println(counter);
	}

	public static void generateMutantsFromPreviousSet(String path, double percSelect, int depth) throws UnsupportedModelException, IOException {
		init();
		File dir = new File(path);
		assert dir.isDirectory();
		ModelComparator comparator = new ModelComparator(1000000);
		for(File file: dir.listFiles()) {
			if(!file.exists()) continue;
			String fileName = file.getName().replaceAll("depth" + (depth - 1), "depth" + depth);
			fileName = fileName.substring(0, fileName.length() - 4);
			FeatureModel fmmodel = Utils.readModel(file.getAbsolutePath());
			List<FMMutation> currMutants = new ArrayList<FMMutation>();
			for(FMMutator mutator: mutators) {
				currMutants.addAll(CollectionsUtil.listFromIterator(mutator.mutate(fmmodel)));						
			}
			/*int toRemove = (int)(currMutants.size()*(1 - percSelect));
			for(int i = 0; i < toRemove; i++) {
				currMutants.remove(rnd.nextInt(currMutants.size()));
			}
			for(FMMutation m: currMutants) {*/
			List<FMMutation> selectedMutants = new ArrayList<FMMutation>();
			int toSelect = (int)(currMutants.size()*percSelect);
			//System.out.println(toSelect);
			for(int i = 0; i < toSelect; i++) {
				FMMutation mut = currMutants.get(rnd.nextInt(currMutants.size()));
				if(comparator.compare(fmmodel, mut.getFirst()) != Comparison.REFACTORING) {
					selectedMutants.add(mut);
				}
				else {
					i--;
				}
			}
			for(FMMutation m: selectedMutants) {
				//saveMutatedModel(m, fmmodel.get);
				String name = fileName + "_" + m.getFirst().getComments().get(m.getFirst().getComments().size() - 1).replace("mutation ", "").replaceAll(" from ", "_").replaceAll(" ", "") + ".xml";
				XmlFeatureModelWriter writer = new XmlFeatureModelWriter(m.getFirst());
				//System.out.println(writer.writeToString());
				FileWriter fw = new FileWriter(new File(name));
				fw.write(writer.writeToString());
				fw.close();
			}
		}
	}

	public static void mutate(String modelPath, int depth, double percMutants) throws IOException, UnsupportedModelException {
		init();
		FeatureModel fm = Utils.readSPLOTModel(modelPath);
		List<FMMutation> mutants = generateMutantsNoSet(fm, depth, percMutants);
		System.out.println("all mutants = " + mutants.size());
		
		//per eliminare gli equivalenti
		/*Set<MyFMMutation> mutantsNoEquiv = new HashSet<MyFMMutation>();
		MyFMMutation orig = new MyFMMutation(fm);
		mutantsNoEquiv.add(orig);
		for(FMMutation m: mutants) {
			mutantsNoEquiv.add(new MyFMMutation(m));
		}
		mutantsNoEquiv.remove(orig);
		System.out.println(mutantsNoEquiv.size());*/

		String modelName = new File(modelPath).getName();
		modelName = modelName.substring(0, modelName.length() - 4);
		for(FMMutation m: mutants) {
			saveMutatedModel(m, modelName + "_depth" + depth, true);
		}
	}

	public static List<FeatureModel> generateNmutants(FeatureModel fmodel, int numMutants, List<FeatureModel> mutants) {
		numMutants--;
		if(numMutants >= 0) {
			List<FMMutation> currMutants;
			do {
				FMMutator mutator = mutators[rnd.nextInt(mutators.length)];
				currMutants = CollectionsUtil.listFromIterator(mutator.mutate(fmodel));
			}
			while(currMutants.size() == 0);
			FeatureModel mutant = currMutants.get(rnd.nextInt(currMutants.size())).getFirst();
			mutants.add(mutant);
			return generateNmutants(mutant, numMutants, mutants);
		}
		else {
			return mutants;
		}
	}

	public static void generateNmutants(String modelPath, int numMutants) throws IOException, UnsupportedModelException {
		init();
		FeatureModel fm = Utils.readModel(modelPath);
		List<FeatureModel> mutants = new ArrayList<FeatureModel>();
		generateNmutants(fm, numMutants, mutants);

		String modelName = new File(modelPath).getName();
		modelName = modelName.substring(0, modelName.length() - 4);
		for(int i = 0; i < numMutants; i++) {
			saveMutatedModel(mutants.get(i), modelName + "_" + (i + 1), false);
		}
	}

	private static void getAdequacy(String oraclePath, String mutantsPath) throws TimeoutException, IOException, FeatureModelException, ConfigurationEngineException, UnsupportedModelException {
		FeatureModel o = Utils.readModel(oraclePath);
		for(File f: new File(mutantsPath).listFiles()) {
			FeatureModel m = Utils.readModel(f.getAbsolutePath());
			System.out.println(CompareOracleMutantBDD.getConformance(o, m).percConfsJudgedCorrectly());
		}
	}
	
	public static void main(String[] args) throws UnsupportedModelException, IOException, TimeoutException, FeatureModelException, ConfigurationEngineException {
		//mutate("splotmodels_new/model_20091225_1547989376.xml", 5, 0.0001);
		//removeEquivalents("splotmodels_new/model_20091225_1547989376.xml", "mutants_model_20091225_1547989376/depth4/");
		//removeEquivalents("mutants_model_20091225_1547989376/depth4/");
		
		//generateMutantsFromPreviousSet("mutants_model_20091225_1547989376/depth4/", 0.1, 5);
		//removeEquivalents("mutants_model_20091225_1547989376/depth5/");
		//generateNmutants("splotmodels_new/featureIDE/REAL-FM-14.xml", 20);
		
		String model = "stack_fm";
		getAdequacy("splotmodels_new/featureIDE/" + model + ".xml", "splotmodels_new/featureIDE/" + model + "/random/");
	}
}

class MyFMMutation {
	private FeatureModel mutation;

	public MyFMMutation(FeatureModel m) {
		mutation = m;
	}

	public MyFMMutation(FMMutation m) {
		this(m.getFirst());
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof MyFMMutation) {
			FeatureModel fm = mutation;
			FeatureModel fm2 = ((MyFMMutation)o).mutation;
			ModelComparator comparator = new ModelComparator(1000000);
			Comparison comparison = comparator.compare(fm, fm2);
			return comparison == Comparison.REFACTORING;
		}
		return false;
	}

	@Override
	public int hashCode(){
		return mutation.hashCode();
	}

	public FeatureModel getMutation() {
		return mutation;
	}
}