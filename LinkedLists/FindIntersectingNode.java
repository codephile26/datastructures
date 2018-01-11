package edu.ds.linkedlists;

/**
 * In this program we intend to find the starting intersect node of two singly linked lists which merge to form a common single 
 * linked list towards the end.
 * 
 * @author Dimple Shah
 *
 */
public class FindIntersectingNode {

	public static ListNode findIntersectingNode(ListNode l1, ListNode l2){
		int length1 = 0;
		int length2 = 0;
		int diff = 0;
		ListNode head1 = l1, head2 = l2;
		 while(head1 != null){
			 length1++;
			 head1 = head1.getNext();
		 }
		 while(head2 != null){
			 length1++;
			 head2 = head2.getNext();
		 }
		if (length1 < length2){
			head1 = l2;
			head2 = l1;
			diff = length2 - length1;
		}
		else {
			head1 = l1;
			head2 = l2;
			diff = length1 - length2;
		}
		for (int i = 1;i<diff;i++){
			if (head1 != null){
				head1 = head1.getNext();
			}
		}
		while (head1 != null && head2 != null){
			if (head1 == head2){
				return head1;
			}
			head1 = head1.getNext();
			head2 = head2.getNext();
		}
		return null;
		
	}

}
