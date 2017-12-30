package edu.ds.linkedlists;

public class LinkedListUtilTest {
	
	public static void main(String...ar){
		/*LinkedList list = new LinkedList();
		list.insertAtBegin(new ListNode(1));
		list.insertAtBegin(new ListNode(2));
		list.insertAtBegin(new ListNode(3));
		list.insertAtBegin(new ListNode(4));
		list.insertAtBegin(new ListNode(5));
		list.insertAtBegin(new ListNode(6));
		list.insertAtBegin(new ListNode(7));
		list.insertAtBegin(new ListNode(8));
		list.insertAtBegin(new ListNode(9));
		list.insertAtBegin(new ListNode(10));
		System.out.println(LinkedListUtil.findNthElementFromEnd(5, list.getHead()));*/
		
//		LinkedList loop = createListEndingInALoop();
//		ListNode loopBegin = LinkedListUtil.detectLoopInALinkedList(loop.getHead());
//		System.out.println(loopBegin.getData());
//		System.out.println(LinkedListUtil.findLengthOfTheLoop(loop.getHead()));
		
		LinkedList sorted = createSortedLinkedList();
		sorted.insertNodeInASortedList(sorted.getHead(), new ListNode(7));
		System.out.println(sorted);
		
//		ListNode newHead = LinkedListUtil.reverseLinkedList(sorted.getHead());
		
		//TODO: Check why this is giving null pointer exception
//		ListNode bottomHead = sorted.reverseLinkedListRecursive(sorted.getHead(), null);
//		System.out.println(bottomHead.getData());
		
		System.out.println(LinkedListUtil.isLinkedListLengthEven(sorted.getHead()));
		
	}
	
	public static LinkedList createListEndingInALoop(){
		LinkedList loop = new LinkedList();
		loop.insertAtBegin(new ListNode(1));
		loop.insertAtBegin(new ListNode(2));
		loop.insertAtBegin(new ListNode(3));
		loop.insertAtBegin(new ListNode(4));
		loop.insertAtBegin(new ListNode(5));
		loop.insertAtBegin(new ListNode(6));
		loop.insertAtBegin(new ListNode(7));
		loop.insertAtBegin(new ListNode(8));
		loop.insertAtBegin(new ListNode(9));
		loop.getHead().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(loop.getHead().getNext().getNext().getNext()); 
		return loop;
	}
	
	public static LinkedList createSortedLinkedList(){
		LinkedList sorted = new LinkedList();
		sorted.insertAtBegin(new ListNode(8));
		sorted.insertAtBegin(new ListNode(6));
		sorted.insertAtBegin(new ListNode(5));
		sorted.insertAtBegin(new ListNode(4));
		sorted.insertAtBegin(new ListNode(3));
		sorted.insertAtBegin(new ListNode(2));
		sorted.insertAtBegin(new ListNode(1));
		return sorted;
	}
	
}
