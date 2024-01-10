package com.java.core;

import java.util.Scanner;

public class NumSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // sum of two numbers

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers");

        System.out.println("Enter the first number");
        int num1 = s.nextInt();

        System.out.println("Enter the second number");
        int num2 = s.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of the two numbers: " + sum);

        s.close();
    }

}
