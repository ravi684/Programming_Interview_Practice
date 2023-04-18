package com.practice.programs;

import java.util.Scanner;

/*
 * Fibonacci series
 * 0 1 1 2 3 5 8 13 21 ....
 * first=0
 * second=1
 * Loop:-
 * third=first+second
 * first=second
 * second=third
 * 
 * 
 * 
 */
public class FibonacciSeries {
	// created a method for main to use and gives parameters like terms
	static void generateFibonacci(int terms) {
		// for fibonacci series
		// we have to declare first value as 0
		int first = 0;
		// we have to declare second value as 1
		int second = 1;
		// System.out.println(first + " " + second);
		// for loop to iterate till numbers of terms
		for (int i = 1; i <= terms; i++) {
			// adding last two numbers to next number
			int third = first + second;

			System.out.println(" " + third);
			// incrementing the values for nexr iteration
			first = second;
			second = third;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int terms = scanner.nextInt();
		// calling method to run purpose
		generateFibonacci(terms);
	}

}
/*
 * ANSWER Enter the number of terms 8 0 1 1 2 3 5 8 13 21 34
 */

/*
 * Python Code def generate_fibonacci(terms) first=0;second=1;
 * print(&"{first} {second}",end=" " for i in range(1,6): find=first+second;
 * print(f"{third}",end=" ") first-second; second=third;
 */
