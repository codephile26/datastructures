package edu.ds.trees;

public class BinaryTree {
	
	private BinaryTreeNode root;

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	public BinaryTree() {
		this.root = null;
	}
	
	
	public void preOrder(BinaryTreeNode root){
		if (root!=null){
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	
	public void postOrder(BinaryTreeNode root){
		if (root!=null){
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.println(root.getData());
		}
	}
	
	public void inOrder(BinaryTreeNode root){
		if (root==null){
			return;
		} else {
			inOrder(root.getLeft());
			System.out.println(root.getData());
			inOrder(root.getRight());
		}
	}
	

}
