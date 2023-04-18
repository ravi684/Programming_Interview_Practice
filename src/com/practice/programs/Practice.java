package com.practice.programs;

public class Practice {
	/*
	 * static void generateFibonacci(int terms) { int first = 0; int second = 1; for
	 * (int i = 1; i <= terms; i++) { int third = first + second;
	 * System.out.println(third); first = second; second = third; } }
	 * 
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); System.out.println("Enter number of terms: "); int terms
	 * = scanner.nextInt(); generateFibonacci(terms); }
	 */

	public static void main(String[] args) {
		String ori = "Ravindra";
		String revString = "";
		for (int i = 0; i <= ori.length(); i++) {
			revString = ori.charAt(i) + revString;

		}
		System.out.println(revString);
	}

}
