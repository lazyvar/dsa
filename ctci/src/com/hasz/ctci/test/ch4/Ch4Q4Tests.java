package com.hasz.ctci.test.ch4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch4.BinaryTreeNode;

public class Ch4Q4Tests {

	@Test
	public void testEmpty() {
		BinaryTreeNode root = null;
		
		assertTrue(ChQ4.isBalanced(root));
	}
	
	@Test
	public void testBalanced1() {
		BinaryTreeNode root = new BinaryTreeNode(77);
		root.left = new BinaryTreeNode(33);
		root.right = new BinaryTreeNode(100);
		root.left.left = new BinaryTreeNode(99);
		root.left.right = new BinaryTreeNode(88);
		root.right.left = new BinaryTreeNode(32);
		root.right.right = new BinaryTreeNode(11);

		assertTrue(ChQ4.isBalanced(root));
	}

	@Test
	public void testBalanced2() {
		BinaryTreeNode root = new BinaryTreeNode(77);
		root.left = new BinaryTreeNode(33);
		root.right = new BinaryTreeNode(100);
		root.left.left = new BinaryTreeNode(99);
		root.left.left.left = new BinaryTreeNode(99);
		root.right.right = new BinaryTreeNode(88);
		root.right.right.right = new BinaryTreeNode(88);
		
		assertTrue(ChQ4.isBalanced(root));
	}

	@Test
	public void testUnbalanaced() {
		BinaryTreeNode root = new BinaryTreeNode(77);
		root.left = new BinaryTreeNode(33);
		root.right = new BinaryTreeNode(100);
		root.left.left = new BinaryTreeNode(0);
		root.right.left = new BinaryTreeNode(88);
		root.right.right = new BinaryTreeNode(120);
		root.right.right.left = new BinaryTreeNode(101);
		root.right.right.left.right = new BinaryTreeNode(1000);
		root.right.right.left.right.left = new BinaryTreeNode(1041);
		
		assertFalse(ChQ4.isBalanced(root));
	}

}
