package com.practice.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String word1, String word2)

	{

		if (word1.length() != word1.length()) {
			return false;
		}

		char wordarr1[] = word1.toCharArray();
		char wordarr2[] = word2.toCharArray();

		Arrays.sort(wordarr1);
		Arrays.sort(wordarr2);

		return Arrays.equals(wordarr1, wordarr2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word1 = "listen";
		String word2 = "nestil";
		if (isAnagram(word1, word2)) {
			System.out.println(word1 + " and " + word2 + " are anagram ");
		} else {
			System.out.println(word1 + " and " + word2 + " are not anagram ");
		}
	}
}
