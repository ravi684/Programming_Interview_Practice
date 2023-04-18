package com.practice.programs;

public class Largest_value_array {
	public static void main(String[] args) {
		// assigning array elements
		int array[] = new int[] { 10, 20, 30, 40, 50, 99 };
		// assigning first value of array
		int Largest = array[0];
		// iterate the array by using for loop
		for (int i = 0; i < array.length; i++) {
			if (array[i] > Largest)
				Largest = array[i];
		}
		System.out.println("The Largest value from array is " + Largest);
	}
}

/*
 * answer
 * 
 * The Largest value from array is 99
 */