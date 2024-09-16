package com.gopal.logical;

public class Palindrom {
  public static void palidrom(String input) {
	  String reverse=new StringBuffer(input).reverse().toString();
	  if(reverse.equals(input)) {
		  System.out.println("Yes It is a Palindrom");
	  }
	  else {
		  System.out.println("No It is Not a Palindrom");
	  }
	  
  }
	public static void main(String[] args) {
		String input="STS";
		palidrom(input);
	
  
	}
}
