package featuremodels.muttestgenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FMTest{

	private byte[] test;
	
	// 1 : true 0: false, -1; don't care
	public FMTest(final byte[] test) {
		this.test = test;
		assert IntStream.range(0, test.length).map(idx -> test[idx]).allMatch(i ->(i==0 || i==1 ||i==-1));
	}
	@Override
	public String toString() {
		 return Arrays.toString(test);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof FMTest) {
			return Arrays.equals(this.test, ((FMTest)obj).test);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Arrays.hashCode(test);
	}
	
	/**
	 * try to merge the t into this test, if suceed than return true, otherwise return false, (return true also if its not modified)
	 * @param t
	 * @return
	 */
	public boolean merge(FMTest t) {
		if (this.test.length != t.test.length) return false;
		// check the content
		byte[] newTest = new byte[test.length];
		for(int i = 0; i < test.length; i++) {
			if (test[i] == t.test[i]) {
				newTest[i] = test[i];
				continue;
			}
			if (test[i] == -1) {
				newTest[i] = t.test[i];
				continue;
			} 
			if (t.test[i] == -1) {
				newTest[i] = test[i];
				continue;
			} 
			return false;
		}
		this.test = newTest;
		return true;
	}
	
	
	
}