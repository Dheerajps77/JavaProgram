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
				
				// If the current number is less than the next number, we subtract its value from result.
				// Otherwise, we add it to result.
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
	
	public static void intToRoman(int num) {
        try {
            // Define arrays for Roman symbols and their corresponding integer values
            int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder roman = new StringBuilder();

            // Loop through each value in the values array
            for (int i = 0; i < values.length; i++) {
                // Append corresponding Roman symbols while the number is greater or equal
                while (num >= values[i]) {
                    roman.append(symbols[i]);
                    num -= values[i];
                }
            }

            // Print the final Roman numeral
            System.out.println("Roman Numeral: " + roman.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		int num = 1994;  // Example input
        intToRoman(num);  // Expected Output: MCMXCIV
		//romanToInt();
	}

}
