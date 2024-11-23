package July2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class wordBoundaryLikeB {

	/*
	 * The \b in regular expressions is a meta character that represents a word
	 * boundary. It is used to match the position where a word starts or ends. This
	 * is particularly useful when you need to match a word without matching
	 * substrings that may contain that word.
	 */

	public static void boundaryWordMethodWithPatternAndMatcher() {
		/*
		 * Pattern: A compiled representation of a regular expression. Matcher: An
		 * engine that performs match operations on a character sequence by interpreting
		 * a Pattern.
		 */
		try {

			String text = "cat catapult catalog";
			String regex = "\\bcat\\b"; // Matches only the whole word "cat"
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(text);
			while (matcher.find()) {
				System.out.println("Found: " + matcher.group());
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeOnlyCharOtherThanAlphaBets() {
		try {

			String str = "cat catapult catalog. The cat. only need cat@ and cat23 and ohh !cat";

			StringBuilder builder = new StringBuilder();
			char[] c = str.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if ((c[i] >= 'A' && c[i] <= 'Z') || (c[i] >= 'a' && c[i] <= 'z') || (c[i] == ' ')) {
					builder.append(c[i]);
				}
			}

			System.out.println(builder.toString());

		} catch (Exception e) {
			throw e;
		}
	}

	public static void boundaryWordMethodWithoutPatternAndMatcher() {
		try {

			String text = "cat catapult catalog. The cat. only need cat@ and cat23 and ohh !cat";
			char[] arrayOfString = text.toCharArray();
			StringBuilder builder = new StringBuilder();

			for (int i = 0; i < arrayOfString.length; i++) {
				if ((arrayOfString[i] >= 'a' && arrayOfString[i] <= 'z')
						|| (arrayOfString[i] >= 'A' && arrayOfString[i] <= 'Z') || (arrayOfString[i] == ' ')) {
					builder.append(arrayOfString[i]);
				}
			}

			System.out.println(builder.toString());

			String newString = builder.toString();
			String[] arr = newString.split(" ");
			StringBuilder builder2 = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("cat")) {
					builder2.append("Hello").append(" ");
				} else {
					builder2.append(arr[i]).append(" ");
				}
			}
			System.out.println(builder2.toString());

		} catch (Exception e) {
			throw e;
		}
	}

	public static void printOnlyNumber() {
		try {

			String str = "cat catapult catalog4303. The42 cat3. only1 need32 cat@ and cat23 and ohh !cat";

			StringBuilder builder = new StringBuilder();
			char[] c = str.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if ((c[i] >= '0' && c[i] <= '9')) {
					builder.append(c[i]);
				}
			}

			System.out.println(builder.toString());

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		boundaryWordMethodWithoutPatternAndMatcher();
	}
}
