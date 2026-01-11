package Dec2025;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class minMaxOccurrenceChar {

	public static void minMaxOccurrenceCharUsingHashmp() {
    /*
	HashMap does not preserve order, so when multiple keys have the same min or max value, 
	any one of them may be returned during iteration.
     */
		String str = "DheerajPratapSinghdz".toLowerCase();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {

			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		char maxChar = ' ', minChar = ' ';
		int maxCount = 0, minCount = Integer.MAX_VALUE;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}

			if (entry.getValue() < minCount) {
				minCount = entry.getValue();
				minChar = entry.getKey();
			}
		}

		System.out.println("Max Char: " + maxChar + " → " + maxCount);
		System.out.println("Min Char: " + minChar + " → " + minCount);
	}
	
	

	public static void minMaxOccurrenceCharUsingHashTable() {
	/*
		
		➡ Min will be first occurring minimum
		➡ Max will be first occurring maximum
	*/
		String str = "DheerajPratapSinghdzzz".toLowerCase();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {

			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		char maxChar = ' ', minChar = ' ';
		int maxCount = 0, minCount = Integer.MAX_VALUE;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}

			if (entry.getValue() < minCount) {
				minCount = entry.getValue();
				minChar = entry.getKey();
			}
		}

		System.out.println("Max Char: " + maxChar + " → " + maxCount);
		System.out.println("Min Char: " + minChar + " → " + minCount);
	}

	public static void main(String[] args) {
		minMaxOccurrenceCharUsingHashTable();
	}
}
