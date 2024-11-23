package Set1InterviewQuestionAnswer;

import java.util.HashSet;
import java.util.Set;

public class RemoveConsectiveDuplicatesValue {

	public static void main(String[] args) {
		removeDuplicateValues();
	}

	public static void removeDuplicateValues() {
		try {
			String str = "hello hello world world hello";
			String[] stringArr = str.split(" ");
			String[] newStringArr = new String[stringArr.length];
			Set<String> sets = new HashSet<String>();
			int temp = 0;

			for (int i = 0; i < stringArr.length; i++) {
				if (sets.add(stringArr[i]) != false) {
					newStringArr[temp++] = stringArr[i];
				}
			}

			for (int g = 0; g < temp; g++) {
				System.out.print(newStringArr[g] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeConsectiveDuplicateWords() {
		try {
			String str = "hello hello world world hello";
			String[] stringArr = str.split(" ");
			String[] newStringArr = new String[stringArr.length];
			int temp = 0;

			for (int i = 0; i < stringArr.length; i++) {
				if (i == 0 || !stringArr[i].equalsIgnoreCase(stringArr[i - 1])) {
					newStringArr[temp++] = stringArr[i];
				}
			}

			for (int g = 0; g < temp; g++) {
				System.out.print(newStringArr[g] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeConsectiveDuplicateChar() {
		try {
			String s1 = "aabccbac"; // abcba
			char[] charArr = s1.toCharArray();
			char[] newCharr = new char[charArr.length];
			int temp = 0;

			// StringBuilder builder = new StringBuilder();
			for (int i = 0; i < charArr.length; i++) {
				// Append the current character if it's the first one or not equal to the
				// previous one
				if (i == 0 || charArr[i] != charArr[i - 1]) {
					// builder.append(charArr[i]);
					newCharr[temp++] = charArr[i];
				}
			}
			// System.out.println(builder.toString());
			for (int g = 0; g < temp; g++) {
				// System.out.print(newCharr[g]);
			}
			// Print the result as a string using only the filled portion of newCharr
			System.out.println(new String(newCharr, 0, temp));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeConsectiveDuplicateNumber() {
		try {
			int[] n1 = { 3, 3, 53, 45, 6, 6, 34, 23, 52, 52, 52, 5, 2, 3 };// 3 53 45 6 34 23 52 5 2 3
			// StringBuilder build=new StringBuilder();
			int[] newArry = new int[n1.length];
			int temp = 0;
			for (int i = 0; i < n1.length; i++) {
				if (i == 0 || n1[i] != n1[i - 1]) {
					newArry[temp++] = n1[i];
					// build.append(n1[i]);
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(newArry[j] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}