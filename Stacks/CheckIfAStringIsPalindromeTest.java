package edu.ds.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckIfAStringIsPalindromeTest {

	@Test
	public void test() {
		boolean result = CheckIfAStringIsPalindrome.isPalindrome("abXba");
		assertTrue(result);
	}
	
	@Test
	public void testNegative(){
		boolean result = CheckIfAStringIsPalindrome.isPalindrome("abXcbef");
		assertFalse(result);
	}
	
}
