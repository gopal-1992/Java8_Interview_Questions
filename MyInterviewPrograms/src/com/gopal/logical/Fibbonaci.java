package com.gopal.logical;

public class Fibbonaci {
	public static void main(String[] args) {
		int n = 10, n1 = 0, n2 = 1;
		System.out.println("first"+" "+ n +" "+ "terms:");
		for (int i = 0; i < n;i++) {
			 System.out.print(n1 + " + ");
			int temp = n1 + n2;
			n1 = n2;
			n2 = temp;

		}
		
	}
}
