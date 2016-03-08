package splr.diff;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import feature.model.name.space.DefaultValueType;
import feature.model.name.space.FeatureType;
import feature.model.name.space.SelectType;

public class FeatureChangeRepository
{

	public FeatureChangeRepository(String arch, String fromRevision, String toRevision)
	{
		this._fromRevision = fromRevision;
		this._toRevision = toRevision;
		this._arch = arch;
	}

	/*
	 * Map a feature with all its changes for a given release period.
	 */
	private Map<String, FeatureChange>	_repo			= new HashMap<String, FeatureChange>();

	private List<FeatureChange>  		_removedFeature	= new ArrayList<FeatureChange>();
	private List<FeatureChange>			_addedFeatures	= new ArrayList<FeatureChange>();

	private List<String>				_addedFeatureNames = new ArrayList<String>();
	private List<String>				_removedFeatureNames = new ArrayList<String>();
	
	private String						_fromRevision	= "";
	private String						_toRevision		= "";
	private String 						_arch			= "";
	
	public int _nbFeatures = 0;	//total number of feature in the variability model for this given release.

	public class FeatureChange
	{

		public String	featureName								= "";
		// feature attribute change
		public int		typeChange								= 0;
		public String 	oldType = "";
		public String 	newType = "";

		// prompt
		public int 		changePrompt							= 0;
		public String 	oldPrompt = "";
		public String 	newPrompt = "";

		// depends
		public int		changeDepends							= 0;
		public int		dependsChangeAmplitude					= 0;
		public List<String> addedDependsRef = new ArrayList<String>(); 
		public List<String> removedDependsRef = new ArrayList<String>();
		public String 	oldDependsExpression 					= ""; 
		public String 	newDependsExpression						= "";
		
		//default value
		public int		defaultValueConditionChangeAmplitude	= 0;
		public List<DefaultValue> addedDefault = new ArrayList<DefaultValue>();
		public List<DefaultValue> removedDefault = new ArrayList<DefaultValue>();
		public List<DefaultValue> modifiedDefault = new ArrayList<DefaultValue>();
		
		//select condition
		public List<Select> addedSelect = new ArrayList<Select>();
		public List<Select> removedSelect = new ArrayList<Select>();
		public List<Select> modifiedSelect = new ArrayList<Select>();
		public int		selectConditionChangeMaxAmplitude		= 0;
	}
	
	public class Select
	{
		public String targetName = "";
		public String oldCondition = "";
		public String newCondition = "";
		public List<String> addedReferences = new ArrayList<String>();
		public List<String> removedReferences = new ArrayList<String>();
	}
	
	
	public class DefaultValue
	{
		public String value = "";
		public String oldCondition = "";
		public String newCondition = "";
		public List<String> addedConditionReferences = new ArrayList<String>();
		public List<String> removedConditionReferences = new ArrayList<String>();
		public List<String> addedDefValReferences = new ArrayList<String>(); 
		public List<String> removedDefValReferences = new ArrayList<String>();
	}
	

	private FeatureChange getFeatureChange(String name)
	{
		FeatureChange change = _repo.get( name );
		if ( change == null )
		{
			change = new FeatureChange();
			change.featureName = name;
			_repo.put( name , change );
		}
		return change;
	}
	
	/////
	// Feature Model level op (add/rem feature)
	/////
	
	public void addedFeature(String featureName)
	{
		if ( !_addedFeatureNames.contains( featureName ) )
		{
			_addedFeatureNames.add( featureName );
		}
	}
	
	public void addedFeature(FeatureType newFeat)
	{
		FeatureChange feat = buildFullFeatureChange( newFeat , true );
		_addedFeatures.add( feat );
	}

	public void removedFeature(String featureName)
	{
		if ( !_removedFeatureNames.contains( featureName ) )
		{
			_removedFeatureNames.add( featureName );
		}
	}
	
