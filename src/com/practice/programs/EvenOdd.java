package com.practice.programs;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive number");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is a Even Number");
		} else {
			System.out.println(num + " is a Odd Number");
		}
	}

}
