package com.gopal.java8;

import java.util.Arrays;
import java.util.List;

public class FindThirdHigestSal {

	public static void main(String[] args) {
		List<Integer> salariesList = Arrays.asList(7, 9, 20, 16, 26);

		Integer thirdHigestSalary = salariesList.stream().distinct().sorted((a, b) -> b - a).skip(0).findFirst().get();
		System.out.println(thirdHigestSalary);
	}

}
