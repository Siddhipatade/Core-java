<<<<<<< HEAD

=======
>>>>>>> branch 'main' of https://github.com/Siddhipatade/Core-java.git
package com.java.core;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// checking String is a palindrome or not
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = scanner.next();
		
	        String reversed = new StringBuilder(str).reverse().toString();

	        if (str.equals(reversed)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }

	}

}
