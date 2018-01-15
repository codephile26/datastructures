package edu.ds.trees;

import java.util.ArrayList;

import org.junit.Test;

public class LevelOrderTraversalTest {

	@Test
	public void test() {
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
		ArrayList<ArrayList<Integer>> list = LevelOrderTraversal.levelOrderTraversal(root);
		for (ArrayList<Integer> arrayList : list) {
			System.out.println(arrayList);
		}
	}

}
