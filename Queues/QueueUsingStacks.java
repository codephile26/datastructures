package edu.ds.queues;

import java.util.Stack;

public class QueueUsingStacks {
	
	protected Stack<Integer> stack1 = new Stack<Integer>();
	protected Stack<Integer> stack2 = new Stack<Integer>();
	
	public void enQueue(int element){
		stack1.push(element);
	}
	
	public int deQueue(){
		if (stack2.isEmpty()){
			while (!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
	
}
