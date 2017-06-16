package com.ds.arrays.simpleoperations;

public class ArrayRotationTester {
	
	public static void main(String...ar){
		int [] arr = {1,2,3,4,5,6,7};
		ArrayRotation.blockSwap(arr, 5, 7);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
