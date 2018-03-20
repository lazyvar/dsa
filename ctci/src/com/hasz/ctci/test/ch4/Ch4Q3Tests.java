package com.hasz.ctci.test.ch4;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.hasz.ctci.main.ch2.SinglyLinkedList;
import com.hasz.ctci.main.ch4.BinaryTreeNode;

public class Ch4Q3Tests {

	@Test
	public void testEmpty() {
		BinaryTreeNode root = null;
		ArrayList<SinglyLinkedList> nodesByDepth = Ch4Q3.nodesByDepth(root);
		
		assertEquals(0, nodesByDepth.size());
	}

	@Test
	public void testOne() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		ArrayList<SinglyLinkedList> nodesByDepth = Ch4Q3.nodesByDepth(root);
		
		assertEquals(1, nodesByDepth.size());
		assertEquals(1, nodesByDepth.get(0).head.data);
		assertNull(nodesByDepth.get(0).head.next);
	}
	@Test
	public void testSmall() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		root.left = new BinaryTreeNode(0);
		root.right = new BinaryTreeNode(2);
		
		ArrayList<SinglyLinkedList> nodesByDepth = Ch4Q3.nodesByDepth(root);
		
		assertEquals(2, nodesByDepth.size());
		
		/* depth 0 */
		assertEquals(0, nodesByDepth.get(0).head.data);
		assertNull(nodesByDepth.get(0).head.next);
		
		/* depth 1 */
		assertEquals(1, nodesByDepth.get(1).head.data);
		assertEquals(2, nodesByDepth.get(1).head.next.data);
		assertNull(nodesByDepth.get(1).head.next.next);
	}

	@Test
	public void testMedium() {
		BinaryTreeNode root = new BinaryTreeNode(77);
		root.left = new BinaryTreeNode(33);
		root.right = new BinaryTreeNode(100);
		root.left.left = new BinaryTreeNode(0);
		root.right.left = new BinaryTreeNode(88);
		root.right.right = new BinaryTreeNode(120);
		root.right.right.left = new BinaryTreeNode(101);
		
		ArrayList<SinglyLinkedList> nodesByDepth = Ch4Q3.nodesByDepth(root);
		
		assertEquals(4, nodesByDepth.size());
		
		/* depth 0 */
		assertEquals(77, nodesByDepth.get(0).head.data);
		assertNull(nodesByDepth.get(0).head.next);
		
		/* depth 1 */
		assertEquals(33, nodesByDepth.get(1).head.data);
		assertEquals(100, nodesByDepth.get(1).head.next.data);
		assertNull(nodesByDepth.get(1).head.next.next);

		/* depth 2 */
		assertEquals(0, nodesByDepth.get(2).head.data);
		assertEquals(88, nodesByDepth.get(2).head.next.data);
		assertEquals(120, nodesByDepth.get(2).head.next.next.data);
		assertNull(nodesByDepth.get(2).head.next.next.next);

		/* depth 3 */
		assertEquals(101, nodesByDepth.get(3).head.data);
		assertNull(nodesByDepth.get(3).head.next);
	}

}
