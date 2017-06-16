package com.ds.arrays.simpleoperations;

import java.util.Scanner;

public class DriverForSorting {

	public static void main(String...ar) throws Exception{
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int [] arr = new int[length];
		for (int i = 0; i<length;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		int min = 0;
//		SortingUtil.insertionSort(arr);
//		SortingUtil.selectionSort(arr);
//		SortingUtil.bubbleSort(arr);
		int low = 0;
		int end = arr.length - 1;
		SortingUtil.mergeSort(arr, low, end);
		System.out.println("The sorted array is: ");
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
