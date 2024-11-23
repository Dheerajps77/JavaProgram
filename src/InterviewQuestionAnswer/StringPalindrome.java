package InterviewQuestionAnswer;

public class StringPalindrome {

	public static void checkNumberPalinDromeAndReverseNumber() {
		try {

			int num = 121;
			int originalNumber = num;
			int rev = 0;
			int rem = 0;
			while (num != 0) {
				rem = num % 10;
				num = num / 10;
				rev = rev * 10 + rem;
			}
			System.out.println("Reverse number: " + rev);

			if (rev == originalNumber) {
				System.out.println("Number is palindrome");
			} else {
				System.out.println("Number is not palindrome");
			}

		} catch (Exception e) {
			throw e;
		}

	}

	public static boolean StringAnagramUsingDifferentAppoarch() {
		boolean flag = true;
		try {
			String str = "damam";
			String str2 = "madam";

			if (str == null || str2 == null || str.length() != str2.length()) {
				return false;
			}
			char c[] = str.toCharArray();
			char c2[] = str2.toCharArray();
			char c1 = '\0', c3 = '\0';
			for (int i = 0; i < c.length; i++) {
				for (int j = i + 1; j < c.length; j++) {
					if (c[i] > c[j]) {
						c1 = c[i];
						c[i] = c[j];
						c[j] = c1;
					}
				}
			}

			for (int i = 0; i < c2.length; i++) {
				for (int j = i + 1; j < c2.length; j++) {
					if (c2[i] > c2[j]) {
						c3 = c2[i];
						c2[i] = c2[j];
						c2[j] = c3;
					}
				}
			}
			String string = new String(c);
			String string1 = new String(c2);

			System.out.println(string);
			System.out.println(string1);
			if (string.equals(string1)) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("String is not Anagram");
			}
		} catch (Exception e) {
			throw e;
		}
		return flag;
	}

	public static boolean StringAnagram() {
		boolean flag = true;
		try {
			String str = "damam";
			String str2 = "madam";

			if (str == null || str2 == null || str.length() != str2.length()) {
				return false;
			}

			StringBuilder builder = new StringBuilder();
			StringBuilder builder1 = new StringBuilder();
			char c[] = str.toCharArray();
			char c2[] = str2.toCharArray();
			char c1 = '\0', c3 = '\0';
			for (int i = 0; i < c.length; i++) {
				for (int j = i + 1; j < c.length; j++) {
					if (c[i] > c[j]) {
						c1 = c[i];
						c[i] = c[j];
						c[j] = c1;
					}
				}
				builder.append(c[i]);
			}

			for (int i = 0; i < c2.length; i++) {
				for (int j = i + 1; j < c2.length; j++) {
					if (c2[i] > c2[j]) {
						c3 = c2[i];
						c2[i] = c2[j];
						c2[j] = c3;
					}
				}
				builder1.append(c2[i]);
			}
			System.out.println(builder.toString());
			System.out.println(builder1.toString());
			if (builder.toString().equals(builder1.toString())) {
				System.out.println("String is Anagram");
			} else {
				System.out.println("String is not Anagram");
			}
		} catch (Exception e) {
			throw e;
		}
		return flag;
	}

	public static void palindrome() {
		try {
			String str = "madam";
			String str1 = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				str1 = str1 + str.charAt(i);
			}
			System.out.print(str1);

			if (str.equals(str1)) {
				System.out.println("\nPalindrome");
			} else {
				System.out.println("\nNot Palindrome");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	static void sortingOfAlpha() {
		try {
			String str = "nitin";
			char[] car = str.toCharArray();
			char c = '\0';
			for (int i = 0; i < car.length; i++) {
				for (int j = i + 1; j < car.length; j++) {
					if (car[i] > car[j]) {
						c = car[i];
						car[i] = car[j];
						car[j] = c;
					}
				}
				System.out.print(car[i]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void caseConverter() {
		try {

			String str = "Dheeraj Pratap Singh";
			char c[] = str.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if (c[i] >= 'a' && c[i] <= 'z') {
					c[i] = (char) (c[i] - 32);
				} else if (c[i] >= 'A' && c[i] <= 'Z') {
					c[i] = (char) (c[i] + 32);
				}
				System.out.print(c[i]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		// palindrome();
		/*
		 * if (StringAnagramUsingDifferentAppoarch()) {
		 * System.out.println("Was found result and length was matched"); } else {
		 * System.out.
		 * println("Wasn't found result might be due to the length wasn't matched"); }
		 */
		checkNumberPalinDromeAndReverseNumber();
	}
}