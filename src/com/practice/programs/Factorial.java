package com.practice.programs;

import java.util.Scanner;

public class Factorial {
	static int factorials(int num) {
		if (num == 0) {
			return 1;
		} else {
			return (num * factorials(num - 1));
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		System.out.println(factorials(num));
	}
}

/*
 * factorial 5 1*2*3*4*5 5*43*2*1 withour recursion int fact=1; for(int
 * i=1;i<=5;i++) { fact=fact*i) } sysou(fact); } 5*factorial(4) 5*4*factorial(3)
 * 5*4*3*factorial(2) 5*4*3*2*factorial(1); 5*4*3*2*1;
 *
 */