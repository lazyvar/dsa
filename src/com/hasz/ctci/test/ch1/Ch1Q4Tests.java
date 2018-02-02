package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.ch1.Ch1Q4;

public class Ch1Q4Tests {

	@Test
	public void testBookExample() {
		assertTrue(Ch1Q4.isPalindromePermutation("Tact Coa"));
	}
	
	@Test
	public void testIsPalindromePermutation1() {
		assertTrue(Ch1Q4.isPalindromePermutation("car Race"));
	}
	
	@Test
	public void testIsPalindromePermutation2() {
		assertTrue(Ch1Q4.isPalindromePermutation("hang a Salami im a go Lasagna hog"));
	}
	
	@Test
	public void testIsNotPalindromePermutation1() {
		assertFalse(Ch1Q4.isPalindromePermutation("this is not a palindrome"));
	}
	
	@Test
	public void testIsNotPalindromePermutation2() {
		assertFalse(Ch1Q4.isPalindromePermutation("fly eagles fly"));
	}

}
