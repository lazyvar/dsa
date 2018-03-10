package com.hasz.ctci.test.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch2.Ch2Q4;
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
			if (count < 3) {
				assertTrue(n.data < 5);
			} else {
				assertTrue(n.data >= 5);
			}
			count++;
			n = n.next;
		}
		
		assertEquals(7, count);
	}

	@Test
	public void testAlreadyPartitioned() {
		int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q4.partition(linkedList, 3);
		
		SinglyLinkedNode n = linkedList.head;
		int count = 0;
		
		while (n != null) {
			if (count < 2) {
				assertTrue(n.data < 3);
			} else {
				assertTrue(n.data >= 3);
			}
			count++;
			n = n.next;
		}
		
		assertEquals(10, count);
	}
	
	@Test
	public void testNegative() {
		int[] list = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3,-4, -5, -6, -7};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q4.partition(linkedList, 4);
		
		SinglyLinkedNode n = linkedList.head;
		int count = 0;
		
		while (n != null) {
			if (count < 11) {
				assertTrue(n.data < 4);
			} else {
				assertTrue(n.data >= 4);
			}
			count++;
			n = n.next;
		}
		
		assertEquals(18, count);
	}

}