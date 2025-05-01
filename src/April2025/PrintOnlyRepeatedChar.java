package April2025;

import java.util.HashMap;
import java.util.Map;

public class PrintOnlyRepeatedChar {
	public static String removeDuplicateCharMethod(String strName, char charToBeRemoved) {

		char[] charArr = strName.toLowerCase().toCharArray();
		StringBuilder builder = new StringBuilder();

		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();

		for (char charValue : charArr) {
			if (maps.get(charValue) != null) {
				maps.put(charValue, maps.get(charValue) + 1);
			} else {
				maps.put(charValue, 1);
			}
		}

		// Only care about the target character
		// int count = maps.getOrDefault(Character.toLowerCase(charToBeRemoved), 0);
		// if (count > 1) {
//	        builder.append(charToBeRemoved).append(",").append(count);
		// }

		for (Map.Entry<Character, Integer> values : maps.entrySet()) {
			if (values.getValue() > 1 && values.getKey() == charToBeRemoved) {
				builder.append(values.getKey() + "," + values.getValue());
			}
		}

		return builder.toString();
	}

	public static void main(String[] args) {

		String str = "Dheeraj Pratap Singh"; // output : Dheerj Prtp Singh
		char charValue = 'a';

		String value = removeDuplicateCharMethod(str, charValue);
		System.out.println(value);
	}

}
