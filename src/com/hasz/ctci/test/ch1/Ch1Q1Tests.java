package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.ch1.Ch1Q1;

public class Ch1Q1Tests {
	
	@Test
	public void testAllUnique() {
		assertTrue(Ch1Q1.isUnique("abcdefghijklmnop"));
	}
	
	@Test
	public void testNoUnique() {
		assertFalse(Ch1Q1.isUnique("aaaaaaaaaaaa"));
	}
	
	@Test
	public void testEmpty() {
		assertTrue(Ch1Q1.isUnique(""));
	}
	
	@Test
	public void testOneDuplicate() {
		assertFalse(Ch1Q1.isUnique("abcdefghii"));
	}
	
	@Test
	public void testManyDuplicate() {
		assertFalse(Ch1Q1.isUnique("aabbccddeeffgghhiijj"));
	}

}
