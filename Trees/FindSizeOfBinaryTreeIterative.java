package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindSizeOfBinaryTreeIterative {
	
	public static int size(BinaryTreeNode root){
		if (root == null){
			return 0;
		}
		int count = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while (!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if (temp != null){
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