	public void removedFeature(FeatureType remFeat)
	{
		FeatureChange feat = buildFullFeatureChange( remFeat , false );
		_removedFeature.add( feat );
	}
	
	
	private FeatureChange buildFullFeatureChange(FeatureType feat,boolean isNew)
	{
		FeatureChange chg = new FeatureChange();
		chg.featureName = feat.getFeatureName();
		
		if ( isNew ) 
		{  
			chg.newType = feat.getType();
			chg.newPrompt = ( feat.isSetPrompt() ? "true" : "false" );
			chg.newDependsExpression = ( feat.getDepends() != null ? feat.getDepends() : "");
			
			for(String s : feat.getDependsReferences())
			{
				chg.addedDependsRef.add( s );
			}
			
			for(DefaultValueType def : feat.getDefaultValues())
			{
				DefaultValue defValue = new DefaultValue(); 
				defValue.value = def.getDefaultValue();
				defValue.newCondition =  ( def.getDefaultValueCondition() != null ? def.getDefaultValueCondition()  : "");
				
				for(String s : def.getDefaultConditionReferences())
				{
					defValue.addedConditionReferences.add( s );
				}
				
				for(String s: def.getDefaultValueReferences())
				{
					defValue.addedDefValReferences.add( s );
				}
				chg.addedDefault.add( defValue );
			}
			
			for(SelectType sel : feat.getSelect())
			{
				Select selChg = new Select();
				selChg.targetName = sel.getTarget();
				
				selChg.newCondition = (sel.getSelectCondition() != null ? sel.getSelectCondition()  : "");
				
				for(String s : sel.getSelectConditionReferences())
				{
					selChg.addedReferences.add( s );
				}
				chg.addedSelect.add( selChg );
			}
		}
		else 
		{
			chg.oldType = feat.getType();
			chg.oldPrompt = ( feat.isSetPrompt() ? "true" : "false" );
			chg.oldDependsExpression =  ( feat.getDepends() != null  ?feat.getDepends() : "");
			for(String s : feat.getDependsReferences())
			{
				chg.removedDependsRef.add( s );
			}
			
			for(DefaultValueType def : feat.getDefaultValues())
			{
				DefaultValue defValue = new DefaultValue(); 
				defValue.value = def.getDefaultValue();
				defValue.oldCondition = ( def.getDefaultValueCondition() != null ? def.getDefaultValueCondition()  : "");
				
				for(String s : def.getDefaultConditionReferences())
				{
					defValue.removedConditionReferences.add( s );
				}
				
				for(String s : def.getDefaultValueReferences())
				{
					defValue.removedDefValReferences.add( s );
				}
				chg.removedDefault.add( defValue );
			}
			
			for(SelectType sel : feat.getSelect())
			{
				Select selChg = new Select();
				selChg.targetName = sel.getTarget();
				
				selChg.oldCondition = ( sel.getSelectCondition() != null ? sel.getSelectCondition() : "");
				
				for(String s : sel.getSelectConditionReferences())
				{
					selChg.removedReferences.add( s );
				}
				chg.removedSelect.add( selChg );
			}
		}
		
		
		
		
		return chg;
	}
	/////
	// Feature attribute changes
	/////
	
	public void changeType(String featureName, String oldType , String newType)
	{
		FeatureChange change = getFeatureChange( featureName );
		change.oldType = oldType; 
		change.newType = newType;
		change.typeChange++;

	}

	public void changePrompt(String featureName, String oldPrompt, String newPrompt)
	{
		FeatureChange change = getFeatureChange( featureName );
		change.oldPrompt = oldPrompt; 
		change.newPrompt = newPrompt;
		change.changePrompt++;
	}

	/////
	// Depends statement changes
	/////
	
	public void changeDepends(String featureName, String oldValue, String newValue)
	{
		FeatureChange chg = getFeatureChange( featureName );
		chg.oldDependsExpression = oldValue;
		chg.newDependsExpression = newValue;
	}
	
	public void addDependsReference(String featureName, String refName)
	{
		FeatureChange chg = getFeatureChange( featureName );
		if(!chg.addedDependsRef.contains( refName ))
			chg.addedDependsRef.add( refName );
	}
	
	public void removeDependsReference(String featureName, String refName)
	{
		FeatureChange chg = getFeatureChange( featureName );
		if(!chg.removedDependsRef.contains( refName ))
			chg.removedDependsRef.add( refName );		
	}
	

	/////
	// Default Value changes
	/////

	public void addDefaultValue(String featureName, String value, String condition)
	{
		FeatureChange change = getFeatureChange( featureName );
		
		DefaultValue def = new DefaultValue();
		def.value = value;
		def.newCondition = condition;
		
		change.addedDefault.add( def );
	}

	public void removeDefaultValue(String featureName, String value, String condition)
	{
		FeatureChange change = getFeatureChange( featureName );
		
		DefaultValue def = new DefaultValue();
		def.value = value;
		def.oldCondition = condition;
		
		change.removedDefault.add( def );
	}

