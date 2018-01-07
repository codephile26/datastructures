package edu.ds.stacks;

import java.util.Stack;

public class LargestRectangularAreaUnderHistogram {
	
	public static int findLargestRectangularAreaUnderHistogram(int [] histogram){
		int max_area = 0; //this variable stores the maximum area under the histogram
		int tp;
		int area_with_top;
		
		int i = 0;
		int n = histogram.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		while (i<n){
			
			if (stack.isEmpty() || histogram[stack.peek()] <= histogram[i]){
				stack.push(i++);
			}
			else {
				tp = stack.peek();
				stack.pop();
				
				area_with_top = histogram[tp] * (stack.isEmpty()?i:i-stack.peek() - 1);
				
				if (max_area < area_with_top){
					max_area = area_with_top;
				}
			}
		}
		
		while (!stack.isEmpty()){
			tp = stack.peek();
			stack.pop();
			area_with_top = histogram[tp] * (stack.isEmpty()? i : i - stack.peek() - 1);
			
			if (max_area < area_with_top){
				max_area = area_with_top;
			}
		}
		
		return max_area;
	}

}
