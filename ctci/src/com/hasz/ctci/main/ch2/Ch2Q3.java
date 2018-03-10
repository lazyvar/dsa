package com.hasz.ctci.main.ch2;

public class Ch2Q3 {

	// assuming node is in middle of array, i.e. not first or last
	public static void removeMiddle(SinglyLinkedNode node) {
		if (node == null) {
			return;
		}
		
		SinglyLinkedNode current = node;
		SinglyLinkedNode next = current.next;
		
		while (next.next != null) {
			current.data = next.data;
			
			current = current.next;
			next = next.next;
		}
		
		current.data = next.data;
		current.next = null;
	}
	
}
