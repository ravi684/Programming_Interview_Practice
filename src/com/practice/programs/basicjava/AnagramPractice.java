package com.practice.programs.basicjava;

import java.util.Arrays;

public class AnagramPractice {
	public static boolean isAnagram(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}

		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		Arrays.sort(word1Array);
		Arrays.sort(word2Array);
		return Arrays.equals(word1Array, word2Array);
	}

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
