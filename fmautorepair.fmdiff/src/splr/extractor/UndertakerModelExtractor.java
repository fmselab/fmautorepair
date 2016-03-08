package splr.extractor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import feature.model.name.space.DefaultValueType;
import feature.model.name.space.FeatureModelType;
import feature.model.name.space.FeatureType;
import feature.model.name.space.SelectType;
import feature.model.name.space.SpaceFactory;
import feature.model.name.space.SpacePackage;
import feature.model.name.space.util.SpaceResourceFactoryImpl;

/**
 * This class is in charge of extracting a ECore feature model from the output of the Undertaker tool.
 * 
 * @author Dante
 * 
 * 
 */
public class UndertakerModelExtractor
{

	private String						_arch		= "";	// architecture to extract
	private String						_version	= "";	// version of the model
	private File						_modelFile	= null; // root directory of Undertaker models.
	private SpaceFactory				_factory	= null;	// pointer to model object factory
	private Map<String, FeatureType>	_features	= null; // store for features, indexed by feature name

	/**
	 * Build a new feature model extractor. It will build an extractor for the feature model of architecture <code>architecture</code> revision
	 * <code>version</code> for which the Undertaker model is located in the file <code>rootDir</code>/version/architecture.rsf
	 * 
	 * @param rootDir
	 *            absolute file path to the directory containing the Undertaker models
	 * @param architecture
	 *            the architecture for which to extract the feature model.
	 * @param version
	 *            the revision of the Linux Kernel for which to extract the Feature Model.
	 * 
	 */
	// Mostly for test purposes.
	public UndertakerModelExtractor(String modelPath, String architecture, String version)
	{
		_arch = architecture;
		_version = version;
		_features = new HashMap<String, FeatureType>();

		_modelFile = new File( modelPath );

		// init the model & get the factory
		SpacePackage.eINSTANCE.eClass();
		_factory = SpaceFactory.eINSTANCE;
	}

	public ResourceSet getModel()
	{
		// build the ECore model from the _model file using our new factory.
		FeatureModelType fm = buildModel( _modelFile );

		// generate a resource using the model
		ResourceSet r = buildResource( fm );

		if ( null == r )
		{// it will always contain the "feature model" itself, so
			// 1 is not enough for a valid model.
			throw new IllegalArgumentException(
					"Failed to load properly the model, the resource is malformed. Check code." );
		}

		// done
		return r;
	}

	private ResourceSet buildResource(FeatureModelType fm)
	{
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		if ( !m.containsKey( "fm" ) )
		{
			m.put( "fm" , new SpaceResourceFactoryImpl() );
		}

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource( URI.createURI( "model/" + _arch + "/" + _version + ".fm" ) );

		resource.getContents().add( fm );

		return resSet;
	}

	private FeatureModelType buildModel(File file)
	{
		FeatureModelType fm = _factory.createFeatureModelType();
		fm.setArchitecture( _arch );
		fm.setRevision( _version );
		
		if(file.exists())
		{
			loadFeatures( file );
	
			EList<FeatureType> features = fm.getFeature();
	
			Set<String> names = _features.keySet();
			for ( String name : names )
			{
				FeatureType feat = _features.get( name );
				features.add( feat );
			}
		}
		else
		{
			System.err.println("\nNo files were found for " + _arch +" " + _version + ". Empty feature model generated. Check wether this is normal or not! "+"The tool was looking for "+ file.getAbsolutePath());
		}

		return fm;
	}

	private void loadFeatures(File file)
	{
		List<String> matchList = new ArrayList<String>();
		Pattern regex = Pattern.compile( "[^\\s\"']+|\"[^\"]*\"|'[^']*'" );

		// first run: extract items - check if some feature are defined more than one time.
		extractFeatures( file , matchList , regex );

		// second run: extract everything else
		extractFeatureAttributes( file , matchList , regex );
	}

	private void extractFeatureAttributes(File file, List<String> matchList, Pattern regex)
	{
		String line;
		try
		{	
				
			BufferedReader br = new BufferedReader( new FileReader( file ) );
			while ( ( line =  br.readLine() ) != null )
			{
				Matcher regexMatcher = regex.matcher( line );
				while ( regexMatcher.find() )
				{
					matchList.add( regexMatcher.group() );
				}

				if ( line.startsWith( "Choice" ) || "".equals( line ) || matchList.size() == 0 )
				{ // not interested in unnamed choices. They can't be tracked over time.
					continue;
				}

				if ( matchList.get( 0 ).equals( "Default" ) )
				{
					addDefaultValueToFeature( matchList );
				}
				else if ( matchList.get( 0 ).equals( "Depends" ) )
				{
					addDependsToFeature( matchList );
				}
				else if ( matchList.get( 0 ).equals( "HasPrompts" ) )
				{
					addPromptsToFeature( matchList );
				}
				else if ( matchList.get( 0 ).equals( "ItemSelects" ) )
				{
					addSelectToFeature( matchList );
				}

				matchList.clear();// ready for next.
			}
			
			br.close();
		}
		catch ( Exception e )
		{
			System.err.println( "Unable to read model file for model " + _arch + " " + _version + " with path: "
					+ file.getAbsolutePath() + "\n" + e.getMessage() );
			throw new RuntimeException( e );
		}
	}

