package com.gopal.interviews;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepetedChar {
	public static void main(String[] args) {
		System.out.println(firstNonRep("gogoppal"));
	}

	public static Character firstNonRep(String input) {

		Character result = null;

		result = input.chars().mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(name -> name.getValue() == 1L).map(name -> name.getKey()).findAny().get();

		return result;
	}
}
