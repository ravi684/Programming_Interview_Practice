package com.practice.programs;

public class Increment_array_elements {
	public static void main(String[] args) {
		int[] arr = new int[5];
		increment(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

	}

	public static void increment(int[] ans) {
		for (int i = 0; i < ans.length; i++) {
			ans[i] = ans[i] + 1;
		}
	}

}

/*
 * answer 1 1 1 1 1
 */