package com.example.algos;

public class PalindromeRecursion {

	public static void main(String[] args) {
		String string = "392193";
		boolean isPal = isPalindrome(string);
		System.out.println(string + " is Pal " + isPal);
	}

	public static boolean isPalindrome(String string) {
		System.out.println(string);
		String outerlhs = string.substring(0, 1);
		String outerrhs = string.substring(string.length() - 1, string.length());

		if (string.length() == 1)
			return true;

		if (outerlhs.equals(outerrhs)) {
			string = string.substring(1, string.length() - 1);
			return isPalindrome(string);

		} else {
			return false;
		}

	}
}
