package edu.ds.stacks;

import java.util.Stack;

public class StockSpanProblem {
	
	public static int [] findStockSpan(int [] stockPrice){
		int n = stockPrice.length;
		
		int [] stockSpan = new int[n];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//Initially push 0 onto the stack.) signifies index of first element.
		stack.push(0);
		
		//Span of first stock Price is always going to be one.
		stockSpan[0] = 1;
		
		for (int i = 1; i<n;i++){
			
			//Here in this loop, we keep popping the elements from the stack, for a given stock price, until we
			//encounter an element with greater stock price than the current stock price.
			
			while (!(stack.isEmpty()) && (stockPrice[stack.peek()] <= stockPrice[i])){
				stack.pop();
			}
			
			stockSpan[i] = (stack.isEmpty())?(i+1):i-stack.peek();
			stack.push(i);
		}
		
		return stockSpan;
		
	}

}
