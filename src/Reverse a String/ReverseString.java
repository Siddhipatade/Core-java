package com.java.core;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String
		String original = "Hello, World!";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

	}

}
