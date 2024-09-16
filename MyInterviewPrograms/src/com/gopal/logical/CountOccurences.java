package com.gopal.logical;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurences {
    public static void count(String input) {
    	Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
    	char[] array=input.toCharArray();
    	
    	for(Character c:array) 
    		if(map.containsKey(c))
    			map.put(c, map.get(c)+1);
    		else 
    			map.put(c, 1);
    		
    		for(Map.Entry entry:map.entrySet()) {
    			System.out.println(entry.getKey()+" "+entry.getValue());
    		
    	}
		
    }
    public static void main(String[] args) {
    	String input="januaray";
    	count(input);
	}
}
