package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfFullAndHalfNodesInBinaryTree {
	
	public static int findNumberOfFullNodesInBinaryTree(BinaryTreeNode root){
		if (root == null){
			return 0;
		}
		int count = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while (!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if (temp.getLeft() != null && temp.getRight() != null){
				count++;
			}
			if (temp.getLeft() != null){
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null){
				q.offer(temp.getRight());
			}
		}
		return count;
	}
	
	public static int findNumberOfHalfNodes(BinaryTreeNode root){
		if (root == null){
			return 0;
		}
		int count = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while (!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if ((temp.getLeft()!=null && temp.getRight() == null) || (temp.getLeft()!= null && temp.getRight() == null)){
				count++;
			}
			
			if (temp.getLeft() != null){
				q.offer(temp.getLeft());
			}
			
			if (temp.getRight() != null){
				q.offer(temp.getRight());
			}
		}
		return count;
	}
}
