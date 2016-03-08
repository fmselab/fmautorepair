This file contains information regarding how to compile / use the FM_Diff tool 
currently being developed


Pre-requisites: 
- Eclipse (Helios and Juno tested, I don't know for other versions)
- Eclipse Modeling tools (need for model generation from XSL file)
	EPP Modeling ->  XML / XSD Schema definition SDK.  (Necessary to generate model code from the XSD schema) 

Recommended if you intended to work/modify the model: 
- Eclipse XML Editors and Tools
- Eclipse Git Team Provider 

Getting started:

1- The code
Open or Import the Eclipse project contained in this very folder. In it, you will find: 
	- src: source code of the Feature Model diff tool
	- /libs: the necessary libs - EMF Compare 3.0 and its pre-requisite. Having the libs directly in this folder facilitates the configuration of the build path in Eclipse as it is directly included.
	(this is not the cleanest way to do it, but EMF Compare pre-requisites are a bit touchy)

	- FeatureModelSchema.xsd : the description of a what a feature model is
	- test1.fm/test2.fm : 2 xml files containing feature models that I use for test purposes.

At this point, you should have an eclipse project with some form of dependency warning. 
This is normal, and it will be resolved in Step 2. 

2- The model
Create a new EMF Project. Specify that you want to use an XML model. Point the project
to FeatureModelSchema.xsd
You can give whatever name you want to that project. 
Once this is done, you should have in your newly created project a model folder containing:
- a "FeatureModelSchema.genmodel" file
- a "space.ecore" file

Double click on the ".genmodel" file. In the editor panel, right click and select "Generate Model Code". 

NOTE: If you do not see a new "EMF Project" in your "New->Project" menu, nor the "Generate Model Code" 
in the previous step, you are missing the Eclipse Modeling Tool plugin. 

3- The build path
Edit the build path of the FM_Diff project. Add your EMF Project as a project dependency. 
This should fix all compilation errors and dependency issues. 

4- Update paths
	in the source file "DataPaths.java", you'll find a few variables that needs to be valuated
	for your instalation. See the content of the file for details. 
	THIS MUST BE DONE! 

5- Hack away. 





