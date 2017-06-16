package com.ds.arrays.simpleoperations;

public class TwoSumHashing {
	
	private static final int MAX_SIZE = 1000;
	
	public static void checkForTwoSum(int [] arr, int x){
		boolean [] binMap = new boolean[MAX_SIZE];
		
		for (int i = 0; i<arr.length;i++){
			int temp = x-arr[i];
			
			if (temp != 0 && binMap[temp]){
				System.out.println("The numbers having the sum " + x + " in the array are: " + temp + " and " + arr[i]);
			}
			
			binMap[arr[i]] = true;
		}
	}

}
