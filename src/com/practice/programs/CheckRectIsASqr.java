package com.practice.programs;

import java.util.Scanner;

/*
 * Take two int values from user and check length is equal to breadth
 */
public class CheckRectIsASqr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		int length = scan.nextInt();
		System.out.println("Enter breadth of a rectangle");
		int breadth = scan.nextInt();
		if (length == breadth) {
			System.out.println("It is squaure");
		} else {
			System.out.println("It is rectangle");
		}
		scan.close();

	}

}
