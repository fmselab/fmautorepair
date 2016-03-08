package splr.diff;


public class DataPaths
{

	//Path to the root of the history datadump. The program expects to find 1 folder per version containing 1 rsf file per architecture.
	public static String rootFoler ="../Undertaker/history/";

	//List of revision to use when building models from RSF files
	public static String[] revisions = {"v2.6.38","v2.6.39","v3.0","v3.1","v3.2", "v3.3", "v3.4","v3.5","v3.6","v3.7","v3.8"};
	
	//List of architecture for which history will be extracted.
	public static String[] archs = {"alpha","arm","arm64","avr32","blackfin","c6x",
			"cris","frv","hexagon","ia64","m32r","m68k",
			"microblaze","mips","mn10300","openrisc","parisc",
			"powerpc","s390","score","sh","sparc","tile","unicore32",
			"xtensa","x86"};
	
	//Database connection parameter.
	//Point to the database in which you created the "fine_grain_changes" table in the "linux" database.
	public static String dbURL="jdbc:mysql://127.0.0.1:3306/linux?failOverReadOnly=false";
	public static String dbUser = "root";
	public static String dbPass = "";
}
