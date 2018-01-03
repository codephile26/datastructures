package edu.ds.stacks;

import java.util.Stack;

public class PostfixExpressionEvaluation {
	
	public static int expressionEvaluation(String postfix){
		Stack<Integer> stack = new Stack<Integer>();
		for (int i =0; i < postfix.length();i++){
			Character token = postfix.charAt(i);
			if (token == '+'){
				int op1 = stack.pop();
				int op2 = stack.pop();
				int result = op1 + op2;
				stack.push(result);
			}
			else if (token == '-'){
				int op1 = stack.pop();
				int op2 = stack.pop();
				int result = op2 - op1;
				stack.push(result);
			}
			else if (token == '*'){
				int op1 = stack.pop();
				int op2 = stack.pop();
				int result = op1 * op2;
				stack.push(result);
			} 
			else if (token == '/'){
				int op1 = stack.pop();
				int op2 = stack.pop();
				int result = op2/op1;
				stack.push(result);
			}
			else if (token == '%'){
				int op1 = stack.pop();
				int op2 = stack.pop();
				int result = op2 % op1;
				stack.push(result);
			}
			else {
				int operand = Integer.parseUnsignedInt(token.toString());
				stack.push(operand);
			}
		}
		return stack.pop();
	}

}
