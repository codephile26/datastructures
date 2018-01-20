package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindDeepestNodeInBinaryTree {
	
	public static BinaryTreeNode findDeepestNode(BinaryTreeNode root){
		if (root == null){
			return null;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		BinaryTreeNode temp = null;
		while (!q.isEmpty()){
			 temp = q.poll();
			if (temp.getLeft()!= null){
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null){
				q.offer(temp.getRight());
			}
		}
		return temp;
	}

}
