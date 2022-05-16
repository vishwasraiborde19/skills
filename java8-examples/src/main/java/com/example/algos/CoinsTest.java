package com.example.algos;

import java.util.Scanner;

public class CoinsTest {

	/**
	 * Question 1: Given coins of value 1, 3, and 6 and a sum, what is the minimum
	 * number of coins needed to reach the sum?
	 * (https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/)
	 */

	public static void getTheleashNumberOfCoins(Integer sum) {
		
		int coinValueSix = 6;
		int coinValueThree = 3;
		int coinValueOne = 1;
		int totalcoins = 0;

		while ( totalcoins < coinValueSix) {
			totalcoins = sum / coinValueSix;
			sum = sum - (coinValueSix * totalcoins);
			System.out.println(coinValueSix + " * " + totalcoins + "=" + coinValueSix * totalcoins);
		}
		
		while ( sum >= coinValueThree ) {
			totalcoins = sum / coinValueThree;
			sum = sum - (coinValueThree * totalcoins);
			System.out.println(coinValueThree + " * " + totalcoins + "=" + coinValueThree * totalcoins);
		}
		
		while ( sum >= coinValueOne) {
			totalcoins = sum / coinValueOne;
			sum = sum - (coinValueThree * totalcoins);
			System.out.println(coinValueOne + " * " + totalcoins + "=" + coinValueOne * totalcoins);
		}


	}

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a total and we will let you know the lowest number of coins");
		while(scanner.hasNext()) {
			getTheleashNumberOfCoins(scanner.nextInt());
			
			System.out.println("Enter a total and we will let you know the lowest number of coins");
		}
		
		
	}

}
