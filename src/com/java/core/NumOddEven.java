package com.java.core;

import java.util.Scanner;

public class NumOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check if number is odd or even
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		if (num %2 == 0) {
			System.out.println(num + " number is even ");
		} else {
			System.out.println(num + " number is odd ");
		}
		
		scanner.close();
		

	}

}
