package Feb2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConvertIntToStringAndThenSort {

	public static void main(String[] args) {
		playingWithUnicodeCharacterToConvertCharIntoInt();
	}

	public static void userDefinedToEnterNumbersInArray() {
		try {

			System.out.println("Enter the size of Array to store Numbers");
			Scanner sizeOfArray = new Scanner(System.in);
			Scanner enterNumberToStoreInArray;
			int enterSizeOfArray = sizeOfArray.nextInt();
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			int[] numArray = new int[enterSizeOfArray];

			for (int i = 0; i < numArray.length; i++) {
				enterNumberToStoreInArray = new Scanner(System.in);
				int num1 = enterNumberToStoreInArray.nextInt();
				numArray[i] = num1;
				arrayList.add(numArray[i]);
			}
			System.out.println("Entered below number in array");

			for (int j = 0; j < arrayList.size(); j++) {
				System.out.print(arrayList.get(j) + " ");
			}

		} catch (Exception e) {
			throw e;
		} finally {
			// System.out.println("This will execute irrespective of exception comes or
			// not");
		}
	}

	public static void playingWithUnicodeCharacterToConvertCharIntoInt() {
		try {
			String string = "1484393";

			char[] charArr = string.toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				
				// ASCII code of numbers .. 48 to 57
				// Convert char to int by subtracting '0'
				// Ex. Below
				// The Unicode value of '4' is 52.
				// The Unicode value of '0' is 48.
				// So, 4 will be convert once 52 - 48 equals 4.
				int number = charArr[i] - '0';
				System.out.print(number + " ");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			// System.out.println("This will execute irrespective of exception comes or
			// not");
		}
	}

	public static void ConvertIntToArrayAndSort() {

		try {

			System.out.println("Enter number to convert into String");
			Scanner inputFromUser = new Scanner(System.in);

			int enteredNumber = inputFromUser.nextInt();
			System.out.println("Entered number is " + enteredNumber);

			// Below statement also correct to convert int to string
			// Integer.toString(enteredNumber);
			char[] convertedIntIntoChar = String.valueOf(enteredNumber).toCharArray();

			ArrayList<Integer> arrayListOfIntArr = new ArrayList<Integer>();

			for (int i = 0; i < convertedIntIntoChar.length; i++) {
				int num = convertedIntIntoChar[i] - '0';
				arrayListOfIntArr.add(num);
			}

			int[] newArr = new int[arrayListOfIntArr.size()];
			int index = 0, temp = 0;

			for (int storeArr : arrayListOfIntArr) {
				newArr[index++] = storeArr;
			}

			System.out.println("Sorted number value");
			for (int j = 0; j < newArr.length; j++) {
				for (int k = j + 1; k < newArr.length; k++) {
					if (newArr[j] > newArr[k]) {
						temp = newArr[j];
						newArr[j] = newArr[k];
						newArr[k] = temp;
					}
				}
				if (j != newArr.length - 1) {
					System.out.print(newArr[j] + " ");
				} else {
					System.out.println(newArr[j]);
				}
			}
			System.out.println("Second highest number is : " + newArr[newArr.length - 2]);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void breakNumberIntoArraysAndThenSort() {
		try {
			int num = 9839232, temp;
			System.out.println("Before conversion into string the number is " + num);
			String convertedIntoString = String.valueOf(num).toString();
			System.out.println("After conversion into number into string is " + convertedIntoString);

			char[] charc = convertedIntoString.toCharArray();
			ArrayList<Integer> arrayListOfInteger = new ArrayList<Integer>();

			for (int i = 0; i < charc.length; i++) {
				int num1 = Character.getNumericValue(charc[i]);
				arrayListOfInteger.add(num1);
			}
			int temp1 = 0;
			int[] newArray = new int[arrayListOfInteger.size()];
			for (int num3 : arrayListOfInteger) {
				newArray[temp1++] = num3;
			}

			System.out.println("Sorting below number");
			for (int j = 0; j < newArray.length; j++) {
				for (int k = j + 1; k < newArray.length; k++) {
					if (newArray[j] > newArray[k]) {
						temp = newArray[j];
						newArray[j] = newArray[k];
						newArray[k] = temp;
					}
				}
				System.out.println(newArray[j]);
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void askUserSpecificNumberIntoArraysAndThenSortAfterRemovedDuplicay() {
		Scanner enterNumberToStoreInArray;
		Set<Integer> set;
		ArrayList<Integer> arrayList;
		int index = 0, enterSizeOfArray, temp = 0;
		ArrayList<Integer> arrayListOfUniqueNumber;
		try {
			System.out.println("Enter the size of Array to store Numbers\n");
			Scanner sizeOfArray = new Scanner(System.in);
			enterSizeOfArray = sizeOfArray.nextInt();
			arrayList = new ArrayList<Integer>();
			int[] numArray = new int[enterSizeOfArray];
			System.out.println("Enter number to store in Array");
			for (int i = 0; i < numArray.length; i++) {
				enterNumberToStoreInArray = new Scanner(System.in);
				int num1 = enterNumberToStoreInArray.nextInt();
				numArray[i] = num1;
				arrayList.add(numArray[i]);
			}
			System.out.println("Below are the entered numbers in array");
			for (int j = 0; j < numArray.length; j++) {
				System.out.println(numArray[j] + " ");
			}

			arrayListOfUniqueNumber = new ArrayList<Integer>();
			set = new HashSet<Integer>();
			for (int a = 0; a < numArray.length; a++) {
				if (set.add(numArray[a]) != false) {
					arrayListOfUniqueNumber.add(numArray[a]);
				}
			}

			int[] newArr = new int[arrayListOfUniqueNumber.size()];
			for (int arrayOfNumber : arrayListOfUniqueNumber) {
				newArr[index++] = arrayOfNumber;
			}

			System.out.println("Below are the unique number");

			for (int d = 0; d < arrayListOfUniqueNumber.size(); d++) {
				if (d != arrayListOfUniqueNumber.size() - 1) {
					System.out.println(arrayListOfUniqueNumber.get(d) + " ");
				} else {
					System.out.println(arrayListOfUniqueNumber.get(d));
				}
			}

			System.out.println("Below are the sorted Numbers having duplicate values");
			for (int y = 0; y < newArr.length; y++) {
				for (int f = y + 1; f < newArr.length; f++) {
					if (newArr[y] > newArr[f]) {
						temp = newArr[y];
						newArr[y] = newArr[f];
						newArr[f] = temp;
					}
				}
				System.out.print(newArr[y] + " ");
			}
			System.out.println("\nSecond highest number : " + newArr[newArr.length - 2]);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void convertNumbersIntoWords() {
		try {
			int n = 23993;
			String string = Integer.toString(n);
			System.out.println(string);
		} catch (Exception e) {
			throw e;

		}
	}

}