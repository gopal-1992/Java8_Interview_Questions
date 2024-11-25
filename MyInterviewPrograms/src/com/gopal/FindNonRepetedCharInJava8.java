package com.gopal;

public class FindNonRepetedCharInJava8 {
	public static void main(String[] args) {
		String input = " Javkajarticles are Awesome";
		
		Character orElse = input.chars().mapToObj(c->(char)c).filter(ch->input.indexOf(ch)==input.lastIndexOf(ch)).findFirst().orElse(null);
		System.out.println(orElse);

	}
}
