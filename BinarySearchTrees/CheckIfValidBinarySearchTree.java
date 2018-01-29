package edu.ds.binarysearchtrees;

public class CheckIfValidBinarySearchTree {
	private static int prev = Integer.MIN_VALUE;

	public static boolean checkIfValidBSTInorder(BinarySearchTreeNode root) {
		return checkIfValidBST(root);
	}

	private static boolean checkIfValidBST(BinarySearchTreeNode root) {
		if (root == null) {
			return true;
		}
		if (!checkIfValidBST(root.getLeft())) {
			return false;
		}
		if (root.getData() < prev) {
			return false;
		}
		prev = root.getData();
		return checkIfValidBST(root.getRight());
	}

	public static boolean checkIfValidBST(BinarySearchTreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}

		return ((root.getData() > min && root.getData() < max) && checkIfValidBST(root.getLeft(), min, root.getData())
				&& checkIfValidBST(root.getRight(), root.getData(), max));
	}
	
	public static boolean checkIfValidBSTMaxMin(BinarySearchTreeNode root){
		if (root == null){
			return true;
		}
		
		if (root.getLeft() != null && findMaximum(root.getLeft()).getData() > root.getData()){
			return false;
		}
		
		if (root.getRight() != null && findMinimum(root.getRight()).getData() < root.getData()){
			return false;
		}
		
		if (!checkIfValidBSTMaxMin(root.getLeft()) || !checkIfValidBSTMaxMin(root.getRight())){
			return false;
		}
		
		return true;
	}
	
	public static BinarySearchTreeNode findMinimum(BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		} else if (root.getLeft() == null) {
			return root;
		} else {
			return findMinimum(root.getLeft());
		}
	}

	public static BinarySearchTreeNode findMaximum(BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		} else if (root.getRight() == null) {
			return root;
		} else {
			return findMaximum(root.getRight());
		}
	}

}
