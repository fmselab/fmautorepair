package fmautorepair.mutationoperators.features;

import org.apache.log4j.Logger;

import fmautorepair.mutationoperators.FMMutator;

public class AlternativeToAndOpt extends AlternativeToAnd {

	private static Logger logger = Logger.getLogger(AlternativeToAndOpt.class
			.getName());

	public static FMMutator instance = new AlternativeToAndOpt();

	private AlternativeToAndOpt(){
		convertToOpt = true;
	}
}
