package splr.diff;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.AttributeChange;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.ReferenceChange;
import org.eclipse.emf.compare.ResourceAttachmentChange;
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import splr.extractor.UndertakerModelExtractor;

import com.google.common.base.Function;

import feature.model.name.space.DefaultValueType;
import feature.model.name.space.FeatureModelType;
import feature.model.name.space.FeatureType;
import feature.model.name.space.SelectType;
import feature.model.name.space.SpacePackage;
import feature.model.name.space.impl.DefaultValueTypeImpl;
import feature.model.name.space.impl.FeatureModelTypeImpl;
import feature.model.name.space.impl.FeatureTypeImpl;
import feature.model.name.space.impl.SelectTypeImpl;
import feature.model.name.space.util.SpaceResourceFactoryImpl;

public class DiffEngine
{
	
	private FeatureChangeRepository _repo = null;
	
	private ResourceSet		older					= null;
	private ResourceSet		newer					= null;
	private final String	_pathToXSD				= "models/FeatureModelSchema.xsd";

	
	/**
	 * To be used to for test purpose only.
	 */
	public DiffEngine()
	{
		_repo = new FeatureChangeRepository("default","1","2");
	}
	
	public FeatureChangeRepository getRepo()
	{
		return _repo;
	}
	
	
	/**
	 * Create a feature model difference identifier engine. 
	 *
	 * @param repo container in which the diffs will be stored.
	 */
	public DiffEngine(FeatureChangeRepository repo)
	{
		_repo = repo;
	}
	
	/**
	 * Load EMF/SDO model from XSDs and set the this.loadedModelResources ResourceSet with the EPackages found.
	 */
	public void initModelFromXsd()
	{
		final Collection<Object> loadedPackagesEtc = new XSDEcoreBuilder().generate( getSchemaUris() );
		final Collection<EPackage> eCorePackages = new LinkedList<EPackage>();
		for ( Object loadedObject : loadedPackagesEtc )
		{
			if ( loadedObject instanceof EPackage )
			{
				eCorePackages.add( (EPackage) loadedObject );
			}
			else
			{
				//final String typeInfo = ( loadedObject == null ) ? "N/A" : loadedObject.getClass().getName();
			}
		}
		
		registerDynamicPackages( eCorePackages );
	}

	public void setOldModel(ResourceSet res1)
	{
		this.older = res1;
	}

	public void setNewModel(ResourceSet res2)
	{
		this.newer = res2;
	}

	public void setOldModel(String uri)
	{
		older = new ResourceSetImpl();
		older.getResource( URI.createFileURI( uri ) , true );
	}

	public void setNewModel(String uri)
	{
		newer = new ResourceSetImpl();
		newer.getResource( URI.createFileURI( uri ) , true );
	}

	public void getDiff()
	{
		// note on scope: createDefaultScope(left model, right model).
		// the right side is used as reference. In this case, I want to know what has changed with respect to the
		// older version of the model. The old model goes to the right side.
		IComparisonScope scope = EMFCompare.createDefaultScope( newer , older );

		IEObjectMatcher custom = new IdentifierEObjectMatcher( getMatchFunction() );
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory( new DefaultEqualityHelperFactory() );

		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl( custom , comparisonFactory );
		matchEngineFactory.setRanking( 20 );
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add( matchEngineFactory );

		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry( matchEngineRegistry ).build();
		Comparison comparison = comparator.compare( scope );
		List<Diff> differences = comparison.getDifferences();

		for ( Diff diff : differences )
		{
			extractDiffInfo( diff );
		}
		//_repo.consoleDump();
	}

	private Collection<URI> getSchemaUris()
	{
		final Collection<URI> result = new LinkedList<URI>();
		result.add( URI.createURI( _pathToXSD ) );
		return result;
	}

	private ResourceSet registerDynamicPackages(final Collection<EPackage> eCorePackages)
	{
		final ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put( "fm" , new SpaceResourceFactoryImpl() );
		EPackage.Registry.INSTANCE.put( SpacePackage.eNS_URI , SpacePackage.eINSTANCE );
		return resourceSet;
	}

	private void extractDiffInfo(Diff diff)
	{
		
		if ( diff instanceof ReferenceChange )
		{
			extractReferenceChangeInfo( diff );
		}
		else if ( diff instanceof AttributeChange )
		{
			AttributeChange change = (AttributeChange) diff;
			EAttribute attr = change.getAttribute();
			if ( diff.getKind() == DifferenceKind.CHANGE )
			{
				extractAttributeChange( diff , attr );
			}
			else if ( diff.getKind() == DifferenceKind.ADD || diff.getKind() == DifferenceKind.DELETE )
			{
				extractListAttributeChange(diff);
			}
		}

	}
	
