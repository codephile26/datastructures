package edu.ds.generictrees;

public class FindSumGenericTree {
	
	public int findSum(GenericTreeNode root){
		if (root == null){
			return 0;
		}
		
		return root.getData() + findSum(root.getFirstChild()) + findSum(root.getNextSibling());
	}

}
