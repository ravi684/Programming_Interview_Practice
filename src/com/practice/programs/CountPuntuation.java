package com.practice.programs;

public class CountPuntuation {
	public static void main(String[] args) {
		int count = 0;
		String string = "He said, 'The mailman loves you.' I heard it with my own ears.";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '!' || string.charAt(i) == ';' || string.charAt(i) == ',' || string.charAt(i) == '.'
					|| string.charAt(i) == '?' || string.charAt(i) == '-' || string.charAt(i) == '/'
					|| string.charAt(i) == ':') {
				count++;

			}
		}
		System.out.println("The number of punctuations exist in the string is " + count);
	}

}
