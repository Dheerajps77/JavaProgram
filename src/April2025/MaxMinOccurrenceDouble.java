package April2025;

import java.util.*;

public class MaxMinOccurrenceDouble {
    public static void main(String[] args) {
        Double[] arr = {1.1, 2.2, 1.1, 3.3, 2.2, 2.2};

        HashMap<Double, Integer> map = new HashMap<>();

        for (Double num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Double maxKey = 0.0, minKey = 0.0;
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            Double key = entry.getKey();
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

        System.out.println("Double Max Occurrence: " + maxKey + " (count: " + maxFreq + ")");
        System.out.println("Double Min Occurrence: " + minKey + " (count: " + minFreq + ")");
    }
}

