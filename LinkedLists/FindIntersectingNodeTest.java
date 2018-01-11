package edu.ds.linkedlists;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindIntersectingNodeTest {

	@Test
	public void test() {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		ListNode node11 = new ListNode(2);
		ListNode node12 = new ListNode(3);
		ListNode node13 = new ListNode(4);
		ListNode node21 = new ListNode(5);
		ListNode node22 = new ListNode(6);
		ListNode node23 = new ListNode(7);
		ListNode node24 = new ListNode(8);
		ListNode nodeCommon = new ListNode(9);
		ListNode nodeCommon2 = new ListNode(10);
		list1.insertAtBegin(nodeCommon);
		list1.insertAtBegin(nodeCommon2);
		list1.insertAtBegin(node11);
		list1.insertAtBegin(node12);
		list1.insertAtBegin(node13);
		list2.insertAtBegin(nodeCommon);
		list2.insertAtBegin(nodeCommon2);
		list2.insertAtBegin(node24);
		list2.insertAtBegin(node23);
		list2.insertAtBegin(node22);
		list2.insertAtBegin(node21);
		ListNode intersectingNode = FindIntersectingNode.findIntersectingNode(list1.getHead(), list2.getHead());
		assertNotNull(intersectingNode);
		assertEquals(nodeCommon, intersectingNode);
	}
	
	
}
