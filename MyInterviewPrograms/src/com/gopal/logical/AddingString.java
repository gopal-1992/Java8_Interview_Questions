package com.gopal.logical;

public class AddingString {
    public static  String  add(String input,String add,int index) {
    	
    	String str=new String();
    	for(int i=0;i<input.length();i++) {
    		str=str+input.charAt(i);
    		 if(i==index) 
    			 str=str+add;
    		 
    	}
		return str;
    }
    
    public static void main(String[] args) {
		String input="never give up";
		String add="ever"+" ";
		int index=5;
		
		System.out.println(add(input,add,index));
	}
	
}
