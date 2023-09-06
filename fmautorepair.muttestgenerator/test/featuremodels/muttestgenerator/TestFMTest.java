package featuremodels.muttestgenerator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFMTest {

	@Test(expected = AssertionError.class)
	public void testInv() {
		new FMTest(new byte[] { 0, 1, 10 });
	}

	
	
	@Test
	public void testMerge1() {
		FMTest t1 = new FMTest(new byte[] { 0, 1, 1 });
		FMTest t2 = new FMTest(new byte[] { 0, 1, 1 });
		assertTrue(t1.merge(t2));
		assertEquals("[0, 1, 1]", t1.toString());
	}

	
	@Test
	public void testMerge2() {
		FMTest t1 = new FMTest(new byte[] { 0, 1, -1 });
		FMTest t2 = new FMTest(new byte[] { 0, 1, 1 });
		assertTrue(t1.merge(t2));
		assertEquals("[0, 1, 1]", t1.toString());
	}

	
	@Test
	public void testMerge2diff() {
		FMTest t1 = new FMTest(new byte[] { 0, 1, 0 });
		FMTest t2 = new FMTest(new byte[] { 0, 1, 1 });
		assertFalse(t1.merge(t2));
	}

	
	@Test
	public void testMerge3() {
		FMTest t1 = new FMTest(new byte[] { 0, 1, 0 });
		FMTest t2 = new FMTest(new byte[] { 0, 1, -1 });
		assertTrue(t1.merge(t2));
		assertEquals("[0, 1, 0]", t1.toString());
	}

	@Test
	public void testMerge4() {
		FMTest t1 = new FMTest(new byte[] { 0, 1, 0, 1 });
		FMTest t2 = new FMTest(new byte[] { 0, 1, -1 });
		assertFalse(t1.merge(t2));
	}

	
	@Test
	public void testEquals() {
		FMTest t1 = new FMTest(new byte[] { 0, 1, -1 });
		FMTest t2 = new FMTest(new byte[] { 0, 1, -1 });
		assertTrue(t1.equals(t2));
	}

}
