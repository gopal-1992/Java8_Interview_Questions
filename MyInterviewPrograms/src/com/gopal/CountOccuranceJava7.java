package com.gopal;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccuranceJava7 {

	public static void main(String[] args) {
		CountOccurance("  gopaaaaall".trim());
	}

	public static void CountOccurance(String input) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		char arr[] = input.toCharArray();

		for (Character c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		System.out.println("#1. Using Map.entrySet() method");
		for (Map.Entry<Character, Integer> me : map.entrySet()) {
			Character k = me.getKey();
            Integer v = me.getValue();
			System.out.println("Key : " + k + "   " + "Value : " + v);
		}
		
		System.out.println("#2. Using entrySet");
		map.entrySet().stream().forEach(System.out :: println);
		
		System.out.println("#3. Using forEach");
		//map.forEach((k,v)->System.out.println("Key :  "+ k +"  "+"Value :: "+v));
		map.forEach((key,value)->System.out.println("Key :  "+ key +"  "+"Value :: "+value));
		
	}


}