package com.hasz.ctci.main.ch2;

public class Ch2Q7 {

	public static SinglyLinkedNode intersectingNode(SinglyLinkedList list1, SinglyLinkedList list2) {
		SinglyLinkedNode node1 = list1.head;
		SinglyLinkedNode node2 = list2.head;
		
		if (node1 == null || node2 == null) {
			return null;
		}

		int list1Count = 1;
		while (node1.next != null) {
			node1 = node1.next;
			list1Count++;
		}
		
		int list2Count = 1;
		while (node2.next != null) {
			node2 = node2.next;
			list2Count++;
		}
		
		// if last nodes are different, there is no intersection
		if (node1 != node2) {
			return null;
		}

		SinglyLinkedList shortList;
		SinglyLinkedList longList;
		int diff;
		
		if (list1Count > list2Count) {
			shortList = list2;
			longList = list1;
			diff = list1Count - list2Count;
		} else {
			shortList = list1;
			longList = list2;
			diff = list2Count - list1Count;
		}
		
		node1 = shortList.head;
		node2 = longList.head;
		
		// advance longer list to catch up to shorter list
		for (int i = 0; i < diff; i++) {
			node2 = node2.next;
		}
		
		// advance both until the match is found
		while (node1 != node2) {
			node1 = node1.next;
			node2 = node2.next;
		}
		
		return node1;
	}
}
