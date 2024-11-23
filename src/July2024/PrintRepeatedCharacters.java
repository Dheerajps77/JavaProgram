package July2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintRepeatedCharacters {

	public static void main(String[] args) {
		//printrepeatedCharacters();
		//printrepeatedCharAndIgnoreCases();
		//playWithString();
		replaceWordsUsingForLoop();
		//hasMapAndHasTable();
		//checkIfStringPalindrome("Nitin");
		//checkIfNumberIsPalindrome(123456789);
		
	}

	/*
	 * OutPut are :- Repeated char are :-->HelDw Number of repeated characters are :
	 * 5
	 */

	/*
	 * A string is said to be palindrome if it remains the same on reading from both
	 * ends.
	 */
	public static void checkIfStringPalindrome(String stringValue) {
		try {
			String rev = "";
			char[] c = stringValue.toCharArray();
			for (int i = c.length - 1; i >= 0; i--) {
				rev = rev + c[i];
			}

			if (stringValue.equalsIgnoreCase(rev)) {
				System.out.println("String is palindrome --> " + stringValue + " == " + rev);
			} else {
				System.out.println("String is not palindrome --> " + stringValue + " == " + rev);
			}
			// System.out.println(rev);
		} catch (Exception e) {
			throw e;
		}

	}

	public static void checkIfNumberIsPalindrome(int n) {
		try {

			int n1 = n;
			int rev = 0, rem;
			while (n != 0) {
				rem = n % 10;
				n = n / 10;
				rev = rev * 10 + rem;
			}

			if (n == rev) {
				System.out.println("Number is palindrome --> " + n1 + " == " + rev);
			} else {
				System.out.println("Number is palindrome --> " + n1 + " == " + rev);
			}
			//System.out.println(rev);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void hasMapAndHasTable() {

		String phraseWords;
		try {
			phraseWords = "I am here to make new vlogs . Please check my vlogs and do let me know if anything wrong with it."
					+ "I will make sure to not to repeat those thing in coming next future. So guys let jump into it"
					+ "and make things better for personal growth and career. I will appericate your efforts";

			String arrayOfWords[] = phraseWords.split(" ");

			Map<String, Integer> hashMap = new HashMap<String, Integer>();

			for (int i = 0; i < arrayOfWords.length; i++) {
				if (hashMap.get(arrayOfWords[i]) != null) {
					hashMap.put(arrayOfWords[i], hashMap.get(arrayOfWords[i]) + 1);
				} else {
					hashMap.put(arrayOfWords[i], 1);
				}
			}

			Set<Entry<String, Integer>> entries = hashMap.entrySet();
			Iterator<Entry<String, Integer>> entry = entries.iterator();

			while (entry.hasNext()) {
				Entry<String, Integer> iterEntry = entry.next();
				System.out.print(iterEntry.getKey() + " : " + iterEntry.getValue());
				System.out.println();

			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void playWithString() {
		try {

			String str = "Dheeraj";
			String name = str + "Pratap";
			System.out.println(name);// DheerajPratap

			String str1 = "Singh";
			String name2 = str.concat(str1);
			System.out.println(name2);// DheerajSingh

			String str3 = "Dheeraj Pratap Singh";
			String str4 = new String("Dheeraj Pratap Singh");

			if (str3.equalsIgnoreCase(str4)) // True
			{
				System.out.println("True");
			}

			String str5 = new String("Dheeraj Pratap Singh");
			String str6 = new String("Dheeraj Pratap Singh");

			if (str5.equalsIgnoreCase(str6)) // True
			{
				System.out.println("True");
			}

			String s = "hello world";
			String sub1 = s.substring(0, 7); // "hello w"
			String sub2 = s.substring(8); // "rld"

			System.out.println(sub1);
			System.out.println(sub2);
		} catch (Exception e) {
			throw e;
		}
	}

	/*
	 * public static void replaceWordsUsingForLoopWithDiffMethod() { try { String
	 * str = "Hello guys . Whats up guys ? Chai pilo guys. Cricket Khelo guys ";
	 * StringBuilder builder = new StringBuilder();
	 * 
	 * // Split string by spaces and punctuation marks String[] stringArray =
	 * str.split("\\s+|(?=[.,?!])");
	 * 
	 * for (int i = 0; i < stringArray.length; i++) { String word = stringArray[i];
	 * // Remove punctuation marks word = word.replaceAll("[.,?!]", "");
	 * 
	 * // Check if the word is "guys" considering word boundaries if
	 * (word.matches("\\bguys\\b")) { builder.append("persons"); } else {
	 * builder.append(word); }
	 * 
	 * // Append space if it's not the last word if (i < stringArray.length - 1) {
	 * builder.append(" "); } }
	 * 
	 * System.out.println("Updated :--> " + builder.toString());
	 * 
	 * } catch (Exception e) { throw e; } }
	 */

	public static void replaceWordsUsingForLoop() {
		try {

			String str = "Hello guys . Whats up guys ? Chai pilo guys. Cricket Khelo guys ";
			StringBuilder builder = new StringBuilder();
			String[] stringArray = str.split(" ");

			for (int i = 0; i < stringArray.length; i++) {

				String newString = stringArray[i];
				String newString1 = newString.replaceAll(".?", "");

				if (newString1.equals("guys")) {
					builder.append("persons");
				} else {
					builder.append(newString1);
				}

				if (i < stringArray.length - 1) {
					builder.append(" ");
				}
			}

			System.out.println(builder.toString());

		} catch (Exception e) {
			throw e;
		}
	}

	public static void printrepeatedCharAndIgnoreCases() {
		try {

			String str = "Dheeraj Pratap Singh";
			char[] chars = str.toLowerCase().toCharArray();
			Set<Character> set = new HashSet<Character>();

			for (int i = 0; i < chars.length; i++) {
				if (set.add(chars[i]) == false) {
					System.out.print(chars[i]);
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void printrepeatedCharacters() {
		try {
			String str = "Hello Huys Deww D";
			int temp = 0;
			char[] c = str.toCharArray();
			int totalCount = c.length;
			System.out.print("Repeated char are :-->");
			for (int i = 0; i < totalCount; i++) {
				for (int j = i + 1; j < totalCount; j++) {
					if ((c[i] == c[j]) && (i != j) && (c[i] != ' ') && (c[j] != ' ')) {
						temp++;
						System.out.print(c[j]);

					}
				}

			}
			System.out.println();
			System.out.println("Number of repeated characters are : " + temp);

		} catch (Exception e) {
			throw e;
		}
	}
}