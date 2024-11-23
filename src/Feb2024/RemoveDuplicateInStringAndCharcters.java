package Feb2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInStringAndCharcters {

	public static void removeDuplicayInString() {
		try {

			String[] strArray = { "Hello", "Dheeraj", "Pratap", "No", "Yes", "Dheeraj", "Hello", "Dilwali", "Khatt",
					"Khatt", "What" };
			Set<String> setOfString = new HashSet<String>();
			ArrayList<String> uniqueValues = new ArrayList<String>();
			ArrayList<String> duplicateValues = new ArrayList<String>();

			for (int i = 0; i < strArray.length; i++) {

				if (setOfString.add(strArray[i]) == false) {
					duplicateValues.add(strArray[i]);
				} else {
					uniqueValues.add(strArray[i]);
				}
			}

			System.out.println("Below are unique values");
			for (int v = 0; v < uniqueValues.size(); v++) {
				System.out.println(uniqueValues.get(v));
			}

			System.out.println("Below are duplicate values");
			for (int e = 0; e < duplicateValues.size(); e++) {
				System.out.println(duplicateValues.get(e));
			}

			String[] sortOfString = new String[uniqueValues.size()];
			int index3 = 0;
			for (String str1 : uniqueValues) {
				sortOfString[index3++] = str1;
			}

			System.out.println("After sorting of String ::::: ");
			String temp = "";
			for (int l = 0; l < sortOfString.length; l++) {
				for (int r = l + 1; r < sortOfString.length; r++) {
					if (sortOfString[l].compareTo(sortOfString[r]) > 0) {
						temp = sortOfString[l];
						sortOfString[l] = sortOfString[r];
						sortOfString[r] = temp;
					}
				}
				if (l != sortOfString.length - 1) {
					System.out.print(sortOfString[l] + " | ");
				} else {
					System.out.print(sortOfString[l]);
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		removeDuplicayInString();

	}

}
