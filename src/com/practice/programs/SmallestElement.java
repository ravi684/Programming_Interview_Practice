package com.practice.array;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 4, 6, 1, 7 };
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println("Smallest Number in the array is : " + smallest);
	}
}
