package com.practice.programs;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number which you want to reverse");
		int num = scan.nextInt();

		// 1.Using the algorithm
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("Reverse Number is :" + rev);
		scan.close();
	}
}
