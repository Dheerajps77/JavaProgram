package Dec2025;

import java.util.HashMap;
import java.util.Map;

public class minMaxOccurrenceInt {

	public static void minMaxOccurrenceInt() {

		int[] arr = { 10, 20, 10, 30, 20, 10, 40, 9 };

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int maxCount = 0;
		int minCount = Integer.MAX_VALUE;
		int maxElement = 0, minElement = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int count = entry.getValue();

			if (count > maxCount) {
				maxCount = count;
				maxElement = entry.getKey();
			}

			if (count < minCount) {
				minCount = count;
				minElement = entry.getKey();
			}
		}

		System.out.println("Max Int: " + maxElement + " → " + maxCount);
		System.out.println("Min Int: " + minElement + " → " + minCount);
	}

	public static void main(String[] args) {
		minMaxOccurrenceInt();
	}
}
