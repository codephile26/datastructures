import static org.junit.Assert.*;

import org.junit.Test;

public class TestBalancedParentheses {

	@Test
	public void testBalancedParenthesesPositive() {
		assertTrue(BalancedParentheses.checkForBalancedParentheses("{[()()]}"));
	}
	
	@Test
	public void testBalancedParenthesesNegativOrderMismatch(){
		assertEquals(false,BalancedParentheses.checkForBalancedParentheses("[{]}"));
	}
	
	@Test
	public void testBalancedParenthesesNegativeMissingBracket(){
		assertEquals(false,BalancedParentheses.checkForBalancedParentheses("{[()()]"));
	}
}
