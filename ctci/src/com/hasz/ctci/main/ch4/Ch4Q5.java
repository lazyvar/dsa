package com.hasz.ctci.main.ch4;

public class Ch4Q5 {

	public static boolean isValidBst(BinaryTreeNode root) {
		return isValidBstHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private static boolean isValidBstHelper(BinaryTreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		
		if (root.data < min || root.data >= max) {
			return false;
		}
	
		boolean leftValid = isValidBstHelper(root.left, min, root.data);
		boolean rightValid = isValidBstHelper(root.right, root.data, max);
		
		return leftValid && rightValid;
	}
}
