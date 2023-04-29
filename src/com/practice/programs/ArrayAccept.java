package com.practice.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAccept {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