	private void extractFeatures(File file, List<String> matchList, Pattern regex)
	{
		String line;
		try
		{
			BufferedReader br = new BufferedReader( new FileReader( file ) );
			while ( ( line = br.readLine() ) != null )
			{

				if ( line.startsWith( "Item" ) && !line.startsWith("ItemSelec") )
				{ // not interested in unnamed choices. They can't be tracked over time.
					Matcher regexMatcher = regex.matcher( line );
					while ( regexMatcher.find() )
					{
						matchList.add( regexMatcher.group() );
					}

					String featureName = matchList.get( 1 );
					String type = matchList.get( 2 );

					FeatureType feat = getFeature( featureName );

					feat.setType( type );
					
					 matchList.clear();
				}
			}
			br.close();
		}
		catch ( Exception e )
		{
			System.err.println( "Error while extracting Items from rsf file " + _arch + " " + _version + " with path: " + file.getAbsolutePath() + "\n"
					+ e.getMessage() );
			throw new RuntimeException( e );
		}
	}

	private void addSelectToFeature(List<String> matchList)
	{

		int length = matchList.size();

		String featureName = matchList.get( 1 );
		if(featureName.startsWith( "CHOICE" )) return; // we don't deal with choices.
		
		String selectedFeat = matchList.get( 2 );
		String condition = "";

		if ( length > 3 )
		{
			condition = matchList.get( 3 );
			condition = condition.replace( "\"" , "" );
			condition = renameChoices( condition );
			if(condition.equalsIgnoreCase( "\"y\"") || condition.equalsIgnoreCase( "y"))
			{
				condition = "";
			}
		}

		FeatureType feat = getFeature( featureName );

		boolean hasTarget = false;
		for ( SelectType selection : feat.getSelect() )
		{
			if ( selection.getTarget().equals( selectedFeat )  )
			{
				hasTarget = true;
				if(!"".equals( condition ))
					if(!"".equals(selection.getSelectCondition()))
						selection.setSelectCondition( selection.getSelectCondition() + " || " + condition );
					else
						selection.setSelectCondition( condition );
				
				EList<String> oldRefs = selection.getSelectConditionReferences();
				List<String> newRefs = extractFeatureNames( condition );
				for(String s : newRefs)
				{
					if(!oldRefs.contains( s ))
						oldRefs.add( s );
				}
			}
		}
		if ( !hasTarget )
		{
			createNewSelectForFeature( selectedFeat , condition , feat );
		}
		
	}

	private void createNewSelectForFeature(String selectedFeat, String condition, FeatureType feat)
	{
		SelectType sel = _factory.createSelectType();
		sel.setTarget( selectedFeat.replace( "\"" , "" ) );
		sel.setSelectCondition( condition );
		sel.setFeatureName( feat.getFeatureName() );
		
		List<String> refs = extractFeatureNames( condition );
		refs.addAll( extractFeatureNames( selectedFeat ) );
		EList<String> selRefs = sel.getSelectConditionReferences(); 
		for(String s : refs)
		{
			if(!selRefs.contains( s ))
			{
				selRefs.add( s );
			}
		}
		
		
		feat.getSelect().add( sel );
	}

	
	
	private String renameChoices(String condition)
	{
		if ( condition.contains( "CHOICE" ) )
		{
			condition = condition.replaceAll( "CHOICE_.." , "CHOICE" );
			condition = condition.replaceAll( "CHOICE_." , "CHOICE" );
			// System.out.println("condition contained choices, it is now: " + condition);
		}
		return condition;
	}

	private void addPromptsToFeature(List<String> matchList)
	{
		String featureName = matchList.get( 1 );
		String value = matchList.get( 2 );
		
		if(featureName.startsWith( "CHOICE" )) return;

		FeatureType feat = getFeature( featureName );

		feat.setPrompt( value.equals( "0" ) ? false : true );
	}

