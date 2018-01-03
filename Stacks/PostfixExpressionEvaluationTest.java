package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostfixExpressionEvaluationTest {

	@Test
	public void testPositive() {
		int result = PostfixExpressionEvaluation.expressionEvaluation("123*+5-");
		assertEquals(2, result);
	}
	
	@Test(expected=Exception.class)
	public void testNegative(){
		int result = PostfixExpressionEvaluation.expressionEvaluation("");
	}
	
	@Test(expected=Exception.class)
	public void testNegativeAlphabetic(){
		int result = PostfixExpressionEvaluation.expressionEvaluation("ABC+");
	}

}
