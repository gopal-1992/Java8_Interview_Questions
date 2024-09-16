package com.gopal.logical;

public class ReverseStringWithSpace {
	public static void main(String[] args) {
		String input[]="Never Give Up".split(" ");
		String reverse="";
		for(int i=input.length-1;i>=0;i--) {
		 reverse=reverse+input[i]+" ";
		}
		System.out.println(reverse);

	}
}
