package com.gopal;

public class RemoveDupllicateCharchater {

	public static void main(String[] args) {
		System.out.println(RemoveDuplicateChar("Goopal"));

	}

	public static String RemoveDuplicateChar(String Input) {
		char arr[] = Input.toCharArray();
		String str = "";

		for (char c : arr) {
			if (str.indexOf(c) == -1) {
				str = str + c;
			}
		}
		return str;
	}

}
