package edu.ds.trees;

public class MaxInBinaryTree {
	
	public static int maxInBinaryTree(BinaryTreeNode root){
		int maxValue = Integer.MIN_VALUE;
		if (root != null){
			int leftMax = maxInBinaryTree(root.getLeft());
			int rightMax = maxInBinaryTree(root.getRight());
			if (leftMax > rightMax){
				maxValue = leftMax;
			}
			else {
				maxValue = rightMax;
			}
			if (root.getData()>maxValue)
				maxValue = root.getData();
		}
		return maxValue;
	}

}
