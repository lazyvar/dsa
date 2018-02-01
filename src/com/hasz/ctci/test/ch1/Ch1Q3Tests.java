package com.hasz.ctci.test.ch1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ch1Q3Tests {

	@Test
	public void testBookExample() {
		assertEquals(Ch1Q3.urlify("Mr John Smith    ", 13), "Mr%20John%20Smith");
	}

	@Test
	public void testSingle() {
		assertEquals(Ch1Q3.urlify("hello there  ", 11), "hello%20there");
	}
	
	@Test
	public void testMultiple() {
		assertEquals(Ch1Q3.urlify("what is in a name?        ", 18), "what%20is%20in%20a%20name?");
	}
	
	@Test
	public void testNone() {
		assertEquals(Ch1Q3.urlify("supercalifragilisticexpialidocious", 34), "supercalifragilisticexpialidocious");
	}
	
	@Test
	public void testEmptyString() {
		assertEquals(Ch1Q3.urlify("", 0), "");
	}

}
