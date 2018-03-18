package com.hasz.ctci.test.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch2.Ch2Q2;
import com.hasz.ctci.main.ch2.Ch2Q7;
import com.hasz.ctci.main.ch2.SinglyLinkedList;
import com.hasz.ctci.main.ch2.SinglyLinkedNode;

public class Ch2Q7Tests {

	@Test
	public void testEmpty() {
		int[] list1 = {};
		int[] list2 = {};
		
		SinglyLinkedList linkedList1 = new SinglyLinkedList(list1);
		SinglyLinkedList linkedList2 = new SinglyLinkedList(list2);
		
		SinglyLinkedNode node = Ch2Q7.intersectingNode(linkedList1, linkedList2);
				
		assertNull(node);
	}

	@Test
	public void testNoIntersection1() {
		int[] list1 = {1, 2, 3, 4};
		int[] list2 = {1, 2, 3, 4};
		
		SinglyLinkedList linkedList1 = new SinglyLinkedList(list1);
		SinglyLinkedList linkedList2 = new SinglyLinkedList(list2);
		
		SinglyLinkedNode node = Ch2Q7.intersectingNode(linkedList1, linkedList2);
				
		assertNull(node);
	}

	@Test
	public void testNoIntersection2() {
		int[] list1 = {};
		int[] list2 = {1, 2, 3, 4};
		
		SinglyLinkedList linkedList1 = new SinglyLinkedList(list1);
		SinglyLinkedList linkedList2 = new SinglyLinkedList(list2);
		
		SinglyLinkedNode node = Ch2Q7.intersectingNode(linkedList1, linkedList2);
				
		assertNull(node);
	}

	@Test
	public void testNoIntersection3() {
		int[] list1 = {1, 2, 3, 4};
		int[] list2 = {};
		
		SinglyLinkedList linkedList1 = new SinglyLinkedList(list1);
		SinglyLinkedList linkedList2 = new SinglyLinkedList(list2);
		
		SinglyLinkedNode node = Ch2Q7.intersectingNode(linkedList1, linkedList2);
				
		assertNull(node);
	}

	@Test
	public void testIntersection1() {
		int[] list1 = {1, 2, 3, 4};
		int[] list2 = {5, 6, 7, 8};
		
		SinglyLinkedList linkedList1 = new SinglyLinkedList(list1);
		SinglyLinkedList linkedList2 = new SinglyLinkedList(list2);
		
		SinglyLinkedNode list1node4 = Ch2Q2.kthToLast(linkedList1, 1);
		SinglyLinkedNode list2node6 = Ch2Q2.kthToLast(linkedList2, 3);
		
		list1node4.next = list2node6;
		
		SinglyLinkedNode node = Ch2Q7.intersectingNode(linkedList1, linkedList2);

		assertEquals(list2node6, node);
	}

	@Test
	public void testIntersection2() {
		int[] list1 = {1};
		int[] list2 = {2, 3, 4, 5};
		
		SinglyLinkedList linkedList1 = new SinglyLinkedList(list1);
		SinglyLinkedList linkedList2 = new SinglyLinkedList(list2);
		
		SinglyLinkedNode list1node1 = Ch2Q2.kthToLast(linkedList1, 1);
		SinglyLinkedNode list2node3 = Ch2Q2.kthToLast(linkedList2, 3);
		
		list1node1.next = list2node3;
		
		SinglyLinkedNode node = Ch2Q7.intersectingNode(linkedList1, linkedList2);
				
		assertEquals(list2node3, node);
	}

	@Test
	public void testIntersection3() {
		int[] list1 = {1, 2, 3, 4};
		int[] list2 = {5};
		
		SinglyLinkedList linkedList1 = new SinglyLinkedList(list1);
		SinglyLinkedList linkedList2 = new SinglyLinkedList(list2);
		
		SinglyLinkedNode list1node4 = Ch2Q2.kthToLast(linkedList1, 1);
		SinglyLinkedNode list2node5 = Ch2Q2.kthToLast(linkedList2, 1);
		
		list1node4.next = list2node5;

		SinglyLinkedNode node = Ch2Q7.intersectingNode(linkedList1, linkedList2);
				
		assertEquals(list2node5, node);
	}

}
