package edu.ds.queues;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseQueueTest {

	@Test
	public void testReverse() throws Exception {
		FixedSizeArrayQueue queue = new FixedSizeArrayQueue(7);
		queue.enQueue(12);
		queue.enQueue(17);
		queue.enQueue(18);
		queue.enQueue(25);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(78);
		FixedSizeArrayQueue queueReversed = ReverseQueue.reverseQueue(queue);
		String expectedArray = "[78,40,30,25,18,17,12]";
		assertEquals(expectedArray, queueReversed.toString());
	}
}