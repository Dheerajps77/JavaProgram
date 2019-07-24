package com.JavaProgramExample;

import java.util.Arrays;

public class StringAnagram {

	public static boolean StringAnagramFunction(String str, String str2) {
		boolean flag = false;
		try {			
			String str4=str.toLowerCase();
			String str5=str2.toLowerCase();			
			char[] c1 = str4.toCharArray();
			char[] c2 = str5.toCharArray();
			
			int c1Length = c1.length;
			int c2Length = c2.length;
			if (c1Length == c2Length) {
				Arrays.sort(c1);
				Arrays.sort(c2);
				System.out.println(c1);
				System.out.println(c2);
				for (int i = 0; i < c1Length; i++) {
					if (c1[i] == c2[i]) {
						flag = true;
					}
					else {
						return flag=false;
					}
				}
			}
		} catch (Exception e) {
			throw e;
		}
		return flag;
	}

	public static void StringReverse() {
		try {

			String string = "Hello guys";
			char[] s = string.toCharArray();
			String str = "";
			for (int i = s.length - 1; i > 0; i--) {
				str = str + s[i];
			}
			System.out.println(str);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		String str = "Armyh";
		String str2 = "Maryj";

		boolean flag;
		flag = StringAnagramFunction(str, str2);
		if (flag) {
			System.out.println(str + " is anagram to this string : " + str2);
		}
		System.out.println(str + " is not anagram to this string : " + str2);
		StringReverse();
	}

}
