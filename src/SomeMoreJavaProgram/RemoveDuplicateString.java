package SomeMoreJavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateString {

	public static void removeDuplicateUsingLinkedHashsetMethod() {
		try {

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeDuplicateString() {
		String str[] = { "Hello", "No", "Yes", "Hello", "Dilwali", "Khatt", "Khatt", "What" };
		Set<String> set = new HashSet<String>();
		ArrayList<String> noDuplicateValue = new ArrayList<String>();
		try {
			System.out.println("Before deleting duplicate strings are at below");
			for (int i = 0; i < str.length; i++) {
				if (i != str.length - 1) {
					System.out.print(str[i] + " | ");
				} else {
					System.out.print(str[i]);
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("Duplicate strings are at below");
			for (int i = 0; i < str.length; i++) {
				if (set.add(str[i]) == false) {
					System.out.println(str[i]);
				} else {
					noDuplicateValue.add(str[i]);
				}
			}
			System.out.println();
			System.out.println("After deleting duplicate strings are at below");
			for (int i = 0; i < noDuplicateValue.size(); i++) {
				if (i != str.length - 1) {
					System.out.print(noDuplicateValue.get(i) + " | ");
				} else {
					System.out.print(noDuplicateValue.get(i));
				}
			}

		} catch (Exception e) {
			throw e;
		}

		/***
		 * OutPut : Before deleting duplicate strings are at below Hello | No | Yes |
		 * Hello | Dilwali | Khatt | Khatt | What
		 * 
		 * Duplicate strings are at below Hello Khatt
		 * 
		 * After deleting duplicate strings are at below Hello | No | Yes | Dilwali |
		 * Khatt | What |
		 */
	}

	public static void removeDuplicateChar() {
		try {

			String str = "Dheeraj";
			System.out.println(str);
			Set<Character> set = new HashSet<Character>();
			System.out.print("Duplicate char are : ");
			for (int i = 0; i < str.length(); i++) {
				if (set.add(str.charAt(i)) == false) {
					System.out.print(str.charAt(i));
				}
			}

		} catch (Exception e) {
			throw e;
		}
		/***
		 * OutPut : Dheeraj Duplicate char are : e
		 */
	}

	public static void countDuplicateString() {
		String str[] = { "Hello", "No", "Yes", "Hello", "Dilwali", "Khatt", "Khatt", "What" };
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < str.length; i++) {
			if (map.get(str[i]) != null) {
				map.put(str[i], map.get(str[i]) + 1);
			} else {
				map.put(str[i], 1);
			}
		}

		Set<Entry<String, Integer>> entry = map.entrySet();
		Iterator<Entry<String, Integer>> iterate = entry.iterator();

		while (iterate.hasNext()) {
			Entry<String, Integer> en = iterate.next();
			System.out.println(en.getValue() + " : " + en.getKey());
		}
		/***
		 * Output: 1 : Dilwali 1 : No 2 : Hello 2 : Khatt 1 : Yes 1 : What
		 */
	}

	public static void main(String[] args) {
		removeDuplicateString();

	}

}
