package com.gopal.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, find the total number of elements present in the
 * list using Stream functions?
 */
public class FindTheTotalNumberOfElements {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		long count = myList.stream().count();
		System.out.println(count);

		/* or can also try below line code */
		int[] arr = { 25, 98, 98, 32, 15 };
		Arrays.stream(arr).boxed().count();
	}
}
