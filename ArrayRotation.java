package com.ds.arrays.simpleoperations;

public class ArrayRotation {
	
	public static void rotateArrayLeftAlgoByJuggling(int [] arr, int d,int n){
		int numberOfSets = FindGCD.findGCD(n, d);
		int temp = 0;
		int j = 0;
		int k = 0;
		for (int i = 0; i < numberOfSets;i++){
			temp = arr[i];
			j = i;
			while ( 1 != 0){
				k = j+d;
				if (k >= n){
					k = k - n;
				}
				if (k == i){
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}
	
	public static void rotateLeftByOne(int [] arr,int n){
		int temp = arr[0];
		for (int i = 0;i< n - 1;i++){
			arr[i] = arr[i+1];
			}
			arr[n - 1] = temp;
	}
	
	public static void main(String...ar){
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
//		rotateArrayLeftAlgoByJuggling(arr,3,12);
//		rotateLeftByOne(arr, 12);
//		rotateRightByOne(arr, 12);
//		rotateRightByJuggling(arr,3,12);
		leftRotate(arr, 7, 12);
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void rotateRightByOne(int [] arr, int n){
		int temp = arr[n-1];
		for (int i = n-1; i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
	
	public static void rotateRightByJuggling(int [] arr, int d, int n){
		int temp = 0;
		int j,k = 0;
		int numberOfSets = FindGCD.findGCD(n, d);
		int highestIndex = n - 1;
		int loopLimit = highestIndex - numberOfSets;
		for (int i = highestIndex; i>loopLimit;i--){
			temp = arr[i];
			j=i;
			while(true){
				k = j - d;
				if (k <= 0){
					k = k+highestIndex;
				}
				if (k == i){
					break;
				}
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}
	
	public static void blockSwap(int [] arr, int d, int n){
		if ( d == 0 || d == n){
			return;
		}
		if ( d == n-d){
			swap(arr,0,n-d,d);
			return;
		}
		if ( d < n - d){
			swap(arr,0,n-d,d);
			blockSwap(arr,d,n-d);
		}
		else {
			swap(arr,0,d,n-d);
			blockSwap(arr, 2*d-n, d);
		}
	}

	public static void swap(int [] arr, int fi, int si, int d){
		int temp = 0;
		for (int i = 0; i<d;i++){
			temp = arr[fi+i];
			arr[fi+i] = arr[si+i];
			arr[si+i] = temp;
		}
	}
	
	public static void leftRotate(int arr[], int d, int n)
	{
	  int i, j;
	  if(d == 0 || d == n)
	    return;
	  i = d;
	  j = n - d;
	  while (i != j)
	  {
	    if(i < j) /*A is shorter*/
	    {
	      swap(arr, d-i, d+j-i, i);
	      j -= i;
	    }
	    else /*B is shorter*/
	    {
	      swap(arr, d-i, d, j);
	      i -= j;
	    }
	    // printArray(arr, 7);
	  }
	  /*Finally, block swap A and B*/
	  swap(arr, d-i, d, i);
	}

}
