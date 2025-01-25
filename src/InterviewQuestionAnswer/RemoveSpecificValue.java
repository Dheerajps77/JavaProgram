package InterviewQuestionAnswer;

import java.util.HashSet;
import java.util.Set;

public class RemoveSpecificValue {

	public static void main(String[] args) {
		removeDuplicayInArray();
	}

	public static void removeDuplicayInArrayUsingSet() {
		try {

			int[] arr = { 100, 5, 1, 2, 3, 2, 1, 4, 5 };
			Set<Integer> sets = new HashSet<Integer>();
			int[] newArr = new int[arr.length];
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (sets.add(arr[i]) != false) {
					newArr[temp++] = arr[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(newArr[j]); // 12345
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeDuplicayInArray() {
		try {

			int[] arr = { 1, 2, 3, 2, 1, 7, 910, 8, 9, 4, 5, 4, 2, 1, 5, 5, 6, 7, 10 };

			int[] newArr = new int[arr.length];
			int temp = 0, temp1 = 0;

			for (int j = 0; j < arr.length; j++) {

				for (int g = j + 1; g < arr.length - 1; g++) {
					if (arr[j] > arr[g]) {
						temp1 = arr[j];
						arr[j] = arr[g];
						arr[g] = temp1;
					}
				}
			}

			for (int i = 0; i < arr.length - 1; i++) {
				if (i == 0 || arr[i] != arr[i - 1]) {
					newArr[temp++] = arr[i];
				}
			}

			for (int k = 0; k < temp; k++) {
				System.out.print(newArr[k] + " "); // 1 2 3 4 5 6 7 8 9 910
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeWordsInString() {
		try {

			String str[] = "This is a sample string".split(" ");
			String wordToBeRemove = "sample";
			String string1 = "";
			for (int i = 0; i < str.length; i++) {
				if (!str[i].equalsIgnoreCase(wordToBeRemove)) {
					string1 = string1 + str[i];
				}
				if (i < str.length - 1) {
					string1 = string1 + " ";
				}
			}
			System.out.print(string1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeSpecificDigitsFromNumber() {
		try {

			int num = 493024214;
			int numToBeRemove = 4;

			char[] charArr = String.valueOf(num).toCharArray();
			int temp = 0;
			char[] numArr = new char[charArr.length];
			for (int i = 0; i < charArr.length; i++) {
				if (charArr[i] - '0' != numToBeRemove) {
					numArr[temp++] = charArr[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(numArr[j]);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeSpecificCharUsingCharArray() {
		try {

			String str = "This is a sample string";
			char[] charArray = str.toCharArray();
			char charToBeRemove = 's';

			char[] newChar = new char[charArray.length];
			int temp = 0;
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] != charToBeRemove) {
					newChar[temp++] = charArray[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(newChar[j]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeSpecificCharUsingString() {
		try {

			String str = "This is a sample string";
			char[] charArray = str.toCharArray();
			char charToBeRemove = 'g';

			String newString = "";
			for (int i = 0; i < charArray.length; i++) {
				if (charArray[i] != charToBeRemove) {
					newString = newString + charArray[i];
				}
			}

			System.out.println(newString);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
