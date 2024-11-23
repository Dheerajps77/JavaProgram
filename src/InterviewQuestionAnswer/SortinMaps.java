package InterviewQuestionAnswer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortinMaps {

	public static void sortMapByKeys() {
		Map<Integer, String> map = new HashMap<>();
		map.put(34, "QA");
		map.put(12, "Senior Consultant");
		map.put(42, "QA Manager");
		map.put(52, "QA Lead");
		map.put(77, "Junior QA");
		map.put(90, "Senior QA Automation");

		// Convert map entries to a list
		List<Map.Entry<Integer, String>> listOfEntries = new ArrayList<>(map.entrySet());

		// Sort the list by keys using a comparator
		listOfEntries.sort(Map.Entry.comparingByKey());

		// Print sorted entries
		System.out.println("Map sorted by keys:");
		for (Map.Entry<Integer, String> entry : listOfEntries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void sortMapByValues() {
		Map<Integer, String> map = new HashMap<>();
		map.put(34, "QA");
		map.put(12, "Senior Consultant");
		map.put(42, "QA Manager");
		map.put(52, "QA Lead");
		map.put(77, "Junior QA");
		map.put(90, "Senior QA Automation");

		// Convert map entries to a list
		List<Map.Entry<Integer, String>> listOfEntries = new ArrayList<>(map.entrySet());

		// Sort the list by values using a custom comparator
		listOfEntries.sort(Map.Entry.comparingByValue());

		// Print sorted entries
		System.out.println("Map sorted by values:");
		for (Map.Entry<Integer, String> entry : listOfEntries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void manualSortMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(34, "QA");
		map.put(12, "Senior Consultant");
		map.put(42, "QA Manager");
		map.put(52, "QA Lead");
		map.put(77, "Junior QA");
		map.put(90, "Senior QA Automation");

		// Convert map entries to a list
		List<Map.Entry<Integer, String>> listOfEntries = new ArrayList<>(map.entrySet());

		// Manual sort by keys
		for (int i = 0; i < listOfEntries.size(); i++) {
			for (int j = i + 1; j < listOfEntries.size(); j++) {
				if (listOfEntries.get(i).getKey() > listOfEntries.get(j).getKey()) {
					// Swap entries
					Map.Entry<Integer, String> temp = listOfEntries.get(i);
					listOfEntries.set(i, listOfEntries.get(j));
					listOfEntries.set(j, temp);
				}
			}
		}

		// Print sorted entries
		System.out.println("Manually sorted map by keys:");
		for (Map.Entry<Integer, String> entry : listOfEntries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		manualSortMap();
	}

}
