package April2025;

import java.util.*;

public class MaxMinOccurrenceString {
	public static void main(String[] args) {
		String[] words = { "apple", "banana", "apple", "cherry", "banana", "banana", "cherry", "name" };

		HashMap<String, Integer> map = new HashMap<>();

		for (String word : words) {

			if (map.get(word) != null) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}

		String maxWord = "";
		String minWord = "";
		int maxFreq = 0;
		int minFreq = 0;
		boolean firstEntry = true; // Flag to handle first iteration

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String word = entry.getKey();
			int freq = entry.getValue();

			if (firstEntry) {
				maxFreq = freq;
				minFreq = freq;
				maxWord = word;
				minWord = word;
				firstEntry = false;
				continue;
			}

			if (freq > maxFreq) {
				maxFreq = freq;
				maxWord = word;
			}
			if (freq < minFreq) {
				minFreq = freq;
				minWord = word;
			}
		}

		System.out.println("String Max Occurrence: " + maxWord + " (count: " + maxFreq + ")");
		System.out.println("String Min Occurrence: " + minWord + " (count: " + minFreq + ")");
	}
}
