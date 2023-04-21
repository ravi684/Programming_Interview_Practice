package com.practice.programs;

import java.util.Scanner;

public class CountSpacesInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string;
		int space = 0;
		System.out.println("Enter any string : ");
		string = scanner.nextLine();

		char ch[] = string.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				space++;

			}
		}
		System.out.println("total number of spaces in string : " + space);

	}

}
