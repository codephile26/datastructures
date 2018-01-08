package edu.ds.queues;

public class FixedSizeArrayQueue {
	;

	private int front, rear, size;
	private int[] array;
	private int capacity;

	public FixedSizeArrayQueue(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
		this.size = this.front = this.rear = 0;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// method to insert an element into the queue
	public void enQueue(int element) throws Exception {
		if (this.size == this.capacity) {
			throw new Exception("Queue is full");
		}
		this.rear = (rear + 1) % this.capacity;
		this.size += 1;
		array[rear] = element;
	}

	public int deQueue() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is empty");
		}
		int item = array[front];
		front = (front + 1) % capacity;
		size -= 1;
		return item;
	}

	public int front() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is empty");
		}
		return array[front];
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}
	
	public String toString(){
		String result = "[";
		for (int i = 0; i<size;i++){
			result += Integer.toString(array[(front+i)%capacity]);
			if (i<size - 1){
				result +=",";
			}
		}
		result +="]";
		return result;
	}

}
