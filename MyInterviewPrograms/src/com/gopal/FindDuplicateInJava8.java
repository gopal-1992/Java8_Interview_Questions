package com.gopal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class FindDuplicateInJava8 {

	public static void main(String[] args) {
		
		/*
		 * List<String> list = new CopyOnWriteArrayList<>();
		 * 
		 * list.add("Amit"); list.add("Vaishnavi"); list.add("Ranjit");
		 * list.add("Preeti");
		 * 
		 * for(String name : list) { list.remove(name); }
		 * 
		 * System.out.println("Final List size: " + list.size());
		 */
		
		  List<String> list = Arrays.asList("Gopal", "Santosh", "Laxmi", "Gopal");
		  
		  List<String> listNames = list.stream().map(name ->name).collect(Collectors.toList()); 
		  Set<String> UniqueNames = new LinkedHashSet<>(); 
		  Set<String> DuplicateNames = listNames.stream().filter(name -> !UniqueNames.add(name))
		  .collect(Collectors.toSet()); 
		  System.out.println("UniqueName :" +UniqueNames);
		  
		  System.out.println("DuplicateNames :" + DuplicateNames);
		 
	}

}
