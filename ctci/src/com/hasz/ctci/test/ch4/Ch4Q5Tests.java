package com.hasz.ctci.test.ch4;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hasz.ctci.main.ch4.BinaryTreeNode;
import com.hasz.ctci.main.ch4.ChQ4;

class Ch4Q5Tests {

	@Test
	public void testEmpty() {
		BinaryTreeNode root = null;
		
		assertTrue(Ch4Q5.isValidBst(root));
	}

	@Test
	public void testOne() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		
		assertTrue(Ch4Q5.isValidBst(root));
	}

	@Test
	public void testSimpleValid() {
		BinaryTreeNode root = new BinaryTreeNode(2);
		root.left = new BinaryTreeNode(1);
		root.right = new BinaryTreeNode(3);
		
		assertTrue(Ch4Q5.isValidBst(root));
	}

	@Test
	public void testSimpleInValid() {
		BinaryTreeNode root = new BinaryTreeNode(2);
		root.left = new BinaryTreeNode(3);
		root.right = new BinaryTreeNode(1);
		
		assertFalse(Ch4Q5.isValidBst(root));
	}

	@Test
	public void testComplexValid() {
		BinaryTreeNode root = new BinaryTreeNode(50);
		root.left = new BinaryTreeNode(25);
		root.right = new BinaryTreeNode(75);
		root.left.left = new BinaryTreeNode(12);
		root.left.right = new BinaryTreeNode(33);
		root.right.right = new BinaryTreeNode(100);
		root.right.right.left = new BinaryTreeNode(88);
		root.right.right.right = new BinaryTreeNode(120);
		
		assertFalse(Ch4Q5.isValidBst(root));
	}
	
	@Test
	public void testComplexInValid() {
		BinaryTreeNode root = new BinaryTreeNode(50);
		root.left = new BinaryTreeNode(25);
		root.right = new BinaryTreeNode(75);
		root.left.left = new BinaryTreeNode(12);
		root.left.right = new BinaryTreeNode(33);
		root.right.right = new BinaryTreeNode(100);
		root.right.right.left = new BinaryTreeNode(8);
		
		assertFalse(Ch4Q5.isValidBst(root));
	}

	@Test
	public void testInvalid() {
		BinaryTreeNode root = new BinaryTreeNode(50);
		root.left = new BinaryTreeNode(25);
		root.right = new BinaryTreeNode(75);
		root.left.right = new BinaryTreeNode(100);
		
		assertFalse(Ch4Q5.isValidBst(root));	
	}
}
