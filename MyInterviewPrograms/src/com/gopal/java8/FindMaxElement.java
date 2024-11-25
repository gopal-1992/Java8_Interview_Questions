package com.gopal.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of integers, find the maximum value element present in it using
 * Stream functions?
 */
public class FindMaxElement {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 201, 32, 15);
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);

		/* or we can try using below way */
		
		//for get the small number
		int[] arr = {25, 98, 301, 32, 15};
		int maxdata = Arrays.stream(arr ).boxed().max(Comparator.reverseOrder()).get(); 

		System.out.println(maxdata);
	}
}
