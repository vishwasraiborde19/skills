package com.example.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeAlgo {

	/*
	 * aabaa finds out if a string is an Palindrome
	 */

	private static boolean isPalendrome(String string) {

		char[] strarray = string.toCharArray();

		int midofString = strarray.length / 2;

		List<String> lhs = new ArrayList<>();
		List<String> rhs = new ArrayList<>();

		boolean isBalancedString = isBalancedString(strarray.length);

		if (isBalancedString) {

			for (int i = 0, j = midofString; i < midofString; i++, j++) {
				lhs.add(String.valueOf(strarray[i]));
				rhs.add(String.valueOf(strarray[j]));
			}
		} else {

			for (int i = 0, j = midofString + 1; i < midofString; i++, j++) {
				lhs.add(String.valueOf(strarray[i]));
				rhs.add(String.valueOf(strarray[j]));
			}
		}

		if (lhs.containsAll(rhs)) {
			return true;
		}

		return false;
	}

	private static boolean isBalancedString(int number) {

		return (number % 2 == 00 ? Boolean.TRUE : Boolean.FALSE);

	}
	
	private static void execute(String testStrins) {
		boolean isPal = isPalendrome(testStrins);
		System.out.println("is Palidrome ? : " + (isPal?"yes, it is":"no, it is not"));
	} 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Enter a String :" );
		
		while(scanner.hasNext()) {
			 execute(scanner.next());
			 System.out.print("Enter a String :" );
		}
		
	}

}
