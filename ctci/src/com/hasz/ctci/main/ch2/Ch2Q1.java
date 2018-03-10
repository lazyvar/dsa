package com.hasz.ctci.main.ch2;

import java.util.HashSet;

public class Ch2Q1 {

	public static void removeDuplicates(SinglyLinkedList list) {
		if (list.head == null) {
			return;
		}
		
		SinglyLinkedNode previous = list.head;
		SinglyLinkedNode current = previous.next;
		HashSet<Integer> seen = new HashSet<Integer>();
		
		seen.add(previous.data);
		
		while (current != null) {
			if (seen.contains(current.data)) {
				previous.next = current.next;
			} else {
				seen.add(current.data);
				previous = current;
			}
			
			current = current.next;
		}
	}
}
