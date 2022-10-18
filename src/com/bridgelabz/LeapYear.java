package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter year : ");
		int year = input.nextInt();

		if (year >= 1582) {

			if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
				System.out.println(year + " is a leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		} else {
			System.out.println("Year not match as per the Gregorian calendar");
		}
	}
}
