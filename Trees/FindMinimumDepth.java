package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class FindMinimumDepth {
	
	public static int findMinimumDepthOfBinaryTree(BinaryTreeNode root){
		if (root == null){
			return 0;
		}
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		//we have encountered the first node on the shortest path, which is the root.
		int count = 1;
		while (!q.isEmpty()){
			BinaryTreeNode currentNode = q.poll();
			if (currentNode != null){	
				if (currentNode.getLeft() == null && currentNode.getRight() == null){
					return count;
				}
				if (currentNode.getLeft() != null){
					q.offer(currentNode.getLeft());
				}
				if (currentNode.getRight()!= null){
					q.offer(currentNode.getRight());
				}
			}
			else {
				if (!q.isEmpty()){
					count++;
					//adding null to mark the end of a traversal.
					q.offer(null);
				}
			}
		}
		return count;
	}

}
