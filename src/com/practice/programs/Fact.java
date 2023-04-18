package com.practice.programs;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {

		int n, i, fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive number");
		n = scanner.nextInt();
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
