package com.gopal;

public class A {
	public void method1(String name) {
		System.out.println("first method");
		}
		 
		public void method1(int id) {
		System.out.println("second method");
		}
		 
		public void method1(Object obj) {
			System.out.println("third method");
		}
		}
		 
		class MainApp {
		public static void main(String[] args) {
		A obj = new A();
		obj.method1(null);
		System.out.println("program ended");
		}
}
