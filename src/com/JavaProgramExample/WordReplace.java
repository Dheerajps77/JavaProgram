package com.JavaProgramExample;

public class WordReplace {

	public static void repeatedStringCount() {
		String str = "Hello guys . Whats up guys ? guys ";

		try {
			int temp = 0;
			String[] str1 = str.split(" ");
			for (int i = 0; i < str1.length; i++) {
				if (str1[i].equals("guys")) {
					temp++;
				}
			}
			System.out.println(temp);
		} catch (Exception e) {
			throw e;
		}

		/*
		 * Output: 3
		 */
	}

	public static void RepeatedWordPrint() {
		String str = "Hello guys . Whats up guys ? guys ";
		String sr = "";
		try {

			String[] str1 = str.split(" ");
			for (int i = 0; i < str1.length; i++) {
				if (str1[i].equalsIgnoreCase("guys")) {
					sr = sr + " " + str1[i];
				}
			}
			System.out.println(sr);
		} catch (Exception e) {

		}
	}

	public static void replaceRepeatedWordPrint() {
		String str = "Hello guys . Whats up guys ? guys ";

		System.out.println("Actual :--> " + str);
		StringBuilder sb = new StringBuilder();
		try {

			String[] str1 = str.split("guys");
			for (int i = 0; i < str1.length - 1; i++) {
				sb.append(str1[i]).append("boy");
				if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + "guys")) {
					sb.append("boy");
				}
			}
			System.out.println("Updated :--> " + sb.toString());
		} catch (Exception e) {
			throw e;
		}

		/*
		 * OutPut :- Actual :--> Hello guys . Whats up guys ? guys Updated :-->
		 * Hello boy . Whats up boy ? boy
		 * 
		 */
	}

	public static void testString() {
		try {

			String str = "Hello guys . Whats up guys ? guys ";
			int temp = 0;
			for (int i = 0; i < str.length() - 1; i++) {

				if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase("guys" + " ")) {
					temp++;
				}
			}
			System.out.println(temp);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		testString();

	}
}
