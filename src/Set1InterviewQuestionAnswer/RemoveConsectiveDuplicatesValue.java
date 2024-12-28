package Set1InterviewQuestionAnswer;

import java.util.HashSet;
import java.util.Set;

public class RemoveConsectiveDuplicatesValue {

	public static void main(String[] args) {
		removeDuplicateCharValuesWithoutSorting();
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
			int[] n1 = { 3, 3, 53, 45, 6, 6, 34, 23, 52, 52, 52, 5, 2, 3, 6 };
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
				System.out.print(newArry[j] + " "); // 3 53 45 6 34 23 52 5 2 3, 6
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeDuplicateValuesInArray() {
		try {
			int[] n1 = { 3, 3, 53, 45, 6, 6, 34, 23, 52, 52, 52, 5, 2, 3, 6, 7 };
			int temp = 0;
			for (int i = 0; i < n1.length; i++) {
				for (int j = i + 1; j < n1.length; j++) {
					if (n1[i] > n1[j]) {
						temp = n1[i];
						n1[i] = n1[j];
						n1[j] = temp;
					}
				}
			}

			for (int h = 0; h < n1.length; h++) {
				if (h == 0 || n1[h] != n1[h - 1]) {
					System.out.print(n1[h] + " ");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeDuplicateValuesWithoutSorting() {
		try {
			int[] n1 = { 3, 3, 53, 45, 6, 6, 34, 23, 52, 52, 52, 5, 2, 3, 6, 7 };
			int[] uniqueArr = new int[n1.length];
			int temp = 0;

			// Traverse the array
			for (int i = 0; i < n1.length; i++) {
				boolean isDuplicate = false;

				// Check if the current element is already in uniqueArr
				for (int j = 0; j < temp; j++) {
					if (n1[i] == uniqueArr[j]) {
						isDuplicate = true;
						break;
					}
				}

				// If not a duplicate, add to uniqueArr
				if (!isDuplicate) {
					uniqueArr[temp++] = n1[i];
				}
			}

			// Print the unique array
			for (int g = 0; g < temp; g++) {
				System.out.print(uniqueArr[g] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeDuplicateCharValuesWithoutSorting() {
		try {
			String s1 = "aabccbac";
			char[] charArr = s1.toCharArray();
			char[] newChar = new char[charArr.length];
			int temp = 0;
			for (int i = 0; i < charArr.length; i++) {
				boolean flag = false;

				for (int j = 0; j < temp; j++) {
					if (charArr[i] == newChar[j]) {
						flag = true;
						break;
					}
				}

				if (!flag) {
					newChar[temp++] = charArr[i];
				}

			}

			String str = new String(newChar, 0, temp);
			System.out.println(str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}