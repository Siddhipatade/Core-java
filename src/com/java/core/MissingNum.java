package com.java.core;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the missing number in an array:
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = size + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int numFromArray : arr) {
            actualSum += numFromArray;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);

        scanner.close();

	}

}
