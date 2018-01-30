package edu.ds.binarysearchtrees;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ds.trees.BinaryTree;
import edu.ds.trees.BinaryTreeNode;

public class LeastCommonAncestorTest {

	@Test
	public void test() {
		BinarySearchTreeNode root = new BinarySearchTreeNode();
		root.setData(20);
		BinarySearchTreeNode left = new BinarySearchTreeNode();
		left.setData(8);
		BinarySearchTreeNode right = new BinarySearchTreeNode();
		right.setData(22);
		root.setLeft(left);
		root.setRight(right);
		
		BinarySearchTreeNode left1 = new BinarySearchTreeNode();
		left1.setData(4);
		BinarySearchTreeNode right1 = new BinarySearchTreeNode();
		right1.setData(12);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinarySearchTreeNode left2 = new BinarySearchTreeNode();
		left2.setData(21);
		BinarySearchTreeNode right2 = new BinarySearchTreeNode();
		right2.setData(30);
		right.setLeft(left2);
		right.setRight(right2);
		
		BinarySearchTreeNode node = LeastCommonAncestor.findLeastCommonAncestor(root, 21, 30);
		assertEquals(22, node.getData());
		BinarySearchTreeNode node2 = LeastCommonAncestor.findLeastCommonAncestor(root, 21, 8);
		assertEquals(20, node2.getData());
	}
	
	@Test
	public void testValidBSTTrue(){
		BinarySearchTreeNode root = new BinarySearchTreeNode();
		root.setData(20);
		BinarySearchTreeNode left = new BinarySearchTreeNode();
		left.setData(8);
		BinarySearchTreeNode right = new BinarySearchTreeNode();
		right.setData(22);
		root.setLeft(left);
		root.setRight(right);
		
		BinarySearchTreeNode left1 = new BinarySearchTreeNode();
		left1.setData(4);
		BinarySearchTreeNode right1 = new BinarySearchTreeNode();
		right1.setData(12);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinarySearchTreeNode left2 = new BinarySearchTreeNode();
		left2.setData(21);
		BinarySearchTreeNode right2 = new BinarySearchTreeNode();
		right2.setData(30);
		right.setLeft(left2);
		right.setRight(right2);
		
		assertTrue(CheckIfValidBinarySearchTree.checkIfValidBSTInorder(root));
		
	}

}
