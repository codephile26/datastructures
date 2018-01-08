package edu.ds.queues;

import static org.junit.Assert.*;

import org.junit.Test;

public class FixedSizeArrayQueueTest {

	@Test
	public void testQueue() throws Exception {
		FixedSizeArrayQueue queue = new FixedSizeArrayQueue(10);
		queue.enQueue(5);
		queue.enQueue(26);
		queue.enQueue(26);
		queue.enQueue(1);
		queue.enQueue(1);
		assertEquals(5, queue.getSize());
		queue.deQueue();
		queue.deQueue();
		assertEquals(3, queue.getSize());
		assertEquals(26, queue.front());
	}

}
