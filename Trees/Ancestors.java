package edu.ds.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ancestors {
	
	public static boolean printAncestorsOfANode(BinaryTreeNode node, int target){
		if (node == null){
			return false;
		}
		if (node.getData() == target){
			return true;
		}
		if (printAncestorsOfANode(node.getLeft(), target) || printAncestorsOfANode(node.getRight(), target)){
			System.out.print(node.getData() + " ");
			return true;
		}
		return false;
	}
	
	/**
	 * In this method we are finding the LCA of two nodes n1 and n2.
	 * This method uses path traversal approach.
	 * Here we traverse the nodes from node to root and then put them in a list.
	 * We then check the list and then return the node which is equal in both the paths.
	 * 
	 * @param root
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static int findLowestCommonAncestor(BinaryTreeNode root, int n1, int n2 ){
		if (root == null){
			return -1;
		}
		return findLCAInternal(root,n1,n2);
		
	}	
		private static int findLCAInternal(BinaryTreeNode root, int n1, int n2) {
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			
			if (!findPath(root,n1,list1) || !findPath(root,n2,list2)){
				System.out.println((list1.size()> 0)?"n1 is present":"n1 is missing");
				System.out.println((list1.size()> 0)?"n2 is present":"n2 is missing");
				return -1;
			}
			
			int i;
			for (i = 0; i<list1.size() && i<list2.size();i++){
				if (!list1.get(i).equals(list2.get(i))){
					break;
				}
			}
			
			return list1.get(i-1);
	}
		
	

	private static boolean findPath(BinaryTreeNode root, int n1, List<Integer> list){
		
		if (root == null){
			return false;
		}
		
		list.add(root.getData());
		
		if (root.getData() == n1){
			return true;
		}
		
		if (root.getLeft() != null && findPath(root.getLeft(),n1,list)){
			return true;
		}
		
		if (root.getRight() != null && findPath(root.getRight(), n1, list)){
			return true;
		}
		
		//if the element is not found in left subtree/right subtree then the last element added to the list is removed and we go the parent by returning false to the parent stack.
		//this is backtracking approach.
		list.remove(list.size() - 1);
		
		return false;
		
	}

}
