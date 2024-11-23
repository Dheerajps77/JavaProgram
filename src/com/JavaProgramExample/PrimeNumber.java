package com.JavaProgramExample;

public class PrimeNumber {

	public static void main(String[] args) {

		CheckPrimeNumber();

	}

	public static void CheckPrimeNumber() {
		try {
			int n = 13, n1 = 0;
			boolean flag = true;
			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0) {					
					flag = false;	
				}
			}

			if (flag) {
				System.out.println(n + " number is prime");
			} else {
				System.out.println(n + " number is not prime");
			}
		} catch (

		Exception e) {

			e.printStackTrace();
		}
	}
}
