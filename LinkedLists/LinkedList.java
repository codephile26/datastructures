package edu.ds.linkedlists;

public class LinkedList {
	
	//length of the linked list. Why kept private? Think?
	private int length = 0;
	
	//this element points to the head of the linked list.
	ListNode head;
	
	public LinkedList() {
		length = 0;
	}

	//returns the first node of the list
	public synchronized ListNode getHead() {
		return head;
	}
	
	//this method inserts an element at the beginning of the list.
	public synchronized void insertAtBegin(ListNode node){
		node.setNext(head);
		head = node;
		length++;
	}
	
	//This method inserts an element at the end of the list
	public synchronized void insertAtEnd(ListNode node){
		// if the list is not populated at all
		if (head == null){
			head = node;
			length++;
		}
		else {
			ListNode p = head,q = p.getNext();
			
			for(p=head;(q=p.getNext()) == null;p=q){
				p.setNext(node);
			}
			
			length++;
		}
	}
	
	//Add a new value to the list at a given position
	//All values at that position till the end move over to make room
	//Note that here we are accepting simple int data and not a ListNode; So before insertion we will create a ListNode object.
	public void insert(int data, int position){
		//checks on position and fix its values accordingly
		if (position < 0){
			position = 0;
		}
		if (position > length){
			position = length;
		}
		//now insert
		//possibilities: 
		//1.list is empty - head ==null; position != 0
		if (head == null){
			head = new ListNode(data);
		}
		else if (position == 0){
		//2. insert at beginning - position = 0; head != null
			ListNode temp = new ListNode(data);
			temp.setNext(head);
			head = temp;
		}
		else {
			//3.Find the correct position and insert
			ListNode temp = head;
			for (int i = 1; i < position;i++){
				//here we obtain the element previous to the position at which we are going to insert our new element
				temp = temp.getNext();
			}
			ListNode newNode = new ListNode(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		length++;
	}
	
	public synchronized ListNode removeFromBegin(){
		//Transfer the head contents to a temporary node and point to the head to the next element of the head.
		//make the next element of the temporary node null - to mark its removal from the list
		ListNode node = head;
		if (node != null){
			head = node.getNext();
			node.setNext(null);
		}
		
		length--;
		return node;
	}
	
	//Steps for removal from end:
	//1. Keep traversing the list and while traversing maintain the previous node address also.
	//2. To remove the end node let the next pointer of the node previous to the last element point to null
	public synchronized ListNode removeFromEnd(){
		//check for no element in the list
		if (head == null){
			return null;
		}
		ListNode tailNode = head, previousToTail = null, next = head.getNext();
		// check for just one element in the list and also the terminal condition
		if (next == null){
			head = null;
			length -= 1;
			return tailNode;
		}
		while ((next = tailNode.getNext()) != null){
			previousToTail = tailNode;
			tailNode = next;
		}
		previousToTail.setNext(null);
		length -= 1;
		return tailNode;
	}
	
	public ListNode removeData(int data){
		if (head == null){
			return null;
		}
		
		if (head.getData() == data){
			head = head.getNext();
			length -= 1;
			return head;
		}
		
		ListNode temp = head, previous = null;
		while ((temp = temp.getNext()) != null){
			if (temp.getData() == data){
				previous.setNext(temp.getNext());
				length -= 1;
				return temp;
			}
			previous = temp;
		}
		
		return null;
	}
	
	
	
	
	/**
	 * This method removes element from the specified position in a linked list.
	 * 
	 * 
	 * @param position
	 */
	public void removeFrom(int position){
		
		if (head == null){
			return;
		}
		
		if ((position < 0) || (position >= length)){
			return;
		}
		
		if (position == 0){
			head = head.getNext();
			length -= 1;
			return;
		}
		else {
			ListNode temp = head;
			for (int i = 0; temp != null && i < position-1; i++){
					temp = temp.getNext();
			}
			
			if (temp == null || temp.getNext() == null){
				return;
			}
			
			temp.setNext(temp.getNext().getNext());
			length -= 1;
		}
	}
	
	public String toString(){
		String result = "[";
		
		if (head == null){
			return result + "]";
		}
		
		result = result + head.getData();
		ListNode temp = head.getNext();
		
		while (temp != null){
			result = result + "," + temp.getData();
			temp = temp.getNext();
		}
		
		return result + "]";
	}
	
	public int length(){
		return length;
	}
	
	//Returns position of the data entered.
	public int getPosition(int data){
		int pos = 0;
		
		if (head == null){
			return Integer.MIN_VALUE;
		}
		
		ListNode temp = head;
		while (temp != null){
			if (temp.getData() == data){
				return pos;
			}
			
			pos += 1;
			temp = temp.getNext();
		}
		
		return Integer.MIN_VALUE;
	}
	
	public ListNode getElementAt(int index) {
		if (index < 0 || index >= length){
			return null;
		}
		
		ListNode dlTemp = head;
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
	
	public void insertNodeInASortedList(ListNode head,ListNode data){
		if (head == null){
			head = data;
			length += 1;
			return;
		}
		//temp acts as a pointer to the previous n
		ListNode temp = head;
		ListNode current = head;
		while ((current != null) && (current.getData() < data.getData())) {
				temp = current;
				current = current.getNext();
		}
				data.setNext(current);
				temp.setNext(data);
				length +=1;
				return;
		}
	
	public ListNode reverseLinkedListRecursive(ListNode current, ListNode previous){
		if (current == null){
			return null;
		}
		if (current.getNext() == null){
			head = current;
			current.setNext(previous);
			return null;
		}
		
		ListNode next = current.getNext();
		current.setNext(previous);
		
		reverseLinkedListRecursive(next, current);
		
		return head;
	}
	
	
	
	}
	


