package com.hasz.ctci.main.ch2;

public class SinglyLinkedList {

	public SinglyLinkedNode head;
	
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
		
		while (n.next != null) {
			n = n.next;
		}
		
		n.next = new SinglyLinkedNode(d);;
	}
	
}
