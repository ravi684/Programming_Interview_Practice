package com.practice.programs;

public class Smallest_value_array {
	public static void main(String[] args) {

		// new number array
		int num[] = new int[] { 12, 7, 23, 34, 45, 56 };

		// assign first element of an array to smallest
		int smallest = num[0];

//iterating each and every value of array one by one using for loop
		for (int i = 0; i < num.length; i++) {
			if (num[i] < smallest)
				smallest = num[i];
		}
		System.out.println("Smallest number is : " + smallest);
	}

}

/*
 * answer Smallest number is : 7
 */
