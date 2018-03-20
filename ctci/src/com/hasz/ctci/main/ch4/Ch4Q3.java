package com.hasz.ctci.main.ch4;

import java.util.ArrayList;

import com.hasz.ctci.main.ch2.SinglyLinkedList;

public class Ch4Q3 {

	public static ArrayList<SinglyLinkedList> nodesByDepth(BinaryTreeNode root) {
		ArrayList<SinglyLinkedList> nodesAtDepth = new ArrayList<SinglyLinkedList>();
				
		nodesByDepthHelper(nodesAtDepth, root, 0);
				
		return nodesAtDepth;
	}
	
	private static void nodesByDepthHelper(ArrayList<SinglyLinkedList> nodesAtDepth, BinaryTreeNode root, int depth) {
		if (root == null) {
			return;
		}
		
		SinglyLinkedList nodes;
		
		if (depth >= nodesAtDepth.size()) {  // depths accessed in order
			nodes = new SinglyLinkedList();  // so the following operations
			nodesAtDepth.add(nodes);         // are safe
		} else {
			nodes = nodesAtDepth.get(depth);
		}

		nodes.insertLast(root.data);
		nodesByDepthHelper(nodesAtDepth, root.left, depth + 1);
		nodesByDepthHelper(nodesAtDepth, root.right, depth + 1);
	}
}
