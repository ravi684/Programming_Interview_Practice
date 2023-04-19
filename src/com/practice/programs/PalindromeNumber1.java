package com.practice.programs;

import java.util.Scanner;

public class PalindromeNumber1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = scanner.nextInt();
		int sum = 0;
		int temp = num;
		while (num != 0)

		{
			int rem = num % 10;

			sum = sum * 10 + rem;
			num = num / 10;
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("It is an Palindrome number");
		} else {
			System.out.println("It is not an Palindrome number");
		}
	}

}
