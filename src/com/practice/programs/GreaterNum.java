package com.practice.programs;

public class GreaterNum {
	public static void main(String[] args) {
		int num1 = 180;
		int num2 = 150;
		int num3 = 650;
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + "is greater number");
		} else if (num2 > num3) {
			System.out.println(num2 + " is a greater number");
		} else {
			{
				System.out.println(num3 + "is greater number");
			}
		}
	}
}
