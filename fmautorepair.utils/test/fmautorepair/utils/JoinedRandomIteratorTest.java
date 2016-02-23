package fmautorepair.utils;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fmautorepair.utils.CollectionsUtil;
import fmautorepair.utils.JoinedRandomIterator;

public class JoinedRandomIteratorTest {

	@Test
	public void testJoinedRandomIteratorListOfIteratorOfT() {
		List<Integer> a1 = Arrays.asList(1,2,3);
		List<Integer> a2 = Arrays.asList(4,5,6);
		JoinedRandomIterator<Integer> iterator = new JoinedRandomIterator<Integer>(a1.iterator(),a2.iterator());
		List<Integer> l = CollectionsUtil.listFromIterator(iterator);
		System.out.println(l);
		assertEquals(6, l.size());
	}
	
	
}
