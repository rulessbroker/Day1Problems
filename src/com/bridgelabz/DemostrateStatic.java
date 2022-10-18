package com.bridgelabz;

public class DemostrateStatic {

//	Static variable
	static String name = "Rahul";

	public static void main(String[] args) {
		show();
		System.out.println(name);
	}

// Static method
	static void show() {
		System.out.println("Static method");
	}

//	Static Block
	static {
		System.out.println("static block");
	}
}
