package com.java.core;

public class Sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Search a number in a sorted array in O(logn) time:
		  int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int target = 6;

	        int index = binarySearch(sortedArray, target);

	        if (index != -1) {
	            System.out.println(target + " found at index " + index);
	        } else {
	            System.out.println(target + " not found in the array.");
	        }
	    }

	    private static int binarySearch(int[] arr, int target) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1; // Not found
	    }
	}