package com.gopal;

public class RevreseStringLeetCode {

	public static void main(String[] args) {
		System.out.println(RevreseString(" welcome Gopal "));
	}

	public static String RevreseString(String Input) {
		String array[] = Input.trim().split("\\s+");

		String str = "";
		for (int i = array.length-1; i >0; i--) {
			str = str + array[i]+" ";
		}
		return str + array[0];
	}
}
