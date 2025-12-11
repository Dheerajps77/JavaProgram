package Dec2025;

import java.util.HashMap;
import java.util.Map;

public class minMaxOccurrenceString {

	public static void minMaxOccurrenceString() {

	    String[] arr = {
	        "java", "python", "java", "selenium", "java", "python", "Hi"
	    };

	    Map<String, Integer> map = new HashMap<>();

	    for (String word : arr) {
	        map.put(word, map.getOrDefault(word, 0) + 1);
	    }

	    String maxWord = "", minWord = "";
	    int maxCount = 0, minCount = Integer.MAX_VALUE;

	    for (Map.Entry<String, Integer> entry : map.entrySet()) {

	        if (entry.getValue() > maxCount) {
	            maxCount = entry.getValue();
	            maxWord = entry.getKey();
	        }

	        if (entry.getValue() < minCount) {
	            minCount = entry.getValue();
	            minWord = entry.getKey();
	        }
	    }

	    System.out.println("Max String: " + maxWord + " → " + maxCount);
	    System.out.println("Min String: " + minWord + " → " + minCount);
	}

	public static void main(String[] args) {
		minMaxOccurrenceString();
	}
}
