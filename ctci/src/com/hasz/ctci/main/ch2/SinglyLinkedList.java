package com.hasz.ctci.main.ch2;

public class SinglyLinkedList {

	public SinglyLinkedNode head;
	
	public SinglyLinkedList() {
		// happy
	}
	
	public SinglyLinkedList(int[] list) {
		if (list.length == 0) {
			return;
		}
		
		head = new SinglyLinkedNode(list[0]);
		
		SinglyLinkedNode n = head;
		
		for (int i = 1; i < list.length; i++) {
			n.next = new SinglyLinkedNode(list[i]);
			n = n.next;
		}
	}
	
	public void insertFirst(int d) {
		SinglyLinkedNode oldHead = head;
		
		head = new SinglyLinkedNode(d);
		head.next = oldHead;
	}
	
	public void insertLast(int d) {
		SinglyLinkedNode n = head;
		SinglyLinkedNode tail = new SinglyLinkedNode(d);
		
		if (n == null) {
			head = tail;
			return;
		}
		
		while (n.next != null) {
			n = n.next;
		}
		
		n.next = tail;
	}
	
	public boolean equals(int[] array) {
		SinglyLinkedNode n = head;
		int count = 0;
		
		while (n != null) {
			if (n.data == array[count]) {
				n = n.next;
				count++;
			} else {
				return false;
			}
		}
		
		return true;
	}

}
