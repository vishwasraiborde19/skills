package com.example.algos;

import java.util.ArrayList;
import java.util.List;

public class PalindromeAlgo {

	private static boolean isPalendrome(String string) {

		char[] strarray = string.toCharArray();
		if (isEven(strarray.length)) {
			return Boolean.FALSE;
		}

		int midofString = strarray.length / 2;

		List<String> lhs = new ArrayList<>();
		List<String> rhs = new ArrayList<>();

		for (int i = 0, j = midofString + 1; i < midofString; i++, j++) {
			lhs.add(String.valueOf(strarray[i]));
			rhs.add(String.valueOf(strarray[j]));
		}

		System.out.println(lhs.toString());
		System.out.println(rhs.toString());

		if (lhs.containsAll(rhs)) {
			return true;
		}

		return false;
	}

	private static boolean isEven(int number) {

		return (number % 2 == 00 ? Boolean.TRUE : Boolean.FALSE);

	}

	public static void main(String args[]) {
		boolean isPal = isPalendrome("BANANAC");
		System.out.println(isPal);
	}

}
