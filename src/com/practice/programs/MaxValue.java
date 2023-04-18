package com.practice.programs;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		System.out.println("Enter first value: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println("Enter second value: ");
		int b = scanner.nextInt();
		if (a > b) {

			System.out.println(a + " is greater than " + b);
		} else {
			System.out.println(b + " is greater than " + a);
		}
	}

}