	public void changeDefaultValueCondition(String featureName, String value, String oldValue, String newValue)
	{
		DefaultValue defChg = getModifiedDefaultForFeature(featureName, value);
		defChg.oldCondition = oldValue;
		defChg.newCondition = newValue;
	}
	
	public void addDefaultReference(String featureName, String defaultValue, String reference)
	{
		DefaultValue defChg = getModifiedDefaultForFeature(featureName, defaultValue);
		if(!defChg.addedConditionReferences.contains( reference ))
			defChg.addedConditionReferences.add( reference );
	}
	
	public void addDefaultConditionReferencesForAdd(String featureName, String defaultValue, String reference)
	{
		DefaultValue defChg = getAddedDefaultForFeature(featureName, defaultValue);
		if(!defChg.addedConditionReferences.contains( reference ))
			defChg.addedConditionReferences.add( reference );
	}
	
	public void addDefaultValueReferencesForAdd(String featureName, String defaultValue, String ref)
	{
		DefaultValue defChg = getAddedDefaultForFeature(featureName, defaultValue);
		if(!defChg.addedDefValReferences.contains( ref ))
			defChg.addedDefValReferences.add( ref );
	}
	
	public void removeDefaultReference(String featureName, String defaultValue, String reference)
	{
		DefaultValue defChg = getModifiedDefaultForFeature(featureName, defaultValue);
		if(!defChg.removedConditionReferences.contains( reference ))
			defChg.removedConditionReferences.add( reference );
	}
	
	public void removeDefaultConditionReferenceForRemove(String featureName, String defaultValue, String reference)
	{
		DefaultValue defChg = getRemovedDefaultForFeature(featureName, defaultValue);
		if(!defChg.removedConditionReferences.contains( reference ))
			defChg.removedConditionReferences.add( reference );
	}
	
	public void removeDefaultValueReferenceForRemove(String featureName, String defaultValue, String reference)
	{
		DefaultValue defChg = getRemovedDefaultForFeature(featureName, defaultValue);
		if(!defChg.removedDefValReferences.contains( reference ))
			defChg.removedDefValReferences.add( reference );
	}
	
	private DefaultValue getModifiedDefaultForFeature(String featureName, String value)
	{
		FeatureChange chg = getFeatureChange( featureName );
		
		DefaultValue defChg = null;
		List<DefaultValue> defChgs  = chg.modifiedDefault;
		defChg = getDefaultValInList( value , defChg , defChgs );
		return defChg;
	}
	
	private DefaultValue getRemovedDefaultForFeature(String featureName, String value)
	{
		FeatureChange chg = getFeatureChange( featureName );
		
		DefaultValue defChg = null;
		List<DefaultValue> defChgs  = chg.removedDefault;
		defChg = getDefaultValInList( value , defChg , defChgs );
		return defChg;
	}

	private DefaultValue getAddedDefaultForFeature(String featureName, String value)
	{
		FeatureChange chg = getFeatureChange( featureName );
		
		DefaultValue defChg = null;
		List<DefaultValue> defChgs  = chg.addedDefault;
		defChg = getDefaultValInList( value , defChg , defChgs );
		return defChg;
	}
	
	private DefaultValue getDefaultValInList(String value, DefaultValue defChg, List<DefaultValue> defChgs)
	{
		for(DefaultValue existingDefChg : defChgs)
		{
			if(existingDefChg.value.equals( value ))
				defChg = existingDefChg;
		}
		
		if(defChg == null)
		{	//this default value hasn't changed yet, let's add it
			defChg = new DefaultValue();
			defChg.value = value;
			defChgs.add( defChg );
		}
		return defChg;
	}

	/////
	// Select statement changes
	/////
	public void addSelect(String featureName, String target, String condition)
	{
		FeatureChange change = getFeatureChange( featureName );
		Select sel = new Select();
		sel.targetName = target;
		sel.newCondition = condition;
		
		change.addedSelect.add( sel );
	}

	public void removeSelect(String featureName, String target, String condition)
	{
		FeatureChange change = getFeatureChange( featureName );
		
		Select sel = new Select();
		sel.targetName = target;
		sel.oldCondition = condition;
		
		change.removedSelect.add( sel );
	}

