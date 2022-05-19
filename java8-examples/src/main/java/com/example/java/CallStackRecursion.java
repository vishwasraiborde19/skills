package com.example.java;

import java.util.Arrays;
import java.util.Date;

public class CallStackRecursion {

	private void splitIntArray(int[] baseArray) {

		// [1,2,3,4,5]
		int len = baseArray.length;
		if (len < 2) {
			System.out.println("reached  terminal case " + Arrays.toString(baseArray));
			return;
		}
		
		int mid = len / 2;

		// [1,2]
		int[] lhs = new int[mid];
		// [3,4,5]
		int[] rhs = new int[len - mid];

		for (int i = 0; i < mid; i++) {
			lhs[i] = baseArray[i];
		}

		for (int j = 0; j < (len - mid); j++) {
			rhs[j] = baseArray[mid + j];
		}
		
		System.out.println(System.currentTimeMillis() + " base array " + Arrays.toString(baseArray) + " \n LHS"
				+ Arrays.toString(lhs) + "RHS" + Arrays.toString(rhs)); 
		
		splitIntArray(lhs);
		splitIntArray(rhs);
		
	
		

	}

	public static void main(String[] args) {
		CallStackRecursion callStackRecursion = new CallStackRecursion();

		int[] parentArray = { 6, 7, 8, 9, 10 };
		//System.out.println((parentArray));
		callStackRecursion.splitIntArray(parentArray);
		//System.out.println((parentArray));
	}

}
