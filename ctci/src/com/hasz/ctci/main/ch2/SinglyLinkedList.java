package com.hasz.ctci.main.ch2;

public class SinglyLinkedList {

	SinglyLinkedNode head;
	
	public SinglyLinkedList(int[] list) throws Exception {
		if (list.length == 0) {
			throw new Exception("list empty");
		}
		
		head = new SinglyLinkedNode(list[0]);
		
		SinglyLinkedNode n = head;
		
		for (int i = 1; i < list.length; i++) {
			n.next = new SinglyLinkedNode(list[i]);
			n = n.next;
		}
	}
	
	public void insertLast(int d) {
		SinglyLinkedNode newNode = new SinglyLinkedNode(d);
		SinglyLinkedNode n = head;
		
		while (n.next != null) {
			n = n.next;
		}
		
		n.next = newNode;
	}
	
}
