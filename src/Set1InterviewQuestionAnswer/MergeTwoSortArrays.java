package Set1InterviewQuestionAnswer;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoSortArrays {

	public static void main(String[] args) {
		findMaximumNumberInMap();
	}

	public static void findMaximumNumberInMap() {
		try {
			Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
			maps.put(1, 239);
			maps.put(2, 5434);
			maps.put(3, 39);
			maps.put(4, 2391);
			maps.put(5, 543422);
			int maxValue = Integer.MIN_VALUE; // Initialize to the smallest possible value // it can be assign with 0 as
												// well
			int key = 0;
			for (Map.Entry<Integer, Integer> entrySetOfMap : maps.entrySet()) {
				if (entrySetOfMap.getValue() > maxValue) {
					maxValue = entrySetOfMap.getValue();
					key = entrySetOfMap.getKey();
				}
			}
			System.out.println("Key for : " + key + " and Maximum value in Map is : " + maxValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void pairCommonElementCount() {
		try {
			int[] arr = { 6, 5, 2, 3, 5, 2, 2, 1 };
			Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (maps.get(arr[i]) != null) {
					maps.put(arr[i], maps.get(arr[i]) + 1);
				} else {
					maps.put(arr[i], 1);
				}
			}

			System.out.println();

			// Print the elements that appear more than once
			for (Map.Entry<Integer, Integer> entryOfMap : maps.entrySet()) {
				System.out.println("Key is " + entryOfMap.getKey() + " and value " + entryOfMap.getValue());
			}

			System.out.println();

			// Print only the elements that appear more than once (pairs)
			for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
				if (entry.getValue() > 1) {
					System.out.println("Element " + entry.getKey() + " appears " + entry.getValue() + " times.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void pairCommonElement() {
		try {
			int[] arr = { 6, 5, 2, 3, 4, 5, 2, 2, 1, 6, 5, 3, 3, 4 };
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for (int f = 0; f < arr.length; f++) {
				System.out.print(arr[f] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void mergeArraysAndAfterSort() {
		try {
			int[] array1 = { 100, 300, 500, 700, 900 };
			int[] array2 = { 201, 400, 600, 800, 109 };
			int[] mergeArr = new int[array1.length + array2.length]; // Simple way to Merge 2 arrays without Sorting
			int temp = 0, temp1 = 0;
			for (int i = 0; i < array1.length; i++) {
				mergeArr[temp++] = array1[i];
			}

			for (int j = 0; j < array2.length; j++) {
				mergeArr[temp++] = array2[j];
			}

			for (int k = 0; k < temp; k++) {
				for (int g = k + 1; g < temp; g++) {
					if (mergeArr[k] > mergeArr[g]) {
						temp1 = mergeArr[k];
						mergeArr[k] = mergeArr[g];
						mergeArr[g] = temp1;
					}
				}
				// System.out.print(mergeArr[k] + " ");
			}

			for (int f = 0; f < temp; f++) {
				System.out.print(mergeArr[f] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void mergeArrays() {
		try {
			int[] array1 = { 100, 300, 500, 700, 900 };
			int[] array2 = { 201, 400, 600, 800, 109 };
			int[] mergeArr = new int[array1.length + array2.length]; // Simple way to Merge 2 arrays without Sorting
			int temp = 0;

			for (int i = 0; i < array1.length; i++) {
				mergeArr[temp++] = array1[i];
			}

			for (int j = 0; j < array2.length; j++) {
				mergeArr[temp++] = array2[j];
			}

			for (int k = 0; k < temp; k++) {
				System.out.print(mergeArr[k] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void merge2SortedArrays() {
		try {
			int[] array1 = { 100, 300, 500, 700, 900 };
			int[] array2 = { 201, 400, 600, 800, 109 };

			// Correct array initialization
			int[] mergedArray = new int[array1.length + array2.length];
			int i = 0, j = 0, k = 0;

			// Merge the two arrays
			while (i < array1.length && j < array2.length) {
				if (array1[i] <= array2[j]) {
					mergedArray[k++] = array1[i++];
				} else {
					mergedArray[k++] = array2[j++];
				}
			}

			// Copy remaining elements of array1, if any
			while (i < array1.length) {
				mergedArray[k++] = array1[i++];
			}

			// Copy remaining elements of array2, if any
			while (j < array2.length) {
				mergedArray[k++] = array2[j++];
			}
			// Print the merged array
			System.out.println("Merged Array:");

			for (int val : mergedArray) {
				System.out.print(val + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
