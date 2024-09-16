package com.gopal.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	/**
	 * Given an integer array nums, return true if any value appears at least twice
	 * in the array, and return false if every element is distinct.
	 */
	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 3 };
		System.out.println(containsDuplicate(array));
	}

	public static boolean containsDuplicate(int[] nums) {
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			return false;
		}
		return true;
	}
		
	
	/* or can also try below way */ 
    /*Set<Integer> setData = new HashSet<>();
        return Arrays.stream(nums)
                     .anyMatch(num -> !setData.add(num));*/
  }

