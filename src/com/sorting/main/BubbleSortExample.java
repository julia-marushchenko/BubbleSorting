package com.sorting.main;

// Class to sort an array
public class BubbleSortExample {
	
	// method to sort the array
	static void bubbleSort(int [] arr) {
		int length = arr.length;
		int temporalParameter = 0;
		for(int index = 0; index < length; index++) {
			for(int index2 = 1; index2 < length; index2++) {
				if(arr[index2 - 1] > arr[index]) {
					//swapping left and right elements if left is greater
					temporalParameter = arr[index2 - 1];
					arr[index2 - 1] = arr[index2];
					arr[index2] = temporalParameter;

				}
			}
		}
	}
	
	// Main method to run java program
	public static void main(String [] args) {
		int[] array = {3, 1, 7, 6, 8, 2};
		// Printing the array to console before sorting;
		System.out.println("Array Before Bubble Sort:");
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		// Sorting array
		BubbleSortExample.bubbleSort(array);
		
		System.out.println();
		
		// Printing the array to console after sorting;
		System.out.println("Array After Bubble Sort:");
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
	}
	
}
