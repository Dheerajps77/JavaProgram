package Aug2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintKeyValueInHashMap {

	public static void printValueBasisOnKey(Map<Integer, String> maps, int key) {
		try {
			if (maps.containsKey(key)) {
				System.out.println("Value for key '" + key + "': " + maps.get(key));
			} else {
				System.out.println("Key '" + key + "' not found in the map.");
			}
		} catch (Exception e) {
		}
	}

	public static void printMapKeysAndValue(Map<Integer, String> maps) {

		try {

			Set<Entry<Integer, String>> setOfEntry = maps.entrySet();
			Iterator<Entry<Integer, String>> iterate = setOfEntry.iterator();
			while (iterate.hasNext()) {
				Entry<Integer, String> value = iterate.next();
				System.out.println(value.getKey() + " : " + value.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Map<Integer, String> maps = new HashMap<Integer, String>();
		maps.put(12, "Books");
		maps.put(32, "Movies");
		maps.put(53, "HR Designation");
		maps.put(55, "Productions");
		maps.put(19, "UAT");
		maps.put(83, "Stagging env");
		int key = 12;

		printValueBasisOnKey(maps, key);
	}
}