package fmautorepair.mutationprocess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import de.ovgu.featureide.fm.core.base.IFeatureModel;
import fmautorepair.mutationoperators.FMMutation;
import fmautorepair.mutationoperators.FMMutator;
import fmautorepair.mutationoperators.constraints.ConstraintAdder;
import fmautorepair.mutationoperators.constraints.ConstraintRemover;
import fmautorepair.mutationoperators.constraints.ConstraintSubstitute;
import fmautorepair.mutationoperators.constraints.ExcludesToRequires;
import fmautorepair.mutationoperators.constraints.IffToImplies;
import fmautorepair.mutationoperators.constraints.ImpliesToIff;
import fmautorepair.mutationoperators.constraints.LiteralChanger;
import fmautorepair.mutationoperators.constraints.LogicAndToOr;
import fmautorepair.mutationoperators.constraints.LogicOrToAnd;
import fmautorepair.mutationoperators.constraints.NegationMutant;
import fmautorepair.mutationoperators.constraints.RequiresToExcludes;
import fmautorepair.mutationoperators.features.AlternativeToAnd;
import fmautorepair.mutationoperators.features.AlternativeToAndOpt;
import fmautorepair.mutationoperators.features.AlternativeToOr;
import fmautorepair.mutationoperators.features.AndToAlternative;
import fmautorepair.mutationoperators.features.AndToOr;
import fmautorepair.mutationoperators.features.MandatoryToOptional;
import fmautorepair.mutationoperators.features.MissingFeature;
import fmautorepair.mutationoperators.features.OptionalToMandatory;
import fmautorepair.mutationoperators.features.OrToAltenative;
import fmautorepair.mutationoperators.features.OrToAnd;
import fmautorepair.mutationoperators.features.OrToAndOpt;
import fmautorepair.mutationoperators.fmovers.MoveFeature;
import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.JoinedIterator;
import fmautorepair.utils.JoinedRandomIterator;

// TODO: Auto-generated Javadoc
/**
 * The Class FMMutationProcess.
 */
public class FMMutationProcess {

	/**
	 * All mutation operators.
	 *
	 * @return the FM mutator[]
	 */
	// attenzione crea circolarita' dipendenze
	public static FMMutator[] allMutationOperators() {

		return new FMMutator[] { 
				MissingFeature.instance, 
				ConstraintRemover.instance,
				AlternativeToAnd.instance,
				AlternativeToOr.instance, 
				AlternativeToAndOpt.instance,
				OrToAltenative.instance, 
				OrToAnd.instance, 
				OrToAndOpt.instance,
				AndToOr.instance, 
				MandatoryToOptional.instance,
				OptionalToMandatory.instance, 
				AndToAlternative.instance,
				NegationMutant.instance,
				LogicAndToOr.instance,
				LogicOrToAnd.instance,
				ConstraintSubstitute.instance,
				LiteralChanger.instance,
				ConstraintAdder.instance, 
				IffToImplies.instance, 
				ImpliesToIff.instance,
				RequiresToExcludes.instance,
				ExcludesToRequires.instance,
				MoveFeature.instance,
		// ExcludesAsCNFToRequires.instance,
		// RequiresAsCnfToExcludes.instance,
		};
	}

	/**
	 * Gets the all mutants.
	 *
	 * @param fmModel the fm model
	 * @return the all mutants
	 */
	public static Iterator<FMMutation> getAllMutants(IFeatureModel fmModel) {
		List<Iterator<FMMutation>> imutations = new ArrayList<>();
		for (FMMutator mutop : FMMutationProcess.allMutationOperators()) {
			imutations.add(mutop.mutate(fmModel));
		}
		return new JoinedIterator<FMMutation>(imutations);
	}

	/**
	 * Gets the all mutants rnd order fom.
	 *
	 * @param fmModel the fm model
	 * @return the iterator of the mutation in random order for the first order
	 */
	public static Iterator<FMMutation> getAllMutantsRndOrderFOM(
			IFeatureModel fmModel) {
		List<Iterator<FMMutation>> imutations = new ArrayList<>();
		for (FMMutator mutop : FMMutationProcess.allMutationOperators()) {
			imutations.add(mutop.mutate(fmModel));
		}
		Collections.shuffle(imutations);
		return new JoinedRandomIterator<FMMutation>(imutations);
	}

