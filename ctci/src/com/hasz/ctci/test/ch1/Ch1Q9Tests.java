package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch1.Ch1Q9;

public class Ch1Q9Tests {

	@Test
	public void testEmpty() {
		assertTrue(Ch1Q9.isRotation("", ""));
	}
	
	@Test
	public void test1Empty() {
		assertFalse(Ch1Q9.isRotation("string1", ""));
	}
	
	@Test
	public void test2Empty() {
		assertFalse(Ch1Q9.isRotation("", "string2"));
	}

	@Test
	public void testEquals() {
		assertTrue(Ch1Q9.isRotation("lamp", "lamp"));
	}
	
	@Test
	public void testBookExample() {
		assertTrue(Ch1Q9.isRotation("waterbottle", "erbottlewat"));
	}
	
	@Test
	public void testNotRotation() {
		assertFalse(Ch1Q9.isRotation("rubiks", "cube"));
	}
	
	@Test
	public void testIsRotation() {
		assertFalse(Ch1Q9.isRotation("butch cassidy and the sundance kid", "the sundance kid butch cassidy and "));
	}
	
	
}
