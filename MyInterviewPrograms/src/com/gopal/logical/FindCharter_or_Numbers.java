package com.gopal.logical;

public class FindCharter_or_Numbers {
	
	public static void main(String[] args) {
		String input = "anjan";

		if (input.matches("[a-z]+") && input.length() > 2) {
			System.out.println("it is a charcter");
		}

		else if (input.matches("[0-9]+") && input.length() > 2) {
			System.out.println("it is a numric");
		} 
		else {
			System.out.println("please provid a valid input");
		}
	}
}
