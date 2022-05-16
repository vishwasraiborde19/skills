package com.example.algos;

import java.util.List;
import java.util.Scanner;

public class AnagramTest {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter String one: ");
		while (scanner.hasNext()) {

			String argOne = scanner.next();

			System.out.print("Enter String two: ");
			String argTwo = scanner.next();
			System.out.println(isAnagram(argOne.toLowerCase(), argTwo.toLowerCase()));
			
			System.out.print("Enter String one: ");
		}

	}

	public static boolean isAnagram(String argsOne, String argsTwo) {

		int asciValueOne = getAsciSumofCharArray(argsOne.toCharArray());
		int asciValueTwo = getAsciSumofCharArray(argsTwo.toCharArray());

		return (asciValueOne == asciValueTwo ? Boolean.TRUE : Boolean.FALSE);
	}

	private static int getAsciSumofCharArray(char[] chars) {
		int asciSum = 0;
		for (int i = 0; i < chars.length; i++) {
			asciSum = asciSum + chars[i];

		}
		return asciSum;

	}

}
