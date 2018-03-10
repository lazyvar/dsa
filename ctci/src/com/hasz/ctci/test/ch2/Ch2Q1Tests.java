package com.hasz.ctci.test.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch2.Ch2Q1;
import com.hasz.ctci.main.ch2.SinglyLinkedList;
import com.hasz.ctci.main.ch2.SinglyLinkedNode;

public class Ch2Q1Tests {
	
	@Test
	public void testEmpty() {
		int[] list = {};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q1.removeDuplicates(linkedList);
		
		int[] expected = {};
		
		assertTrue(linkedList.equals(expected));
	}
	
	@Test
	public void testSomeDuplicates() {
		int[] list = {1, 3, 1, 5, 5, 2, 1};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q1.removeDuplicates(linkedList);
		
		int[] expected = {1, 3, 5, 2};
		
		assertTrue(linkedList.equals(expected));
	}
	
	@Test
	public void testNoDuplicates() {
		int[] list = {1, 2, 3, 4, 5, 6, 7};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q1.removeDuplicates(linkedList);
		
		int[] expected = {1, 2, 3, 4, 5, 6, 7};
		
		assertTrue(linkedList.equals(expected));
	}
	
	@Test
	public void testAllDuplicates() {
		int[] list = {1, 1, 1, 1, 1, 1, 1};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q1.removeDuplicates(linkedList);
		
		int[] expected = {1};
		
		assertTrue(linkedList.equals(expected));
	}

}
