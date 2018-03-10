package com.hasz.ctci.test.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch2.Ch2Q1;
import com.hasz.ctci.main.ch2.SinglyLinkedList;
import com.hasz.ctci.main.ch2.SinglyLinkedNode;

public class Ch2Q2Tests {

	@Test
	public void testEmpty() {
		int[] list = {};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		SinglyLinkedNode node = Ch2Q2.kthToLast(3);
				
		assertNull(node);
	}
	
	@Test
	public void testOutOfBounds() {
		int[] list = {1, 2, 3, 4, 5};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		SinglyLinkedNode node = Ch2Q2.kthToLast(10);
				
		assertNull(node);
	}
	
	@Test
	public void testFirst() {
		int[] list = {1, 2, 3, 4, 5};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		SinglyLinkedNode node = Ch2Q2.kthToLast(4);
				
		assertNull(node);
	}
	
	@Test
	public void testMiddle() {
		int[] list = {1, 2, 3, 4, 5};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		SinglyLinkedNode node = Ch2Q2.kthToLast(2);
				
		assertNull(node);
	}
	
	@Test
	public void testLast() {
		int[] list = {1, 2, 3, 4, 5};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		SinglyLinkedNode node = Ch2Q2.kthToLast(0);
				
		assertNull(node);
	}
}
