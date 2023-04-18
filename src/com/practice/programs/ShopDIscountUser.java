package com.practice.programs;

import java.util.Scanner;

/* A shop will give discount of 10% if the cost of purchased quantity
 * is more than 1000.
 * Ask user for quantity.
 * Suppose,one unit will cost 100.
 * Judge and print total cost for user*/
public class ShopDIscountUser {
	/*
	 * get the quantity from user price will be (100*quantity) if*price>1000):=>
	 * give discount else do not give discount.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the quantity from user: ");
		int quantity = scanner.nextInt();
		double price = 100 * quantity;
		if (price > 1000) {
			double discount = price * 0.1;
			double ori_price = price - discount;
			System.out.println("After applying dicount your modified price is: " + ori_price);

		} else {

			System.out.println("Your are not eligible to get discount ");
		}
	}

}
