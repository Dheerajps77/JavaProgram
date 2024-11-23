package Aug2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctValue {

	public static void distinctDouble() {
		try {
			double[] values = { 1.1, 2.2, 3.3, 1.1, 4.4, 2.2, 5.5, 3.3, 5.0, 42.43 };

			Map<Double, Integer> maps = new HashMap<Double, Integer>();

			for (int i = 0; i < values.length; i++) {
				if (maps.get(values[i]) != null) {
					maps.put(values[i], maps.get(values[i]) + 1);
				} else {
					maps.put(values[i], 1);
				}
			}

			for (Map.Entry<Double, Integer> entry : maps.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

		} catch (Exception e) {
			throw e;
		}
	}

	public static void distinctfloat() {
		try {
			float[] values = { 1.1f, 2.2f, 3.3f, 1.1f, 4.4f, 2.2f, 5.5f, 3.3f, 444.5f };

			Map<Float, Integer> maps = new HashMap<Float, Integer>();

			for (int i = 0; i < values.length; i++) {
				if (maps.get(values[i]) != null) {
					maps.put(values[i], maps.get(values[i]) + 1);
				} else {
					maps.put(values[i], 1);
				}
			}

			for (Map.Entry<Float, Integer> entry : maps.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

		} catch (Exception e) {
			throw e;
		}
	}

	public static void distinctInteger() {
		try {
			int num[] = { 34, 53, 34, 56, 65, 54, 2, 3, 2, 3, 4, 4, 5, 5, 76, 76, 76, 80, 80, 89, 80 };

			Map<Integer, Integer> maps = new HashMap<Integer, Integer>();

			for (int i = 0; i < num.length; i++) {
				if (maps.get(num[i]) != null) {
					maps.put(num[i], maps.get(num[i]) + 1);
				} else {
					maps.put(num[i], 1);
				}
			}

			Set<Entry<Integer, Integer>> setsOfEntry = maps.entrySet();
			Iterator<Entry<Integer, Integer>> iteratorOfSet = setsOfEntry.iterator();

			while (iteratorOfSet.hasNext()) {
				Entry<Integer, Integer> entrySet = iteratorOfSet.next();
				System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void distinctString() {
		try {

			String str = "I know , I know , I've heard it before. "
					+ "The cat sat on the mat, the mat that was soft and warm. "
					+ "She shouted , 'No , no , no!' as she ran away. "
					+ "He kept saying , 'Please , please , I need your help."
					+ "The rain, rain , go away , come again another day.";

			String newString[] = str.toLowerCase().split(" ");

			Map<String, Integer> maps = new HashMap<String, Integer>();

			for (int i = 0; i < newString.length; i++) {
				if (maps.get(newString[i]) != null) {
					maps.put(newString[i], maps.get(newString[i]) + 1);
				} else {
					maps.put(newString[i], 1);
				}
			}

			Set<Entry<String, Integer>> setss = maps.entrySet();
			Iterator<Entry<String, Integer>> entrySetss = setss.iterator();

			while (entrySetss.hasNext()) {
				Entry<String, Integer> entryOne = entrySetss.next();
				System.out.println(entryOne.getKey() + " : " + entryOne.getValue());
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void distinctChar() {
		try {
			String str = "abcabcabcd";
			char c[] = str.toCharArray();

			Map<Character, Integer> setss = new HashMap<Character, Integer>();
			for (int i = 0; i < c.length; i++) {
				if (setss.get(c[i]) != null) {
					setss.put(c[i], setss.get(c[i]) + 1);
				} else {
					setss.put(c[i], 1);
				}
			}

			Set<Entry<Character, Integer>> enterySetValue = setss.entrySet();
			Iterator<Entry<Character, Integer>> iteratorOfEntry = enterySetValue.iterator();

			while (iteratorOfEntry.hasNext()) {
				Entry<Character, Integer> singleEntryFromSet = iteratorOfEntry.next();

				System.out.println(singleEntryFromSet.getKey() + " " + singleEntryFromSet.getValue());
			}
		} catch (

		Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		distinctfloat();
	}
}
