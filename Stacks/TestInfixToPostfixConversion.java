package edu.ds.stacks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInfixToPostfixConversion {
	
	@Test
	public void testInfixToPostfixPositive(){
		String expression = "A*B-(C+D)+E";
		String result = InfixToPostfixConversion.convertInfixToPostfix(expression);
		assertEquals("AB*CD+-E+",result);
	}

}
