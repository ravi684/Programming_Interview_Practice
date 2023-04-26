package com.practice.String;

import java.util.Scanner;

public class Fibonacci {
	public static int generateFibonacci(int terms) {

		int first = 0;
		int second = 1;
		for (int i = 0; i <= terms; i++) {
			int third = first + second;
			System.out.println(third);
			first = second;
			second = third;
		}
		return terms;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of terms: ");
		int terms = scanner.nextInt();
		generateFibonacci(terms);

	}

}
