package com.practice.programs;

import java.util.Scanner;

public class AverageArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(Arrays.toString(arr));
		int sum = 0;
		double average = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum is : " + sum);
		average = sum / arr.length;
		System.out.println("Average is : " + average);
	}
}
//Enter size of an array: 
//5
//10
//20
//30
//40
//50
//sum is : 150
//Average is : 30.0
