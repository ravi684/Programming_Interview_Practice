package com.practice.array;

//Write a java program to sort the elements of an array elements in ascending order
public class SortingElementsAsc {
	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp = 0;
		// Displaying elements of original array:
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		// sort the array in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		// Displaying elements of array sorted in ascending order
		System.out.println("Elements of array sorted in ascending order : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
/*
 * Elements of original array: 5 2 8 7 1 Elements of array sorted in ascending
 * order : 1 2 5 7 8
 */
