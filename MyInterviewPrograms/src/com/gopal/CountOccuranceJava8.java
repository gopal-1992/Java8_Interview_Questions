package com.gopal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceJava8 {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("Gopal", "Santosh", "Laxmi", "Gopal");
		
		List<String> nameList = name.stream().map(data -> data).collect(Collectors.toList());
		System.out.println("Name List "+ nameList);
		
		Map<String, Long> UniqueNames = nameList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("UniqueNames :: "+ UniqueNames);
		
		Set<String> DuplicateNames = UniqueNames.entrySet().stream().filter(data -> data.getValue() > 1)
				.map(data -> data.getKey()).collect(Collectors.toSet());
		
		System.out.println("DuplicateNames" + DuplicateNames);
	}

}
