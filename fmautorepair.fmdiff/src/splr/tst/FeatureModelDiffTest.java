package splr.tst;


import java.io.IOException;

import org.junit.Test;

import splr.diff.FeatureModelDiff;

/**
 * @author Dante Basic test class: the call to compare should just NOT throw any exception.
 */
public class FeatureModelDiffTest
{

	@Test
	public void test() throws IOException, InterruptedException
	{
		String file1 = "test_data/test1.fm";
		String file2 = "test_data/test2.fm";

		FeatureModelDiff.compare( file1 , file2 );
	}

	@Test
	public void test2() throws IOException, InterruptedException
	{
		String file1 = "test_data/FM_Org.fm";
		String file2 = "test_data/FM_New.fm";

		FeatureModelDiff.compare( file1 , file2 );
	}

}
