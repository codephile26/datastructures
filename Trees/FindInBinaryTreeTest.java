package edu.ds.trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindInBinaryTreeTest {

	@Test
	public void testIterative() {
		BinaryTreeNode root = new BinaryTreeNode();
		root.setData(5);
		BinaryTreeNode left = new BinaryTreeNode();
		left.setData(10);
		BinaryTreeNode right = new BinaryTreeNode();
		right.setData(15);
		root.setLeft(left);
		root.setRight(right);
		
		BinaryTreeNode left1 = new BinaryTreeNode();
		left1.setData(12);
		BinaryTreeNode right1 = new BinaryTreeNode();
		right1.setData(14);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinaryTreeNode left2 = new BinaryTreeNode();
		left2.setData(16);
		BinaryTreeNode right2 = new BinaryTreeNode();
		right2.setData(18);
		right.setLeft(left2);
		right.setRight(right2);
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(root);
		boolean isFound = FindInBinaryTree.findElementInBinaryTree(root, 15);
		assertTrue(isFound);
		boolean isNotFound = FindInBinaryTreeRecursive.findInBinaryTree(root, 17);
		assertFalse(isNotFound);
	}
	
	@Test
	public void testRecursive(){
		BinaryTreeNode root = new BinaryTreeNode();
		root.setData(5);
		BinaryTreeNode left = new BinaryTreeNode();
		left.setData(10);
		BinaryTreeNode right = new BinaryTreeNode();
		right.setData(15);
		root.setLeft(left);
		root.setRight(right);
		
		BinaryTreeNode left1 = new BinaryTreeNode();
		left1.setData(12);
		BinaryTreeNode right1 = new BinaryTreeNode();
		right1.setData(14);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinaryTreeNode left2 = new BinaryTreeNode();
		left2.setData(16);
		BinaryTreeNode right2 = new BinaryTreeNode();
		right2.setData(18);
		right.setLeft(left2);
		right.setRight(right2);
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(root);
		boolean isFound = FindInBinaryTreeRecursive.findInBinaryTree(root, 15);
		assertTrue(isFound);
		boolean isNotFound = FindInBinaryTreeRecursive.findInBinaryTree(root, 17);
		assertFalse(isNotFound);
	}

}
