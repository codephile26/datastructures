package edu.ds.trees;

public class FindSizeOfBinaryTree {
	
	public static int size(BinaryTreeNode root){
		if (root == null){
			return 0;
		}
		int leftCount = root.getLeft() ==null?0:size(root.getLeft());
		int rightCount = root.getRight()== null? 0:size(root.getRight());
		return 1 + leftCount + rightCount;
	}
	
}