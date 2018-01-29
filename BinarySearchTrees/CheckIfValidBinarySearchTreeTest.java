package edu.ds.binarysearchtrees;

import static org.junit.Assert.*;

import org.junit.Test;


public class CheckIfValidBinarySearchTreeTest {

	@Test
	public void testValidBSTFalse() {
		BinarySearchTreeNode root = new BinarySearchTreeNode();
		root.setData(5);
		BinarySearchTreeNode left = new BinarySearchTreeNode();
		left.setData(10);
		BinarySearchTreeNode right = new BinarySearchTreeNode();
		right.setData(15);
		root.setLeft(left);
		root.setRight(right);
		
		BinarySearchTreeNode left1 = new BinarySearchTreeNode();
		left1.setData(12);
		BinarySearchTreeNode right1 = new BinarySearchTreeNode();
		right1.setData(14);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinarySearchTreeNode left2 = new BinarySearchTreeNode();
		left2.setData(16);
		BinarySearchTreeNode right2 = new BinarySearchTreeNode();
		right2.setData(18);
		right.setLeft(left2);
		right.setRight(right2);
		
		assertFalse(CheckIfValidBinarySearchTree.checkIfValidBSTInorder(root));
	}

}
