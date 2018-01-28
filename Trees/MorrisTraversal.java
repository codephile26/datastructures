package edu.ds.trees;

public class MorrisTraversal {
	
	public static void morrisInorderTraversal(BinaryTreeNode root){
		if (root == null){
			return;
		}
		
		BinaryTreeNode current, pre;
		
		current = root;
		
		while (current != null){
			if (current.getLeft() == null){
				System.out.print(current.getData() + " ");
				current = current.getRight();
			}
			else {
				//Find inorder predecessor
				pre = current.getLeft();
				
				//find rightmost child of left subtree
				while (pre.getRight() != null && pre.getRight() != current){
					pre = pre.getRight();
				}
				
				//pre - rightmost leaf node
				//make it point to current root node
				if (pre.getRight() == null){
					pre.setRight(current);
					//go to next left subtree
					current = current.getLeft();
				}
				else {
					//tree is already threaded - remove the thread.
					pre.setRight(null);
					System.out.print(current.getData() + " ");
					current = current.getRight();
				}
			}
		}
	}
	
	
	public static void morrisPreorderTraversal(BinaryTreeNode root){
		if (root == null){
			return;
		}
		BinaryTreeNode current, pre;
		current = root;
		
		while (current != null){
			if (current.getLeft() == null){
				System.out.print(current.getData() + " ");
				current = current.getRight();
			}
			else {
				//Find inorder predecessor
				pre = current.getLeft();
				
				while (pre.getRight() != null && pre.getRight() != current){
					pre = pre.getRight();
				}
				
				if (pre.getRight() == current){
					pre.setRight(null);
					current = current.getRight();
				}
				
				else {
					System.out.print(current.getData() + " ");
					pre.setRight(current);
					current = current.getLeft();
				}
			}
		}
	}
	
	public static void main(String...ar){
		BinaryTreeNode root = new BinaryTreeNode();
		root.setData(5);
		BinaryTreeNode left = new BinaryTreeNode();
		left.setData(10);
		BinaryTreeNode right = new BinaryTreeNode();
		right.setData(15);
		root.setLeft(left);
		root.setRight(right);
		
		BinaryTreeNode left1 = new BinaryTreeNode();
		left1.setData(12);
		BinaryTreeNode right1 = new BinaryTreeNode();
		right1.setData(14);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinaryTreeNode left2 = new BinaryTreeNode();
		left2.setData(16);
		BinaryTreeNode right2 = new BinaryTreeNode();
		right2.setData(18);
		right.setLeft(left2);
		right.setRight(right2);
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(root);
		morrisInorderTraversal(binaryTree.getRoot());
		System.out.println();
		morrisPreorderTraversal(binaryTree.getRoot());
	}
	
}