	private void extractListAttributeChange(Diff diff)
	{

		Match match = diff.getMatch();

		EObject refObject = match.getRight();
		
		AttributeChangeSpec chg = (AttributeChangeSpec) diff;
		
		String referenceChange = (String) chg.getValue();
		String attrName = chg.getAttribute().getName();
		
		if ("DefaultConditionReferences".equalsIgnoreCase( attrName ))
		{
			DefaultValueType changedObj = (DefaultValueType) refObject;

			if(diff.getKind() == DifferenceKind.ADD)
			{
				_repo.addDefaultReference( changedObj.getFeatureName() , changedObj.getDefaultValue() , referenceChange );
			}
			if(diff.getKind() == DifferenceKind.DELETE)
			{
				_repo.removeDefaultReference( changedObj.getFeatureName() , changedObj.getDefaultValue() , referenceChange );			
			}
		}
		else  if ("SelectConditionReferences".equalsIgnoreCase( attrName ))
		{
			SelectType changedObj = (SelectType) refObject; 
			
			if(diff.getKind() == DifferenceKind.ADD)
			{
				_repo.addSelectConditionRef( changedObj.getFeatureName() , changedObj.getTarget() , referenceChange );
			}
			if(diff.getKind() == DifferenceKind.DELETE)
			{
				_repo.removeSelectConditionRef( changedObj.getFeatureName() , changedObj.getTarget() , referenceChange );
			}
		}
		else if ("DependsReferences".equalsIgnoreCase( attrName )) //temporary hack for case change in the model
		{
			FeatureType changedObj = (FeatureType) refObject; 

			if(diff.getKind() == DifferenceKind.ADD)
			{
				_repo.addDependsReference( changedObj.getFeatureName() , referenceChange );
			}
			if(diff.getKind() == DifferenceKind.DELETE)
			{
				_repo.removeDependsReference( changedObj.getFeatureName(),referenceChange );
			}
		}

	}

	/**
	 * That's adding and removing entire select/default value items from/on a feature.
	 * @param diff
	 */
	private void extractReferenceChangeInfo(Diff diff)
	{
		Match match = diff.getMatch();

		EObject oldObject = match.getRight();
		EObject newObject = match.getLeft();
		ReferenceChange refChange = (ReferenceChange) diff;

		if ( diff.getKind() == DifferenceKind.ADD )
		{
			if ( oldObject instanceof FeatureModelTypeImpl )
			{
				// add reference to feature model.
				FeatureTypeImpl newFeat = (FeatureTypeImpl) refChange.getValue();				
				_repo.addedFeature( newFeat );
			}
			else if ( oldObject instanceof FeatureTypeImpl )
			{	// add reference to feature				
				Object newRef = refChange.getValue();
				if(newRef instanceof SelectTypeImpl)
				{
					SelectTypeImpl select = (SelectTypeImpl) refChange.getValue();
					FeatureTypeImpl feature = (FeatureTypeImpl) oldObject;
					
					_repo.addSelect( feature.getFeatureName(), select.getTarget(), select.getSelectCondition());
					for(String ref : select.getSelectConditionReferences())
						_repo.addSelectConditionRefForAdd( feature.getFeatureName() , select.getTarget() , ref );
				}
				else if (newRef instanceof DefaultValueType)
				{
					FeatureTypeImpl feature = (FeatureTypeImpl) oldObject;
					DefaultValueType def = (DefaultValueType) newRef ;

					_repo.addDefaultValue( feature.getFeatureName() , def.getDefaultValue() , def.getDefaultValueCondition() );
					for(String ref: def.getDefaultConditionReferences())
					{
						_repo.addDefaultConditionReferencesForAdd( feature.getFeatureName() , def.getDefaultValue() , ref );
					}
					
					for(String ref: def.getDefaultValueReferences())
					{
						_repo.addDefaultValueReferencesForAdd( feature.getFeatureName() , def.getDefaultValue() , ref );
					}
				}
				else
				{
					throw new RuntimeException("Unknown type of reference added to a feature object:" + newRef.getClass().toString());
				}
			}
		}
		else if ( diff.getKind() == DifferenceKind.DELETE )
		{
			if ( newObject instanceof FeatureModelTypeImpl )
			{
				// removed reference to feature model.
				FeatureTypeImpl newFeat = (FeatureTypeImpl) refChange.getValue();
				_repo.removedFeature( newFeat );
			}
			else if ( newObject instanceof FeatureTypeImpl )
			{	// removed reference to feature
				FeatureTypeImpl feature = (FeatureTypeImpl) newObject;
				Object removedRef = refChange.getValue();
				
				if(removedRef instanceof SelectTypeImpl)
				{	//the removed reference is a reference to a select statement
					SelectTypeImpl select = (SelectTypeImpl) refChange.getValue();
					_repo.removeSelect( feature.getFeatureName() , select.getTarget(), select.getSelectCondition());
					for(String ref : select.getSelectConditionReferences())
					{
						_repo.removeSelectConditionRefForRemove( feature.getFeatureName() , select.getTarget() , ref );
					}
				}
				else if (removedRef instanceof DefaultValueType)
				{	//the removed reference is a reference to a default value
					DefaultValueType def = (DefaultValueType) removedRef ;
					_repo.removeDefaultValue( feature.getFeatureName() , def.getDefaultValue(), def.getDefaultValueCondition() );
					for(String ref : def.getDefaultConditionReferences())
					{
						_repo.removeDefaultConditionReferenceForRemove( feature.getFeatureName() , def.getDefaultValue() , ref );
					}
					
					for(String ref : def.getDefaultValueReferences())
					{
						_repo.removeDefaultValueReferenceForRemove( feature.getFeatureName() , def.getDefaultValue() , ref );
					}
				}
				else
				{
					throw new RuntimeException("Unknown type of reference added to a feature object : "+ removedRef.getClass().toString());
				}
			}
		}
	}

