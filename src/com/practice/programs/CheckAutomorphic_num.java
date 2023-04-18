package com.practice.programs;

import java.util.Scanner;

/*
 * 25=25*25
 * 625
 * 1.Get number from the user
 * 2.call the methods that checks for automorphic
 * define the logic for automorphic
 */

public class CheckAutomorphic_num {
	static boolean findAutomorphic(int number) {
		int square = number * number;
		while (number > 0) {
			if (number % 10 != square % 10) {
				return false;
			}
			number /= 10;
			square /= 10;

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		boolean result = findAutomorphic(n);
		if (result)
			System.out.println("Given number " + n + " is  a automorphic number");
		else {
			System.out.println("Givem= number " + n + " is not a automorphic numbers");
		}
		scan.close();
	}

}

/*
 * Enter a number 25 Given number 25 is a automorphic number
 */