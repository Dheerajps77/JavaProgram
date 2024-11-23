package Feb2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayingWithArrays {
	public static void main(String[] args) {
	}
	public static void shiftAllZeroToRightSideInArray() {

		int n[] = { 34, 55, 3, 0, 8, 90, 0, 9, 0, 2, 0, 205, 5, 0, 50, 0 };
		int temp = 0;
		int lengthOfArray = n.length;
		int[] result = new int[lengthOfArray];
		
		for (int i = 0; i < lengthOfArray; i++) {
			if (n[i] != 0) {
				result[temp++] = n[i];
			}
		}

		while (temp < lengthOfArray) {
			result[temp++] = 0;
		}
		for (int j = 0; j < lengthOfArray; j++) {
			System.out.print(result[j] + " ");
		}
	}

	public static void shiftNegativeValueToRight() {
		try {
			int n[] = { 34, 55, -3, -1, 8, 90, 3, 9, 7, -2, 2, 205, 5, 1, -50, -2, -77, -9, -10 };
			int temp = 0;
			int newLength = n.length;
			int[] newArr = new int[newLength];

			for (int i = 0; i < n.length; i++) {
				if (n[i] >= 0) {
					newArr[temp++] = n[i];
				}
			}

			for (int k = 0; k < n.length; k++) {
				if (n[k] < 0) {
					newArr[temp++] = n[k];
				}
			}
			System.arraycopy(newArr, 0, n, 0, newLength);
			System.out.println();
			
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[j] + " ");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void shiftDuplicatesValueAtTheEndOfArrayWithDiffMethod() {
		try {
			int n[] = { 34, 55, 3, 0, 8, 5, 90, 0, 9, 0, 2, 3, 9, 50, 0, 205, 5, 0, 50, 0 };

			List<Integer> nonDuplicateValue = new ArrayList<>();
			List<Integer> duplicateValue = new ArrayList<>();
			Set<Integer> set = new HashSet<>();

			for (int i = 0; i < n.length; i++) {
				if (set.add(n[i])) {
					nonDuplicateValue.add(n[i]);
				} else {
					duplicateValue.add(n[i]);
				}
			}

			int[] result = new int[nonDuplicateValue.size() + duplicateValue.size()];
			int index = 0;

			for (int value : nonDuplicateValue) {
				result[index++] = value;
			}

			for (int value : duplicateValue) {
				result[index++] = value;
			}

			for (int d = 0; d < result.length; d++) {
				System.out.print(result[d] + " ");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void shiftDuplicatesValueAtTheEndOfArray() {
		try {
			int n[] = { 34, 55, 3, 0, 8, 590, 0, 9, 0, 2, 3, 9, 50, 0, 205, 5, 0, 50, 0 };
			ArrayList<Integer> nonDuplicateValue = new ArrayList<Integer>();
			ArrayList<Integer> duplicateValue = new ArrayList<Integer>();
			Set<Integer> set = new HashSet<Integer>();

			for (int i = 0; i < n.length; i++) {
				if (set.add(n[i]) != false) {
					nonDuplicateValue.add(n[i]);
				} else {
					duplicateValue.add(n[i]);
				}
			}

			int[] nonDuplicate = new int[nonDuplicateValue.size()];
			int[] duplicate = new int[duplicateValue.size()];
			int temp = 0, temp1 = 0;

			for (int nonduplicateValue : nonDuplicateValue) {
				nonDuplicate[temp++] = nonduplicateValue;
			}

			for (int duplicateValues : duplicateValue) {
				duplicate[temp1++] = duplicateValues;
			}

			for (int d = 0; d < nonDuplicate.length; d++) {
				System.out.print(nonDuplicate[d] + " ");
			}

			System.out.println("==========================");
			for (int d = 0; d < duplicate.length; d++) {
				System.out.print(duplicate[d] + " ");
			}
			System.out.println();
		} catch (Exception e) {
			throw e;
		}

	}
}
