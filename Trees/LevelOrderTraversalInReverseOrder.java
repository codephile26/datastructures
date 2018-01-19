package edu.ds.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversalInReverseOrder {
	
	public static void reverseLevelOrderTraversal(BinaryTreeNode root){
		if (root == null){
			return ;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while (!q.isEmpty()){
			BinaryTreeNode temp = q.poll();
			stack.push(temp);
			if (temp.getLeft() != null){
				q.offer(temp.getLeft());
			}
			if (temp.getRight() != null){
				q.offer(temp.getRight());
			}
		}
		
		while(!stack.isEmpty()){
			BinaryTreeNode temp = stack.pop();
			System.out.print(temp.getData() + " ");
		}
	}

}
