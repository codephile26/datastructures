package edu.ds.linkedlists;

/**
 * In this class, I have implemented various methods to solve different kinds of problems related to linked lists.
 * 
 * 
 * 
 * @author Admin
 *
 */
public class LinkedListUtil { 
	
	//Program to traverse a linked list
	public static int listLength(ListNode headNode){
		int length = 0;
		ListNode currentNode = headNode;
		while (currentNode != null){
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}
	
	public static ListNode getLast(ListNode headNode){
		ListNode currentNode = headNode;
		while (currentNode != null){
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}
	
	public static int findNthElementFromEnd(int n,ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		for (int i = 1; i<n; i++){
			if (fast != null){
				fast = fast.getNext();
			}
		}
		if (fast != null){
			while (fast.getNext() != null && slow.getNext() != null){
				slow = slow.getNext();
				fast = fast.getNext();
			}
		}
		if (slow != null){
			return slow.getData();
		}
		else {
			return -1;
		}
	}
	
	public static ListNode detectLoopInALinkedList(ListNode head){
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		boolean loopExists = false;
		while (fastPointer != null && fastPointer.getNext() != null){
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			if (slowPointer == fastPointer){
				loopExists = true;
				break;
			}
		}
		if (loopExists){
			slowPointer = head;
			while (slowPointer != fastPointer){
				slowPointer = slowPointer.getNext();
				fastPointer = fastPointer.getNext();
			}
			return fastPointer;
		}
		else {
			return null;
		}
	}
	
	public static int findLengthOfTheLoop(ListNode head){
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		int length = 0;
		boolean loopExists = false;
		while (fastPointer != null && fastPointer.getNext() != null){
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			if (slowPointer == fastPointer){
				loopExists = true;
				break;
			}
		}
		if (loopExists){
			do{
				slowPointer = slowPointer.getNext();
				length++;
			} while (slowPointer != fastPointer);
			return length;
		}
		else {
			return 0;
		}
		
	}
	
	public static ListNode reverseLinkedList(ListNode head){
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null){
			next = current.getNext();
		    current.setNext(previous);
		    previous = current;
		    current = next;
		}
		return previous;
	}

	public static boolean isLinkedListLengthEven(ListNode listHead){
		ListNode current = listHead;
		while (current != null && current.getNext() != null){
			current = current.getNext().getNext();
		}
		if (current == null){
			return true;
		}
		else {
			return false;
		}
	}
	
}
