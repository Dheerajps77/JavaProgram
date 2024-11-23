package Aug2024;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArrayOrArrayList {

	public static void findCommonElementInArrayWithoutCheckingDuplicates() {
		try {
			int[] array1 = { 34, 5, 3, 3, 24, 3, 5, 63, 44, 6, 66, 86, 54, 53, 454, 4, 5, 778, 43, 32, 5, 4, 23 };
			int[] array2 = { 34, 5, 3, 3, 2, 3, 5, 6, 4, 6, 66, 8, 54, 53, 45, 4, 5, 78, 343, 632, 35, 14, 54 };
			int[] commonElements = new int[array1.length]; // Allocate a fixed-size array for common elements
			int temp = 0;

			// Check if the lengths of both arrays are equal
			if (array1.length != array2.length) {
				System.out.println("The lengths of the two arrays are not equal. Exiting the program.");
				return; // Exit the method if lengths are not equal
			}

			// Find common elements
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[i] == array2[j]) {
						commonElements[temp++] = array1[i];
						break;
					}

				}
			}

			// Print the common elements
			System.out.println("Common Elements:");
			for (int i = 0; i < temp; i++) {
				System.out.println(commonElements[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findCommonElementInArrayAndCheckDuplicatesAsWell() {
		try {
			int[] array1 = { 34, 5, 3, 3, 24, 3, 5, 63, 44, 6, 66, 86, 54, 53, 454, 4, 5, 778, 43, 32, 5, 4, 23 };
			int[] array2 = { 34, 5, 3, 3, 2, 3, 5, 6, 4, 6, 66, 8, 54, 53, 45, 4, 5, 78, 343, 632, 35, 14, 54 };
			int[] commonElements = new int[array1.length]; // Allocate a fixed-size array for common elements
			int temp = 0;

			// Check if the lengths of both arrays are equal
			if (array1.length != array2.length) {
				System.out.println("The lengths of the two arrays are not equal. Exiting the program.");
				return; // Exit the method if lengths are not equal
			}

			// Find common elements
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[i] == array2[j]) {
						// Check if the element is already present in the result array
						boolean alreadyPresent = false;
						for (int k = 0; k < temp; k++) {
							if (commonElements[k] == array1[i]) {
								alreadyPresent = true;
								break;
							}
						}

						// If not present, add the element to the result array
						if (!alreadyPresent) {
							commonElements[temp++] = array1[i];
						}
						break; // Break inner loop to avoid counting duplicates
					}
				}
			}

			// Print the common elements
			System.out.println("Common Elements:");
			for (int i = 0; i < temp; i++) {
				System.out.println(commonElements[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findCommonElementInArrayUsingSets() {
		try {

			int[] array1 = { 34, 5, 3, 3, 24, 3, 5, 63, 44, 6, 66, 86, 54, 53, 454, 4, 5, 778, 43, 32, 5, 4, 23 };
			int[] array2 = { 34, 5, 3, 3, 2, 3, 5, 6, 4, 6, 66, 8, 54, 53, 45, 4, 5, 78, 343, 632, 35, 14, 54 };

			// Check if the lengths of both arrays are equal
			if (array1.length != array2.length) {
				System.out.println("The lengths of the two arrays are not equal. Exiting the program.");
				return; // Exit the method if lengths are not equal
			}

			Set<Integer> set1 = new HashSet<>();
			Set<Integer> commonElements = new HashSet<>();

			// Add elements of array1 to set1
			for (int num : array1) {
				set1.add(num);
			}

			// Find common elements
			for (int num : array2) {
				if (set1.contains(num)) {
					commonElements.add(num);
				}
			}

			// Print the common elements
			System.out.println("Common Elements: " + commonElements);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		findCommonElementInArrayAndCheckDuplicatesAsWell();

	}

}
