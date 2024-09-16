package com.gopal.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, sort all the values present in it using Stream
 * functions
 */
public class SortValues {
	public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

         myList.stream()
               .sorted()
               .forEach(System.out::println);

      /* Or can also try below way */

      //Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
}
}
