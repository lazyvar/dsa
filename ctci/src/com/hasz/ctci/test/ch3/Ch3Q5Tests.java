package com.hasz.ctci.test.ch3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch3.Stack;

public class Ch3Q5Tests {

	@Test
	public void testEmpty() {
		Stack stack = new Stack();
		
		stack.sort();
		
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testPreSorted() {
		Stack stack = new Stack();
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		stack.sort();
		
		assertEquals(1, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(3, stack.pop());
	}
	
	@Test
	public void testReversed() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.sort();
		
		assertEquals(1, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(3, stack.pop());
		assertEquals(4, stack.pop());
		assertEquals(5, stack.pop());
	}
	
	@Test
	public void testUnsorted() {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(11);
		stack.push(3);
		stack.push(8);
		stack.push(5);
		
		stack.sort();
		
		assertEquals(1, stack.pop());
		assertEquals(3, stack.pop());
		assertEquals(5, stack.pop());
		assertEquals(8, stack.pop());
		assertEquals(11, stack.pop());
	}

	@Test
	public void testRandom() {
		int n = 100;
		Stack stack = new Stack();
		
		for (int i = 0; i < n; i++) {
			stack.push((int) (Math.random() * 100));
		}
		
		stack.sort();
		
		int last = stack.pop();
		while (!stack.isEmpty()) {
			assertTrue(last <= stack.pop());
		}
	}

}
