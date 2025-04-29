package April2025;

import java.util.*;

public class MaxMinOccurrenceFloat {
    public static void main(String[] args) {
        Float[] arr = {1.1f, 2.2f, 1.1f, 3.3f, 2.2f, 2.2f};

        HashMap<Float, Integer> map = new HashMap<>();

        for (Float num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Float maxKey = 0.0f, minKey = 0.0f;
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;

        for (Map.Entry<Float, Integer> entry : map.entrySet()) {
            Float key = entry.getKey();
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

        System.out.println("Float Max Occurrence: " + maxKey + " (count: " + maxFreq + ")");
        System.out.println("Float Min Occurrence: " + minKey + " (count: " + minFreq + ")");
    }
}
