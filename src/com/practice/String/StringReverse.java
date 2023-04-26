package com.practice.String;

public class StringReverse {
	public static void main(String[] args) {
		String ori = "Ravindra";
		String rev = "";
		for (int i = 0; i <= ori.length() - 1; i++) {
			rev = rev + ori.charAt(i);
		}
		System.out.println(rev);
	}
}
