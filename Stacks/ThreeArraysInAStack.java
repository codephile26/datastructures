package edu.ds.stacks;

public class ThreeArraysInAStack {
	private int [] dataArray;
	private int size,topOne,topTwo,baseMiddle,topMiddle;
	
	public ThreeArraysInAStack(int size) throws Exception {
		if (size < 3){
			throw new Exception("Size less than three is not permitted");
		}
		this.size = size;
		this.dataArray = new int[size];
		this.topOne = -1;
		this.baseMiddle = size/2;
		this.topMiddle = this.baseMiddle;
		this.topTwo = size;
	}
	
	public void push(int stackId, int data) throws Exception{
		if (stackId == 1){
			if (baseMiddle == topOne + 1){
				if (isMiddleStackRightShiftable()){
					shiftMiddleStackToRight();
					topOne++;
					dataArray[topOne] = data;
					return;
				}else {
					throw new Exception("Stack " + stackId + " has reached maximum limit");
				}
			}
			else {
				topOne++;
				dataArray[topOne] = data;
				return;
			}
		}
		else if (stackId == 2){
			if (topTwo==topMiddle+1){
				if(isMiddleStackLeftShiftable()){
					shiftMiddleStackToLeft();
					topMiddle++;
					dataArray[topMiddle] = data;
					return;
				}
				else {
					throw new Exception("Stack " + stackId + " has reached maximum limit");
				}
			}
			else {
				if (baseMiddle == topMiddle){
					dataArray[topMiddle] = data;
				}
				else {
					++topMiddle;
					dataArray[topMiddle] = data;
					return;
				}
				
			}
		}
		else if (stackId == 3){
			if (topTwo == topMiddle+1){
				if (isMiddleStackLeftShiftable()){
					shiftMiddleStackToLeft();
					topTwo--;
					dataArray[topTwo] = data;
					return;
				}
				else {
					throw new Exception("Stack " + stackId + " has reached maximum limit");
				}
			}
			else {
				topTwo--;
				dataArray[topTwo] = data;
				return;
			}
		}
		else {
			System.out.println("Invalid Stack Id");
		}
	}

	private void shiftMiddleStackToLeft() {
		for (int i = baseMiddle -1; i <= topMiddle-1;i++){
			dataArray[i] = dataArray[i+1];
		}
		baseMiddle--;
		dataArray[topMiddle] = Integer.MIN_VALUE;
		topMiddle--;
	}

	private void shiftMiddleStackToRight() {
		for (int i = topMiddle+1; i >= baseMiddle + 1;i--){
			dataArray[i] = dataArray[i-1];
		}
		dataArray[baseMiddle] = Integer.MIN_VALUE;
		baseMiddle++;
		topMiddle++;
		
	}

	private boolean isMiddleStackRightShiftable() {
		if (topOne+1<baseMiddle){
			return true;
		}
		return false;
	}
	
	private boolean isMiddleStackLeftShiftable() {
		if (topMiddle+1<topTwo){
			return true;
		}
		return false;
	}
	
	public int pop(int stackId) throws Exception{
		if (stackId==1){
			if (topOne == -1){
				throw new Exception("Stack " + stackId + " is empty");
			}
			int element = dataArray[topOne];
			dataArray[topOne] = Integer.MIN_VALUE;
			topOne--;
			return element;
		}
		if (stackId==2){
			if (topMiddle == baseMiddle){
				throw new Exception("Stack " + stackId + " is empty");
			}
			int element = dataArray[topMiddle];
			dataArray[topMiddle] = Integer.MIN_VALUE;
			topMiddle--;
			return element;
		}
		if (stackId==3){
			if (topTwo == size){
				throw new Exception("Stack " + stackId + " is empty");
			}
			int element = dataArray[topTwo];
			dataArray[topTwo] = Integer.MIN_VALUE;
			topTwo++;
			return element;
		}
		return -1;
	}

	public int[] getDataArray() {
		return dataArray;
	}

	public void setDataArray(int[] dataArray) {
		this.dataArray = dataArray;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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

	public int getBaseMiddle() {
		return baseMiddle;
	}

	public void setBaseMiddle(int baseMiddle) {
		this.baseMiddle = baseMiddle;
	}

	public int getTopMiddle() {
		return topMiddle;
	}

	public void setTopMiddle(int topMiddle) {
		this.topMiddle = topMiddle;
	}
	
}
