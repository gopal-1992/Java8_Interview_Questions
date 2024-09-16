package com.gopal.logical;

public class LinerSearch {
	
	public static int  search(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])
				return i;
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {8,9,6,5,4,1,2,3,7};
		int key=3;
		System.out.println("the" +" "+key+" is found at"+" "+search(arr,key));
	}

}
