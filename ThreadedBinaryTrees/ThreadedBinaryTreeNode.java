package edu.ds.threadedbinarytrees;

public class ThreadedBinaryTreeNode {
	
	private ThreadedBinaryTreeNode leftChild;
	private int lTag;
	private int data;
	private int rTag;
	private ThreadedBinaryTreeNode rightChild;
	public ThreadedBinaryTreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(ThreadedBinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public int getlTag() {
		return lTag;
	}
	public void setlTag(int lTag) {
		this.lTag = lTag;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getrTag() {
		return rTag;
	}
	public void setrTag(int rTag) {
		this.rTag = rTag;
	}
	public ThreadedBinaryTreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(ThreadedBinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
}
