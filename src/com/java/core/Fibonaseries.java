package com.java.core;

public class Fibonaseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // Change this to the desired number of Fibonacci terms
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

	}

}
