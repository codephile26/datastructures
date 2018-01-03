package edu.ds.stacks;

import java.util.Stack;

public class CheckIfAStringIsPalindrome {
	
	public static boolean isPalindrome(String string){
		char inputChar[] = string.toCharArray();
		Stack<Character> s = new Stack<Character>();
		int i = 0;
		while (inputChar[i] != 'X'){
			s.push(inputChar[i]);
			i++;
		}
		i++;
		while (i <inputChar.length){
			if (s.isEmpty()){
				return false;
			}
			else if (inputChar[i] != s.pop()){
				return false;
			}
			i++;
		}
		return true;
	}

}
