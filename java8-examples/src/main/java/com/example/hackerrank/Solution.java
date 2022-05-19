package com.example.hackerrank;

public class Solution {

	private static void getFlows(Integer number) {

		if (isOddNumber(number)) {
			System.out.println("Weird");
		}
		if (!isOddNumber(number) && isWithInRange(number, 2, 5)) {
			System.out.println("Not Weird");
		}
		if (!isOddNumber(number) && isWithInRange(number, 6, 20)) {
			System.out.println("Weird");
		}
		if (!isOddNumber(number) && isGreater(number, 20)) {
			System.out.println("Not Weird");
		}

	}

	private static boolean isWithInRange(Integer number, int startRange, int endRange) {
		return ((number >= startRange) && (number <= endRange) ? Boolean.TRUE : Boolean.FALSE);
	}

	private static boolean isGreater(Integer number, int endRange) {
		return ((number > endRange) ? Boolean.TRUE : Boolean.FALSE);
	}

	private static boolean isOddNumber(Integer number) {
		return (number % 2 == 0 ? Boolean.FALSE : Boolean.TRUE);
	}

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//int input = scanner.nextInt();
		getFlows(20);
		//scanner.close();
	}
}
