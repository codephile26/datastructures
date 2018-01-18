package edu.ds.trees;

public class FindInBinaryTreeRecursive {
	
	public static boolean findInBinaryTree(BinaryTreeNode root, int data){
		if (root==null){
			return false;
		}
		if (root.getData() == data){
			return true;
		}
		return findInBinaryTree(root.getLeft(), data) || findInBinaryTree(root.getRight(), data);
	}
}
