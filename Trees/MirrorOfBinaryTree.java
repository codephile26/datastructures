package edu.ds.trees;

public class MirrorOfBinaryTree {
	
	public static BinaryTreeNode mirrorOfBinaryTree(BinaryTreeNode root){
		BinaryTreeNode temp = null;
		if (root != null){
			mirrorOfBinaryTree(root.getLeft());
			mirrorOfBinaryTree(root.getRight());
			temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
		}
		return root;
	}
	
	public static boolean areMirrors(BinaryTreeNode root1, BinaryTreeNode root2){
		if (root1 == null && root2 == null){
			return true;
		}
		if (root1 == null || root2 == null){
			return false;
		}
		if (root1.getData() != root2.getData()){
			return false;
		}
		else return (areMirrors(root1.getLeft(),root2.getRight()) && areMirrors(root1.getRight(),root2.getLeft()));
	}

}
