package com.gopal.logical;

public class FindLargestNumber {
	static int arr[]={8,2,1,6,4,9,7,5,3,12};
	public static void main(String[] args) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) 
			if(arr[i]>max) 
				max=arr[i];
			
		System.out.println(max);
	}
}
