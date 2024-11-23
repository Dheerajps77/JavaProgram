package com.JavaProgramExample;

public class FactorialOfNumber {

	public static void main(String[] args) {

		// CheckFactorialNumber();
		String string = "slkfk";
		String number = "33245";

		boolean bool = isNumeric(number);

		if (bool) {
			System.out.println("String is string");
		} else {
			System.out.println("String is number");
		}

	}
	
	public static boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c))
				return false;
		}
		return true;
	}

	public static void CheckFactorialNumber() {
		try {
			int n = 5;
			int temp = 1;

			for (int i = 1; i <= n; i++) {
				temp = temp * i;
			}

			System.out.println(temp);

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
