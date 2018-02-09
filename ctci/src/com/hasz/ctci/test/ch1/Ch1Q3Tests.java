package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch1.Ch1Q3;

public class Ch1Q3Tests {

	@Test
	public void testBookExample() {
		assertEquals("Mr%20John%20Smith", Ch1Q3.urlify("Mr John Smith    ", 13));
	}

	@Test
	public void testSingle() {
		assertEquals("hello%20there", Ch1Q3.urlify("hello there  ", 11));
	}
	
	@Test
	public void testMultiple() {
		assertEquals("what%20is%20in%20a%20name?", Ch1Q3.urlify("what is in a name?        ", 18));
	}
	
	@Test
	public void testNone() {
		assertEquals("supercalifragilisticexpialidocious", Ch1Q3.urlify("supercalifragilisticexpialidocious", 34));
	}
	
	@Test
	public void testEmptyString() {
		assertEquals("", Ch1Q3.urlify("", 0));
	}

}
