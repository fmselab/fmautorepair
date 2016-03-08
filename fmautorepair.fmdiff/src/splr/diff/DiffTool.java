package splr.diff;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.eclipse.emf.ecore.resource.ResourceSet;

import splr.extractor.UndertakerModelExtractor;


public class DiffTool
{

	private String _rootFolder = DataPaths.rootFoler;
	private String[] _folders =  DataPaths.revisions;// {"v2.6.38","v2.6.39","v3.0","v3.1","v3.2", "v3.3", "v3.4","v3.5","v3.6","v3.7","v3.8"}; 
	
	
	private String _architecture = ""; //should be a RSF file name.
	
	public void start(String arch) throws IOException
	{
		
		_architecture = arch;
		
		//for each pair of folder, compute the differences between the 2 models, spit out the CSV file, save the list of features that changed.
		for(int i = 0 ; i < (_folders.length - 1) ; i++)
		{
			String oldRSF= _rootFolder + _folders[i] + "/"+ _architecture +".rsf";
			String newRSF = _rootFolder + _folders[i+1] + "/"+ _architecture +".rsf";
		
			//checkFiles( oldRSF , newRSF );
			
			FeatureChangeRepository repo = new FeatureChangeRepository(_architecture,_folders[i],_folders[i+1]);
			
			System.out.print("now comparing: " + oldRSF + " with "+ newRSF);
			
			long start = System.currentTimeMillis();
			
			compare( i , oldRSF , newRSF , repo );
			
			long done = System.currentTimeMillis();
			
			System.out.print(" - done in " + ( (done - start)/1000) + " seconds \n");

		}
	}


	private void compare( int i, String oldRSF, String newRSF, FeatureChangeRepository repo) throws IOException
	{
		UndertakerModelExtractor ex = new UndertakerModelExtractor( oldRSF , _architecture , _folders[i] );
		ResourceSet res1 = ex.getModel();
		
		ex = new UndertakerModelExtractor( newRSF , _architecture , _folders[i+1] );
		ResourceSet res2 = ex.getModel();
		int nbFeatAfter = ex.getNbFeatures();
		
		DiffEngine diff = new DiffEngine(repo);
		diff.initModelFromXsd();
		diff.setOldModel( res1 );
		diff.setNewModel( res2 );
		
		repo._nbFeatures = nbFeatAfter;
		
		diff.getDiff();
	
		if(repo.getNbModifiedFeatures() != 0 || repo.getNbNewFeatures() != 0 || repo.getNbRemovedFeatures() != 0)
		{
			try
			{
				DBWriter db = new DBWriter();
				repo.recordDiff(db);
				db.disconnect();
			}
			catch ( SQLException e )
			{
				System.err.println("last disconnect failed");
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}	
	}


	public static void deleteFolder(File folder) {
	    File[] files = folder.listFiles();
	    if(files!=null) { //some JVMs return null for empty dirs
	        for(File f: files) {
	            if(f.isDirectory()) {
	                deleteFolder(f);
	            } else {
	                f.delete();
	            }
	        }
	    }
	    folder.delete();
	}
	
}
