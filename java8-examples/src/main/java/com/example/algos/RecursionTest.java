package com.example.algos;

public class RecursionTest {
	
	public static void main (String args[] ) {
		callMeAgain (20);
	}

	private static void callMeAgain(int value) {
		
		if(value == 10) {
			return;
		}
		
		Integer integer = new Integer(value);
		integer = integer - 1 ;
		System.out.println("value within recursive code :" + value);
		callMeAgain(integer);
		
		System.out.println("value after recursive code :" + value);
		
	}
}
