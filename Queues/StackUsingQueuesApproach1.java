package edu.ds.queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuesApproach1 {
	
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	private int top;
	
	public void push(int x){
		q1.add(x);
		top = x;
	}
	
	public int pop(){
		while (q1.size()>1){
			top = q1.remove();
			q2.add(top);
		}
		int element = q1.remove();
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		return element;
	}
}
