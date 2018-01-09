package edu.ds.queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
	private Queue<Integer> q1 = new LinkedList<>();
	
	public void push(int element){
		q1.add(element);
		int sz = q1.size();
		while (q1.size()>1){
			q1.add(q1.remove());
			sz--;
		}
	}
}
