package com.bridgelabz;

import java.util.Scanner;

public class StringEqual {
	public static void main(String[] args) {
		String name = "Ram";
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter input : ");
		String userInput = input.next();
		
		System.out.println(name.equals(userInput));
	}
}
