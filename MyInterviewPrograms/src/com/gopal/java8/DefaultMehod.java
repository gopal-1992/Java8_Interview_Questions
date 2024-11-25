package com.gopal.java8;

public interface DefaultMehod {
	// defult method
	default int add(int a, int b) {
		return a + b;
	}

	// funtional interface
	public int addition(int a, int b);

	//static method
	static String hello(String name) {
		System.out.println("Hello, New Static Method Here" + name);
		return name;

	}

}
