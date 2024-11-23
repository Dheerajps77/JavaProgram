package Aug2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveElementFromArray {

	public static void removeDuplicatesFromSortedArrayUsingDifferentApproach2() {
		try {

			int num[] = { 0, 1, 2, 2, 3, 0, 4, 2, 4, 2, 1, 4, 6, 8, 5, 3, 2, 20, 1, 40, 2, 56, 3, 3 };
			int temp = 0, k = 0;
			int num1[];
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			System.out.println("Sort Values in Array");
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
				System.out.print(num[i] + " ");
			}

			System.out.println("\nRemoved duplicate Values");
			for (int g = 0; g < num.length; g++) {
				if (g == 0 || num[g] != num[g - 1]) {
					arrayList.add(num[g]);
					k++;
				}
			}

			// Step 3: Transfer ArrayList to array
			num1 = new int[arrayList.size()];
			for (int i = 0; i < arrayList.size(); i++) {
				num1[i] = arrayList.get(i);
			}
			// Step 4: Print the result
			for (int value : num1) {
				System.out.print(value + " ");
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeDuplicatesFromSortedArrayUsingDifferentApproach() {
		try {

			int num[] = { 0, 1, 2, 2, 3, 0, 4, 2, 4, 2, 1, 4, 6, 8, 5, 3, 2, 20, 1, 40, 2, 56, 3, 3 };
			int temp = 0, k = 0;
			System.out.println("Sort Values in Array");
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
				System.out.print(num[i] + " ");
			}

			System.out.println("\nRemoved duplicate Values");
			for (int g = 0; g < num.length; g++) {
				if (num[g] != num[k]) {
					k++;
					num[k] = num[g];
				}
			}

			for (int i = 0; i <= k; i++) {
				System.out.print(num[i] + " ");
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeDuplicatesFromSortedArrayUsingSets() {
		try {

			int num[] = { 0, 1, 2, 2, 3, 0, 4, 2, 4, 2, 1, 4, 6, 8, 5, 3, 2, 20, 1, 40, 2, 56, 3, 3 };
			int temp = 0;
			Set<Integer> set = new HashSet<Integer>();
			System.out.println("Sort Values in Array");
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] > num[j]) {
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
				System.out.print(num[i] + " ");
			}

			System.out.println("\nRemoved duplicate Values");
			for (int g = 0; g < num.length; g++) {
				if (set.add(num[g]) != false) {
					System.out.print(num[g] + " ");
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeElement() {
		try {

			int num[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
			int numToBeRemove = 2;
			int k = 0;
			for (int i = 0; i < num.length; i++) {
				if (numToBeRemove != num[i]) {
					num[k] = num[i];
					k++;
				}
			}

			for (int j = k; j < num.length; j++) {
				num[j] = -1;
				System.out.println("k = " + k);
				System.out.println("nums = " + Arrays.toString(num).replace("-1", "_"));
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void removeNegativeNumberUsingArrayList() {
		try {
			int[] numbers = { -98, 343, 23, 8, 6, 1, 67, 45, 3, 656, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };
			int temp = 0;
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			// System.out.println(numbers.length);
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > 0) {
					// temp++;
					arrayList.add(numbers[i]);
					// numbers[temp] = numbers[i];
				}
			}
			for (int value : arrayList) {
				System.out.println(value);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeNegativeNumberUsingArrays() {
		try {
			int[] numbers = { -98, 343, 23, 8, 6, 1, 67, 45, 3, 656, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };
			int temp = 0;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] >= 0) {
					numbers[temp] = numbers[i];
					temp++;
				}
			}

			for (int i = 0; i <= temp; i++) {
				System.out.println(numbers[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeSingleValueFromArray(int n) {
		try {
			int[] numbers = { -98, 343, 23, 8, 6, 1, 67, 45, 3, 656, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };
			int temp = 0;
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] != n) {
					numbers[temp] = numbers[i];
					temp++;
				}
			}

			for (int i = 0; i <= temp; i++) {
				System.out.println(numbers[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void shiftNegativeValueAtLeft() {
		try {
			int[] numbers = { -98, 343, 23, 8, 6, 1, 67, 45, 3, 656, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };
			int temp = 0;
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] < 0) {
					numbers[temp++] = numbers[i];
				}
			}
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] >= 0) {
					numbers[temp++] = numbers[i];
				}
			}

			for (int i = 0; i < temp; i++) {
				System.out.println(numbers[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void shiftZeroValueAtLeft() {
		try {
			int[] numbers = { 0, 343, 23, 8, 6, 1, 67, 45, 3, 656, 7, 8654, 0, 54, 64, 323, 0, 0, 0, 0 };
			int temp = 0;
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == 0) {
					numbers[temp++] = numbers[i];
				}
			}
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > 0) {
					numbers[temp++] = numbers[i];
				}
			}

			for (int i = 0; i < temp; i++) {
				System.out.println(numbers[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// removeNegativeNumberUsingArrays();
		// removeSingleValueFromArray(-98);
		// shiftNegativeValueAtLeft();
		shiftZeroValueAtLeft();
	}

}
