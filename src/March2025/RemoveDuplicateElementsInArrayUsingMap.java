package March2025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateElementsInArrayUsingMap {

	public static void main(String[] args) {
		RemoveDuplicatesInNumberArray();
	}

	public static void RemoveDuplicatesInNumberArray() {
		try {

			int[] arrayOfNum = { 3, 5, 2, 2, 4, 5, 6, 3, 24, 5, 2, 3, 5, 6, 7, 54, 35, 77, 8, 467, 88, 533, 6754, 2244,
					533, 3, 4 };

			int temp = 0;
			Map<Integer, Boolean> maps = new HashMap<>();
			List<Integer> uniqueList = new ArrayList<>();

			for (int num : arrayOfNum) {
				if (!maps.containsKey(num)) {
					maps.put(num, true);
					uniqueList.add(num);
				}
			}

			int[] uniqueArray = new int[uniqueList.size()];
			for (int j = 0; j < uniqueList.size(); j++) {
				uniqueArray[temp++] = uniqueList.get(j);
			}

			for (int g = 0; g < temp; g++) {
				System.out.print(uniqueArray[g] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
