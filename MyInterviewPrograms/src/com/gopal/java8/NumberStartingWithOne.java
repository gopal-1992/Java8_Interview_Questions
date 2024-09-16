package com.gopal.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	/**
	 * Given a list of integers, find out all the numbers starting with 1 using
	 * Stream functions?
	 */
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(s -> s + "") // Convert integer to String
				.filter(s -> s.startsWith("1")).forEach(System.out::println);

		/* or can also try below method */

		int[] arr = {10, 15, 8, 49, 25, 98, 32};
		List<String> list = Arrays.stream(arr ).boxed().map(s -> s + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());

		System.out.println(list);
	}
}
