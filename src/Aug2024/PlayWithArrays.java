package Aug2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PlayWithArrays {

	public static int randomNumber() {
		return (int) (Math.random() * 100);
	}

	public static void userSpecificToShow2DArrays() {

		Scanner scanner = null;
		int rows, column;
		try {
			scanner = new Scanner(System.in);
			System.out.println("Please let us know the row count you want to enter");
			rows = scanner.nextInt();

			System.out.println("Please let us know the column count you want to enter");
			column = scanner.nextInt();

			int[][] arrays = new int[rows][column];

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < column; j++) {
					arrays[i][j] = randomNumber();
				}
			}

			// Displaying the array elements
			System.out.println("2D Array Elements:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < column; j++) {
					System.out.print(arrays[i][j] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			throw e;
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	public static void findMinAndMaxUsingDirectApproach() {
		try {
			int[] number = { 32, 14, 3, 68, 34, 543, 32, 465, 9, 48, 254, 2244, 24, 12, 72, 54, 46, 6 };

			int min = number[0];
			int max = number[0];

			for (int i = 0; i < number.length; i++) {
				if (min < number[i]) {
					min = number[i];
				} else if (max > number[i]) {
					max = number[i];
				}
			}
			System.out.println("Minimum value is : " + min);
			System.out.println("Maximum value is : " + max);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void findMinAndMaxUsingBubbleSort() {
		try {
			int[] number = { 32, 14, 3, 68, 34, 543, 32, 465, 9, 48, 254, 2244, 24, 12, 72, 54, 46, 6 };
			int temp = 0;
			for (int i = 0; i < number.length; i++) {
				for (int j = i + 1; j < number.length; j++) {
					if (number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}
				System.out.println(number[i]);
			}

			System.out.println("Max value : " + (number[number.length - 1]));
			System.out.println("Min value : " + (number[0]));
		} catch (Exception e) {
			throw e;
		}
	}

	public static void duplicateInArray() {
		try {

			int[] number = { 32, 4, 3, 2, 34, 4, 5, 3, 2, 2, 4, 5, 6, 5, 4, 3, 21, 4, 6, 65, 32 };
			int dupTemp = 0, nonDupTemp = 0;
			Set<Integer> integers = new HashSet<Integer>();

			System.out.println("Below are the duplicate values");
			for (int i = 0; i < number.length; i++) {
				if (integers.add(number[i]) != true) {
					dupTemp++;
					System.out.print(number[i] + " ");
				} else {
					nonDupTemp++;
				}
			}

			System.out.println("\nTotal duplicate count of values are : " + dupTemp);
			System.out.println("Total Non-duplicate count of values are : " + nonDupTemp);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void findDuplicateValueWithCount() {
		String[] stringArray;
		String phrase;
		StringBuilder builder;
		Map<String, Integer> map;
		char[] charArray;
		try {
			map = new HashMap<String, Integer>();
			phrase = "The cat sat on the mat and the mat was warm. She saw a big, big dog in the yard."
					+ "This is the best, best coffee I've ever had. He promised to call, call her later."
					+ "The quick brown fox jumps over the lazy dog and the lazy fox runs away quickly, quickly, and quietly.";
			builder = new StringBuilder();
			charArray = phrase.toCharArray();

			for (int i = 0; i < charArray.length; i++) {
				if ((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'A' && charArray[i] <= 'Z')
						|| (charArray[i] == ' ')) {
					builder.append(charArray[i]);
				}
			}
			stringArray = builder.toString().split(" ");

			for (int i = 0; i < stringArray.length; i++) {
				if (map.get(stringArray[i]) != null) {
					map.put(stringArray[i], map.get(stringArray[i]) + 1);
				} else {
					map.put(stringArray[i], 1);
				}
			}

			Set<Entry<String, Integer>> sets = map.entrySet();
			Iterator<Entry<String, Integer>> iterable = sets.iterator();

			while (iterable.hasNext()) {
				Entry<String, Integer> entry = iterable.next();
				System.out.println(entry.getKey() + "===>" + entry.getValue());
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		findMinAndMaxUsingDirectApproach();
	}

}
