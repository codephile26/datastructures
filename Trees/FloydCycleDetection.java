package edu.ds.linkedlists;

public class FloydCycleDetection {
	
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

}
