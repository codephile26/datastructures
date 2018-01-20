package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWithMaximumSum {
	
	public static int findTheLevelWithMaximumSum(BinaryTreeNode root){
		if (root == null){
			return 0;
		}
		int currentSum = 0, maximumSum = 0;
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		while (!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			if (temp != null){
				currentSum = currentSum + temp.getData();
				
				if (temp.getLeft() != null){
					q.offer(temp.getLeft());
				}
				
				if (temp.getRight() != null){
					q.offer(temp.getRight());
				}
			}
			else {
				if (currentSum>maximumSum){
					maximumSum = currentSum;
				}
				currentSum = 0;
				if (!q.isEmpty()){
					q.offer(null);
				}
			}
		}
		return maximumSum;
	}

}
