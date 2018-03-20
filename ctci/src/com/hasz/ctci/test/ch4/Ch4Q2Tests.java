package com.hasz.ctci.test.ch4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hasz.ctci.main.ch4.BinaryNode;

public class Ch4Q2Tests {

	@Test
	public void testEmpty() {
		int[] sortedArray = {};
		
		BinaryNode root = Ch4Q2.minTreeFrom(sortedArray);
		
		assertNull(root);
	}
	
	@Test
	public void testSmall() {
		int[] sortedArray = {1, 2, 3};
		
		BinaryNode root = Ch4Q2.minTreeFrom(sortedArray);
		
		assertEquals(2, root.data);
		assertEquals(1, root.left.data);
		assertEquals(3, root.right.data);
	}

	@Test
	public void testMedium() {
		int[] sortedArray = {1, 2, 3, 5, 8, 13};
		
		BinaryNode root = Ch4Q2.minTreeFrom(sortedArray);
		
		assertEquals(3, root.data);
		assertEquals(2, root.left.data);
		assertEquals(8, root.right.data);
		assertEquals(1, root.left.left.data);
		assertEquals(5, root.right.left.data);
		assertEquals(13, root.right.right.data);
	}
	
	@Test
	public void tesLarge() {
		int[] sortedArray = {1, 2, 3, 5, 8, 13,
							21, 34, 55, 89, 144};
		
		BinaryNode root = Ch4Q2.minTreeFrom(sortedArray);
		
		assertEquals(2, root.data);
		assertEquals(5, root.left.data);
		assertEquals(55, root.right.data);
		assertEquals(2, root.left.left.data);
		assertEquals(13, root.left.right.data);
		assertEquals(34, root.right.left.data);
		assertEquals(144, root.right.right.data);
	}

}
