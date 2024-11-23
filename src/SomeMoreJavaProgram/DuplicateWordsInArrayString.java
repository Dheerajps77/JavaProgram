package SomeMoreJavaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInArrayString {

	public static void duplicateWordsInArrayString(String str) {
		try {

			String str1[] = str.split(" ");
			Set<String> set = new HashSet<String>();
			for (int i = 0; i < str1.length; i++) {
				if (set.add(str1[i]) == false) {
					System.out.println("The duplicate words is : " + str1[i]);
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void duplicateWordsWithCountNumber(String str) {
		try {
			String[] str1 = str.split(" ");

			Map<String, Integer> map = new HashMap<String, Integer>();

			for (int i = 0; i < str1.length; i++) {
				if (map.get(str1[i]) != null) {
					map.put(str1[i], map.get(str1[i]) + 1);
				} else {
					map.put(str1[i], 1);
				}
			}

			Set<Entry<String, Integer>> mapValue = map.entrySet();
			Iterator<Entry<String, Integer>> iterate = mapValue.iterator();

			while (iterate.hasNext()) {
				Entry<String, Integer> values = iterate.next();
				String key = values.getKey();
				int value = values.getValue();
				System.out.println(key + " : : " + value);
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		String str = "Hello everyone . I hope everyone is fine . everyone . all good now ?? hope";
		DuplicateWordsInArrayString.duplicateWordsWithCountNumber(str);
	}

}
