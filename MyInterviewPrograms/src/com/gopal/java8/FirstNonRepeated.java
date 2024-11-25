package com.gopal.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a String, find the first non-repeated character in it using Stream
 * functions?
 */
public class FirstNonRepeated {
	public static void main(String args[]) {
		System.out.println(logic("gogokyyll"));
	}
	
	private static Character logic(String input) {  
        Character result =  input.chars()           // IntStream
             .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
             .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
             .entrySet().stream()                       // EntrySet stream
             .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
             .map(entry -> entry.getKey())              // get the keys of EntrySet
             .findFirst().get();                        // get the first entry from the keys
        
         return result;    
  }
}
