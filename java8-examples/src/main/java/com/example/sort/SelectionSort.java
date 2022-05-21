package com.example.sort;

import java.util.Arrays;

public class SelectionSort {

	private static int[] sort(int[] toSort) {

		int len = toSort.length;
		int smallest = toSort[0];
		int largest = toSort[0];
		int smallestIndex = 0;

		System.out.println("input" + Arrays.toString(toSort));
		
		for (int i = 0; i < len - 1; i++) {

			System.out.println("iteration > " + (i + 1));
			
			smallest = toSort[i];
			largest = toSort[i];

			for (int j = i; j < len; j++) {

				if (toSort[j] <= smallest) {
					smallest = toSort[j];
					smallestIndex = j;
				}

				if (toSort[j] >= largest) {
					largest = toSort[j];
				}

			}
			int temp = toSort[i];
			toSort[i] = smallest;
			toSort[smallestIndex] = temp;

			System.out.println(Arrays.toString(toSort));

		}

		return toSort;
	}

	public static void main(String[] args) {

		int[] toSort = { 99, 8, 77, 36, 15, 34, 3, 22, 77 };
		sort(toSort);
		// System.out.println(Arrays.toString(toSort));
	}

}
