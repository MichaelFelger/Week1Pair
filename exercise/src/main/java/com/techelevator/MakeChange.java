package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the change calculator.");
		System.out.print("Please enter the amount of the bill: ");
		double bill = Double.parseDouble(scanner.nextLine());

		System.out.print("How much was tendered? ");
		double tendered = Double.parseDouble(scanner.nextLine());


		double change = (tendered - bill);
		System.out.printf("The change is $%.2f ", change);
	}

}
