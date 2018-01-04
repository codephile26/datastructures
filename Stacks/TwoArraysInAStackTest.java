package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoArraysInAStackTest {

	@Test
	public void testPushPositive() throws Exception {
		TwoArraysInAStack array = new TwoArraysInAStack(20);
		array.push(1,12);
		array.push(1, 20);
		array.push(1, 35);
		array.push(2, 13);
		array.push(2, 21);
		array.push(2, 36);
		assertEquals(2, array.getTopOne());
		assertEquals(17,array.getTopTwo());
		assertEquals(array.getArray().length-1,array.getTopOne() + array.getTopTwo());
	}
	
	@Test
	public void testPopNegative() throws Exception{
		TwoArraysInAStack array = new TwoArraysInAStack(20);
		array.push(1,12);
		array.push(1, 20);
		array.push(1, 35);
		array.push(2, 13);
		array.push(2, 21);
		array.push(2, 36);
		assertEquals(2, array.getTopOne());
		assertEquals(17,array.getTopTwo());
		assertEquals(array.getArray().length-1,array.getTopOne() + array.getTopTwo());
		array.pop(1);
		assertEquals(1,array.getTopOne());
		array.pop(2);
		assertEquals(18, array.getTopTwo());
	}
	
	@Test
	public void testPopEmpty() throws Exception{
		TwoArraysInAStack array = new TwoArraysInAStack(20);
		assertEquals(-1, array.pop(1));
		assertEquals(-1, array.pop(2));
	}
	
	@Test(expected=Exception.class)
	public void testPushFull() throws Exception{
		TwoArraysInAStack array = new TwoArraysInAStack(5);
		array.push(1, 1);
		array.push(1, 2);
		array.push(1, 3);
		array.push(2, 4);
		array.push(2, 5);
		array.push(1, 6);
	}

}
