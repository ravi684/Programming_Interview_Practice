package com.practice.programs;

import java.util.Scanner;

public class Digit_count {
	/*
	 * Total no. of digit in a number 746314/10 1.746314/10 quo=74631 count=1
	 * 2.74631/10 quo=7463 count=2 3.7463/10 quo=746 count=3 4.746/10 quo=74 count=4
	 * 5.74/10 quo=7 count=5 5.7/10 quo=0 count=6
	 */

	static void digit_count(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}
		System.out.println("Total number of digits: " + count);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		digit_count(n);
		scanner.close();
	}

}
/*
 * answer: Enter a number 746314 Total number of digits: 6
 */
