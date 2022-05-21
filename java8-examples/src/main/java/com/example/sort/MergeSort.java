package com.example.sort;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] parent, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = parent[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = parent[i];
		}

		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(parent, l, r, mid, n - mid);
	}

	public static void merge(int[] parent, int[] lhs, int[] rhs, int left_arr_size, int right_arr_size) {

		System.out.print(" in " + Arrays.toString(parent));
		System.out.print(" " + Arrays.toString(lhs));
		System.out.print(" " + Arrays.toString(rhs));

		System.out.print(" " + (left_arr_size));
		System.out.println(" " + (right_arr_size));

		int i = 0, j = 0, k = 0;
		while (i < left_arr_size && j < right_arr_size) {
			if (lhs[i] <= rhs[j]) {
				parent[k++] = lhs[i++];
			} else {
				parent[k++] = rhs[j++];
			}
		}
		while (i < left_arr_size) {
			parent[k++] = lhs[i++];
		}
		while (j < right_arr_size) {
			parent[k++] = rhs[j++];
		}

		System.out.println("out " + Arrays.toString(parent));
		System.out.println("- ");

	}

	public static void main(String[] args) {

		int[] actual = { 100, 7, 6, 2, 3, 4 };
		MergeSort.mergeSort(actual, actual.length);

	}

}
