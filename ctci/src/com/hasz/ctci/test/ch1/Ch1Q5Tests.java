package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch1Q5Tests {

	@Test
	public void testBook1() {
		assertTrue(Ch1Q5.isSingleEdit("pale", "ple"));
	}
	
	@Test
	public void testBook2() {
		assertTrue(Ch1Q5.isSingleEdit("pales", "pale"));
	}
	
	@Test
	public void testBook3() {
		assertTrue(Ch1Q5.isSingleEdit("pale", "bale"));
	}
	
	@Test
	public void testBook4() {
		assertTrue(Ch1Q5.isSingleEdit("pale", "bake"));
	}

}
