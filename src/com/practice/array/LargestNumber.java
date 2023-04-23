package com.practice.array;

public class LargestNumber {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];

		}
		System.out.println("Largest element in the arraay is: " + largest);
	}

}
