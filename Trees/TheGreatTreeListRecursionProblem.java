package edu.ds.trees;


public class TheGreatTreeListRecursionProblem {

	public static BinaryTreeNode convertBTToCircularDLL(BinaryTreeNode root){
		if (root == null){
			return null;
		}
		
		BinaryTreeNode left = convertBTToCircularDLL(root.getLeft());
		BinaryTreeNode right = convertBTToCircularDLL(root.getRight());
		
		root.setLeft(root);
		root.setRight(root);
		
		return concatenate(concatenate(left,root),right);
	}

	private static BinaryTreeNode concatenate(BinaryTreeNode left, BinaryTreeNode right) {
		if (left == null){
			return right;
		}
		if (right == null){
			return left;
		}
		
		BinaryTreeNode leftLast = left.getLeft();
		BinaryTreeNode rightLast = right.getLeft();
		
		leftLast.setRight(right);
		right.setLeft(leftLast);
		
		left.setLeft(rightLast);
		rightLast.setRight(left);
		
		return left;
	}
	
	public static void displayCircularLinkedList(BinaryTreeNode head){
		System.out.println("Circular linked list is");
		BinaryTreeNode itr = head;
		do {
			System.out.print(itr.getData() + " ");
			itr = itr.getRight();
		}
		while (itr != head);
		System.out.println();
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
		
		BinaryTreeNode cllhead = convertBTToCircularDLL(root);
		displayCircularLinkedList(cllhead);
	}
}
