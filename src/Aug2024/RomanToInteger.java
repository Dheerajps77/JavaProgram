package Aug2024;

import java.util.HashMap;

public class RomanToInteger {

	public static void romanToInt() {
		try {
			String str = "MCMXCIV";
			int number, result = 0;
			HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
			romanMap.put('I', 1);
			romanMap.put('V', 5);
			romanMap.put('X', 10);
			romanMap.put('L', 50);
			romanMap.put('C', 100);
			romanMap.put('D', 500);
			romanMap.put('M', 1000);

			int n = str.length();
			for (int i = 0; i < n; i++) {
				number = romanMap.get(str.charAt(i));

				if (i < n - 1 && number < romanMap.get(str.charAt(i + 1))) {
					result = result - number;
				} else {
					result = result + number;
				}
			}
		System.out.println(result);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		romanToInt();
	}

}
