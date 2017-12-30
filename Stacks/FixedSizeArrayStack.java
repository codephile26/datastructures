package edu.ds.stacks;

public class FixedSizeArrayStack {

	private int[] array;
	private int top = -1; // initialize top as -1 as the stack is empty right
							// now
	public static final int CAPACITY = 50;
	private int capacity;

	public FixedSizeArrayStack() {
		this(CAPACITY);
	}

	public FixedSizeArrayStack(int capacity) {
		super();
		this.capacity = capacity;
		array = new int[capacity];
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getTop() throws Exception {
		if (isEmpty()){
			throw new Exception("Stack is Empty");
		}
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static int getMaxCapacity() {
		return CAPACITY;
	}

	// Main stack operations - push an element onto the stack and pop an element
	// from a stack

	public int getSize() {
		return (top + 1);
	}

	public void push(int element) throws Exception {
		if ((this.getSize()) >= this.getCapacity()) {
			throw new Exception();
		}
		else {
			top = top + 1;
			array[top] = element;
			return;
		}
	}
	
	public int pop() throws Exception{
		if (this.getSize() == 0){
			throw new Exception("Stack is Empty");
		}
		else {
			int lastElement = array[top];
			array[top] = Integer.MIN_VALUE;
			top = top - 1;
			return lastElement;
		}
	}
	
	public boolean isEmpty(){
		return (top < 0);
	}
	
	public String toString(){
		String s = "[";
		if (getSize() > 0){
			s = s + array[0];
		}
		if (getSize() > 1){
			for (int i = 1; i<getSize();i++){
				s+=","+array[i];
			}
		}
		return s +"]";
	}
}
