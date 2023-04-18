package com.practice.programs;

import java.util.Scanner;

public class Array_elements_maximum {
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
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];

		}
		System.out.println("max value is " + max);
		scanner.close();
	}

}

/*
 * Give me number of values 4 Give me the values 43 Give me the values 27 Give
 * me the values 87 Give me the values 92 max value is 92
 */

/*
 * Array Notes Q.How to stores array? Primitive datatypes:- int ,float ,char
 * ,double. boolean non-primitives datatypes :-array ,string.
 */
