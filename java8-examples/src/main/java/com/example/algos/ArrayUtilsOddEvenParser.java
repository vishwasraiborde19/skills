package com.example.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class ArrayUtilsOddEvenParser {

	private static final String ENTER_ARRAY_MESSAGE = "Please Enter an Integer Array and presss Enter:= ";
	private static final String ASTRIX = "*";
	private static final String DASH = "-";

	public static String generateStringWithOddEvenSeparator(List<Integer> input) {

		StringBuilder finalString = new StringBuilder();

		for (int currentindex = 0, nextIndex = 1; nextIndex < input.size(); currentindex++, nextIndex++) {

			int currnetValue = input.get(currentindex);
			int nextValue = input.get(nextIndex);

			finalString.append(currnetValue);

			if (isNumberEven(currnetValue) && isNumberEven(nextValue)) {
				finalString.append(ASTRIX);

			} else if (!isNumberEven(currnetValue) && !isNumberEven(nextValue)) {
				finalString.append(DASH);
			}

			if (nextIndex == (input.size() - 1)) {
				finalString.append(nextValue);
				break;
			}

		}
		return finalString.toString();
	}

	public static List<Integer> copyValuesAsList(String array) {
		char[] argument = array.toCharArray();
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < argument.length; i++) {
			intList.add(getCharToInt(argument[i]));
		}
		return intList;
	}

	private static boolean isNumberEven(Integer number) {
		return (number % 2 == 0 ? Boolean.TRUE : Boolean.FALSE);
	}

	private static Integer getCharToInt(char intAsString) {
		return Integer.parseInt(String.valueOf(intAsString));
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print(ENTER_ARRAY_MESSAGE);

		while (scanner.hasNext()) {

			String stringofintegers = scanner.next();
			List<Integer> input = copyValuesAsList(stringofintegers);

			System.out.println("Output :" + generateStringWithOddEvenSeparator(input));
			System.out.println(ENTER_ARRAY_MESSAGE);
		}
		scanner.close();

	}

}
