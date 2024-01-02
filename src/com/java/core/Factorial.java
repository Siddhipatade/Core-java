package com.java.core;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Find the factorial of a number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }

}

