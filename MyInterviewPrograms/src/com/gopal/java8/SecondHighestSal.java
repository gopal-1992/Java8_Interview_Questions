package com.gopal.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestSal {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1000,2000,4000,3000);
		Optional<Integer> secondHighest = numbers.stream().distinct().sorted((a, b) -> b - a).skip(3).findFirst();
		Integer finaloutPut = secondHighest.get();
		System.out.println(finaloutPut);
	}

}
