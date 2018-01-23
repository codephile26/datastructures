package edu.ds.trees;

import java.util.Stack;

public class ZigZagTreeTraversal {
	
	public static void zigZagTreeTraverse(BinaryTreeNode root){
		if (root == null){
			return;
		}
		
		Stack<BinaryTreeNode> currentLevel = new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> nextLevel = new Stack<BinaryTreeNode>();
		
		currentLevel.push(root);
		boolean leftToRight = true;
		
		while (!currentLevel.isEmpty()){
			BinaryTreeNode temp = currentLevel.pop();
			
			if (temp != null){
				System.out.println(temp.getData());
				
				if (leftToRight){
					if (temp.getLeft() != null){
						nextLevel.push(temp.getLeft());
					}
					if (temp.getRight() != null){
						nextLevel.push(temp.getRight());
					}
				}
				else {
					if (temp.getRight() != null){
						nextLevel.push(temp.getRight());
					}
					if (temp.getLeft() != null){
						nextLevel.push(temp.getLeft());
					}
				}
			}
			
			if (currentLevel.isEmpty()){
				leftToRight = !leftToRight;
				Stack<BinaryTreeNode> temporaryStack = currentLevel;
				currentLevel = nextLevel;
				nextLevel = temporaryStack;
			}
		}
	}

	private static void swap(Stack<BinaryTreeNode> currentLevel, Stack<BinaryTreeNode> nextLevel) {
		Stack<BinaryTreeNode> temp = currentLevel;
		currentLevel = nextLevel;
		nextLevel = temp;
	}
	
	public static void main(String...ar){
		BinaryTreeNode root = new BinaryTreeNode();
		root.setData(5);
		BinaryTreeNode left = new BinaryTreeNode();
		left.setData(10);
		BinaryTreeNode right = new BinaryTreeNode();
		right.setData(15);
		root.setLeft(left);
		root.setRight(right);
		
		BinaryTreeNode left1 = new BinaryTreeNode();
		left1.setData(12);
		BinaryTreeNode right1 = new BinaryTreeNode();
		right1.setData(14);
		left.setLeft(left1);
		left.setRight(right1);
		
		BinaryTreeNode left2 = new BinaryTreeNode();
		left2.setData(16);
		BinaryTreeNode right2 = new BinaryTreeNode();
		right2.setData(18);
		right.setLeft(left2);
		right.setRight(right2);
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setRoot(root);
		zigZagTreeTraverse(root);
	}
}
