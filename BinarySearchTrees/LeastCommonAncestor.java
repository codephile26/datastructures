package edu.ds.binarysearchtrees;

public class LeastCommonAncestor {
	
	
	public static BinarySearchTreeNode findLeastCommonAncestor(BinarySearchTreeNode root, int n1, int n2){
		
		if (root == null){
			return null;
		}
		
		if (n1 < root.getData() && n2 < root.getData()){
			return findLeastCommonAncestor(root.getLeft(), n1, n2);
		}
		
		if (n1 > root.getData() && n2 > root.getData()){
			return findLeastCommonAncestor(root.getRight(), n1, n2);
		}
		
		return root;
	}

}
