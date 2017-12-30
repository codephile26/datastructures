package edu.ds.linkedlists;

public class CircularLinkedList {

	private int length;
	private CircularLinkedListNode tail;

	public int getLength() {
		return length;
	}

	public CircularLinkedListNode getTail() {
		return tail;
	}

	public int getSize() {
		int size = 0;
		CircularLinkedListNode clTemp = tail;
		while (clTemp.getNext() != tail) {
			size++;
			clTemp = clTemp.getNext();
		}

		return size;
	}

	public String toString() {
		String result = "[";
		if (tail != null) {
			CircularLinkedListNode clTemp = tail.getNext();
			result = result + clTemp.getData();
			while (clTemp!= tail) {
				clTemp = clTemp.getNext();
				result = result + "," + clTemp.getData();
			}
			return result + "]";
		} else {
			return result + "]";
		}
	}

	public void addToBeginning(int data) {
		CircularLinkedListNode node = new CircularLinkedListNode(data);
		if (tail == null) {
			tail = node;
			tail.setNext(node);
			length += 1;
			return;
		} else {
			node.setNext(tail.getNext());
			tail.setNext(node);
			length += 1;
			return;
		}

	}
	
	public void addToEnd(int data){
		CircularLinkedListNode temp = new CircularLinkedListNode(data);
		if (tail == null){
			tail = temp;
			temp.setNext(tail);
			length +=1;
			return;
		}
		else {
			temp.setNext(tail.getNext());
			tail.setNext(temp);
			tail = temp;
			length += 1;
			return;
		}
	}
	
	public void removeFromBeginning(){
		//no element in the list
		if (tail == null){
			return;
		}
		//only 1 element in the list
		if (tail.getNext() == tail){
			tail = null;
			length -= 1;
			return;
		}
		tail.setNext(tail.getNext().getNext());
		length -= 1;
		return;
	}
	
	public void removeFromEnd(){
		if (tail == null){
			return;
		}
		CircularLinkedListNode cLLNode = tail;
		while (cLLNode.getNext() != tail){
			cLLNode = cLLNode.getNext();
		}
		if (cLLNode == tail){
			tail = null;
			length -= 1;
			return;
		}
		else {
			cLLNode.setNext(tail.getNext());
			tail = cLLNode;
			length -= 1;
			return;
		}
	}

}
