package Program30June;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ReverseOrderOfWords {

	public static HashMap<Character, Integer> countOfRepeatedChar(String name) {
		// String name="abhishek jain";
		// char[]c= name.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		try {

			for (int i = 0; i < name.length(); i++) {
				if (hashMap.get(name.charAt(i)) != null) {
					hashMap.put((name.charAt(i)), hashMap.get(name.charAt(i)) + 1);
				} else {
					hashMap.put((name.charAt(i)), 1);
				}
			}

		} catch (Exception e) {
			throw e;
		}
		return hashMap;
	}

	public static String reverseTheOrderOfString(String str) {
		String reverseOrder = "";
		try {

			// String str="Abhishek Jain";
			String[] stringArray = str.split(" ");

			for (int i = stringArray.length - 1; i >= 0; i--) {
				if (i != stringArray.length - 1) {
					reverseOrder = reverseOrder + " " + stringArray[i];
				} else {
					reverseOrder = reverseOrder + stringArray[i];
				}
				System.out.print(stringArray[i] + " ");
			}
		} catch (Exception e) {
			throw e;
		}
		return reverseOrder;
	}

	public static void main(String[] args) {
		String str = "abhishek jain";
		String revOrderOfString = reverseTheOrderOfString(str);
		System.out.println("Below are the reverse order of Strings words");
		System.out.print(revOrderOfString + " ");
		System.out.println();

		HashMap<Character, Integer> mapValue = countOfRepeatedChar(str);
		Set<Entry<Character, Integer>> setValue = mapValue.entrySet();
		Iterator<Entry<Character, Integer>> iterateSet = setValue.iterator();
		System.out.println("Below are the count of Duplicated Char");
		while (iterateSet.hasNext()) {
			Entry<Character, Integer> entry = iterateSet.next();
			System.out.println(entry.getValue() + " " + entry.getKey());
		}

	}

}
