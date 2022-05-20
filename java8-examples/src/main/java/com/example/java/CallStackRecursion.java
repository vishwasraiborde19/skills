package com.example.java;

import java.util.Arrays;
import java.util.Date;

public class CallStackRecursion {

	private void splitIntArray(int[] baseArray) {

		int len = baseArray.length;
		if (len < 2) {
			return;
		}

		int mid = len / 2;

		int[] lhs = new int[mid];
		int[] rhs = new int[len - mid];

		for (int i = 0; i < mid; i++) {
			lhs[i] = baseArray[i];
		}

		for (int j = 0; j < (len - mid); j++) {
			rhs[j] = baseArray[mid + j];
		}

		splitIntArray(lhs);
		splitIntArray(rhs);

		// this will be called in the reverse order of the stack and will contain the
		// variable the stack order
		mergeSort(baseArray, lhs, rhs, lhs.length, rhs.length);

	}

	private void mergeSort(int[] baseArray, int[] lhs, int[] rhs, int lhslength, int rhslengh) {

		System.out.println("base array " + Arrays.toString(baseArray) + "  LHS " + Arrays.toString(lhs) + ""
				+ Arrays.toString(rhs)+" RHS ");

		int i = 0, j = 0, k = 0;

		while (i < lhslength && j < rhslengh) {
			if (lhs[i] < rhs[j]) {
				baseArray[k] = lhs[i];
				k++;
				i++;
			} else {
				baseArray[k] = rhs[j];
				j++;
				k++;
			}

		}
		
		//if highest is remaining in lhs and copy into base array
		while (i < lhslength) {
			baseArray[k] = lhs[i];
			k++;
			i++;
		}
		
		//if highest is remaining in lhs and copy into base array
		while (j < rhslengh) {
			baseArray[k] = rhs[j];
			k++;
			j++;
		}
		
		System.out.println("stage    : " + Arrays.toString(baseArray));
	}

	public static void main(String[] args) {
		CallStackRecursion callStackRecursion = new CallStackRecursion();

		int[] parentArray = { 12, 6, 11, 8, 7, 9, 10};
		System.out.println("input     : " + Arrays.toString(parentArray));
		callStackRecursion.splitIntArray(parentArray);
		
		System.out.println("final sorted  : " + Arrays.toString(parentArray));
	}

}
