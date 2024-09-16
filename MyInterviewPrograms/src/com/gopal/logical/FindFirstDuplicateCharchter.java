package com.gopal.logical;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicateCharchter {
     static char  findDuplicate(char arr[]) {
    	 Set<Character>set=new HashSet<>();
    	 
    	 for(int i=0;i<arr.length;i++) {
    		 char c=arr[i];
    		 if(set.contains(c))
    			 return c;
    		 else
        		 set.add(c);
    	 }
    	 
		return '\0';
     }
     public static void main(String[] args) {
		String input="hibernate";
		char c[]=input.toCharArray();
		System.out.println("The First letter of  given input is"+" "+findDuplicate(c));
				
	}
}