	public void changeSelectCondition(String featureName, String target, String oldValue, String newValue)
	{
		Select sel = getSelectForFeature(featureName, target);
		sel.oldCondition = oldValue;
		sel.newCondition = newValue;
	}
	
	
	public void addSelectConditionRef(String featureName, String target, String ref)
	{
		Select sel = getSelectForFeature(featureName, target);
		if(!sel.addedReferences.contains( ref ))
			sel.addedReferences.add(ref);
	}
	
	public void addSelectConditionRefForAdd(String featureName, String target, String ref)
	{
		Select sel = getAddedSelectForFeature(featureName, target);
		if(!sel.addedReferences.contains( ref ))
			sel.addedReferences.add(ref);
	}
	
	
	public void removeSelectConditionRef(String featureName, String target, String ref)
	{
		Select sel = getSelectForFeature(featureName, target);
		if(!sel.removedReferences.contains( ref ))
			sel.removedReferences.add(ref);
	}
	
	public void removeSelectConditionRefForRemove(String featureName, String target, String ref)
	{
		Select sel = getRemovedSelectForFeature(featureName, target);
		if(!sel.removedReferences.contains( ref ))
			sel.removedReferences.add(ref);
	}
	/**
	 * Returns the "select" object associated with feature <code>featureName</code> which points to <code>target</code>. 
	 * If none is found, one is created with the appropriate target.
	 * @param featureName the name of the changed feature
	 * @param target the name of the selected feature of the changed "select statement"
	 * @return the select object, or a new one.
	 */
	private Select getSelectForFeature(String featureName , String target)
	{
		FeatureChange chg = getFeatureChange( featureName );
		Select sel = null; 
		List<Select> sels = chg.modifiedSelect;
		
		sel = getSelectInList( target , sels );
		
		return sel;
	}
	
	private Select getAddedSelectForFeature(String featureName , String target)
	{
		FeatureChange chg = getFeatureChange( featureName );
		Select sel = null; 
		List<Select> sels = chg.addedSelect;
		
		sel = getSelectInList( target , sels );
		
		return sel;
	}
	
	private Select getRemovedSelectForFeature(String featureName , String target)
	{
		FeatureChange chg = getFeatureChange( featureName );
		Select sel = null; 
		List<Select> sels = chg.removedSelect;
		
		sel = getSelectInList( target , sels );
		
		return sel;
	}

	private Select getSelectInList(String target,  List<Select> sels)
	{
		Select sel = null;
		//looking for existing select change obj (with the specified target)
		for(Select existingSel : sels)
		{
			if(existingSel.targetName.equals( target ))
			{
				sel = existingSel;
			}
		}
		
		if(sel == null)
		{//none found, create one.
			sel = new Select();
			sel.targetName = target;
			sels.add( sel );
		}
		return sel;
	}
	
	
	/////// Utils
	
	public int getNbNewFeatures()
	{
		return _addedFeatures.size();
	}
	
	public int getNbRemovedFeatures()
	{
		return _removedFeature.size();
	}
	
	public int getNbModifiedFeatures()
	{
		return _repo.size();
	}
	
	public List<String> getModifiedFeatureNames()
	{
		List<String> names = new ArrayList<String>();
		Set<String>keys = _repo.keySet();
		
		for(String s : keys)
		{
			names.add( s );
		}
		
		return names;
	}
	

	/**
	 * Writer the content of the repository in CSV format into the writer passed as parameter.
	 * 
	 * 
	 * @param wr
	 * @throws IOException 
	 */
	public void recordDiff(DBWriter db) throws IOException
	{
		try
		{	
			Set<String> featNames = _repo.keySet();
			for(String n : featNames)
			{ 
				FeatureChange c = _repo.get( n );	
				db.addChangeEntry( c , _toRevision , _arch );  
				db.recordModifiedFeature( _arch , _toRevision , c.featureName );
			}
			
			
			
			db.recordNbFeatures(_arch,_toRevision,_nbFeatures);
			for(FeatureChange f : _removedFeature)
			{
				db.addRemEntry( f , _toRevision , _arch );
				db.recordRemovedFeature(_arch,_toRevision,f.featureName);
			
			}
			for(FeatureChange f : _addedFeatures)
			{
				db.addNewEntry( f , _toRevision , _arch );
				db.recordAddedFeature(_arch,_toRevision,f.featureName);
			}
		}
		catch ( SQLException e )
		{
			System.err.println("error while updating arch level information");
		}
		
		

	}
	
	
	
