package edu.ds.linkedlists;

public class CircularLinkedListNode {
	
	private int data;
	private CircularLinkedListNode next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public CircularLinkedListNode getNext() {
		return next;
	}
	public void setNext(CircularLinkedListNode next) {
		this.next = next;
	}
	
	public CircularLinkedListNode(int data) {
		super();
		this.data = data;
	}
	
}
