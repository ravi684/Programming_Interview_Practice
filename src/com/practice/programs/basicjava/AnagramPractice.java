package com.practice.programs.basicjava;

import java.util.Arrays;

public class AnagramPractice {
	public static boolean isAnagram(String word1, String word2) {
		// first check the length of word 1 is equal to length word 2 then it will move
		// forward otherwise it will print false
		if (word1.length() != word2.length()) {
			return false;
		}
//convert string word into character array
		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		// sort the array of characters
		Arrays.sort(word1Array);
		Arrays.sort(word2Array);
		// check all the characters in the first array is equal to second character
		// array

		return Arrays.equals(word1Array, word2Array);
	}

//main class
	public static void main(String[] args) {
		String word1 = "silent";
		String word2 = "listen";
		if (isAnagram(word1, word2)) {
			System.out.println("anaram");
		} else {
			System.out.println("Not anaram");
		}
	}

}
