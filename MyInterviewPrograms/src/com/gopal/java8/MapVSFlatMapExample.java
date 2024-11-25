package com.gopal.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMapExample {
	public static void main(String[] args) {
		List<String > names = Arrays.asList("Go pal", "Saan vika","Ara v","Gud du");
		System.out.println("names List :: "+ names);
		
		//using map to get the legth of each sentence
		List<Integer> nameLength = names.stream().map(name ->name.length()).collect(Collectors.toList());
		System.out.println("Map Output :::: "+nameLength);
		//using flatmap
		
		List<String> flatMap = names.stream().flatMap(name->Arrays.stream(name.split(" "))).collect(Collectors.toList());
		
		System.out.println("flatMap Output :::: "+flatMap);
		
		
	}

}
