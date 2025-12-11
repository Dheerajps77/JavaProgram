package Dec2025;

import java.util.HashMap;
import java.util.Map;

public class minMaxOccurrenceFloat {

	public static void minMaxOccurrenceFloat() {

	    float[] arr = { 1.2f, 2.5f, 1.2f, 3.8f, 2.5f, 1.2f };

	    Map<Float, Integer> map = new HashMap<>();

	    for (float num : arr) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }

	    float maxElement = 0f, minElement = 0f;
	    int maxCount = 0, minCount = Integer.MAX_VALUE;

	    for (Map.Entry<Float, Integer> entry : map.entrySet()) {

	        if (entry.getValue() > maxCount) {
	            maxCount = entry.getValue();
	            maxElement = entry.getKey();
	        }

	        if (entry.getValue() < minCount) {
	            minCount = entry.getValue();
	            minElement = entry.getKey();
	        }
	    }

	    System.out.println("Max Float: " + maxElement + " → " + maxCount);
	    System.out.println("Min Float: " + minElement + " → " + minCount);
	}

	
	public static void main(String[] args) {
		minMaxOccurrenceFloat();
	}
}
