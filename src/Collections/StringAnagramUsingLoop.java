package Collections;

import java.util.ArrayList;

public class StringAnagramUsingLoop {

	public static void anagramOfStringProgram() {
		try {

			String firstString = "Dheeraj is not working in the company";
			String secondString = "Dheeraj is not working in the company";
			StringBuilder builder = new StringBuilder();
			StringBuilder builder1 = new StringBuilder();
			String[] newString = firstString.split(" ");
			String[] newSecondString = secondString.split(" ");
			// char actualAnagramValue = 0, expectedAnagramValue = 0;
			char StringTemp1, StringTemp2;
			ArrayList<Character> actualAnagramValue = new ArrayList<Character>();
			ArrayList<Character> expectedAnagramValue = new ArrayList<Character>();

			for (int i = 0; i < newString.length; i++) {
				builder.append(newString[i]);
			}
			System.out.print("Before sorting the string 1 values --> ");
			System.out.print(builder.toString());
			String newSortString = builder.toString().toLowerCase();

			char[] newSortChar = newSortString.toCharArray();
			System.out.println();
			System.out.print("After sorting the string 1 values --> ");
			for (int j = 0; j < newSortChar.length; j++) {
				for (int k = j + 1; k < newSortChar.length; k++) {

					if (newSortChar[j] > newSortChar[k]) {
						StringTemp1 = newSortChar[j];
						newSortChar[j] = newSortChar[k];
						newSortChar[k] = StringTemp1;
					}
				}
				System.out.print(newSortChar[j]);
				actualAnagramValue.add(newSortChar[j]);
			}

			for (int l = 0; l < newSecondString.length; l++) {
				builder1.append(newSecondString[l]);
			}
			System.out.println();
			String newSortString1 = builder1.toString().toLowerCase();
			char[] newSortChar2 = newSortString1.toCharArray();

			System.out.print("Before sorting the String 2 values  --> ");
			System.out.print(builder1.toString());
			System.out.println();
			System.out.print("After sorting the String 2 values  --> ");
			for (int u = 0; u < newSortChar2.length; u++) {
				for (int y = u + 1; y < newSortChar2.length; y++) {
					if (newSortChar2[u] > newSortChar2[y]) {
						StringTemp2 = newSortChar2[u];
						newSortChar2[u] = newSortChar2[y];
						newSortChar2[y] = StringTemp2;
					}
				}
				System.out.print(newSortChar2[u]);
				expectedAnagramValue.add(newSortChar2[u]);
			}
			System.out.println();
			
			if(actualAnagramValue.equals(expectedAnagramValue))
			{
				System.out.println(actualAnagramValue + "\n");
				System.out.println(expectedAnagramValue + "\n");
				System.out.println("This is anagram is matched");
			} else {
				System.out.println(actualAnagramValue + "\n");
				System.out.println(expectedAnagramValue + "\n");
				System.out.println("This is not anagram is matched");
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		anagramOfStringProgram();
	}

}
