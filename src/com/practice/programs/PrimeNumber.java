package com.practice.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int n, i, flag = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any positive integer: ");
		n = scanner.nextInt();
		if (n == 0 || n == 1) {
			flag = 1;
		}
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

}
