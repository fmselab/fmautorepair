package splr.diff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import splr.diff.FeatureChangeRepository.DefaultValue;
import splr.diff.FeatureChangeRepository.FeatureChange;
import splr.diff.FeatureChangeRepository.Select;

public class DBWriter
{

	public static Connection	_connection	= null;
	
	public enum change_category {
								ADD_FEATURE,
								REM_FEATURE,
								MOD_FEATURE
								}; //3 categories
								
	public enum change_subcategory 
								{
								ADD_FEAT_ATTR,
								MOD_FEAT_ATTR,
								REM_FEAT_ATTR,
								
								ADD_DEFAULT,
								MOD_DEFAULT,
								REM_DEFAULT,
		
								ADD_DEPENDS,
								MOD_DEPENDS,
								REM_DEPENDS,
								
								ADD_SELECT,
								MOD_SELECT,
								REM_SELECT
								};//12 sub categories
								
	public enum change_type		{
								ADD_TYPE,
								MOD_TYPE,
								REM_TYPE,

								ADD_PROMPT,
								MOD_PROMPT,
								REM_PROMPT,

								ADD_DEF_VAL,
								REM_DEF_VAL,
								ADD_DEF_VAL_COND,
								REM_DEF_VAL_COND,
								MOD_DEF_VAL_COND,
								ADD_DEF_VAL_COND_REF,
								REM_DEF_VAL_COND_REF,
								ADD_DEF_VAL_REF,
								REM_DEF_VAL_REF,

								ADD_DEPENDS,
								REM_DEPENDS,
								MOD_DEPENDS,
								ADD_DEPENDS_REF,
								REM_DEPENDS_REF,

								ADD_SELECT_TARGET,
								REM_SELECT_TARGET,
								ADD_SELECT_COND,
								REM_SELECT_COND,
								MOD_SELECT_COND,
								ADD_SELECT_REF,
								REM_SELECT_REF
								} //27 change types

