package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch1Q2Tests {

	@Test
	public void testArePermutations1() {
		assertTrue(Ch1Q2.arePermutations("im a lasagna hog", "go hang a salami"));
	}
	
	@Test
	public void testArePermutations2() {
		assertTrue(Ch1Q2.arePermutations("early morning", "morning early"));
	}
	
	@Test
	public void testArePermutations3() {
		assertTrue(Ch1Q2.arePermutations("I beleive I can fly", "I can fly I beleive"));
	}
	
	@Test
	public void testAreNotPermutations1() {
		assertFalse(Ch1Q2.arePermutations("these are not the", "droids you are looking for");
	}
	
	@Test
	public void testAreNotPermutations2() {
		assertFalse(Ch1Q2.arePermutations("abcdef", "hijklm");
	}
	
	@Test
	public void testEmptyString() {
		assertTrue(Ch1Q2.arePermutations("", ""));
		assertFalse(Ch1Q2.arePermutations("", "hey hey you you"));
		assertFalse(Ch1Q2.arePermutations("whats poppin", ""));
	}

}
