package edu.ds.trees;

public class LeastCommonAncestor {
	
	static BinaryTreeNode root;
	
	
	
	public static BinaryTreeNode findLCA(int n1, int n2){
		return findLCA(root, n1, n2);
	}



	private static BinaryTreeNode findLCA(BinaryTreeNode node, int n1, int n2) {
		if (node == null){
			return null;
		}
		
		if (node.getData()== n1 || node.getData() == n2 ){
			return node;
		}
		
		BinaryTreeNode leftLCA = findLCA(node.getLeft(), n1 ,n2);
		BinaryTreeNode rightLCA = findLCA(node.getRight(), n1 ,n2);
		
		if (leftLCA != null && rightLCA != null){
			return node;
		}
		
		return (leftLCA!=null? leftLCA:rightLCA);
		
	}

}
