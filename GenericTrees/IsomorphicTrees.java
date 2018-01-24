package edu.ds.generictrees;

public class IsomorphicTrees {
	
	public static boolean isIsomorphic(GenericTreeNode root1, GenericTreeNode root2){
		if (root1 == null && root2==null){
			return true;
		}
		if ((root1==null && root2 != null) || (root1 != null && root2 == null)){
			return false;
		}
		return (isIsomorphic(root1.getFirstChild(), root2.getFirstChild()) && isIsomorphic(root1.getNextSibling(),root2.getNextSibling()));
	}

}
