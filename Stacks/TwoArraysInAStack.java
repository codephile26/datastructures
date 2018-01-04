package edu.ds.stacks;

public class TwoArraysInAStack {

	private int [] array;
	private int topOne;
	private int topTwo;
	
	public TwoArraysInAStack(int n) throws Exception {
		if (n<2){
			throw new Exception("Size of the array cannot be less than 2");
		}
		this.array = new int[n];
		topOne = -1;
		topTwo = array.length;
	}
	
	public void push(int stackId, int data) throws Exception{
		if (topTwo == topOne + 1){
			throw new Exception("Array is full");
		}
		if (stackId==1){
				topOne++;
				array[topOne] = data;
				return;
		}
		else if (stackId==2){
			topTwo--;
			array[topTwo] = data;
			return;
		}
		else {
			System.out.println("Invalid stack id");
		}
	}
	
	public int pop(int stackId){
		if (stackId == 1){
			if (topOne == -1){
				System.out.println("Stack " + stackId + " is empty");
				return -1;
			}
			int element = array[topOne];
			array[topOne] = Integer.MIN_VALUE;
			topOne--;
			return element;
		}
		else if (stackId == 2){
			if (topTwo == array.length){
				System.out.println("Stack " + stackId + " is empty");
				return -1;
			}
			int element = array[topTwo];
			array[topTwo] = Integer.MIN_VALUE;
			topTwo++;
			return element;
		}
		else {
			System.out.println("Invalid Stack Id");
			return -1;
		}
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getTopOne() {
		return topOne;
	}

	public void setTopOne(int topOne) {
		this.topOne = topOne;
	}

	public int getTopTwo() {
		return topTwo;
	}

	public void setTopTwo(int topTwo) {
		this.topTwo = topTwo;
	}

}
