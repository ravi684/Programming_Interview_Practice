package com.practice.programs;

import java.util.Scanner;

/*Prime Number
 * No of factors=2
 * prime number is definitely not an even  number 
 */
public class Prime_Number {
	static boolean isPrime(int number) {
		int factors = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {

				factors++;
			}
		}
		if (factors == 2)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int number = scanner.nextInt();
		boolean result = isPrime(number);
		if (result)
			System.out.println("Given number " + number + " is a prime number");
		else {
			System.out.println("Given number " + number + " is not a prime number");
		}
	}
}

/*
 * ANSWER Enter a number to check prime or not 23 Given number 23 is a prime
 * number
 */
