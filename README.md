# feature models auto repair
Tools and data for our project that aims at repairing feature models using mutation operators. 
The approach is presented in:

*Paolo Arcaini, Angelo Gargantini, and Paolo Vavassori*  
Automatic Detection and Removal of Conformance Faults in Feature Models  
in 9th IEEE International Conference on Software Testing, Verification and Validation (ICST 2016), Chicago, USA, April 10-15 (2016): 102-112  
[download the pdf file](https://cs.unibg.it/gargantini/research/papers/icst16_autoDetectionAndRemoval.pdf)

which was later extended for general variability models (not only feature models)

*Paolo Arcaini, Angelo Gargantini, and Paolo Vavassori*  
Automated Repairing of Variability Models  
in Proceedings of the 21st International Systems and Software Product Line Conference - Volume A on - SPLC17, ACM Press (2017)  
[download the pdf file](https://cs.unibg.it/gargantini/research/papers/splc17.pdf)


This project introduces several **mutation operators** for feature models  
See project  fmautorepair. mutation

In this web site we publish also a test generator tool based on mutation.  
It was originally proposed in:

*Arcaini P, Gargantini A, Vavassori P.*  
Generating Tests for Detecting Faults in Feature Models.   
International Conference on Software Testing, Verification and Validation. ICST, IEEE: Graz, Austria, 2015; 1–10, doi: 10.1109/ICST.2015.7102591  
[download the pdf file](https://cs.unibg.it/gargantini/research/papers/icst15_mutation_fm.pdf)

This is based on BDDs instead of SMT solver.  
To download the tool click https://github.com/fmselab/fmautorepair/raw/master/fmautorepair.muttestgenerator/dist/mutfmtg.jar

To run it just execute: `java -jar mutfmtg.jar <xmlfile>` 
