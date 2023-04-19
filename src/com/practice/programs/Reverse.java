package com.practice.programs;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int rev = 0;
		int num = scanner.nextInt();
		while (num != 0) {
			int rem = num % 10;

			rev = rev * 10 + rem;

			num = num / 10;
		}
		System.out.println(rev);
	}

}
