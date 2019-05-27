package com.JavaProgramExample;

public class PrimeNumber {

	public static void main(String[] args) {

		CheckPrimeNumber();

	}

	public static void CheckPrimeNumber() {
		try {
			int n = 10, n1 = 0;
			boolean flag = false;
			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0) {
					n1 = n1++;
					flag = true;
				}
			}

			if (flag) {
				System.out.println(n + " number is not prime");
			} else {
				System.out.println(n + " number is prime");
			}
		} catch (

		Exception e) {

			e.printStackTrace();
		}
	}
}
