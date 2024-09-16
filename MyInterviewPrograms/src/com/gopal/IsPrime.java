package com.gopal;

public class IsPrime {

	public static void main(String[] args) {
		if (isPrimeNumber(3, 2)) {
			System.out.println("its Prime Number");
		} else {
			System.out.println("its Not Prime Number");
		}
	}

	public static Boolean isPrimeNumber(int n, int i) {
		if (n <= 2) {
			return (n == 2) ? true : false;
		} else if (n %i  == 0) {
			return false;
		} else if (n * n > i) {
			return true;
		}
		return (isPrimeNumber(n, i + 1));
	}
}
