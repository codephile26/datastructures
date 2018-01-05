package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeArraysInAStackTest {

	@Test
	public void testPush() throws Exception {
		ThreeArraysInAStack stack = new ThreeArraysInAStack(9);
		stack.push(1, 2);
		stack.push(1, 4);
		stack.push(1, 8);
		stack.push(2, 3);
		stack.push(2, 6);
		stack.push(3, 5);
		stack.push(3, 10);
		stack.push(3, 10);
		stack.push(1, 16);
		assertEquals(3, stack.getTopOne());
	}

}
