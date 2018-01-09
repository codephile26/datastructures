package edu.ds.queues;

import java.util.Stack;

public class ReverseQueue {
	
	public static FixedSizeArrayQueue reverseQueue(FixedSizeArrayQueue queue) throws Exception{
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()){
			stack.push(queue.deQueue());
		}
		while (!stack.isEmpty()){
			queue.enQueue(stack.pop());
		}
		return queue;
	}

}
