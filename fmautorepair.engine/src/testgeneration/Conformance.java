package testgeneration;

public class Conformance {
	private long numConfigurations;
	private long numConfsJudgedCorrectly;

	public Conformance(long numConfigurations, long numConfsJudgedCorrectly) {
		this.numConfigurations = numConfigurations;
		this.numConfsJudgedCorrectly = numConfsJudgedCorrectly;
	}

	public long getNumConfigurations() {
		return numConfigurations;
	}

	public long getNumConfsJudgedCorrectly() {
		return numConfsJudgedCorrectly;
	}

	public double percConfsJudgedCorrectly() {
		return numConfsJudgedCorrectly/(double)numConfigurations;
	}

	@Override
	public String toString() {
		return numConfsJudgedCorrectly + "/" + numConfigurations;  
	}
}