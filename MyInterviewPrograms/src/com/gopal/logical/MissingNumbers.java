package com.gopal.logical;

public class MissingNumbers {
	static int arr[] = { 9, 7, 1, 3, 4, 5, 8, 2 };

	public static void main(String[] args) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		System.out.println("the missing numbers is"+" "+sum);
	}

}
