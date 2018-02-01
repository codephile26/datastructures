package edu.ds.binarysearchtrees;

public class FloorAndCeilingInBST {
	
	//returns smallest integer from the BST which is greater than the input value
	public static int ceiling(BinarySearchTreeNode root, int input){
		if (root == null){
			return Integer.MIN_VALUE;
		}
		
		if (input == root.getData()){
			return root.getData();
		}
		
		if (input > root.getData()){
			return ceiling(root.getRight(), input);
		}
		
		int ceil = ceiling(root.getLeft(), input);
		return (ceil >=input)? ceil : root.getData();
	}
	
//	//returns largest integer from the BST which is smaller than the input value
//	public static int floor(BinarySearchTreeNode root, int input){
//		if (root == null){
//			return Integer.MIN_VALUE;
//		}
//		
//		if (input == root.getData()){
//			return root.getData();
//		}
//		
//		
//		if (input > root.getData()){
//			return ceiling(root.getLeft(), input);
//		}
//		
//		int ceil = ceiling(root.getRight(), input);
//		return (ceil >=input)? ceil : root.getData();
//	}
	
	public static BinarySearchTreeNode floor(BinarySearchTreeNode root, int input){
		BinarySearchTreeNode prev = null;
		return floor(root, prev, input);
	}

	private static BinarySearchTreeNode floor(BinarySearchTreeNode root, BinarySearchTreeNode prev, int input) {
		if (root == null){
			return null;
		}
		if (floor(root.getLeft(),prev, input) == null){
			return null;
		}
		if (root.getData() == input){
			return root;
		}
		if (root.getData() > input){
			return prev;
		}
		prev = root;
		return floor(root.getRight(),prev,input);
	}

}
