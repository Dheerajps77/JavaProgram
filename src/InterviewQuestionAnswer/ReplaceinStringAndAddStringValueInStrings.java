package InterviewQuestionAnswer;

public class ReplaceinStringAndAddStringValueInStrings {
	public static void replaceSpecificWordsInStrings() {
		try {
			String str = "you and me not going to do this work. Please You stop everything whatever you have right now."
					+ " you do not have to worry for future things. I will take care of everything. "
					+ "you just sit release and let me handle the things you";

			String[] words = str.split(" "); // Split string into words
			String result = ""; // Final result string

			for (int i = 0; i < words.length; i++) {
				if (words[i].equalsIgnoreCase("you")) {
					result += "chalbe"; // Replace "you" with "chalbe"
				} else {
					result += words[i]; // Keep other words unchanged
				}
				if (i < words.length - 1) { // Add space after each word, except the last
					result += " ";
				}
			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sperateDataType() {
		try {
			String str = "DakeVKGm14nDBH8493maaerf";
			char[] upperCase = new char[str.length()];
			char[] lowerCase = new char[str.length()];
			char[] digits = new char[str.length()];

			char[] c = str.toCharArray();
			int upperIndex = 0, lowerIndex = 0, digitIndex = 0;

			for (int i = 0; i < c.length; i++) {
				if (c[i] >= 'A' && c[i] <= 'Z') {
					upperCase[upperIndex++] = c[i];
				} else if (c[i] >= 'a' && c[i] <= 'z') {
					lowerCase[lowerIndex++] = c[i];
				} else if (c[i] >= '0' && c[i] <= '9') {
					digits[digitIndex++] = c[i];
				}
			}

			// Print uppercase letters
			System.out.print("Uppercase Letters: ");
			for (int i = 0; i < upperIndex; i++) {
				System.out.print(upperCase[i]);
			}
			System.out.println();

			// Print lowercase letters
			System.out.print("Lowercase Letters: ");
			for (int i = 0; i < lowerIndex; i++) {
				System.out.print(lowerCase[i]);
			}
			System.out.println();

			// Print digits
			System.out.print("Digits: ");
			for (int i = 0; i < digitIndex; i++) {
				System.out.print(digits[i]);
			}
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void repleaceSpecificWordsInStrings() {
		try {

			String str = "you and me not going to do this work. Please You stop everything whatever you have right now."
					+ " you do not have to worry for future things. I will take care of everything. "
					+ "you just sit release and let me handle the things you";

			String str1[] = str.split(" ");
			StringBuilder builder = new StringBuilder();

			for (int i = 0; i < str1.length; i++) {
				if (str1[i].toLowerCase().equals("you")) {
					builder.append("chalbe").append(" ");
				} else {
					builder.append(str1[i]).append(" ");
				}
			}

			System.out.println(builder.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void replaceSpecificWordsInStringsAndRemoveDelimiters() {
		try {

			String str = "you and me not going to do this work. Please stop everything whatever you have right now."
					+ " You do not have to worry for future things. I will take care of everything."
					+ "You just sit release and let me handle the things. you wont be handling such thing now";

			// Convert the string to char array and use StringBuilder to modify the string
			char[] str1 = str.toCharArray();
			StringBuilder builder = new StringBuilder();

			// This flag will check if we are inside a word
			StringBuilder word = new StringBuilder();

			for (int i = 0; i < str1.length; i++) {
				// If the character is a letter or a space, add to word builder
				if ((str1[i] >= 'a' && str1[i] <= 'z') || (str1[i] >= 'A' && str1[i] <= 'Z') || str1[i] == ' ') {
					word.append(str1[i]);
				}

				// When space or end of string is encountered, check the word and append to
				// builder
				if (str1[i] == ' ' || i == str1.length - 1) {
					String currentWord = word.toString().trim();

					// If the current word is "you", replace with "chalbe"
					if (currentWord.equalsIgnoreCase("you")) {
						builder.append("chalbe ");
					} else {
						builder.append(currentWord).append(" ");
					}

					// Reset the word for the next one
					word.setLength(0);
				}
			}

			// Print the result
			System.out.println(builder.toString().trim());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void repleaceSpecificWordsInStringsRemoveDelimitorsWithEqualIgnores() {
		try {

			String str = "you and me not going to do this work. Please stop everything whatever you have right now."
					+ " You do not have to worry for future things. I will take care of everything."
					+ "You just sit release and let me handle the things.you wont be handling such thing now you";

			char str1[] = str.toCharArray();
			StringBuilder builder = new StringBuilder();
			StringBuilder wordBuilder = new StringBuilder();

			for (int i = 0; i < str1.length; i++) {
				if ((str1[i] >= 'a' && str1[i] <= 'z') || (str1[i] >= 'A' && str1[i] <= 'Z') || (str1[i] == ' ')) {
					if (str1[i] == ' ') {
						String word = wordBuilder.toString();
						if (word.equalsIgnoreCase("you")) {
							builder.append("chalbe").append(' ');
						} else {
							builder.append(word).append(' ');
						}
						wordBuilder.setLength(0); // The method wordBuilder.setLength(0) is used to clear the contents
													// of the wordBuilder after processing a word.

					} else {
						wordBuilder.append(str1[i]);
					}
				}
			}
			// Handle the last word after the loop ends
			String lastWord = wordBuilder.toString();
			if (lastWord.equalsIgnoreCase("you")) {
				builder.append("chalbe");
			} else {
				builder.append(lastWord);
			}

			System.out.println(builder.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addSpecificWordWithUserDefinedWord() {
		try {

			String str = "you and me not going to do this work. Please stop everything whatever you have right now."
					+ " You do not have to worry for future things. I will take care of everything."
					+ "You just sit release and let me handle the things.you wont be handling such thing now";

			StringBuilder builder = new StringBuilder();

			String arrayOfString[] = str.split(" ");
			String value = String.valueOf(345);
			for (int i = 0; i < arrayOfString.length; i++) {
				if (arrayOfString[i].equalsIgnoreCase(("you"))) {
					builder.append(arrayOfString[i]).append(value).append(" ");
				} else {
					builder.append(arrayOfString[i]).append(" ");
				}
			}
			// Handle the last word after the loop ends
			String lastWord = builder.toString();
			if (lastWord.equalsIgnoreCase("you")) {
				builder.append(value);
			} else {
				builder.append(lastWord);
			}

			System.out.println(builder.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void addSpecificWordWithUserDefinedWordRemoveDelimitorsWithEqualIgnores() {
		try {

			String str = "you and me not going to do this work. Please stop everything whatever you have right now."
					+ " You do not have to worry for future things. I will take care of everything."
					+ "You just sit release and let me handle the things.you wont be handling such thing now you";

			StringBuilder builder = new StringBuilder();
			StringBuilder builder2 = new StringBuilder();

			char arrayOfchar[] = str.toCharArray();
			String value = String.valueOf(345);
			for (int i = 0; i < arrayOfchar.length; i++) {
				String word = builder2.toString();
				if (arrayOfchar[i] == ' ') {
					if (word.equalsIgnoreCase("you")) {
						builder.append(word).append(value).append(' ');
					} else {
						builder.append(word).append(' ');
					}
					builder2.setLength(0);
				} else {
					builder2.append(arrayOfchar[i]);
				}
			}

			// Handle the last word (since there might not be a trailing space)
			String actualWord = builder2.toString();
			if (actualWord.equalsIgnoreCase("you")) {
				builder.append("you").append(value);
			} else {
				builder.append(actualWord);
			}

			System.out.println(builder.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		repleaceSpecificWordsInStrings();
	}

}
