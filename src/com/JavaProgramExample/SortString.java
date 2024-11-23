package com.JavaProgramExample;

public class SortString {

	public static void main(String[] args) {
		SortStringProgram();
	}

	public static void shiftZeroNumberToRight() {
		try {

			int n[] = { 44, 6, 75, 0, 3, 0, 7, 0, 433, 0, 0, 20, 0, 0, 6, 7, 8 };
			int temp = 0;
			for (int i = 0; i < n.length; i++)
				if (n[i] != 0)
					n[temp++] = n[i];
			while (temp < n.length)
				n[temp++] = 0;

			for (int j = 0; j < n.length; j++) {
				System.out.print(n[j] + " ");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void SortStringProgram() {
		String[] str = { "Thanos", "Captain", "Tony Stark", "Thor", "Barton", "Avengers", "Dr. Strange" };
		int totalLength = str.length;
		String temp = "";

		for (int i = 0; i < totalLength; i++) {
			for (int j = i + 1; j < totalLength; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			System.out.println(str[i]);
		}
		System.out.println();
		System.out.println("After Descending order");

		for (int j = str.length - 1; j > 0; j--) {
			System.out.println(str[j]);
		}
	}

}
