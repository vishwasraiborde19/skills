package com.example.algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Panagram {
	/*
	 * a quick brown fox jumps over the lazy dog
	 */


	public static boolean isPanGram(String pangramString) {

		pangramString = pangramString.replaceAll(" ", "");
		List<String> list = removeDuplicatesFromString(pangramString);
		for (String str : list) {
			System.out.println(str);
		}

		return (list.size()==26 ? Boolean.TRUE : Boolean.FALSE);

	}

	private static List<String> removeDuplicatesFromString(String string) {
		char[] stringArray = string.toCharArray();
		Set<String> set = new HashSet<>();

		for (int i = 0; i < stringArray.length; i++) {
			set.add(String.valueOf(stringArray[i]));
		}

		return new ArrayList<>(set);

	}



	public static void main(String[] args) {
		
		System.out.print("Enter String one: ");
		boolean ouput = isPanGram("a quick brown fox jumps over  lazy dog");
		System.out.print("Output :" + ouput);
	
	}

}
