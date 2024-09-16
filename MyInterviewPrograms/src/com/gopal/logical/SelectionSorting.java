package com.gopal.logical;

public class SelectionSorting { 
	
	public void sorting(int arr[]) {
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			int min_index=i;
			
			for(int j=i;j<n;j++)
				if(arr[j]<arr[min_index])
					min_index=j;
			
                 //swapping
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		
			
		
	}
	
	public void pring(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		  System.out.println();
	}
	public static void main(String[] args) {
		SelectionSorting obj=new SelectionSorting();
		int arr[]= {9,6,3,1,4,7,8,5,2};
		System.out.println("Unsorted Array");
		obj.pring(arr);
		System.out.println("Sorted Array");
		obj.sorting(arr);
		obj.pring(arr);
		
	}

}
