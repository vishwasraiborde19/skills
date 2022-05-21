package com.example.sort;

import java.util.Arrays;

public class BubbleSort {

	public static int[] sort(int[] array) {

		boolean done = false;
		int len = array.length;
		int loopcount = 0;

		while (!done) {

			done = true;
			for (int cur = 0, next = (cur + 1); next < len; cur++, next++) {
				if (array[cur] > array[next]) {

					int temp = array[cur];
					array[cur] = array[next];
					array[next] = temp;

					done = false;	
				}
				loopcount++;
			}
			// items are sorted at the RHS therefore the ordered length can be ignored removed
			len--;

		}
		System.out.println("sorted in loops := " + loopcount);
		return array;

	}

	public static void main(String[] args) {

		int[] array = { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 8, 81, 82, 83, 79, 78, 77 };
		System.out.println("Input  > " + Arrays.toString(array));
		BubbleSort.sort(array);
		System.out.println("output >" + Arrays.toString(array));

	}

}
