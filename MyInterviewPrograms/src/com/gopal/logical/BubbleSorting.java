package com.gopal.logical;

public class BubbleSorting {

	public void sorting(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}

	}

	public void pring(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSorting obj = new BubbleSorting();
		int arr[] = { 9, 6, 3, 1, 4, 7, 8, 5, 2 };
		System.out.println("Unsorted Array");
		obj.pring(arr);
		System.out.println("Sorted Array");
		obj.sorting(arr);
		obj.pring(arr);

	}

}
