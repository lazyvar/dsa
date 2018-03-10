package com.hasz.ctci.test.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch2.SinglyLinkedList;
import com.hasz.ctci.main.ch2.SinglyLinkedNode;

public class Ch2Q1Tests {

	private boolean arrayEqualsList(int [] expected, SinglyLinkedList actual) {
		SinglyLinkedNode n = actual.head;
		int count = 0;
		
		while (n != null) {
			if (n.data == expected[count]) {
				n = n.next;
				count++;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	@Test
	public void test() {
		int[] list = {1, 3, 1, 5, 5, 2, 1};
		SinglyLinkedList linkedList = new SinglyLinkedList(list);
		
		Ch2Q1.removeDuplicates(linkedList);
		
		int[] expected = {1, 3, 5, 2};
		
		assertTrue(arrayEqualsList(expected, linkedList));
	}

}
