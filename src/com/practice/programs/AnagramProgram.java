package com.practice.programs;

import java.util.ArrayList;
import java.util.Scanner;

/*1.Read a word or phrase from the user.
 * 2.Generate all possible permutations of the letter in the word or phrase.
 * 3.For each permutation,check if it is a valid word in a dictionary.
 * 4.If a permutation is a valid word,add it to the list of anagrams.
 * 5.Print the list of anagrams.
 */
public class AnagramProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String wordString = scanner.next();
		ArrayList<String> anagramStrings = new ArrayList<String>();
		permute(wordString.toCharArray(), 0, anagramStrings);
		System.out.println("Anagrams of " + wordString + " : " + anagramStrings);
	}

//This function generate all possible permutations of a given vharacter array.
	private static void permute(char[] charArray, int index, ArrayList<String> anagramStrings) {
		if (index == charArray.length - 1) {
			String wordString = new String(charArray);
			if (isValidWord(wordString)) {
				anagramStrings.add(wordString);
			}
		} else {
			for (int i = index; i < charArray.length; i++) {
				swap(charArray, index, i);
				permute(charArray, index + 1, anagramStrings);
				swap(charArray, index, i);
			}
		}
	}

//This function swaps two elements in a character array.
	private static void swap(char[] charArray, int i, int j) {
		char temp = charArray[i];
		charArray[i] = charArray[j];

		charArray[j] = temp;

	}

//This function checks if a given string is a valid word  in a dictionary
	private static boolean isValidWord(String wordString) {
//Replace this with your own code to check  if word is a valid word in a dictionary.
		// for example,you can use an API like wordnik or a local dictionary file.
		return true;
	}
}
