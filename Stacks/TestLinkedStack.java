package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLinkedStack {

	@Test
	public void test() {
		LinkedStack stack = createData();
		assertEquals(0, stack.getLength());
	
	}
	
	private LinkedStack createData(){
		LinkedStack stack = new LinkedStack();
		stack.push(20);
		return stack;
	}

}
