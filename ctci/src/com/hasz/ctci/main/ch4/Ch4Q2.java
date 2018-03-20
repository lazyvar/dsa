package com.hasz.ctci.main.ch4;

public class Ch4Q2 {

	// assuming array is sorted in increasing order and unique
	public static BinaryTreeNode minTreeFrom(int[] array) {
		if (array.length == 0) {
			return null;
		}
		
		return minTreeHelper(array, 0, array.length);
	}
	
	private static BinaryTreeNode minTreeHelper(int[] array, int start, int end) {
		if (start >= end) {
			return null;
		}
		
		int mid = (end - start) / 2 + start;
		BinaryTreeNode node = new BinaryTreeNode(array[mid]);
		
		node.left = minTreeHelper(array, start, mid);
		node.right = minTreeHelper(array, mid + 1, end);
		
		return node;
	}
	
}
