package Aug2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharTypeCounter {

	public static void main(String[] args) {
		String str = "Hello World! 123\n\t";
		char[] c = str.toCharArray();

		Map<String, Integer> charTypeCountMap = new HashMap<String, Integer>();

		// Initialize counts for different types of characters
		charTypeCountMap.put("Digit", 0);
		charTypeCountMap.put("Uppercase Letter", 0);
		charTypeCountMap.put("Lowercase Letter", 0);
		charTypeCountMap.put("Whitespace", 0);
		charTypeCountMap.put("Other", 0);

		for (int i = 0; i < c.length; i++) {
			if (isDigit(c[i])) {
				charTypeCountMap.put("Digit", charTypeCountMap.get("Digit") + 1);
			} else if (isUppercaseLetter(c[i])) {
				charTypeCountMap.put("Uppercase Letter", charTypeCountMap.get("Uppercase Letter") + 1);
			} else if (isLowercaseLetter(c[i])) {
				charTypeCountMap.put("Lowercase Letter", charTypeCountMap.get("Lowercase Letter") + 1);
			} else if (isWhitespace(c[i])) {
				charTypeCountMap.put("Whitespace", charTypeCountMap.get("Whitespace") + 1);
			} else {
				charTypeCountMap.put("Other", charTypeCountMap.get("Other") + 1);
			}
		}

		// Print the counts for each type of character
		for (Entry<String, Integer> entry : charTypeCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

	public static boolean isUppercaseLetter(char c) {
		return c >= 'A' && c <= 'Z';
	}

	public static boolean isLowercaseLetter(char c) {
		return c >= 'a' && c <= 'z';
	}

	public static boolean isWhitespace(char c) {
		return c == ' ' || c == '\t' || c == '\n' || c == '\r';
	}

}