	///////
	// DEBUG FACILITIES
	//////
	public void consoleDump()
	{
		System.out.println(" == ADDED FEATURES == ");
		
		for(FeatureChange chg : _addedFeatures)
		{
			featureDump(chg);
		}
		
		System.out.println(" == REMOVED FEATURES == ");
		
		for(FeatureChange chg : _removedFeature)
		{
			featureDump(chg);
		}
		
		System.out.println(" == MODIFIED FEATURES == ");
		for(String name : _repo.keySet())
		{
			FeatureChange chg = _repo.get( name );
			featureDump(chg);
		}
	}
	
	private void featureDump(FeatureChange chg)
	{
		System.out.println("Feature: " + chg.featureName);
		System.out.println("	old type : " + chg.oldType +" -  new type "+ chg.newType);
		System.out.println("	old prompt : " + chg.oldPrompt+" -  new prompt "+ chg.newPrompt);
		System.out.println("	---- Depends statement ---");
		System.out.println("	old depends : " + chg.oldDependsExpression);
		System.out.println("	old references : ");
		for(String s : chg.removedDependsRef)
			System.out.println("		"+s);
		System.out.println("	new depends : " + chg.newDependsExpression);
		System.out.println("	new references : ");
		for(String s : chg.addedDependsRef)
			System.out.println("		"+s);
		
		outputDefaultChanges( chg );
		outputSelectChanges(chg);
		
	}

	private void outputDefaultChanges(FeatureChange chg)
	{
		System.out.println("	---- Default Values ---");
		System.out.println("		- added default values");
		for(DefaultValue def : chg.addedDefault)
		{
			System.out.println("		value : " + def.value);
			System.out.println("		condition:" + def.newCondition);
			System.out.println("		new condition references:" );
			for(String s: def.addedConditionReferences)
			{
				System.out.println("			"+s);
			}
			System.out.println("		new  value references:" );
			for(String s: def.addedDefValReferences)
			{
				System.out.println("			"+s);
			}
			
		}
		
		System.out.println("		- removed default values");
		for(DefaultValue def : chg.removedDefault)
		{
			System.out.println("		value : " + def.value);
			System.out.println("		condition:" + def.oldCondition);
			System.out.println("		removed condition references:" );
			for(String s: def.removedConditionReferences)
			{
				System.out.println("			"+s);
			}
			System.out.println("		removed  value references:" );
			for(String s: def.removedDefValReferences)
			{
				System.out.println("			"+s);
			}
		}
		
		System.out.println("		- modified default values");
		for(DefaultValue def : chg.modifiedDefault)
		{
			System.out.println("		value : " + def.value);
			System.out.println("		old condition:" + def.oldCondition);
			System.out.println("		new condition:" + def.newCondition);
			System.out.println("		removed condition references:" );
			for(String s: def.removedConditionReferences)
			{
				System.out.println("			"+s);
			}
			System.out.println("		new condition references:" );
			for(String s: def.addedConditionReferences)
			{
				System.out.println("			"+s);
			}
			
			System.out.println("		removed  value references:" );
			for(String s: def.removedDefValReferences)
			{
				System.out.println("			"+s);
			}
			System.out.println("		new  value references:" );
			for(String s: def.addedDefValReferences)
			{
				System.out.println("			"+s);
			}
		}
	}


	private void outputSelectChanges(FeatureChange chg)
	{
		System.out.println("	---- Select ---");
		System.out.println("		- added select");
		for(Select def : chg.addedSelect)
		{
			System.out.println("		target : " + def.targetName);
			System.out.println("		condition:" + def.newCondition);
			System.out.println("		new references:" );
			for(String s: def.addedReferences)
			{
				System.out.println("			"+s);
			}
		}
		System.out.println("		- removed selects");
		for(Select def : chg.removedSelect)
		{
			System.out.println("		target : " + def.targetName);
			System.out.println("		condition:" + def.oldCondition);
			System.out.println("		removed references:" );
			for(String s: def.removedReferences)
			{
				System.out.println("			"+s);
			}
		}
		System.out.println("		- modified selects");
		for(Select def : chg.modifiedSelect)
		{
			System.out.println("		target : " + def.targetName);
			System.out.println("		old condition:" + def.oldCondition);
			System.out.println("		new condition:" + def.newCondition);
			System.out.println("		removed references:" );
			for(String s: def.removedReferences)
			{
				System.out.println("			"+s);
			}
			System.out.println("		new references:" );
			for(String s: def.addedReferences)
			{
				System.out.println("			"+s);
			}
		}
	}


}
