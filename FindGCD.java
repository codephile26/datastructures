package com.ds.arrays.simpleoperations;

public class FindGCD {

	public static int findGCD(int a, int b) {
		if (a < b) {
			System.out.println("Let the larger number be the first argument");
			return -1;
		}
		if (b == 0) {
			return a;
		} else {
			return findGCD(b, a % b);
		}

	}

	public static void main(String... ar) {
		int GCD = findGCD(62, 26);
		System.out.println(GCD);
	}

}
