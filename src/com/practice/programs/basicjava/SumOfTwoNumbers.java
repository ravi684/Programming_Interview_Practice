package com.practice.programs.basicjava;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value of a");
		int a = scanner.nextInt();
		System.out.println("Enter a value of b");
		int b = scanner.nextInt();
		int c;

		c = a + b;
		System.out.println("The sum of Two Numbers are " + c);
	}

}
