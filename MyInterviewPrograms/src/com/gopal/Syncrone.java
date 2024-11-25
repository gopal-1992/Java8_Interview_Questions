package com.gopal;

import java.util.HashSet;
import java.util.Set;

public class Syncrone {
	
	public static void main(String[] args) {
		Set set = new HashSet<>();
		Employee e1 = new Employee("Gopal","gnpr", 33);
		Employee e2 = new Employee("Gopal","gnpr", 33);
		set.add(e1);
		set.add(e2);
		
		System.out.println(set.size());
		
	}

}
