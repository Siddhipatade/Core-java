package com.java.core;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverse string
		String original = "Hello, World!";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

	}

}
