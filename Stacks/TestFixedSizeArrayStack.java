package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFixedSizeArrayStack {

	@Test
	public void testPushPositive() throws Exception {
		FixedSizeArrayStack stack = createDataForPushOperation();
		assertEquals(3, stack.getSize());
		assertEquals(2, stack.getTop());
		System.out.println(stack);
	}

	public FixedSizeArrayStack createDataForPushOperation() throws Exception {
		FixedSizeArrayStack stack = new FixedSizeArrayStack();
		stack.push(20);
		stack.push(33);
		stack.push(45);
		return stack;
	}

	public FixedSizeArrayStack createDataForPushOperationWhenStackIsFull() throws Exception {
		FixedSizeArrayStack stack = new FixedSizeArrayStack();
		for (int i = 0; i < 50; i++) {
			stack.push(i);
		}
		return stack;
	}

	@Test(expected = Exception.class)
	public void testPushWhenStackIsFull() throws Exception {
		FixedSizeArrayStack stack = createDataForPushOperationWhenStackIsFull();
		assertEquals(50, stack.getSize());
		stack.push(50);
	}

	@Test
	public void testPop() throws Exception {
		FixedSizeArrayStack stack = createDataForPushOperation();
		assertEquals(3, stack.getSize());
		int element = stack.pop();
		assertEquals(45, element);
		assertEquals(2, stack.getSize());
	}
	
	@Test(expected=Exception.class)
	public void testPopNegative() throws Exception{
		FixedSizeArrayStack stack = new FixedSizeArrayStack();
		stack.pop();
	}

}
