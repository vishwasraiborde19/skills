package com.example.algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PanagramAlgo {
	/*
	 * a quick brown fox jumps over the lazy dog
	 */

	public static boolean isPanGram(String pangramString) {

		pangramString = pangramString.replaceAll(" ", "");
		List<String> list = converStringToList(pangramString);

		findMissingLettes(list);
		return (list.size() == 26 ? Boolean.TRUE : Boolean.FALSE);

	}

	public static List<String> findMissingLettes(List<String> charList) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		List<String> reference = converStringToList(alphabet);
		reference.removeAll(charList);
		System.out.println("Missing Letters are: " + reference.toString());
		return charList;

	}

	private static List<String> converStringToList(String string) {
		char[] stringArray = string.toCharArray();
		Set<String> set = new HashSet<>();

		for (int i = 0; i < stringArray.length; i++) {
			set.add(String.valueOf(stringArray[i]));
		}

		return new ArrayList<>(set);

	}

	public static void main(String[] args) {

		System.out.println("Enter String one: ");
		boolean ouput = isPanGram("a uick brown fox jumps over  lazy dog th");
		System.out.println ("Output :" + ouput);

	}

}
