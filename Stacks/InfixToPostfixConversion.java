package edu.ds.stacks;

import java.util.Stack;

public class InfixToPostfixConversion {
	
	public static int getPrecedence(char ch){
		switch (ch){
			case '+':
			case '-':	return 1;
			case '*':
			case '/':	return 2;
			case '^':   return 3;
			default : return 0;
		}
	}
	
	/**
	 * @param expression
	 * @return
	 */
	public static String convertInfixToPostfix(String expression){
		Stack<Character> stack = new Stack<Character>();
		String result = new String();
		for (int i = 0; i < expression.length();i++){
			char c = expression.charAt(i);
			if (Character.isLetterOrDigit(c)){
				result = result + c;
			}
			else if (c == ')'){
				while (!stack.isEmpty() && stack.peek() != '('){
					result = result + stack.pop();
				}
			}
			else if (c == '('){
				stack.push(c);
			}
			else {
				while (!stack.isEmpty() && (getPrecedence(c) <= getPrecedence(stack.peek()) ||  stack.peek()=='(')){
					if (stack.peek() == '('){
						stack.pop();
					}
					else {
						result = result + stack.pop();
					}
				}
				stack.push(c);
			}
		}
		return result;
	}

}
