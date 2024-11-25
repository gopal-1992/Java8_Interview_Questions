package com.gopal.java8;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetedChartchersJava7 {
	public static void main(String[] args) {

		String input = "vkssfdsdsve";
		char result = nonRepeted(input);

		if (result != '\0') {
			System.out.println("The first non repeted charchter is : " + result);
		} else {
			System.out.println("No non-repeted charchter found");
		}

	}

	public static char nonRepeted(String input) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		// count occureance for each charchter
		for (Character c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		/// find first non repetevie char
		for (char c : input.toCharArray()) {
			if ((map.get(c) == 1)) {
				return c;
			}
		}
		return '\0';

	}
}
