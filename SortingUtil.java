package com.ds.arrays.simpleoperations;

public class SortingUtil {

	public static void insertionSort(int[] arr) {
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while (i >= 0 && key < arr[i]) {
				arr[i + 1] = arr[i]; // j chhota h or j ki position me hum bade
										// wale ko le gaye
				i = i - 1;
			}
			arr[i + 1] = key;
		}
	}

	public static void selectionSort(int[] arr) throws Exception {
		for (int i = 0; i < arr.length; i++) {
			int indexMin = SortingUtil.findMinimumElement(arr, i);
			int key = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = key;
		}
	}

	public static int findMinimumElement(int[] arr, int lowestIndex)
			throws Exception {
		if (lowestIndex >= arr.length) {
			throw new Exception();
		}
		int minIndex = lowestIndex;
		for (int i = lowestIndex; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void bubbleSort(int[] arr) {
		for (int j = 1; j < arr.length;j++){
			for (int i = 0; i < arr.length-1;i++){
				if (arr[i] > arr[j]){
					int key = arr[i];
					arr[i] = arr[j];
					arr[j] = key;
				}
			}
			
		}
	}
	
	public static void mergeSort(int [] arr, int low, int end){
		int mid = (low+end)/2;
		if (low < end){
			mergeSort(arr, low, mid);
			mergeSort(arr,mid+1,end);
			
		
			merge(arr, low, mid, end);
			
		}
		}
	
	
	public static void merge(int [] arr, int low, int mid, int end){
		int n1 = mid - low + 1;
		int n2 = end - mid;
		
		int [] L = new int[n1];
		int [] M = new int[n2];
		
		for (int i = 0; i<n1;i++)
			L[i] = arr[low + i];
		for (int j = 0; j<n2;j++)
			M[j] = arr[mid + 1 + j];
		
		int i = 0,j = 0;
		int k = low;
		
		while (i < n1 && j < n2){
			if (L[i] <= M[j]){
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = M[j];
				j++;
			}
			k++;
		}
		
		while (i<n1){
			arr[k] = L[i];
			i++; k++;
		}
		
		while (j<n2){
			arr[k] = M[j];
			j++;k++;
		}
	}

}
