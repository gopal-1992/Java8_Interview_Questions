package com.gopal;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RevereseStringInJava8 {

	public static void main(String[] args) {
		System.out.println(RevreseString("Gopal"));

	}
public static String RevreseString(String input) {
	return Stream.of(input).map(name-> new StringBuilder(name).reverse()).collect(Collectors.joining(" "));
}
	
}
