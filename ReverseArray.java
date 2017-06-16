package com.ds.arrays.simpleoperations;

public class ReverseArray {
	
	public static void reverseArrayIterative(int [] arr,int low, int high){
		int temp = 0;
		while (low < high){
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
	public static void reverseArrayRecursive(int [] arr, int low, int high){
		
		if (low >=high){
			return;
		}
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		
		reverseArrayRecursive(arr, low + 1, high - 1);
		
	}
	
	public static void main(String...ar){
		int [] arr = {1,2,3,4,5,6};
		int low = 0;
		int high = arr.length - 1;
//		reverseArrayIterative(arr,low,high);
		reverseArrayRecursive(arr,low,high);
		for (int i : arr) {
			System.out.println(i);
		}
		}
	}


