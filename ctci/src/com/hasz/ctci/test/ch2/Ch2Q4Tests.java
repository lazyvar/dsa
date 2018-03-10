package com.hasz.ctci.test.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch2.SinglyLinkedList;
import com.hasz.ctci.main.ch2.SinglyLinkedNode;

public class Ch2Q4Tests {

	@Test
	public void testEmpty() {
		int[] list = {};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q4.partition(linkedList, 1);
				
		assertNull(linkedList.head);
	}

	@Test
	public void testSingle() {
		int[] list = {1};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q4.partition(linkedList, 1);
		
		int[] expected = {1};
		
		assertTrue(linkedList.equals(expected));
	}

	@Test
	public void testBook() {
		int[] list = {3, 5, 8, 5, 10, 2, 1};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q4.partition(linkedList, 5);
		
		SinglyLinkedNode n = linkedList.head;
		int count = 0;
		
		while (n != null) {
			if (count < 4) {
				assertTrue(n.data < 5);
			} else {
				assertTrue(n.data >= 5);
			}
			count++;
		}
		
		assertEquals(7, count);
	}

}s