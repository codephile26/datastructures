package edu.ds.binarysearchtrees;

public class SortedArrayToBinarySearchTree {
	
	public static BinarySearchTreeNode buildBST(int A[], int start,int end){
		BinarySearchTreeNode newNode;
		if (start>end){
			return null;
		}
		newNode = new BinarySearchTreeNode();
		if (start == end){
			newNode.setData(A[start]);
			//left and right child of this node are null by default
		}
		else {
			int mid = (start + (end-start))/2;
			newNode.setData(A[mid]);
			newNode.setLeft(buildBST(A,start,mid-1));
			newNode.setRight(buildBST(A,mid + 1,end));
		}
		return newNode;
	}
	
	
	public static void main(String...ar){
		int A[] = {1,2,3,4,5,6,7,8,9};
		BinarySearchTreeNode root = buildBST(A, 0, A.length - 1);
		root.inOrder(root);
	}
}
