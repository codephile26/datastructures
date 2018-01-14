package edu.ds.trees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativePostOrderTraversal {
	
	public static ArrayList<Integer> iterativePostOrderTraversal(BinaryTreeNode root){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null){
			return list;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		BinaryTreeNode prev = null;
		while (!stack.isEmpty()){
			BinaryTreeNode curr = stack.peek();
			if (prev == null || prev.getLeft() == curr || prev.getRight() == curr){
				if (curr.getLeft() != null){
					stack.push(curr.getLeft());
				}
				else if (curr.getRight() != null){
					stack.push(curr.getRight());
				}
			}
			else if (curr.getLeft() == prev){
				if (curr.getRight() != null){
					stack.push(curr.getRight());
				}
			}
			else {
				list.add(curr.getData());
				stack.pop();
			}
			prev = curr;
		}
		return list;
	}
	
}
