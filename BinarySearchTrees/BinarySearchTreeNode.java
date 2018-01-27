package edu.ds.binarysearchtrees;

public class BinarySearchTreeNode {

	private int data;
	private BinarySearchTreeNode left;
	private BinarySearchTreeNode right;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BinarySearchTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}

	public BinarySearchTreeNode getRight() {
		return right;
	}

	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}

	public BinarySearchTreeNode find(BinarySearchTreeNode root, int data) {
		if (root == null) {
			return null;
		}
		if (data < root.getData()) {
			return find(root.getLeft(), data);
		} else if (data > root.getData()) {
			return find(root.getRight(), data);
		}
		return root;
	}

	public BinarySearchTreeNode findMinimum(BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		} else if (root.getLeft() == null) {
			return root;
		} else {
			return findMinimum(root.getLeft());
		}
	}

	public BinarySearchTreeNode findMaximum(BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		} else if (root.getRight() == null) {
			return root;
		} else {
			return findMaximum(root.getRight());
		}
	}

	public BinarySearchTreeNode insert(BinarySearchTreeNode root, int data) {
		if (root == null) {
			root = new BinarySearchTreeNode();
			root.setData(data);
			return root;
		}
		else {
			if (data < root.getData()){
				root.setLeft(insert(root.getLeft(),data));
			}
			else if (data > root.getData()){
				root.setLeft(insert(root.getRight(),data));
			}
		}
		return root;
	}
	
	public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data){
		BinarySearchTreeNode temp;
		if (root == null){
			System.out.println("Element is not here. Tree is empty");
			return null;
		}
		else if (data < root.getData()){
			root.setLeft(delete(root.getLeft(),data));
		}
		else if (data>root.getData()){
			root.setRight(delete(root.getRight(),data));
		}
		else {
			if (root.getLeft() != null && root.getRight() != null){
				temp = findMaximum(root);
				root.setData(data);
				root.setLeft(delete(root.getLeft(),root.getData()));
			}
			else {
				temp = root;
				if (root.getLeft() == null)
					root = root.getRight();
				if(root.getRight() == null)
					root = root.getLeft();
			}
		}
		
		return root;
	}

}
