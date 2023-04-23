package com.practice.array;

import java.util.Scanner;

//Sum of an Array Element
public class SumOfElement {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements in the array: ");
		for (i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Number of elements Present in the array are : " + arr.length);
		for (i = 0; i < arr.length; i++) {

			System.out.print("Array elements are : " + arr[i] + " ");

		}
	}

}
