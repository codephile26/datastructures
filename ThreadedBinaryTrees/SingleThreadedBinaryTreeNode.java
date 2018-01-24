package edu.ds.threadedbinarytrees;

public class SingleThreadedBinaryTreeNode {
	
	private int data;
	private SingleThreadedBinaryTreeNode left;
	private SingleThreadedBinaryTreeNode right;
	private boolean rightThread;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SingleThreadedBinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(SingleThreadedBinaryTreeNode left) {
		this.left = left;
	}

	public SingleThreadedBinaryTreeNode getRight() {
		return right;
	}

	public void setRight(SingleThreadedBinaryTreeNode right) {
		this.right = right;
	}

	public boolean isRightThread() {
		return rightThread;
	}

	public void setRightThread(boolean rightThread) {
		this.rightThread = rightThread;
	}

	public SingleThreadedBinaryTreeNode leftMost(SingleThreadedBinaryTreeNode root){
		if (root == null){
			return null;
		}
		SingleThreadedBinaryTreeNode current = null;
		while(current.getLeft() != null){
			current = current.getLeft();
		}
		return current;
	}
	
	public void inOrder(SingleThreadedBinaryTreeNode root){
		if (root == null){
			return;
		}
		
		SingleThreadedBinaryTreeNode current = leftMost(root);
		
		while (current != null){
			System.out.println(current.getData());
			
			if(current.isRightThread()){
				current = current.getRight();
			}
			else {
				current = leftMost(current.getRight());
			}
		}
	}

}
