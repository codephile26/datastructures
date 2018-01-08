package edu.ds.queues;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedQueueTest {

	@Test
	public void test() throws Exception {
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		assertEquals(4, queue.size());
		assertEquals(5,queue.front());
		queue.dequeue();
		assertEquals(3, queue.size());
		assertEquals(10, queue.front());
	}
}
