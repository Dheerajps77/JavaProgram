package April2025;

import java.util.*;

public class MaxMinOccurrenceChar {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'b'};

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = 0, minChar = 0;
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                maxChar = ch;
            }
            if (freq < minFreq) {
                minFreq = freq;
                minChar = ch;
            }
        }

        System.out.println("Char Max Occurrence: " + maxChar + " (count: " + maxFreq + ")");
        System.out.println("Char Min Occurrence: " + minChar + " (count: " + minFreq + ")");
    }
}
