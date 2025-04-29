package April2025;

import java.util.HashMap;
import java.util.Map;

public class FindOddDuplicateAndUniqueInHashHmap {

	// Duplicates for int array
	public static void findDuplicatesInIntegers(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println("\nDuplicate Integers:");
		for (int key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.print(key + " ");
			}
		}
	}

	// Unique for int array
	public static void findUniquesInIntegers(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println("\nUnique Integers:");
		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
	}

	// Odd One for int array
	public static void findOddOneInIntegers(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : array) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		System.out.println("\nOdd-One Integers:");
		for (int key : map.keySet()) {
			if (map.get(key) % 2 != 0) {
				System.out.print(key + " ");
			}
		}
	}

	// Similar methods for String arrays
	public static void findDuplicatesInStrings(String[] array) {
		Map<String, Integer> map = new HashMap<>();
		for (String str : array) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		System.out.println("\nDuplicate Strings:");
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.print(key + " ");
			}
		}
	}

	public static void findUniquesInStrings(String[] array) {
		Map<String, Integer> map = new HashMap<>();
		for (String str : array) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		System.out.println("\nUnique Strings:");
		for (String key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
	}

	public static void findOddOneInStrings(String[] array) {
		Map<String, Integer> map = new HashMap<>();
		for (String str : array) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		System.out.println("\nOdd-One Strings:");
		for (String key : map.keySet()) {
			if (map.get(key) % 2 != 0) {
				System.out.print(key + " ");
			}
		}
	}

	// Similar methods for Character arrays
	public static void findDuplicatesInCharacters(char[] array) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : array) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("\nDuplicate Characters:");
		for (char key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.print(key + " ");
			}
		}
	}

	public static void findUniquesInCharacters(char[] array) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : array) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("\nUnique Characters:");
		for (char key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
	}

	public static void findOddOneInCharacters(char[] array) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : array) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("\nOdd-One Characters:");
		for (char key : map.keySet()) {
			if (map.get(key) % 2 != 0) {
				System.out.print(key + " ");
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = { 3, 5, 2, 2, 4, 5, 3, 7 };
		String[] strings = { "apple", "banana", "apple", "orange", "banana", "grape" };
		char[] chars = { 'a', 'b', 'c', 'a', 'd', 'b', 'e' };

		// Integers
		findDuplicatesInIntegers(nums);
		findUniquesInIntegers(nums);
		findOddOneInIntegers(nums);

		// Strings
		findDuplicatesInStrings(strings);
		findUniquesInStrings(strings);
		findOddOneInStrings(strings);

		// Characters
		findDuplicatesInCharacters(chars);
		findUniquesInCharacters(chars);
		findOddOneInCharacters(chars);
	}

}
