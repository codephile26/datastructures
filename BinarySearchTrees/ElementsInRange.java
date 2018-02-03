package edu.ds.binarysearchtrees;

public class ElementsInRange {
	
	public static void printElementsInRangeK1AndK2(BinarySearchTreeNode root, int k1, int k2){
		if (root == null){
			return;
		}
		
		if (k1 < root.getData()){
			printElementsInRangeK1AndK2(root.getLeft(), k1, k2);
		}
		
		if (k1 < root.getData() && k2 > root.getData()){
			System.out.print(root.getData());
		}
		
		if (k2 > root.getData()){
			printElementsInRangeK1AndK2(root.getRight(), k1, k2);
		}
		
	}
	
	public static void main(String...ar){
		BinarySearchTreeNode node = new BinarySearchTreeNode();
		int k1 = 10, k2 = 25;
		node.setData(20);
		node.setLeft(new BinarySearchTreeNode(8));
		node.setRight(new BinarySearchTreeNode(22));
		node.getLeft().setLeft(new BinarySearchTreeNode(4));
		node.getLeft().setRight(new BinarySearchTreeNode(12));
		
		printElementsInRangeK1AndK2(node,k1,k2);
	}

}
