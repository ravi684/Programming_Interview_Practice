package com.practice.programs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		int r, sum = 0, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}
	/*
	 * answer Enter the number: 23 not palindrome
	 * 
	 */

}
