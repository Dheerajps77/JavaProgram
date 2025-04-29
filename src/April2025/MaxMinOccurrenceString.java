package April2025;

import java.util.*;

public class MaxMinOccurrenceString {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana", "banana"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String maxWord = "", minWord = "";
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();

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
