package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class InsertInBinaryTree {
	
	public static BinaryTreeNode insertInBinaryTree(BinaryTreeNode root, int data){
		if (root == null){
			root = new BinaryTreeNode(data);
			return root;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()){
			BinaryTreeNode temp = queue.poll();
			if (temp != null){
				if (temp.getLeft() != null){
					queue.offer(temp.getLeft());
				}
				else {
					BinaryTreeNode newNode = new BinaryTreeNode(data);
					temp.setLeft(newNode);
					return root;
				}
				if (temp.getRight() != null){
					queue.offer(temp.getRight());
				}
				else {
					BinaryTreeNode newNode = new BinaryTreeNode(data);
					temp.setRight(newNode);
					return root;
				}
			}
		}
		return root;
	}

}
