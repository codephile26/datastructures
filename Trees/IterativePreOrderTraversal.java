package edu.ds.trees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePreOrderTraversal {
	
	public static ArrayList<Integer> preOrderTraversal(BinaryTreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null){
			return list;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		while (!stack.isEmpty()){
			BinaryTreeNode temp = stack.pop();
			list.add(temp.getData());
			if (temp.getRight() != null){
				stack.push(temp.getRight());
			}
			if (temp.getLeft() != null){
				stack.push(temp.getLeft());
			}
		}
		return list;
		
	}
}
