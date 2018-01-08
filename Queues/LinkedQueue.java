package edu.ds.queues;

public class LinkedQueue {

	private int length;
	private ListNode front, rear;

	public int getLength() {
		return length;
	}

	public ListNode getFront() {
		return front;
	}

	public ListNode getRear() {
		return rear;
	}

	public LinkedQueue() {
		this.length = 0;
		this.front = this.rear = null;
	}

	/**
	 * Adds an element to the rear end of the list
	 * 
	 * @param element
	 */
	public void enqueue(int element) {
		ListNode node = new ListNode(element);
		if (isEmpty()) {
			front = node;
		} else {
			rear.setNext(node);
		}
		rear = node;
		length += 1;
	}

	public boolean isEmpty() {
		return (length == 0);
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int data = front.getData();
		front = front.getNext();
		length -= 1;
		if (isEmpty()) {
			rear = null;
		}
		return data;
	}

	public int front() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		return front.getData();
	}

	public int size() {
		return length;
	}

}
