package com.hasz.ctci.main.ch4;

public class ChQ4 {

	/* a tree is balanced iff the heights of the two subtrees for any node never differ by one */
	public static boolean isBalanced(BinaryTreeNode root) {
		try {
			checkHeightDiff(root, 0, 1);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	/* throws an exception if height for any subtree is off by more than the diff 
	 * otherwise returns the height of the tree */
	private static int checkHeightDiff(BinaryTreeNode root, int depth, int diff) throws Exception {
		if (root == null) {
			return depth;
		}
		
		int left = checkHeightDiff(root.left, depth + 1, diff);
		int right = checkHeightDiff(root.right, depth + 1, diff);
		
		if (Math.abs(left - right) > diff) {
			throw new Exception();
		}

		return left > right ? left : right;
	}
	
}