	/**
	 * Gets the all mutants rnd order ho m2.
	 *
	 * @param fmModel the fm model
	 * @return the iterator of the mutation in random order from first order to
	 *         second one
	 */
	public static Iterator<FMMutation> getAllMutantsRndOrderHOM2(
			IFeatureModel fmModel) {
		FMMutator[] mutators = FMMutationProcess.allMutationOperators();
		
		// costruisco tutte quelle del primo ordine come lista
		// � dispendioso per memoria
		List<FMMutation> all1ordermutations = CollectionsUtil
				.listFromIterator(getAllMutantsRndOrderFOM(fmModel));
		Collections.shuffle(all1ordermutations);
		// now the second order
		List<Iterator<FMMutation>> secOrdmutations = new ArrayList<>();
		ArrayList<Class<? extends FMMutator> > mutOpClass = new ArrayList<Class<? extends FMMutator> >();
 		for (FMMutator mutop: mutators) {
			mutOpClass.add(mutop.getClass());
		}
 		for(FMMutation m: all1ordermutations) {
			int indexMutator = mutOpClass.indexOf(m.getMutationClass());
			IFeatureModel firstOrderMutant = m.getFirst();
			for (int i = indexMutator; i < mutators.length; i++) {
				Iterator<FMMutation> itSomMutations = mutators[i].mutate(firstOrderMutant);
				//List<FMMutation> somMutations = CollectionsUtil.listFromIterator(itSomMutations);
				//Collections.shuffle(somMutations);
				//secOrdmutations.add(somMutations.iterator());
				secOrdmutations.add(itSomMutations);
			}
		}
		Collections.shuffle(secOrdmutations);
		// unite the first with the second
		return new JoinedIterator<>(all1ordermutations.iterator(),
				new JoinedRandomIterator<FMMutation>(secOrdmutations));
	}
	
	/**
	 * Gets the all mutants rnd order ho m2in order.
	 *
	 * @param fmModel the fm model
	 * @return the all mutants rnd order ho m2in order
	 */
	public static Iterator<FMMutation> getAllMutantsRndOrderHOM2inOrder(
			IFeatureModel fmModel) {
		FMMutator[] mutators = FMMutationProcess.allMutationOperators();
		
		// costruisco tutte quelle del primo ordine come lista
		// � dispendioso per memoria
		Iterator<FMMutation> a = getAllMutantsRndOrderFOM(fmModel);
		// now the second order
		
		List<Iterator<FMMutation>> secOrdmutations = new ArrayList<>();
		ArrayList<Class<? extends FMMutator> > mutOpClass = new ArrayList<Class<? extends FMMutator> >();
 		for (FMMutator mutop: mutators) {
			mutOpClass.add(mutop.getClass());
		}
 		while (a.hasNext()) {
 			FMMutation m = a.next();
			int indexMutator = mutOpClass.indexOf(m.getMutationClass());
			IFeatureModel firstOrderMutant = m.getFirst();
			for (int i = indexMutator; i < mutators.length; i++) {
				Iterator<FMMutation> itSomMutations = mutators[i].mutate(firstOrderMutant);
				//List<FMMutation> somMutations = CollectionsUtil.listFromIterator(itSomMutations);
				//Collections.shuffle(somMutations);
				//secOrdmutations.add(somMutations.iterator());
				secOrdmutations.add(itSomMutations);
			}
		}
		Collections.shuffle(secOrdmutations);
		
		// unite the first with the second
		return new JoinedIterator<>(getAllMutants(fmModel),
				new JoinedRandomIterator<FMMutation>(secOrdmutations));
	}
	/**
	 * Gets the some mutants.
	 *
	 * @param fmModel
	 *            the fm model
	 * @param n
	 *            the n
	 * @return the maximum n mutants randomly selected
	 */
	public static Iterator<FMMutation> getSomeMutants(
			final IFeatureModel fmModel, final int n) {

		return new Iterator<FMMutation>() {
			int i = 0;
			Iterator<FMMutation> irnd = getAllMutantsRndOrderFOM(fmModel);

			@Override
			public boolean hasNext() {
				return (irnd.hasNext() && i < n);
			}

			@Override
			public FMMutation next() {
				i++;
				return irnd.next();
			}

		};
	}

}
