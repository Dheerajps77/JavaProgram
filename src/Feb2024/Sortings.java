package Feb2024;

import java.util.Arrays;
import java.util.Scanner;

public class Sortings {

	public static void sortingNumber() {
		int n[] = { 2, 5, 1, 0, 10, 3 };
		int temp = 0;
		try {

			for (int i = 0; i < n.length; i++) {
				for (int j = i + 1; j < n.length; j++) {
					if (n[i] > n[j]) {
						temp = n[i];
						n[i] = n[j];
						n[j] = temp;
					}
				}
				System.out.println(n[i]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void sortCharcWithoutSpace() {
		String str = "Dheeraj Pratap Singh";
		String removedSpacedString = str.replaceAll(" ", "");
		char temp = ' ';
		try {
			char[] charOfString = removedSpacedString.toCharArray();
			for (int i = 0; i < charOfString.length; i++) {
				for (int j = i + 1; j < charOfString.length; j++) {
					if (charOfString[i] > charOfString[j]) {
						temp = charOfString[i];
						charOfString[i] = charOfString[j];
						charOfString[j] = temp;
					}
				}
				System.out.print(charOfString[i]);

			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeSpaceWithoutInBuiltFunction() {
		try {

			String str = "Dheeraj Pratap Singh";
			// String str1[]=str.split(" ");
			char cs[] = str.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				if (cs[i] == ' ') {
					cs[i] = cs[i]++;
				} else
					System.out.print(cs[i]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeSpaceWithInBuiltFunction() {
		try {

			String str = "Dheeraj Pratap Singh";
			String str1[] = str.split(" ");
			for (int i = 0; i < str1.length; i++) {
				System.out.print(str1[i]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void sortingWithoutFirstLetterWithSubstring() {
		try {
			String inputString = "zebracode";

			// Extract the first letter
			char firstLetter = inputString.charAt(0);

			// Sort the remaining characters
			char[] remainingChars = inputString.substring(1).toCharArray();
			Arrays.sort(remainingChars);

			// Concatenate the sorted characters with the first letter
			String sortedString = firstLetter + new String(remainingChars);

			System.out.println("Original String: " + inputString);
			System.out.println("Sorted String without first letter: " + sortedString);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void SortingString() {
		try {
			int temp, size;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string value: ");
			String str = sc.nextLine();
			char charArray[] = str.toCharArray();
			size = charArray.length;
			for (int i = 0; i < size; i++) {
				for (int j = i + 1; j < size; j++) {
					if (charArray[i] > charArray[j]) {
						temp = charArray[i];
						charArray[i] = charArray[j];
						charArray[j] = (char) temp;
					}
				}
			}
			System.out.println("Third largest element is: " + Arrays.toString(charArray));
		} catch (Exception e) {
			throw e;
		}
	}

	public static void remoFirstAndLastLetterFromString() {
		String str = "Dheeraj Pratap Singh";
		String removedSpacedString = str.replaceAll(" ", "");

		char temp = ' ';
		try {
			char[] charOfString = removedSpacedString.toCharArray();
			for (int i = 1; i < charOfString.length - 1; i++) {

				System.out.print(charOfString[i]);

			}
			System.out.println();
			String newString = "HellloJi";
			String subStringNewOne = newString.substring(1, newString.length() - 1);
			System.out.println(subStringNewOne);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeAnyCharacterString(char userSpecificChar) {
		String str = "Dheeraj Pratap Singh";
		String removedSpacedString = str.replaceAll(" ", "");
		String removedString = "";

		try {
			char[] charOfString = removedSpacedString.toCharArray();
			for (int i = 0; i < charOfString.length; i++) {

				if (charOfString[i] == userSpecificChar) {
					charOfString[i] = ' ';
				}
				removedString = removedString + charOfString[i];
			}

			System.out.println(removedString.replaceAll(" ", ""));

			String newStringValue = "Hello ji. Nahi ho rha hai kya tumse";

			String spaceRemoved = newStringValue.replaceAll(" ", "");
			String newStringAfterRemovedString = spaceRemoved.replace(userSpecificChar, ' ');
			String heyNewString = newStringAfterRemovedString.replaceAll(" ", "");
			System.out.println(heyNewString);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeLowerCase() {
		String str = "Dheeraj Pratap Singh";
		String removedSpacedString = str.replaceAll(" ", "");
		String removedString = "";

		try {
			char[] charOfString = removedSpacedString.toCharArray();
			for (int i = 0; i < charOfString.length; i++) {

				if (charOfString[i] >= 97 && charOfString[i] <= 123) {
					charOfString[i] = ' ';
				}
				removedString = removedString + charOfString[i];
			}
			System.out.println(removedString);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeUpparCase() {
		String str = "Dheeraj Pratap Singh";
		String removedSpacedString = str.replaceAll(" ", "");
		String removedString = "";

		try {
			char[] charOfString = removedSpacedString.toCharArray();
			for (int i = 0; i < charOfString.length; i++) {

				if (charOfString[i] >= 65 && charOfString[i] <= 91) {
					charOfString[i] = ' ';
				}
				removedString = removedString + charOfString[i];
			}
			System.out.println(removedString);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void SwapFirstCharAndLastCharFromString() {
		String str = "Dheeraj Pratap Singh";
		String removedSpacedString = str.replaceAll(" ", "");

		try {
			char[] charOfString = removedSpacedString.toCharArray();
			char firstChar = charOfString[0];
			int lengthOfCharArray = charOfString.length - 1;
			char lastChar = charOfString[lengthOfCharArray];
			for (int i = 0; i < charOfString.length; i++) {

				if (i == 0) {
					charOfString[i] = lastChar;
				} else if (i == lengthOfCharArray) {
					charOfString[i] = firstChar;
				}

				System.out.print(charOfString[i]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeSpecialChar() {
		try {

			// String specialChar = "~`!@#$%^&*()-_+={}[]|\\/:\\;\"'<>,.?";

			String name = "Dheeraj&*()-_+=Sin&*()Pratap&*Singh_+=";
			char nameOfChar[] = name.toCharArray();
			for (int i = 0; i < nameOfChar.length; i++) {

				if ((nameOfChar[i] > 66 && nameOfChar[i] < 92) || (nameOfChar[i] > 97 && nameOfChar[i] < 122)) {
					System.out.print(nameOfChar[i]);
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static String sortWithoutFirstCharacters(String input, int numberOfCharactersToIgnore) {
		if (input == null || input.length() <= numberOfCharactersToIgnore)
			return input; // If there are fewer characters than the number to ignore, return input as it
							// is

		char[] chars = input.toCharArray();

		// Sorting the characters except the first characters
		for (int i = numberOfCharactersToIgnore; i < chars.length; i++) {
			for (int j = numberOfCharactersToIgnore; j < chars.length - 1; j++) {
				if (chars[j] > chars[j + 1]) {
					char temp = chars[j];
					chars[j] = chars[j + 1];
					chars[j + 1] = temp;
				}
			}
		}

		return new String(chars);
	}

	public static String removeFirstFromString(String input) {
		try {
			// Check if input is null or empty
			if (input == null || input.isEmpty()) {
				return input;
			}

			StringBuilder modifiedString = new StringBuilder();
			StringBuilder currentWord = new StringBuilder();
			boolean firstCharSkipped = false;

			for (int i = 0; i < input.length(); i++) {
				char currentChar = input.charAt(i);

				if (currentChar == ' ') {
					if (firstCharSkipped) {
						modifiedString.append(currentWord).append(' ');
						currentWord.setLength(0);
						firstCharSkipped = false;
					}
				} else {
					if (!firstCharSkipped) {
						firstCharSkipped = true;
					}
					currentWord.append(currentChar);
				}
			}

			if (firstCharSkipped) {
				modifiedString.append(currentWord);
			}

			return modifiedString.toString();
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	public static void sortWords()
	{
		String statement="I am master.This is my new Number. Please don't use for public purposes".toLowerCase();
		String temp="";
		try {
			
			String[] arrayString=statement.split(" ");
			
			for(int i=0;i<arrayString.length;i++)
			{
				for(int j=i+1;j<arrayString.length;j++)
				{
					if(arrayString[i].compareTo(arrayString[j])>0)
					{
						temp=arrayString[i];
						arrayString[i]=arrayString[j];
						arrayString[j]=temp;
					}
				}
				System.out.println(arrayString[i]);
			}
			
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		/// removeUpparCase();

		//String newStrin=removeFirstFromString("Dheeraj Pratap Singh");
		//System.out.println(removeFirstFromString("Dheeraj Pratap Singh"));
		sortWords();
		
	}

}