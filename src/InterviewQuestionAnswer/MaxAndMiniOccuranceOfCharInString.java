package InterviewQuestionAnswer;

import java.util.HashMap;
import java.util.Map;

public class MaxAndMiniOccuranceOfCharInString {

	public static void maxOccurrenceInString(String input) {
		int maxOccurrenceCount = 0;
		char maxOccurrenceChar = ' ';

		try {
			for (int i = 0; i < input.length(); i++) {
				char currentChar = input.charAt(i);
				int count = 0;

				// Count occurrences of currentChar in the input string
				for (int j = 0; j < input.length(); j++) {
					if (input.charAt(j) == currentChar) {
						count++;
					}
				}

				// Update maxOccurrenceCount and maxOccurrenceChar if necessary
				if (count > maxOccurrenceCount) {
					maxOccurrenceCount = count;
					maxOccurrenceChar = currentChar;
				}
			}

			// Print the result outside the loops
			System.out.println("Character with maximum occurrence: " + maxOccurrenceChar);
			System.out.println("Occurrence count: " + maxOccurrenceCount);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void minOccurrenceInString(String input) {
		int minOccurrenceCount = input.length();
		char minOccurrenceChar = ' ';

		try {
			for (int i = 0; i < input.length(); i++) {
				char currentChar = input.charAt(i);
				int count = 0;

				// Count occurrences of currentChar in the input string
				for (int j = 0; j < input.length(); j++) {
					if (input.charAt(j) == currentChar) {
						count++;
					}
				}

				// Update maxOccurrenceCount and maxOccurrenceChar if necessary
				if (count < minOccurrenceCount) {
					minOccurrenceCount = count;
					minOccurrenceChar = currentChar;
				}
			}

			// Print the result outside the loops
			System.out.println("Character with maximum occurrence: " + minOccurrenceChar);
			System.out.println("Occurrence count: " + minOccurrenceCount);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void maximumOccuranceofChar() {
		try {

			String input = "javajjjjjjjjj programming language";
			char[] charArray = input.toCharArray();

			// Use a map to count occurrences of each character
			Map<Character, Integer> maps = new HashMap<Character, Integer>();

			for (int i = 0; i < charArray.length; i++) {
				if (maps.get(charArray[i]) != null) {
					maps.put(charArray[i], maps.get(charArray[i]) + 1);
				} else {
					maps.put(charArray[i], 1);
				}
			}

			for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
				// System.out.println(entry.getKey() + " : " + entry.getValue());
			}

			// Initialize variables to keep track of the max character and its count
			char maxChar = ' ';
			int maxCount = 0;

			// Iterate over the map to find the character with the highest occurrence
			for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
				if (entry.getValue() > maxCount) {
					maxChar = entry.getKey();
					maxCount = entry.getValue();
				}
			}

			// Print the result
			System.out.println("Character with highest occurrence: " + maxChar);
			System.out.println("Occurrences: " + maxCount);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void maximumOccuranceHighestChar() {
		try {

			String input = "java programming language";

			// Use a map to count occurrences of each character
			Map<Character, Integer> charCountMap = new HashMap<>();

			// Count each character in the input string
			for (char c : input.toCharArray()) {
				if (c != ' ') { // Ignore spaces
					charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
				}
			}

			// Find the character with the highest occurrence
			char maxChar = ' ';
			int maxCount = 0;
			for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
				if (entry.getValue() > maxCount) {
					maxChar = entry.getKey();
					maxCount = entry.getValue();
				}
			}

			System.out.println("Character with the highest occurrence: " + maxChar);
			System.out.println("Occurrences: " + maxCount);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// String input = "java programming language";
		/// minOccurrenceInString(input);
		maximumOccuranceofChar();
	}
}
