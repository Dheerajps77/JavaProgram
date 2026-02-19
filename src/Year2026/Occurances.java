package Year2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurances {

	public static void occuranceInChar() {
		String str = "zdheeraj pratap singh";
		char[] charArr = str.toCharArray();

		char maxCharOccurance = ' ';
		char minCharOccurance = ' ';
		int maxCount = 0;
		int minCount = 0;
		Map<Character, Integer> maps = new LinkedHashMap<Character, Integer>();

		for (Character char1 : charArr) {
			if (char1 == ' ')
				continue;
			if (maps.get(char1) != null) {
				/* maps.put(char1, maps.getOrDefault(char1, 0) + 1); */

				maps.put(char1, maps.get(char1) + 1);
			} else {
				maps.put(char1, 1);
			}
		}

		boolean flag = true;

		for (Map.Entry<Character, Integer> occur : maps.entrySet()) {

			if (flag) {
				maxCharOccurance = occur.getKey();
				minCharOccurance = occur.getKey();

				maxCount = occur.getValue();
				minCount = occur.getValue();
				flag = false;
			}

			if (occur.getValue() > maxCount) {
				maxCharOccurance = occur.getKey();
				maxCount = occur.getValue();
			}
			if (occur.getValue() < minCount) {
				minCharOccurance = occur.getKey();
				minCount = occur.getValue();
			}
		}
		System.out.println("MaxCharOccurance : => " + maxCharOccurance + " and maxCharCount => " + maxCount);
		System.out.println("MinCharOccurance : => " + minCharOccurance + " and minCharCount => " + minCount);

	}

	public static void main(String[] args) {
		occuranceInChar();
	}

}
