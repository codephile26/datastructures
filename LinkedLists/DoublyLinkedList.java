package edu.ds.linkedlists;

public class DoublyLinkedList {
	
	private DoublyLinkedListNode head;
	
	private int length;

	public DoublyLinkedListNode getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}
	
	public void insertAtBegin(int data){
		if (head == null){
			DoublyLinkedListNode dllNode = new DoublyLinkedListNode(data);
			head = dllNode;
			length += 1;
			return;
		}
		
		DoublyLinkedListNode dllNode = new DoublyLinkedListNode(data);
		dllNode.setNext(head);
		head.setPrevious(dllNode);
		head = dllNode;
		length += 1;
		return;
	}
	
	public void insertAtEnd(int data){
		if (head == null){
			DoublyLinkedListNode dllNode = new DoublyLinkedListNode(data);
			head = dllNode;
			length +=1;
			return;
		}
		
		DoublyLinkedListNode dllNode = new DoublyLinkedListNode(data);
		DoublyLinkedListNode dlTemp = head;
		while (dlTemp.getNext() != null){
			dlTemp = dlTemp.getNext();
		}
		dlTemp.setNext(dllNode);
		dllNode.setPrevious(dlTemp);
		length += 1;
	}
	
	public void insert(int data, int position){
		if ((position < 0) || (position > length)){
			return;
		}
		
		DoublyLinkedListNode dlNode = new DoublyLinkedListNode(data);
		
		if (head == null){
			head = dlNode;
			length += 1;
			return;
		}
		
		if (position == 0){
			//add at the beginning;
			dlNode.setNext(head);
			head.setPrevious(dlNode);
			head = dlNode;
			length += 1;
			return;
		}
		
		DoublyLinkedListNode dlTemp = head;
		for (int i = 1; i<position;i++){
			dlTemp = dlTemp.getNext();
		}
		
		dlNode.setNext(dlTemp.getNext());
		dlNode.setPrevious(dlTemp);
		dlNode.getNext().setPrevious(dlNode);
		dlTemp.setNext(dlNode);
		length +=1;
		
	}
	
	public void removeBegin(){
		if (head == null){
			return;
		}
		
		head = head.getNext();
		if (head != null){
			head.setPrevious(null);
		}
		
		length -= 1;
		return;
	}
	
	public void removeEnd(){
		if (head == null){
			return;
		}
		
		DoublyLinkedListNode temp = head;
		while (temp.getNext() != null){
			temp = temp.getNext();
		}
		
		//Now we have the last node of the list
		DoublyLinkedListNode secondLast = temp.getPrevious();
		if (secondLast != null){
			secondLast.setNext(null);
			temp.setPrevious(null);
			length -= 1;
		}
		else {
			//if the last element is the only element in the list
			head = null;
			temp = null;
			length -= 1;
		}
		
	}
	
	public void removeFromPosition(int position){
		if (head == null){
			return;
		}
		
		if (position < 0 || position > length){
			return;
		}
		
		if (position == 0){
			if (head.getNext() != null){
				head.getNext().setPrevious(null);
			}
			head = head.getNext();
			length -= 1;
			return;
		}
		
		DoublyLinkedListNode dllTemp = head;
		for (int i = 0; i < position; i++){
			dllTemp = dllTemp.getNext();
		}
		
		if (dllTemp != null){
			DoublyLinkedListNode previous = dllTemp.getPrevious();
			DoublyLinkedListNode next = dllTemp.getNext();
				if (previous != null)
				{
					previous.setNext(next);
				}
				
				if (next != null){
					next.setPrevious(previous);	
				}
				
				length -= 1;
				return;
		}
		else {
			if (length == 1){
				dllTemp = null;
				length -= 1;
				return;
			}
		}
	}
	
	public void removeData(int data){
		
		if (head == null){
			return;
		}
		
		if (head.getData() == data){
			if (this.length == 1){
				length -= 1;
				head = null;
				return;
			}
			else {
				head = head.getNext();
				head.setPrevious(null);
				length -= 1;
				return;
			}
		}
		
		DoublyLinkedListNode dlTemp = head;
		while (dlTemp != null){
			if (dlTemp.getData() == data){
				DoublyLinkedListNode next = dlTemp.getNext();
				DoublyLinkedListNode previous = dlTemp.getPrevious();
				if (previous != null){
					previous.setNext(next);
				}
				if (next != null){
					next.setPrevious(previous);
				}
				length -= 1;
				return;
			}
			
			dlTemp = dlTemp.getNext();
		}
	}	
	
	
	public String toString(){
		String result = "[";
		
		if (head == null){
			result = result + "]";
			return result;
		}
		
		DoublyLinkedListNode dlTemp = head;
		result = result + dlTemp.getData();
		while (dlTemp.getNext() != null){
			dlTemp = dlTemp.getNext();
			result = result + "," + dlTemp.getData();
		}
		
		result = result + "]";
		return result;
	}
	
	public String toStringReverse(){
		String result = "[";
		int lastIndex = length - 1;
		int i = lastIndex;
		DoublyLinkedListNode dlTemp = getElementAt(i);
		result = result + dlTemp.getData();
		while (dlTemp.getPrevious() != null){
			dlTemp = dlTemp.getPrevious();
			result = result + "," + dlTemp.getData();
		}
		result = result + "]";
		return result;
	}
	
	public DoublyLinkedListNode getElementAt(int index) {
		if (index < 0 || index >= length){
			return null;
		}
		
		DoublyLinkedListNode dlTemp = head;
		for (int i = 0; i <= index; i++){
			if (i == index){
				return dlTemp;
			}
			else {
				dlTemp = dlTemp.getNext();
			}
		}
		return null;
	}

	public int getDataAt(int index){
		if (index < 0 || index >= length){
			return -1;
		}
		
		DoublyLinkedListNode dlTemp = head;
		for (int i = 0; i <= index; i++){
			if (i == index){
				return dlTemp.getData();
			}
			else {
				dlTemp = dlTemp.getNext();
			}
		}
		return -1;
	}
	
	

}
