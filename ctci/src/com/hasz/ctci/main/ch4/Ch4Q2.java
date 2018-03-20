package com.hasz.ctci.main.ch4;

public class Ch4Q2 {

	// assuming array is sorted in increasing order and unique
	public static BinaryNode minTreeFrom(int[] array) {
		if (array.length == 0) {
			return null;
		}
		
		return minTreeHelper(array, 0, array.length);
	}
	
	private static BinaryNode minTreeHelper(int[] array, int start, int end) {
		if (start >= end) {
			return null;
		}
		
		int mid = (end - start) / 2 + start;
		BinaryNode node = new BinaryNode(array[mid]);
		
		node.left = minTreeHelper(array, start, mid);
		node.right = minTreeHelper(array, mid + 1, end);
		
		return node;
	}
	
}
