package April2025;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class InterviewQuestions {

	public static void main(String[] args) {
		ConsonantCount();

		generateWord(3, 2, 0); // Example 1
		generateWord(4, 1, 2); // Example 2
	}

	public static void generateWord(int aCount, int bCount, int cCount) {
		try {
			char lastChar1 = '\0', lastChar2 = '\0';

			while (aCount > 0 || bCount > 0 || cCount > 0) {
				boolean picked = false;

				if (aCount >= bCount && aCount >= cCount && !(lastChar1 == 'a' && lastChar2 == 'a')) {
					System.out.print('a');
					lastChar2 = lastChar1;
					lastChar1 = 'a';
					aCount--;
					picked = true;
				} else if (bCount >= aCount && bCount >= cCount && !(lastChar1 == 'b' && lastChar2 == 'b')) {
					System.out.print('b');
					lastChar2 = lastChar1;
					lastChar1 = 'b';
					bCount--;
					picked = true;
				} else if (cCount >= aCount && cCount >= bCount && !(lastChar1 == 'c' && lastChar2 == 'c')) {
					System.out.print('c');
					lastChar2 = lastChar1;
					lastChar1 = 'c';
					cCount--;
					picked = true;
				}

				if (!picked) {
					// If we can't pick according to highest count, try to pick any available which
					// is different
					if (aCount > 0 && !(lastChar1 == 'a' && lastChar2 == 'a')) {
						System.out.print('a');
						lastChar2 = lastChar1;
						lastChar1 = 'a';
						aCount--;
					} else if (bCount > 0 && !(lastChar1 == 'b' && lastChar2 == 'b')) {
						System.out.print('b');
						lastChar2 = lastChar1;
						lastChar1 = 'b';
						bCount--;
					} else if (cCount > 0 && !(lastChar1 == 'c' && lastChar2 == 'c')) {
						System.out.print('c');
						lastChar2 = lastChar1;
						lastChar1 = 'c';
						cCount--;
					} else {
						// If even that is not possible, then break
						break;
					}
				}
			}

			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ConsonantCount() {
		try {
			String input = "Hello World";
			int count = 0;
			input = input.toLowerCase();

			for (char c : input.toCharArray()) {
				if (c >= 'a' && c <= 'z' && !"aeiou".contains(c+"")) {
					count++;
				}
			}
			System.out.println("Number of consonants: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sumToFindDigonals() {
		try {
			int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

			int n = matrix.length;
			int primary = 0, secondary = 0;

			for (int i = 0; i < n; i++) {
				primary = primary + matrix[i][i];
				secondary = secondary + matrix[i][n - i - 1];
			}

			System.out.println("Primary Diagonal Sum: " + primary);
			System.out.println("Secondary Diagonal Sum: " + secondary);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeValueWhileReadingInMap() {
		try {

			Map<Integer, String> values = new HashMap<Integer, String>();
			values.put(1, "Gaurav");
			values.put(3, "Sushma");
			values.put(2, "Eshita");
			values.put(13, "Dheeraj");
			values.put(56, "Raju");
			values.put(72, "Govinda");

			Set<Entry<Integer, String>> valuesToBeRemoved = values.entrySet();
			Iterator<Entry<Integer, String>> iterator = valuesToBeRemoved.iterator();

			while (iterator.hasNext()) {
				Map.Entry<Integer, String> hasNext = iterator.next();

				if (hasNext.getKey() == 72) {
					iterator.remove();
				} else {
					System.out.println(hasNext.getKey() + ", " + hasNext.getValue());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sortValueBasisOnKeyvaluePair() {
		try {

			SortedMap<Integer, String> values = new TreeMap<Integer, String>();
			values.put(1, "Gaurav");
			values.put(3, "Sushma");
			values.put(2, "Eshita");

			for (Map.Entry<Integer, String> readValue : values.entrySet()) {
				System.out.println(readValue.getKey() + ", " + readValue.getValue());
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void shiftZeros() {
		try {

			int[] arrNum = { 1, -5, 0, 0, 8, 0, 1 };
			int[] newArr = new int[arrNum.length];
			int temp = 0;

			for (int i = 0; i < arrNum.length; i++) {
				if (arrNum[i] != 0) {
					newArr[temp++] = arrNum[i];
				}
			}

			/*
			 * // Fill remaining positions with 0 while (temp < arrNum.length) {
			 * arrNum[temp++] = 0; }
			 */

			for (int i = 0; i < arrNum.length; i++) {
				if (arrNum[i] == 0) {
					newArr[temp++] = arrNum[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(newArr[j] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void checkIfhasThreeConsecutiveSameChars() {
		try {
			String str = "aadheerajPraatapSinghhh";
			boolean flag = false;
			for (int i = 0; i < str.length() - 2; i++) {
				if ((str.charAt(i) == str.charAt(i + 1)) && ((str.charAt(i + 1) == str.charAt(i + 2)))) {
					flag = true;
				}
			}

			if (flag) {
				System.out.println("Statement have 3 consecutive char of same");
			} else {
				System.out.println("Statement doesn't have 3 consecutive char of same");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
