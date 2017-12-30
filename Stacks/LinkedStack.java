package edu.ds.stacks;

import java.util.EmptyStackException;

public class LinkedStack {
	private int length;
	private ListNode top;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public ListNode getTop() {
		return top;
	}

	public void setTop(ListNode top) {
		this.top = top;
	}

	public LinkedStack() {
		length = 0;
	}
	
	public void push(int data){
		ListNode node = new ListNode(data);
		if (top == null){
			top = node;
			length +=1;
			return;
		}
		node.setNext(top);
		top = node;
		length += 1;
		return;
	}
	
	public int pop(){
		if (top == null){
			throw new EmptyStackException();
		}
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}
	
	public int peek(){
		if (top == null){
			throw new EmptyStackException();
		}
		return top.getData();
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public String toString(){
		String result = "[";
		ListNode current = top;
		while (current != null){
			result = result + current.toString() + "\n";
			current = current.getNext();
		}
		return result;
	}
}
