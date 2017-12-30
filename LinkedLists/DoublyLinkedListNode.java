package edu.ds.linkedlists;

public class DoublyLinkedListNode {
	
	private int data;
	private DoublyLinkedListNode previous;
	private DoublyLinkedListNode next;
	
	public int getData() {
		return data;
	}
	
	public DoublyLinkedListNode getPrevious() {
		return previous;
	}
	
	public DoublyLinkedListNode getNext() {
		return next;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setPrevious(DoublyLinkedListNode previous) {
		this.previous = previous;
	}
	
	public void setNext(DoublyLinkedListNode next) {
		this.next = next;
	}

	public DoublyLinkedListNode(int data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "DoublyLinkedListNode [data=" + data + "]";
	}
	
	
	
}
