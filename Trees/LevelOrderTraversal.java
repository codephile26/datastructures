package edu.ds.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static ArrayList<ArrayList<Integer>> levelOrderTraversal(BinaryTreeNode root) {
		if (root == null) {
			return null;
		}
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		queue.offer(null);
		ArrayList<Integer> curr = new ArrayList<Integer>();
		while (!queue.isEmpty()) {
			BinaryTreeNode temp = queue.poll();
			if (temp != null){
				curr.add(temp.getData());
				if (temp.getLeft() != null){
					queue.offer(temp.getLeft());
				}
				if (temp.getRight() != null){
					queue.offer(temp.getRight());
				}
			}
			else {
				ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
				res.add(c_curr);
				curr.clear();
				if (!queue.isEmpty())
					queue.offer(null);
			}
		}
		return res;
	}
}
