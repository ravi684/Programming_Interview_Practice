package com.practice.programs;

public class Swap_Numbers {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Brfore swapping the numbers are" + a + " " + b);
		/*
		 * Logic 1 -using third variable int temp = a; a = b; b = temp;
		 */

		/*
		 * Logic second by using only two variables a = a + b; b = a - b; a = a - b;
		 */
		/*
		 * Logic third by using * and / operators a = a * b; b = a / b; a = a / b;
		 */
		/*
		 * Logic fourth by using bitwise operators a = a ^ b; b = a ^ b; a = a ^ b;
		 * 
		 */

		System.out.println("After swapping the numbers are " + a + " " + b);
	}

}