	public DBWriter()
	{
		try
		{
			try
			{
				Class.forName( "com.mysql.jdbc.Driver" );
			}
			catch ( ClassNotFoundException e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			connect();
		}
		catch ( SQLException e )
		{
			throw new RuntimeException( " Error while contacting the database:" + e.getMessage() );
		}
	}

	void connect() throws SQLException
	{
		if(_connection == null || _connection.isClosed())
		{
		
			String user = DataPaths.dbUser;//"root";
			String pass = DataPaths.dbPass;//"";
			String url = DataPaths.dbURL;//"jdbc:mysql://127.0.0.1:3306/linux?failOverReadOnly=false";
			_connection = DriverManager.getConnection( url , user , pass );
	
			if ( !_connection.isValid( 1 ) )
				throw new RuntimeException( "Unable to connect to the database with parameters:" + url + " " + user );
		}
	}

	public void disconnect() throws SQLException
	{
		if(_connection != null)
		{
			_connection.close();
			_connection = null;
		}
	}
	
	private Connection getConnection() throws SQLException
	{
		String user = "root";
		String pass = "";
		String url = DataPaths.dbURL;
		Connection connection = DriverManager.getConnection( url , user , pass );
		
		return connection;
	}
	
	
	public void addRemEntry(FeatureChange c, String revision, String arch) throws SQLException
	{
		Connection cx = getConnection();
		String category = change_category.REM_FEATURE.name();
		try
		{	
			addFineChangesForFeature( c , revision , arch , cx , category );
		}
		catch(SQLException e)
		{
			System.err.println("error while recording changed features: "+e.getMessage());
		}
		finally
		{
			
			cx.close();
		}
	}

	
	public void addNewEntry(FeatureChange c, String revision, String arch) throws SQLException
	{
		Connection cx = getConnection();
		String category = change_category.ADD_FEATURE.name();
		try
		{
			
			addFineChangesForFeature( c , revision , arch , cx , category );

		}
		catch(SQLException e)
		{
			System.err.println("error while recording changed features: "+e.getMessage());
		}
		finally
		{
			
			cx.close();
		}
	}

	public void addChangeEntry(FeatureChange c, String revision, String arch) throws SQLException
	{


		Connection cx = getConnection();
		String category = change_category.MOD_FEATURE.name();
		try
		{
			
			addFineChangesForFeature( c , revision , arch , cx , category );

		}
		catch(SQLException e)
		{
			System.err.println("error while recording changed features: "+e.getMessage());
		}
		finally
		{
			
			cx.close();
		}
	}

	private String getSQLStatement(String init, String id, String ARNC , String subCat , String type , String oldValue, String newValue)
	{
		String query = "";
		query =init+" \'"+id+"\',"+ARNC+",\'"+subCat+"\',\'"+type+"\',\'"+oldValue+"\',\'"+newValue+"\');";
		return query;
	}
	
	private void addFineChangesForFeature(FeatureChange c, String revision, String arch, Connection cx, String category) throws SQLException
	{
		String SQL = "INSERT INTO linux.fine_grain_changes VALUES (";// +
		int counter = 0;
		String idPrefix = c.featureName+"_"+revision+"_"+arch+"_";
		//Arch, Revision, Name, Category
		String ARNC = "\'"+arch+"\',\'"+revision+"\',\'"+c.featureName+"\',\'"+category+"\'"; 

		counter = addTypeChange( c , counter , cx , SQL , idPrefix , ARNC );
		counter = addPromptChange( c , counter , cx , SQL , idPrefix , ARNC );
		counter = addChangeDepends( c , counter , cx , SQL , idPrefix , ARNC );
		counter = addChangeDefault( c , counter , cx , SQL , idPrefix , ARNC );
		counter = addChangeSelect( c , counter , cx , SQL , idPrefix , ARNC );
	}

	private int addTypeChange(FeatureChange c, int counter, Connection cx, String SQL, String idPrefix, String ARNC) throws SQLException
	{
		if(!"".equals( c.oldType ) && !"".equals( c.newType ))
		{
			
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_FEAT_ATTR.name(),change_type.MOD_TYPE.name(),c.oldType,c.newType );
			run(cx,query);
			counter++;
		} 
		else if (!"".equals( c.oldType ) && "".equals( c.newType ))
		{
			
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_FEAT_ATTR.name(),change_type.REM_TYPE.name(),c.oldType,c.newType );
			run(cx,query);
			counter++;
		} 
		else if ("".equals( c.oldType ) && !"".equals( c.newType ))
		{
			
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_FEAT_ATTR.name(),change_type.ADD_TYPE.name(),c.oldType,c.newType );
			run(cx,query);
			counter++;
		}
		return counter;
	}

	private int addPromptChange(FeatureChange c, int counter, Connection cx, String SQL, String idPrefix, String ARNC) throws SQLException
	{
		if(!"".equals( c.oldPrompt ) && !"".equals( c.newPrompt ))
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_FEAT_ATTR.name(),change_type.MOD_PROMPT.name(),c.oldPrompt,c.newPrompt );
			run(cx,query);
			counter++;
		}
		else if(!"".equals( c.oldPrompt ) && "".equals( c.newPrompt ))
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_FEAT_ATTR.name(),change_type.REM_PROMPT.name(),c.oldPrompt,c.newPrompt );
			run(cx,query);
			counter++;
		}
		else if("".equals( c.oldPrompt ) && !"".equals( c.newPrompt ))
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_FEAT_ATTR.name(),change_type.ADD_PROMPT.name(),c.oldPrompt,c.newPrompt );
			run(cx,query);
			counter++;
		}
		return counter;
	}

	private int addChangeSelect(FeatureChange c, int counter, Connection cx, String SQL, String idPrefix, String ARNC) throws SQLException
	{
		for(Select sel : c.removedSelect)
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_SELECT.name(),change_type.REM_SELECT_TARGET.name(),sel.targetName,"" );
			run(cx,query);
			counter++;
			
			if(null != sel.oldCondition && sel.oldCondition.length() > 0 )
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_SELECT.name(),change_type.REM_SELECT_COND.name(),sel.oldCondition,"" );
				run(cx,query);
				counter++;
			}
			
			for(String s : sel.removedReferences)
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_SELECT.name(),change_type.REM_SELECT_REF.name(),s,"" );
				run(cx,query);
				counter++;
			}
		}
		
		for(Select sel : c.addedSelect)
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_SELECT.name(),change_type.ADD_SELECT_TARGET.name(),"",sel.targetName );
			run(cx,query);
			counter++;
			
			if(null != sel.newCondition && sel.newCondition.length() > 0)
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_SELECT.name(),change_type.ADD_SELECT_COND.name(),"",sel.newCondition );
				run(cx,query);
				counter++;
			}
			
			for(String s : sel.addedReferences)
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_SELECT.name(),change_type.ADD_SELECT_REF.name(),"",s );
				run(cx,query);
				counter++;
			}
		}
		
		for(Select sel : c.modifiedSelect)
		{
			
			if (!"".equals( sel.oldCondition ) && !"".equals( sel.newCondition ))
			{
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_SELECT.name(),change_type.MOD_SELECT_COND.name(),sel.oldCondition,sel.newCondition );
				run(cx,query);
				counter++;
			}
			else if (!"".equals( sel.oldCondition ) && "".equals( sel.newCondition ))
			{
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_SELECT.name(),change_type.REM_SELECT_COND.name(),sel.oldCondition,sel.newCondition );
				run(cx,query);
				counter++;
			} 
			else if ("".equals( sel.oldCondition ) && !"".equals( sel.newCondition ))
			{
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_SELECT.name(),change_type.ADD_SELECT_COND.name(),sel.oldCondition,sel.newCondition );
				run(cx,query);
				counter++;
			}  
			
			for(String s : sel.addedReferences)
			{
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_SELECT.name(),change_type.ADD_SELECT_REF.name(),"",s );
				run(cx,query);
				counter++;
			}
			
			for(String s : sel.removedReferences)
			{
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_SELECT.name(),change_type.REM_SELECT_REF.name(),s,"" );
				run(cx,query);
				counter++;
			}
		}
		
		return counter;
	}

	private int addChangeDefault(FeatureChange c, int counter, Connection cx, String SQL, String idPrefix, String ARNC) throws SQLException
	{
		for(DefaultValue remDV : c.removedDefault)
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_DEFAULT.name(),change_type.REM_DEF_VAL.name(),remDV.value,"" );
			run(cx,query);
			counter++;
			
			if(null != remDV.oldCondition && remDV.oldCondition.length() > 0)
			{	//the remove default had a condition.
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_DEFAULT.name(),change_type.REM_DEF_VAL_COND.name(),remDV.oldCondition,"" );
				run(cx,query);
				counter++;
			}
			
			for(String s : remDV.removedConditionReferences)
			{	//the remove default had references
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_DEFAULT.name(),change_type.REM_DEF_VAL_COND_REF.name(),s,"" );
				run(cx,query);
				counter++;
			}
			
			for(String s : remDV.removedDefValReferences)
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_DEFAULT.name(),change_type.REM_DEF_VAL_REF.name(),s,"" );
				run(cx,query);
				counter++;
			}
		}
		
		for(DefaultValue addDV : c.addedDefault)
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_DEFAULT.name(),change_type.ADD_DEF_VAL.name(),"",addDV.value );
			run(cx,query);
			counter++;
			
			if(null != addDV && addDV.newCondition.length() > 0)
			{	//the new default has a condition.
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_DEFAULT.name(),change_type.ADD_DEF_VAL_COND.name(),"",addDV.newCondition );
				run(cx,query);
				counter++;
			}
			
			for(String s : addDV.addedConditionReferences)
			{	//the new default has references
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_DEFAULT.name(),change_type.ADD_DEF_VAL_COND_REF.name(),"",s );
				run(cx,query);
				counter++;
			}
			
			for(String s : addDV.addedDefValReferences)
			{	//the new default has references
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_DEFAULT.name(),change_type.ADD_DEF_VAL_REF.name(),"",s );
				run(cx,query);
				counter++;
			}
		}
		
		for(DefaultValue modDV : c.modifiedDefault)
		{
			if(!"".equals( modDV.oldCondition ) && !"".equals( modDV.newCondition ))
			{	//condition modified.
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEFAULT.name(),change_type.MOD_DEF_VAL_COND.name(),modDV.oldCondition,modDV.newCondition );
				run(cx,query);
				counter++;
			}
			else if (!"".equals( modDV.oldCondition ) && "".equals( modDV.newCondition ))
			{
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEFAULT.name(),change_type.REM_DEF_VAL_COND.name(),modDV.oldCondition,modDV.newCondition );
				run(cx,query);
				counter++;
			}
			else if ("".equals( modDV.oldCondition ) && !"".equals( modDV.newCondition ))
			{	//condition modified.
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEFAULT.name(),change_type.ADD_DEF_VAL_COND.name(),modDV.oldCondition,modDV.newCondition );
				run(cx,query);
				counter++;
			}
			
			for(String s : modDV.addedConditionReferences)
			{	//the new default has references
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEFAULT.name(),change_type.ADD_DEF_VAL_COND_REF.name(),"",s);
				run(cx,query);
				counter++;
			}
			
			for(String s : modDV.removedConditionReferences)
			{	//the new default has references
				String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEFAULT.name(),change_type.REM_DEF_VAL_COND_REF.name(),s,"");
				run(cx,query);
				counter++;
			}
		}
		
		return counter;
	}

	private int addChangeDepends(FeatureChange c, int counter, Connection cx, String SQL, String idPrefix, String ARNC) throws SQLException
	{
		//depends
		if(!"".equals( c.oldDependsExpression ) && !"".equals( c.newDependsExpression))
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEPENDS.name(),change_type.MOD_DEPENDS.name(),c.oldDependsExpression,c.newDependsExpression);
			run(cx,query);
			counter++;
			for(String s : c.removedDependsRef)
			{
				 query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEPENDS.name(),change_type.REM_DEPENDS_REF.name(),s,"");
				run(cx,query);
				counter++;
			}
			for(String s : c.addedDependsRef)
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.MOD_DEPENDS.name(),change_type.ADD_DEPENDS_REF.name(),"",s);
				run(cx,query);
				counter++;
			}
		}
		else if (!"".equals( c.oldDependsExpression ) && "".equals( c.newDependsExpression))
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_DEPENDS.name(),change_type.REM_DEPENDS.name(),c.oldDependsExpression,c.newDependsExpression);
			run(cx,query);
			counter++;
			for(String s : c.removedDependsRef)
			{
				 query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_DEPENDS.name(),change_type.REM_DEPENDS_REF.name(),s,"");
				run(cx,query);
				counter++;
			}
			for(String s : c.addedDependsRef)
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.REM_DEPENDS.name(),change_type.ADD_DEPENDS_REF.name(),"",s);
				run(cx,query);
				counter++;
			}
		}
		else if ("".equals( c.oldDependsExpression ) && !"".equals( c.newDependsExpression))
		{
			String query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_DEPENDS.name(),change_type.ADD_DEPENDS.name(),c.oldDependsExpression,c.newDependsExpression);
			run(cx,query);
			counter++;
			for(String s : c.removedDependsRef)
			{
				 query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_DEPENDS.name(),change_type.REM_DEPENDS_REF.name(),s,"");
				run(cx,query);
				counter++;
			}
			for(String s : c.addedDependsRef)
			{
				query = getSQLStatement(SQL, idPrefix+counter, ARNC,change_subcategory.ADD_DEPENDS.name(),change_type.ADD_DEPENDS_REF.name(),"",s);
				run(cx,query);
				counter++;
			}
		}
		
		return counter;
	}

	private void run(Connection cx, String SQL) throws SQLException
	{
		 Statement st;
		 st = cx.createStatement();
		 st.executeUpdate( SQL );
		 st.getUpdateCount();
	}

	public void recordRemovedFeature(String _arch, String _toRevision, String s) throws SQLException
	{
		recordCorseGrainChanges( _arch , _toRevision , s , "delete");
	}
	
	public void recordAddedFeature(String _arch, String _toRevision, String s) throws SQLException
	{
		recordCorseGrainChanges( _arch , _toRevision , s , "add");
	}
	
	public void recordModifiedFeature(String _arch, String _toRevision, String s) throws SQLException
	{
		recordCorseGrainChanges( _arch , _toRevision , s , "modified");
	}

	private void recordCorseGrainChanges(String _arch, String _toRevision, String s, String op) throws SQLException
	{
		String SQL = "INSERT INTO linux.coarse_grain_changes VALUES ";
		SQL += "(\'" + _arch + "_" + _toRevision + "_" + s + "\',\'" + _arch + "\',\'" + _toRevision + "\',\'" + op + "\',\'" + s + "\');";
		
		Connection cx = getConnection();
		Statement st = null;
		try
		{
			 run( cx , SQL );
		}
		catch(SQLException e)
		{
			System.err.println("error while recording added/removed features: "+e.getMessage());
		}
		finally
		{
			if(null != st) st.close();
			cx.close();
		}
	}

	public void recordNbFeatures(String _arch, String _toRevision, int _nbFeatures) throws SQLException
	{
		String SQL = "INSERT INTO linux.coarse_grain_changes VALUES ";
		SQL += "(\'" + _arch + "_" + _toRevision + "\',\'" + _arch + "\',\'" + _toRevision + "\',\'" + "total" + "\',\'" + _nbFeatures + "\');";
		
		Connection cx = getConnection();
		Statement st = null;
		try
		{
			 run( cx , SQL );
		}
		catch(SQLException e)
		{
			System.err.println("error while recording added/removed features: "+e.getMessage());
		}
		finally
		{
			if(null != st) st.close();
			cx.close();
		}
		
	}
}

