package edu.ds.binarysearchtrees;

import java.util.Stack;

public class UnionIntersectionBST {
	
	public static void printCommonNodes(BinarySearchTreeNode node1, BinarySearchTreeNode node2){
		if (node1 == null){
			System.out.println("BST 1 is empty");
		}
		if (node2==null){
			System.out.println("BST 2 is empty");
		}
		
		Stack<BinarySearchTreeNode> s1 = new Stack<BinarySearchTreeNode>();
		Stack<BinarySearchTreeNode> s2 = new Stack<BinarySearchTreeNode>();
		
		while(true){
			if (node1 != null){
				s1.push(node1);
				node1 = node1.getLeft();
			}
			else if (node2 != null){
				s2.push(node2);
				node2 = node2.getLeft();
			}
			else if (!s1.isEmpty() && !s2.isEmpty()){
				node1 = s1.peek();
				node2 = s2.peek();
				
				if (node1.getData() == node2.getData()){
					System.out.print(node1.getData() + " ");
					
					s1.pop();
					s2.pop();
					
					node1 = node1.getRight();
					node2 = node2.getRight();
				}
				
				else if (node1.getData() < node2.getData()){
					s1.pop();
					node1 = node1.getRight();
					node2 = null;
				}
				else if (node1.getData() > node2.getData()){
					s2.pop();
					node2 = node2.getRight();
					node1 = null;
				}
			}
			else {
				break;
			}
		}
	}
	
	public static void main(String...ar){
		BinarySearchTreeNode root1 = createTree1();
		BinarySearchTreeNode root2 = createTree2();
		
	    System.out.println("Common nodes:");
	    printCommonNodes(root1, root2);
	}

	private static BinarySearchTreeNode createTree1() {
		BinarySearchTreeNode root = new BinarySearchTreeNode();
		root.setData(4);
		BinarySearchTreeNode left = new BinarySearchTreeNode();
		left.setData(2);
		BinarySearchTreeNode right = new BinarySearchTreeNode();
		right.setData(8);
		root.setLeft(left);
		root.setRight(right);
		
		BinarySearchTreeNode left1 = new BinarySearchTreeNode();
		left1.setData(1);
		BinarySearchTreeNode right1 = new BinarySearchTreeNode();
		right1.setData(3);
		left.setLeft(left1);
		left.setRight(right1);
		
//		BinarySearchTreeNode left2 = new BinarySearchTreeNode();
//		left2.setData(5);
//		BinarySearchTreeNode right2 = new BinarySearchTreeNode();
//		right2.setData(9);
//		right.setLeft(left2);
//		right.setRight(right2);
		
		//create right child of left 2
//		BinarySearchTreeNode left3 = new BinarySearchTreeNode();
//		left3.setData(7);
//		left2.setRight(left3);
		return root;
	}
	
	private static BinarySearchTreeNode createTree2() {
		BinarySearchTreeNode root = new BinarySearchTreeNode();
		root.setData(4);
		BinarySearchTreeNode left = new BinarySearchTreeNode();
		left.setData(2);
		BinarySearchTreeNode right = new BinarySearchTreeNode();
		right.setData(8);
		root.setLeft(left);
		root.setRight(right);
		
		BinarySearchTreeNode left1 = new BinarySearchTreeNode();
		left1.setData(1);
		BinarySearchTreeNode right1 = new BinarySearchTreeNode();
		right1.setData(3);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinarySearchTreeNode left2 = new BinarySearchTreeNode();
		left2.setData(5);
		BinarySearchTreeNode right2 = new BinarySearchTreeNode();
		right2.setData(9);
		right.setLeft(left2);
		right.setRight(right2);
		
		//create right child of left 2
		BinarySearchTreeNode left3 = new BinarySearchTreeNode();
		left3.setData(7);
		left2.setRight(left3);
		return root;
	}
}
