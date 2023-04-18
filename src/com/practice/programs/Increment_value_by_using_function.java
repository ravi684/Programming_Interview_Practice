package com.practice.programs;

public class Increment_value_by_using_function {
	public static void main(String[] args) {
		int x = 5;
		x = Increment(x);
		System.out.println(x);

	}

	public static int Increment(int a) {
		a++;
		return a;

	}

}

/*
 * answer 6
 */
