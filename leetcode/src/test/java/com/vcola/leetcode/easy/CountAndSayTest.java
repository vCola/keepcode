package com.vcola.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class CountAndSayTest {
	
	private CountAndSay countAndSay = new CountAndSay();

	@Test
	public void testCountAndSay() {
		Assert.assertEquals("111221", countAndSay.countAndSay(5));
	}
	
	
	

}
