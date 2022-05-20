package com.example.sort;

import java.util.Arrays;

public class BubbleSort {

	public static int[] sort(int[] array) {

		boolean done = false;
		int len = array.length;
		int loopcount = 0;

		while (!done) {

			done = true;
			for (int current = 0, next = (current + 1); next < len; current++, next++) {
				if (array[current] > array[next]) {

					int temp = array[current];
					array[current] = array[next];
					array[next] = temp;

					done = false;
					System.out.println(">" + Arrays.toString(array));

				}
				loopcount++;
			}
			// items are sorted at the RHS therefore the ordered length can be ignored removed
			len--;

		}
		System.out.println("sorted in loops := " + loopcount);
		System.out.println(">" + Arrays.toString(array));
		return array;

	}

	public static void main(String[] args) {

		int[] array = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 8, 81, 82, 83, 79, 78, 77 };
		BubbleSort.sort(array);

	}

}
