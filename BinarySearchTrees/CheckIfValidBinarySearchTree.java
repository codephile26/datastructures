package edu.ds.binarysearchtrees;

public class CheckIfValidBinarySearchTree {
	private static int prev = Integer.MIN_VALUE;
	
	public static boolean checkIfValidBSTInorder(BinarySearchTreeNode root){
		return isBST(root);
	}

	private static boolean isBST(BinarySearchTreeNode root) {
		if (root == null){
			return true;
		}
		if (!isBST(root.getLeft())){
			return false;
		}
		if (root.getData() < prev){
			return false;
		}
		prev = root.getData();
		return isBST(root.getRight());
	}

}
