package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindInBinaryTree {
	
	public static boolean findElementInBinaryTree(BinaryTreeNode root, int data){
		if (root == null){
			return false;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while (!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
				if (temp.getData() == data){
					return true;
				}
				if (temp.getLeft() != null){
					q.offer(temp.getLeft());
				}
				if (temp.getRight() != null){
					q.offer(temp.getRight());
				}
		}
		return false;
	}

}
