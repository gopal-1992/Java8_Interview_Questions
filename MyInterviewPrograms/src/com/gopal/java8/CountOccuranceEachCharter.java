package com.gopal.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceEachCharter {
	public static void main(String[] args) {
		
		String input = "iilovejava";
		
		 //Count Occurances for each chartecher
		 
		Map<String, Long> result = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Count Each Charchter "+ result);
		
		
		//find all duplicate
		List<String> duplicateElements = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(x->x.getValue()>1)
		.map(x->x.getKey())
		.collect(Collectors.toList());
		
		System.out.println(duplicateElements);
		
		//find UniqueElements
		List<String> uniqueElements = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(x->x.getValue()==1) // first repeted char .filter(x->x.getValue()>1)
				.map(x->x.getKey())
				.collect(Collectors.toList());
		
		System.out.println(uniqueElements);
		
		// find first non-repeted elements from given String
		 String findFirstNonRepetedChar = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream()
				.filter(x->x.getValue()==1)
				.findFirst().get().getKey();
		 
		 System.out.println(findFirstNonRepetedChar);
		 
		 
		 //find second higest sal from given List
		 int[] numbers = {4,7,9,5,6};
		 Integer secondHigest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder())
		 .skip(1).findFirst().get();
		 System.out.println(secondHigest);
		 
		// find longest String from given array
		String[]  LongestString = {"java","springboot","microservices","sql"};
		String findLongestString = Arrays.stream(LongestString).reduce((word1, word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(findLongestString);
		
		// find the all elements from array who is starts from 1
		int[] number = {4,7,11,5,6,1};
		
		List<String> startsWith1 = Arrays.stream(number).boxed().map(s-> s+ "")
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(startsWith1);
		 
		List<Integer> asList = Arrays.asList(1,2,null);
		asList.set(1,10);
		 
		
	}
	
	
	

}
