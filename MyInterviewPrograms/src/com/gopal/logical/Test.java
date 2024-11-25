package com.gopal.logical;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	//Ex:
	//Input : { "array", "apple", "rat"}
	//Output: y,a,r
	
	
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("array", "apple", "rat");
		
		for(String name:asList ) {
			String collect = NonRepeted(name);
			System.out.println(collect);
		}
		
	}

	private static String NonRepeted(String name) {
		String string = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.filter(x->x.getValue()==1)
		.map(x->x.getKey()).findFirst().get();
		return string;
		
	}
}
