package com.JavaProgramExample;

public class Fibonacci {

	public static void printFibonacci() {
		try {

			int a = 0;
			int b = 1;
			int c;
			for (int i = 0; i < 10; i++) {
				c = a + b;
				a = b;
				b = c;

				System.out.println(a);
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		printFibonacci();
	}

}
