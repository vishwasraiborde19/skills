package com.example.algos;

import java.util.StringTokenizer;

public class StringTest1 {
	
	private  static final String TAB_LIMIT = " " ;


	public static String arrangeSentence(String[] arrayofWords) {

		StringBuilder finalString = new StringBuilder();

		for (String value : arrayofWords) {
			finalString.append(TAB_LIMIT);

			// check if the string is a single word or multiple words
			StringTokenizer token = new StringTokenizer(value);
			while (token.hasMoreTokens()) {
				String words = token.nextToken().toLowerCase();
				finalString.append(TAB_LIMIT);
				finalString.append(fistLettertoUpper(words));
			}

		}
		return finalString.toString();

	}

	private static String fistLettertoUpper(String str) {
		str = str.toLowerCase();
		StringBuilder finalString = new StringBuilder();
		String fristletter = str.substring(0, 1);
		String remainder = str.substring(1, str.length());
		finalString.append(fristletter.toUpperCase());
		finalString.append(remainder);
		return finalString.toString();
	}

	public static void main(String args[]) {
		
		String[] input = { "I", "GOT", "iNtErN", "at geekS foR geekS" };
		String optput = arrangeSentence(input);
		System.out.println(optput);

	}

}
