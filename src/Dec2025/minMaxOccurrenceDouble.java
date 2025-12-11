package Dec2025;

import java.util.HashMap;
import java.util.Map;

public class minMaxOccurrenceDouble {

	public static void minMaxOccurrenceDouble() {

	    double[] arr = { 2.3, 4.5, 2.3, 6.7, 4.5, 2.3 };

	    Map<Double, Integer> map = new HashMap<>();

	    for (double num : arr) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }

	    double maxElement = 0, minElement = 0;
	    int maxCount = 0, minCount = Integer.MAX_VALUE;

	    for (Map.Entry<Double, Integer> entry : map.entrySet()) {

	        if (entry.getValue() > maxCount) {
	            maxCount = entry.getValue();
	            maxElement = entry.getKey();
	        }

	        if (entry.getValue() < minCount) {
	            minCount = entry.getValue();
	            minElement = entry.getKey();
	        }
	    }

	    System.out.println("Max Double: " + maxElement + " → " + maxCount);
	    System.out.println("Min Double: " + minElement + " → " + minCount);
	}

	public static void main(String[] args) {
		minMaxOccurrenceDouble();
	}
}
