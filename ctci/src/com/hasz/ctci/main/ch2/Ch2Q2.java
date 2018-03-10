package com.hasz.ctci.main.ch2;

public class Ch2Q2 {

	public static SinglyLinkedNode kthToLast(SinglyLinkedList list, int k) {
		SinglyLinkedNode turtle = list.head;
		SinglyLinkedNode rabbit = list.head;
		
		for (int i = 0; i < k; i++) {
			if (rabbit == null) {
				return null;
			}
			
			rabbit = rabbit.next;
		}
		
		while (rabbit != null) {
			turtle = turtle.next;
			rabbit = rabbit.next;
		}
		
		return turtle;
	}
	
}
