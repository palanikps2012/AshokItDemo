package com.tcs.CoreDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 5, 6, 6, 7, 2 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (set.add(arr[i]) == false) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
