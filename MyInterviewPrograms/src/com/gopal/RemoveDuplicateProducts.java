package com.gopal;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateProducts {
	public static int countDuplicateProducts(String[] names, int[] prices, int[] weights) {
		Set<String> seenProducts = new HashSet<>();
		Set<String> duplicateProducts = new HashSet<>();
		for (int i = 0; i < names.length; i++) {
			String productDescription = names[i] + "," + prices[i] + "," + weights[i];
			if (seenProducts.contains(productDescription)) {
				duplicateProducts.add(productDescription);
			} else {
				seenProducts.add(productDescription);
			}
		}
		return duplicateProducts.size();
	}

	public static void main(String[] args) {
		String[] names = { "ball", "bat", "glove", "glove", "glove" };
		int[] prices = { 2, 3, 1, 2, 1 };
		int[] weights = { 2, 5, 1, 1, 1 };
		int duplicates = countDuplicateProducts(names, prices, weights);
		System.out.println("Number of duplicate products: " + duplicates);
	}

}
