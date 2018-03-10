package com.hasz.ctci.test.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch2.Ch2Q2;
import com.hasz.ctci.main.ch2.Ch2Q3;
import com.hasz.ctci.main.ch2.SinglyLinkedList;
import com.hasz.ctci.main.ch2.SinglyLinkedNode;

public class Ch2Q3Tests {

	@Test
	public void testEmpty() {
		int[] list = {};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q3.removeMiddle(null);
				
		assertNull(linkedList.head);
	}

	@Test
	public void testTriple() {
		int[] list = {1, 2, 3};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		SinglyLinkedNode node2 = Ch2Q2.kthToLast(linkedList, 2);
		
		Ch2Q3.removeMiddle(node2);
		
		int[] listMissing2 = {1, 3};
		
		assertTrue(linkedList.equals(listMissing2));
	}

	@Test
	public void testRemoveSingle() {
		int[] list = {1, 2, 3, 4, 5, 6, 7};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		SinglyLinkedNode node4 = Ch2Q2.kthToLast(linkedList, 4);
		
		Ch2Q3.removeMiddle(node4);
		
		int[] listMissing4 = {1, 2, 3, 5, 6, 7};
		
		assertTrue(linkedList.equals(listMissing4));
	}

	@Test
	public void testRemoveMultiple() {
		int[] list = {1, 2, 3, 4, 5, 6, 7};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		SinglyLinkedNode node4 = Ch2Q2.kthToLast(linkedList, 4);
		
		Ch2Q3.removeMiddle(node4);
		
		int[] listMissing4 = {1, 2, 3, 5, 6, 7};
		
		assertTrue(linkedList.equals(listMissing4));
		
		SinglyLinkedNode node2 = Ch2Q2.kthToLast(linkedList, 5);
		
		Ch2Q3.removeMiddle(node2);
		
		int[] listMissing4and2 = {1, 3, 5, 6, 7};
		
		assertTrue(linkedList.equals(listMissing4and2));

		SinglyLinkedNode node6 = Ch2Q2.kthToLast(linkedList, 2);
		
		Ch2Q3.removeMiddle(node6);
		
		int[] listMissing4and2and6 = {1, 3, 5, 7};
		
		assertTrue(linkedList.equals(listMissing4and2and6));

	}

}
