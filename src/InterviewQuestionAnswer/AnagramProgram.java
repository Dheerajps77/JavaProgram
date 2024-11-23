package InterviewQuestionAnswer;

import java.util.Arrays;

public class AnagramProgram {

	public static int[] getDigitsArray(int num) {

		char[] chars = String.valueOf(num).toCharArray();
		int[] digits = new int[chars.length];
		for (int i = 0; i < chars.length; i++) {
			digits[i] = chars[i] - '0';
		}
		return digits;
	}

	// Method to sort an array using Bubble Sort

	private static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					// Swap elements
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static boolean arraysEquals(int[] num, int[] num1) {
		try {
			if (num.length != num1.length) {
				return false;
			}
			for (int i = 0; i < num.length; i++) {
				if (num[i] != num1[i]) {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public static void checkNumberAnagramUsingForLoop() {
		try {

			int num = 123456;
			int num1 = 654321;

			int[] array = getDigitsArray(num);
			int[] array1 = getDigitsArray(num1);

			bubbleSort(array);
			bubbleSort(array1);

			if (arraysEquals(array, array1)) {
				System.out.println("Number are Anagram");
			} else {
				System.out.println("Numbers are not Anagram");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void checkNumberAnagramUsingInbuiltFunction() {
		try {
			int num = 123456;
			int num1 = 654321;

			int[] array = getDigitsArray(num);
			int[] array1 = getDigitsArray(num1);

			bubbleSort(array);
			bubbleSort(array1);

			if (Arrays.equals(array, array1)) {
				System.out.println("Number are Anagram");
			} else {
				System.out.println("Numbers are not Anagram");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static boolean StringAnagram() {
		boolean flag = true;
		try {
			String str = "damam";
			String str2 = "madam";

			if (str == null || str2 == null || str.length() != str2.length()) {
				return false;
			}
			char c[] = str.toCharArray();
			char c2[] = str2.toCharArray();
			char c1 = '\0', c3 = '\0';
			for (int i = 0; i < c.length; i++) {
				for (int j = i + 1; j < c.length; j++) {
					if (c[i] > c[j]) {
						c1 = c[i];
						c[i] = c[j];
						c[j] = c1;
					}
				}
			}

			for (int i = 0; i < c2.length; i++) {
				for (int j = i + 1; j < c2.length; j++) {
					if (c2[i] > c2[j]) {
						c3 = c2[i];
						c2[i] = c2[j];
						c2[j] = c3;
					}
				}
			}
			String string = new String(c);
			String string1 = new String(c2);

			System.out.println(string);
			System.out.println(string1);
			if (string.equals(string1)) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("String is not Anagram");
			}
		} catch (Exception e) {
			throw e;
		}
		return flag;
	}

	public static void main(String[] args) {

		StringAnagram();
	}
}