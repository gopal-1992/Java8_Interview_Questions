package com.gopal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EvenOddNumbers {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,3,5,4,9,6);
		List<Integer> collect = num.stream().filter(numb -> numb %2==0).collect(Collectors.toList());
		System.out.println("Even Numbers : "+collect);
	}

}
