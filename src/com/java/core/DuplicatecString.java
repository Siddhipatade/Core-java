package com.java.core;

public class DuplicatecString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//duplicate characters in a String:
		String str = "programming";

        System.out.println("Duplicate characters in the string:");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i) + " ");
                    break;
                }
            }
        }

	}

}
