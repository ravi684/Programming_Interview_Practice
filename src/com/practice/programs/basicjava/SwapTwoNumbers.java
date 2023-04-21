package com.practice.programs.basicjava;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = scanner.nextInt();
		System.out.println("Enter value of b: ");
		int b = scanner.nextInt();
		System.out.println("Value of A before swapping is : " + a);
		System.out.println("Value of B before swapping is : " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Value of A after swapping is : " + a);
		System.out.println("Value of B after swapping is : " + b);
	}

}

/*
 * Enter value of a: 23 Enter value of b: 34 Value of A before swapping is : 23
 * Value of B before swapping is : 34 Value of A after swapping is : 34 Value of
 * B after swapping is : 23
 */
