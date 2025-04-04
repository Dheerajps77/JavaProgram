package March2025;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfValuesInArrayUsingMap {

	public static void main(String[] args) {
		// findMaxOccuranceOfEachCharInString();
		findMinOccuranceOfEachCharInString();
	}

	public static void findMaxOccuranceOfEachCharInString() {
		try {

			String str = "Dheeraj Pratap Singhd";
			char[] charArr = str.toCharArray();
			HashMap<Character, Integer> maps = new HashMap<>();

			int maxCount = 0;
			char maxElement = ' ';
			for (char charValue : charArr) {
				if (maps.get(charValue) != null) {
					maps.put(charValue, maps.get(charValue) + 1);
				}

				else {
					maps.put(charValue, 1);
				}
				/*
				 * if (maps.get(charValue) > maxCount) { maxCount = maps.get(charValue);
				 * maxElement = charValue; }
				 */
			}

			// In Java, when you have a HashMap, it stores data as key-value pairs.
			// The keySet() method returns a Set view of all the keys present in the map.
			// When you iterate over a map using keySet(), you are iterating only over the
			// keys, not the values.

			// Find the character with maximum occurrence

			for (char key : maps.keySet()) {
				int count = maps.get(key);
				if (count > maxCount) {
					maxCount = count;
					maxElement = key;
				}
			}

			System.out.println("Actual Value : " + str);
			System.out.println("Max occurance of char : " + maxElement + " and max occurance of time : " + maxCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findMinOccuranceOfEachCharInString() {
		try {

			String str = "Dheeraj Pratap Singhdz";
			char[] charArr = str.toCharArray();
			HashMap<Character, Integer> maps = new HashMap<>();

			int minCount = Integer.MAX_VALUE;
			char minElement = ' ';
			for (char charValue : charArr) {

				if (charValue == ' ')
					continue;

				if (charValue >= 'A' && charValue <= 'Z') {
					charValue = (char) (charValue + 32);
				}
				if (maps.get(charValue) != null) {
					maps.put(charValue, maps.get(charValue) + 1);
				}

				else {
					maps.put(charValue, 1);
				}
			}

			// Find the character with minimum occurrence

			for (char key : maps.keySet()) {
				int count = maps.get(key);
				if (count < minCount) {
					minCount = count;
					minElement = key;
				}
			}

			System.out.println("Actual Value : " + str);
			System.out.println("Min occurance of char : " + minElement + " and min occurance of time : " + minCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void maxOccurrenceInInteger() {
		int[] arr = { 1, 2, 3, 2, 2, 1 };
		Map<Integer, Integer> countMap = new HashMap<>();
		int maxCount = 0;
		int maxElement = arr[0];

		for (int num : arr) {
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) + 1);
			} else {
				countMap.put(num, 1);
			}

			if (countMap.get(num) > maxCount) {
				maxCount = countMap.get(num);
				maxElement = num;
			}
		}

		System.out.println("Integer with maximum occurrence: " + maxElement);
		System.out.println("Occurrence count: " + maxCount);
	}

	public static void maxOccurrenceInFloat() {
		float[] arr = { 1.1f, 2.2f, 1.1f, 3.3f, 2.2f, 1.1f };
		Map<Float, Integer> countMap = new HashMap<>();
		int maxCount = 0;
		float maxElement = arr[0];

		for (float num : arr) {
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) + 1);
			} else {
				countMap.put(num, 1);
			}

			if (countMap.get(num) > maxCount) {
				maxCount = countMap.get(num);
				maxElement = num;
			}
		}

		System.out.println("Float with maximum occurrence: " + maxElement);
		System.out.println("Occurrence count: " + maxCount);
	}

	public static void maxOccurrenceInDouble() {
		double[] arr = { 1.1, 2.2, 1.1, 3.3, 2.2, 1.1 };
		Map<Double, Integer> countMap = new HashMap<>();
		int maxCount = 0;
		double maxElement = arr[0];

		for (double num : arr) {
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) + 1);
			} else {
				countMap.put(num, 1);
			}

			if (countMap.get(num) > maxCount) {
				maxCount = countMap.get(num);
				maxElement = num;
			}
		}

		System.out.println("Double with maximum occurrence: " + maxElement);
		System.out.println("Occurrence count: " + maxCount);
	}

	public static void maxOccurrenceInStringArray() {
		String[] arr = { "apple", "banana", "apple", "orange", "banana", "apple" };
		Map<String, Integer> countMap = new HashMap<>();
		int maxCount = 0;
		String maxElement = arr[0];

		for (String str : arr) {
			if (countMap.containsKey(str)) {
				countMap.put(str, countMap.get(str) + 1);
			} else {
				countMap.put(str, 1);
			}

			if (countMap.get(str) > maxCount) {
				maxCount = countMap.get(str);
				maxElement = str;
			}
		}

		System.out.println("String with maximum occurrence: " + maxElement);
		System.out.println("Occurrence count: " + maxCount);
	}
}
