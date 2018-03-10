package com.hasz.ctci.main.ch2;

public class Ch2Q4 {

	public static void partition(SinglyLinkedList list, int k) {
		SinglyLinkedNode node = list.head;
		int leftCount = 0;

		while (node != null) {
			if (node.data < k) {
				leftCount++;
			}
			node = node.next;
		}
		
		SinglyLinkedNode left = list.head;
		SinglyLinkedNode movingRight = list.head;
		SinglyLinkedNode originalRight = list.head;
		
		for (int i = 0; i < leftCount; i++) {
			movingRight = movingRight.next;
			originalRight = originalRight.next;
		}
		
		while (left != originalRight) {
			if (left.data < k) {
				left = left.next;
			} else {
				int tmp = left.data;
				
				left.data = movingRight.data;
				movingRight.data = tmp;
				movingRight = movingRight.next;
			}
		}
	}
	
}
