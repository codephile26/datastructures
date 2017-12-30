import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

	 public static boolean checkForBalancedParentheses(String expression){
		 Stack<Character> stack = new Stack<Character>();
		 for (int i = 0; i< expression.length();i++){
				if (expression.charAt(i) == '}'){
					if (!(stack.isEmpty()) && (stack.peek()=='{')){
						stack.pop();
					}
					else {
						return false;
					}
				}
				else if (expression.charAt(i) == ']'){
					if (!(stack.isEmpty()) && (stack.peek()=='[')){
						stack.pop();
					}
					else {
						return false;
					}
				}
				else if (expression.charAt(i) == ')'){
					if (!(stack.isEmpty()) && (stack.peek()=='(')){
						stack.pop();
					}
					else {
						return false;
					}
				}
				else if ( (expression.charAt(i) == '{' ) || (expression.charAt(i) == '[' ) || (expression.charAt(i) == '(' )){
					stack.push(expression.charAt(i));				
					}
			}
		 if (stack.isEmpty()){
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	

}
