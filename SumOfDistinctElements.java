package com.tcs.CoreDemo;

import java.util.Arrays;
import java.util.HashSet;

public class SumOfDistinctElements {

	public static void sumOfDistinct_HashSet(int[] arrA) {

		HashSet<Integer> hashSet = new HashSet<>();
		int sum = 0;
		System.out.print(" Unique elements are (HashSet Method): ");

		for (int i = 0; i < arrA.length; i++) {
			if (!hashSet.contains(arrA[i])) {
				System.out.print(arrA[i] + " ");

				sum += arrA[i];
				hashSet.add(arrA[i]);
			}
		}
		System.out.println(" ");
		System.out.println("Sum of all Unique elements (HashSet Method: " + sum);
	}

	public static void main(String[] args) {
		int[] arrA = { 1, 6, 4, 3, 2, 2, 3, 8, 1};
		sumOfDistinct_HashSet(arrA);
	}
}
