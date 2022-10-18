package com.bridgelabz;

public class SumOfCommandLine {
	public static void main(String[] args) {
		int num, cnt = 0;
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				num = Integer.parseInt(args[i]);
				sum = sum + num;
			} catch (NumberFormatException e) {
				System.out.println(e);
				cnt++;
			}
		}
		System.out.println("Sum of only valid integers is= " + sum);

		System.out.println("Invalid integers are: " + cnt);
	}
}
