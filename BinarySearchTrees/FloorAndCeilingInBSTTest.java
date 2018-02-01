package edu.ds.binarysearchtrees;

import static org.junit.Assert.*;

import org.junit.Test;

public class FloorAndCeilingInBSTTest {

	@Test
	public void testCeiling() {
		BinarySearchTreeNode root = new BinarySearchTreeNode();
		root.setData(4);
		BinarySearchTreeNode left = new BinarySearchTreeNode();
		left.setData(2);
		BinarySearchTreeNode right = new BinarySearchTreeNode();
		right.setData(8);
		root.setLeft(left);
		root.setRight(right);
		
		BinarySearchTreeNode left1 = new BinarySearchTreeNode();
		left1.setData(1);
		BinarySearchTreeNode right1 = new BinarySearchTreeNode();
		right1.setData(3);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinarySearchTreeNode left2 = new BinarySearchTreeNode();
		left2.setData(5);
		BinarySearchTreeNode right2 = new BinarySearchTreeNode();
		right2.setData(9);
		right.setLeft(left2);
		right.setRight(right2);
		
		//create right child of left 2
		BinarySearchTreeNode left3 = new BinarySearchTreeNode();
		left3.setData(7);
		left2.setRight(left3);
		
		//create left child of left 3
//		BinarySearchTreeNode left4 = new BinarySearchTreeNode();
//		left4.setData(6);
//		left3.setLeft(left4);
		
		//test cases for ceiling function
		int ceil = FloorAndCeilingInBST.ceiling(root, 0);
		assertEquals(1, ceil);
		
		int ceil1 = FloorAndCeilingInBST.ceiling(root, 10);
		assertEquals(Integer.MIN_VALUE,ceil1);
		
		int ceil2 = FloorAndCeilingInBST.ceiling(root, 6);
		assertEquals(7,ceil2);
		
		int ceil3 = FloorAndCeilingInBST.ceiling(root, 3);
		assertEquals(3,ceil3);
	}
	
	
	@Test
	public void testFloor(){
		BinarySearchTreeNode root = new BinarySearchTreeNode();
		root.setData(4);
		BinarySearchTreeNode left = new BinarySearchTreeNode();
		left.setData(2);
		BinarySearchTreeNode right = new BinarySearchTreeNode();
		right.setData(8);
		root.setLeft(left);
		root.setRight(right);
		
		BinarySearchTreeNode left1 = new BinarySearchTreeNode();
		left1.setData(1);
		BinarySearchTreeNode right1 = new BinarySearchTreeNode();
		right1.setData(3);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinarySearchTreeNode left2 = new BinarySearchTreeNode();
		left2.setData(5);
		BinarySearchTreeNode right2 = new BinarySearchTreeNode();
		right2.setData(9);
		right.setLeft(left2);
		right.setRight(right2);
		
		//create right child of left 2
		BinarySearchTreeNode left3 = new BinarySearchTreeNode();
		left3.setData(7);
		left2.setRight(left3);
		
		BinarySearchTreeNode floor = FloorAndCeilingInBST.floor(root, 6);
		root.inOrder(root);
		System.out.println(floor);
	}
}