	private void extractAttributeChange(Diff diff, EAttribute attr)
	{
		Match match = diff.getMatch();

		EObject newObject = match.getLeft();
		EObject refObject = match.getRight();
		String target = "";
		String featureName = "";

		if ( newObject instanceof FeatureTypeImpl )
		{
			FeatureTypeImpl feat = (FeatureTypeImpl) newObject;
			featureName = feat.getFeatureName();
		}
		else if ( newObject instanceof SelectTypeImpl )
		{
			SelectTypeImpl sel = (SelectTypeImpl) newObject;
			FeatureTypeImpl container = (FeatureTypeImpl) sel.eContainer();
			target = sel.getTarget();
			featureName = container.getFeatureName() ;//+ " with selection target" + sel.getTarget();
		}
		else if ( newObject instanceof DefaultValueTypeImpl )
		{
			DefaultValueTypeImpl def = (DefaultValueTypeImpl) newObject;
			FeatureTypeImpl container = (FeatureTypeImpl) def.eContainer();
			target = def.getDefaultValue();
			featureName = container.getFeatureName() ;//+ " with selection target" + sel.getTarget();
		}
		else if ( newObject instanceof FeatureModelTypeImpl )
		{
			featureName = "MODEL";
		}

		Object newAttr = newObject.eGet( attr );
		Object oldAttr = refObject.eGet( attr );

		String newValue = ( null == newAttr ? "unset" : newAttr.toString() );
		String oldValue = ( null == oldAttr ? "unset" : oldAttr.toString() );
		
		recordAttributeChange(featureName, attr.getName(), target,oldValue, newValue);
	}

	

	private Function<EObject, String> getMatchFunction()
	{
		Function<EObject, String> fmMatch = new Function<EObject, String>()
		{

			public String apply(EObject input)
			{
				if ( input instanceof FeatureType )
				{
					return ( (FeatureType) input ).getFeatureName();
				}

				if ( input instanceof FeatureModelType )
				{
					return ( (FeatureModelType) input ).getArchitecture();
				}

				if ( input instanceof SelectType )
				{
					SelectType sel = (SelectType) input;
					return ( "select_"+sel.getFeatureName() + "_" + sel.getTarget() );
				}
				
				if ( input instanceof DefaultValueType)
				{
					DefaultValueType def = (DefaultValueType) input;
					
					return ( "default_"+def.getFeatureName() +"_"+ def.getDefaultValue() );
				}
				
				return null;
			}
		};
		return fmMatch;
	}
	
	private void recordAttributeChange(String featureName, String attrName, String target, String oldValue, String newValue)
	{
		//feature level attributes:
		if (attrName.equals("depends"))
		{
			_repo.changeDepends(featureName,oldValue,newValue);
		}
		else if (attrName.equals("prompt"))
		{
			_repo.changePrompt( featureName, oldValue, newValue );
		}
		else if (attrName.equals("type"))
		{
			_repo.changeType( featureName, oldValue, newValue );
		}
		else if (attrName.equals("defaultValueCondition"))
		{
			_repo.changeDefaultValueCondition(featureName, target, oldValue, newValue);
			
		}
		else if (attrName.equals("selectCondition"))
		{
			_repo.changeSelectCondition( featureName , target, oldValue , newValue );
		}
		else
		{
			//System.err.println(" Trying to record unknown attribute: "+attrName);
			//throw new RuntimeException("Unknown attribute changed");
		}
	}
	
}
