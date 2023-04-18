package com.practice.programs;

import java.util.Scanner;

public class Duplicates_in_array {

	public static void increment(int[] ans) {
		for (int i = 0; i < ans.length; i++) {
			ans[i] = ans[i] + 1;
		}
	}

	public static void duplicates(int[] arr) {
		int count = 1;
		int x = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == x) {
				count++;
			} else {
				if (count > 1) {
					System.out.println(x);
				}
				x = arr[i];
				count = 1;
			}
		}
		if (count > 1) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give me number of values");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Give me the values ");
			int a = scanner.nextInt();
			arr[i] = a;

		}
		duplicates(arr);

	}

}

/*
 * answer Give me number of values 8 Give me the values 1 Give me the values 1
 * Give me the values 2 Give me the values 3 Give me the values 3 Give me the
 * values 3 Give me the values 4 Give me the values 4 1 3 4
 */
