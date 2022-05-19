package com.example.sort;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		System.out.println(System.currentTimeMillis() + " base array " + Arrays.toString(a) + " \n LHS"
				+ Arrays.toString(l) + "RHS" + Arrays.toString(r)); 
		merge(a, l, r, mid, n - mid);
	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}

	public static void main(String args[]) {

		int[] actual = { 5, 1, 6, 2, 3, 4 };
		MergeSort.mergeSort(actual, actual.length);
		
		for(int i =0 ; i < actual.length ; i++) {
			///System.out.print(actual[i]+",");
		}

	}

}
