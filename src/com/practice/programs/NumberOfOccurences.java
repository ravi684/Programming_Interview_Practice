package com.practice.programs;

//
import java.util.Scanner;

public class NumberOfOccurences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ar[] = { 43, 43, 54, 56, 55, 66, 55, 77, 88, 77 };
		int no, count = 0;
		System.out.println("Enter any Number");
		no = scanner.nextInt();
		for (int i = 0; i < ar.length; i++) {
			if (no == ar[i]) {
				count++;
			}

		}
		System.out.println("Number of Occurence of a " + no + " is " + count);

	}

}
