package com.java.core;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired number of Fibonacci terms: ");
        int size = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci series:");

        for (int i = 1; i <= size; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        scanner.close();
    }

}
