package featuremodels.muttestgenerator;

import java.util.Arrays;

class Test{

	private byte[] test;
	
	public Test(byte[] test) {
		this.test = test;
	}
	@Override
	public String toString() {
		 return Arrays.toString(test);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Test) {
			return Arrays.equals(this.test, ((Test)obj).test);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(test);
	}
}