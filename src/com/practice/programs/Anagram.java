package com.practice.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
//	Create method that accept string 
	public static boolean isAnagram(String word1, String word2) {
//		Compare length of strings
//		if equals then valid to proceed
		if (word1.length() != word2.length()) {
//			otherwise not an anagram
			return false;
		}
//		convert the given string into character array
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
//		Sort the arrays
		Arrays.sort(word1Array);
		Arrays.sort(word2Array);
//		compare each and every character in both the character array by using .equals method:which is used to content comparison
		return Arrays.equals(word1Array, word2Array);
	}

	public static void main(String[] args) {
//		accept string
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string");
		String word1 = scanner.next();

		System.out.println("Enter second string");
		String word2 = scanner.next();
		if (isAnagram(word1, word2)) {
			System.out.println(word1 + " and " + word2 + " are Anagram ");
		} else {
			System.out.println(word1 + " and " + word2 + " are Not an Anagram");
		}
		scanner.close();
	}

}