	private void addDependsToFeature(List<String> matchList)
	{
		String featureName = matchList.get( 1 );
		String expression = matchList.get( 2 );
		
		if(featureName.startsWith( "CHOICE" )) return; // we don't deal with choices.

		FeatureType feat = getFeature( featureName );
		expression = renameChoices(expression);
		expression = expression.replace( "\"" , "");
		if ( null != feat.getDepends() && feat.getDepends().length() != 0 )
		{
			feat.setDepends( feat.getDepends() + " && " + expression );
			
			List<String> references = extractFeatureNames (expression);
			EList<String> depRefs = feat.getDependsReferences();
			for(String s : references)
			{
				if(!depRefs.contains( s ))
				{
					depRefs.add( s );
				}
			}
		}
		else
		{
			//add the expression
			feat.setDepends( expression );
			//add the references
			List<String> references = extractFeatureNames (expression);
			EList<String> depRefs = feat.getDependsReferences();
			for(String s : references)
			{
				if(!depRefs.contains( s ))
				{
					depRefs.add( s );
				}
			}
		}
	}

	private void addDefaultValueToFeature(List<String> matchList)
	{
		int length = matchList.size();

		String featureName = matchList.get( 1 );
		
		if(featureName.startsWith( "CHOICE" )) return; // we don't deal with choices.
		
		String defaultValue = matchList.get( 2 );
		defaultValue=defaultValue.replace("\"",""); 
		String condition = "";

		if ( length > 3 ) condition = matchList.get( 3 );
		
		if(condition.equalsIgnoreCase( "y" ) || condition.equalsIgnoreCase( "\"y\"" ))
			condition = "";
		
		condition = renameChoices(condition);
		condition = condition.replace( "\"" , "" );
		
		List<String> conditionReferences = extractFeatureNames (condition);
		
		FeatureType feat = getFeature( featureName );
		
		
		EList<DefaultValueType> defaults  = feat.getDefaultValues();
		boolean isNew = true;
		
		//check if this default value already exists for this feature
		for (DefaultValueType def : defaults)
		{
			if(def.getDefaultValue().equals( defaultValue ))
			{//we need to append new feature reference from the condition to the references in this one - if any
				isNew = false;
				EList<String> refFeatureNames = def.getDefaultConditionReferences();
				for(String s : conditionReferences)
				{
					if(!refFeatureNames.contains( s ))
					{
						refFeatureNames.add( s );
					}
				}
				def.setDefaultValueCondition(def.getDefaultValueCondition() + " || " + condition);
				
				break;
			}
		}
	
		
		if(isNew)
		{
			DefaultValueType def = _factory.createDefaultValueType();
			def.setFeatureName( featureName );
			def.setDefaultValue( defaultValue.replace("\"","") );//un-quote value.
			def.setDefaultValueCondition( condition );
			EList<String> refs = def.getDefaultConditionReferences();
			if( (feat.getType().equals( "tristate" ) || feat.getType().equals( "boolean" ) ) && defaultValue.length() > 1)
			{//the default value could be a combination of other feature value.
				def.getDefaultValueReferences().addAll( extractFeatureNames( defaultValue) );
			}
			
			refs.addAll( conditionReferences );

			feat.getDefaultValues().add( def );
		}
	}

	/**
	 * Extract feature names from a boolean feature expression (such as select condition)
	 * 
	 * @param condition
	 * 
	 * @return a list of string (feature names), empty list if no feature names where found.
	 */
	private List<String> extractFeatureNames(String condition)
	{
		//a bit of clean up to be able to extract feature name without operators and stuff.
		condition = condition.replace( "!" , "" ); 
		condition = condition.replace( "\"" , " " );
		condition = condition.replace( "||" , "" );
		condition = condition.replace( "&&" , "" );
		condition = condition.replace( "(" , " ( " );
		condition = condition.replace( ")" , " ) " );
		condition = condition.replace( "=" , " = " );
		
		List<String> featureNames = new ArrayList<String>();
		
		String[] args = condition.split( " " );
		
		for (int i = 0 ; i < args.length ; i++)
		{
			if(args[i].length() > 1) //feature names are more than 2 char long, and this removes spaces and binary operators
				featureNames.add( args[i].trim() );
		}
		
		return featureNames;
	}

	public FeatureType getFeature(String featureName)
	{
		FeatureType feat = _features.get( featureName );

		if ( feat == null )
		{
			feat = _factory.createFeatureType();
			feat.setFeatureName( featureName );
			_features.put( featureName , feat );
		}

		return feat;
	}
	
	public int getNbFeatures()
	{
		return _features.size();
	}

}
