package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch1.Ch1Q5;

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
		assertFalse(Ch1Q5.isSingleEdit("pale", "bake"));
	}
	
	@Test
	public void testSame() {
		assertTrue(Ch1Q5.isSingleEdit("antarctica", "antarctica"));
	}
	
	@Test
	public void testDifferent() {
		assertFalse(Ch1Q5.isSingleEdit("antarctica", "hawaii"));
	}

	@Test
	public void testTwoEdit() {
		assertFalse(Ch1Q5.isSingleEdit("mack", "zach"));
	}
}
