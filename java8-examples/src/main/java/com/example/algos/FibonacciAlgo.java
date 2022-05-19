package com.example.algos;

public class FibonacciAlgo {

	public static void generateFibo(int endCase) {

		StringBuilder builder = new StringBuilder();

		int sum = 0;
		int previousSum = 0;
		int currnetSum = 1;

		for (int i = 1; i <= endCase; i++) {

			sum = previousSum + currnetSum;
			currnetSum = previousSum;
			previousSum = sum;
			builder.append(sum);
			builder.append(",");

		}
		System.out.println(builder);
	}

	public static void main(String args[]) {
		generateFibo(10);
	}

}
