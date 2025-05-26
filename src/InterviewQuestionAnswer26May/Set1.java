package InterviewQuestionAnswer26May;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Set1 {

	public static void printLeftAngleTriangleWithNumber() {
		int n = 10;

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		/*
		 * 1 12 123 1234 12345 123456 1234567 12345678
		 */
	}

	public static void printRightAngleTriangleWithNumber() {
		int n = 10;

		for (int i = 1; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		/*
		 * 1 12 123 1234 12345 123456 1234567 12345678
		 */
	}

	public static boolean isIsomorphic(String str, String str1) {
		
		/*
		 maps: stores the mapping from str1 → str2. Example: 'e' → 'a'.
		 sets: ensures no two characters in str1 map to the same character in str2.
		 */
		Map<Character, Character> maps = new HashMap<Character, Character>();
		Set<Character> sets = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {

			char ch1 = str.charAt(i);
			char ch2 = str1.charAt(i);

			if (str.length() != str1.length())
				return false;

			/*
			 If character ch1 from str1 is already mapped, ensure it always maps 
			 to the same character ch2 from str2.
			If not consistent, return false.
			 */
			if (maps.containsKey(ch1)) {
				if (maps.get(ch1) != ch2) return false;
			} else {
				/*
				if ch1 hasn't been mapped yet:
				Check if ch2 is already used by some other ch1. If yes, return false.
				Otherwise, record this mapping: ch1 → ch2 and note that ch2 is now used.
				*/
				if (sets.contains(ch2)) return false;
				maps.put(ch1, ch2);
				sets.add(ch2);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// printRightAngleTriangleWithNumber();

		System.out.println(isIsomorphic("egg", "add"));    // true ('e'->'a', 'g'->'d')
	    System.out.println(isIsomorphic("foo", "bar"));    // false ('o'→'a' and 'o'→'r' conflict)
	    System.out.println(isIsomorphic("paper", "title"));// true ('p'->'t', 'a'->'i'...)
	    System.out.println(isIsomorphic("ab", "aa"));      // false (both 'a' and 'b' → 'a')
	}
}
