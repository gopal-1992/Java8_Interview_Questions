package com.gopal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartsWith {
	public static void main(String[] args) {
		List<String> listNames = Arrays.asList("Gopal","Guddu");
		List<String> collect = listNames.stream().filter(name->name.startsWith("G", 0) && name.endsWith("l")).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
