package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch1Q4Tests {

	@Test
	public void testBookExample() {
		assertTrue(Ch1Q4.isPalindromePermutation("Tact Coa"));
	}
	
	@Test
	public void testIsPalindromePermutation1() {
		assertTrue(Ch1Q4.isPalindromePermutation("Tact Coa"));
	}
	
	@Test
	public void testIsPalindromePermutation2() {
		assertTrue(Ch1Q4.isPalindromePermutation("hang a salami im a go lasagna hog"));
	}
	
	@Test
	public void testIsNotPalindromePermutation1() {
		assertTrue(Ch1Q4.isPalindromePermutation("this is not a palindrome"));
	}
	
	@Test
	public void testIsNotPalindromePermutation2() {
		assertTrue(Ch1Q4.isPalindromePermutation("fly eagles fly"));
	}

}
