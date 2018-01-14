package edu.ds.trees;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeInorderTraversal {

	public static ArrayList<Integer> iterativeInorderTraversal(BinaryTreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null){
			return list;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode currentNode = root;
		boolean done = false;
		while (!done) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				if (stack.isEmpty()) {
					done = true;
				} else {
					currentNode = stack.pop();
					list.add(currentNode.getData());
					currentNode = currentNode.getRight();
				}
			}
		}
		return list;
	}

}
