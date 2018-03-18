package com.hasz.ctci.main.ch3;

import java.util.EmptyStackException;

import com.hasz.ctci.main.ch2.SinglyLinkedNode;

public class Stack {

	SinglyLinkedNode top;
	
	public void push(int d) {
		SinglyLinkedNode newTop = new SinglyLinkedNode(d);
		
		newTop.next = top;
		top = newTop;
	}
	
	public int pop() {
		if (top == null) {
			throw new EmptyStackException();
		}
		
		SinglyLinkedNode oldTop = top;
	
		top = top.next;
		
		return oldTop.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peek() {
		if (top == null) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
}
