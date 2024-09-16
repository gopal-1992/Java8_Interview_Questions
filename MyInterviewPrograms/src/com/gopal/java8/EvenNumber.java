package com.gopal.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 3, 5, 7, 11);
		list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

		
		/* or can also try below method */
		int[] nums = { 2, 4, 6, 8, 3, 5, 7, 11 };
		Map<Boolean, List<Integer>> list1 = Arrays.stream(nums).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println(list1);
	}
}
