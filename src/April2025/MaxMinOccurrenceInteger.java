package April2025;

import java.util.*;

public class MaxMinOccurrenceInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Fill map
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxKey = 0, minKey = 0;
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                maxKey = key;
            }
            if (freq < minFreq) {
                minFreq = freq;
                minKey = key;
            }
        }

        System.out.println("Integer Max Occurrence: " + maxKey + " (count: " + maxFreq + ")");
        System.out.println("Integer Min Occurrence: " + minKey + " (count: " + minFreq + ")");
    }
}
