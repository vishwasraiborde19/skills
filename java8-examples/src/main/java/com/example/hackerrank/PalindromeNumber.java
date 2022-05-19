package com.example.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromeNumber {

	/**
	 * Question 2: Given an integer, add it with the reverse of the value, and check
	 * if it’s a palindrome. If it isn’t a palindrome, repeat the process until the
	 * sum is a palindrome. Print out the number of iterations and the value of the
	 * final palindrome
	 * 
	 * 1123 -> 3211 1123+3211 = 4334
	 */

	private static boolean isPal(int number) {
		List<Character> lhs = new ArrayList<>();
		List<Character> rhs = new ArrayList<>();

		String numAsStr = String.valueOf(number);
		char[] charArrayofNumber = numAsStr.toCharArray();

		boolean isNumberBalanced = isNumberBalanced(numAsStr.length());

		int len = charArrayofNumber.length;
		int mid = len / 2;

		if (isNumberBalanced) {

			for (int i = 0, j = mid + 1; i < mid; i++, j++) {
				lhs.add(charArrayofNumber[i]);
				rhs.add(charArrayofNumber[j]);
			}

		} else {

			for (int i = 0, j = len - 1; i < mid; i++, j--) {
				lhs.add(charArrayofNumber[i]);
				rhs.add(charArrayofNumber[j]);
			}
		}

		if (lhs.equals(rhs)) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}

	}

	private static boolean isNumberBalanced(Integer num) {
		return (!((num % 2) == 0));
	}

	private static int reverseNumber(Integer number) {
		StringBuilder collector = new StringBuilder();

		String numberStr = number.toString();
		char[] charArrayofNumber = numberStr.toCharArray();

		for (int i = charArrayofNumber.length - 1; i >= 0; i--) {
			collector.append(charArrayofNumber[i]);
		}
		return Integer.parseInt(collector.toString());

	}

	private static void execute(int originalNumber) {
		boolean isPal = false;
		int count = 0;
		isPal = isPal(originalNumber);
		if (isPal) {
			System.out.println("The number [" + originalNumber + "]you entered is a Pal");
		} else {
			while (!(isPal(originalNumber))) {

				count++;
				int reversed = reverseNumber(originalNumber);
				originalNumber = originalNumber + reversed;
				
			}
			System.out.println("Palendrome [ " + originalNumber + " ] generated  in [ " + count + " ] counts");
		}

	}

	public static void main(String args[]) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		Integer originalNumber = 0;
		System.out.print("Enter a number: ");
		try {
			
			while (scanner.hasNext()) {
				originalNumber = scanner.nextInt();
				execute(originalNumber);
				System.out.print("Enter a number :");

			}
		} catch (Exception e) {
			
			System.out.print("Try again with a smaller number Enter a number :" + e.getMessage());
			while (scanner.hasNext()) {
				originalNumber = scanner.nextInt();
				execute(originalNumber);
				System.out.print("Enter a number :");

			}
		}

	}

}
