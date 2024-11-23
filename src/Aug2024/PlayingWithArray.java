package Aug2024;

import java.util.ArrayList;
import java.util.List;

public class PlayingWithArray {
	
	public static void printOnlyZeroValuesInArrayUsingList() {
	    try {
	        int n[] = { -98, 343, 23, 8, 6, 1, 67, 0, 45, 3, 656, 0, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };

	        // We use three different lists to store zero, positive, and negative values
	        List<Integer> zeros = new ArrayList<>();
	        List<Integer> positives = new ArrayList<>();
	        List<Integer> negatives = new ArrayList<>();

	        // Pass through the array to categorize each number
	        for (int i = 0; i < n.length; i++) {
	            if (n[i] == 0) {
	                zeros.add(n[i]);
	            } else if (n[i] > 0) {
	                positives.add(n[i]);
	            } else {
	                negatives.add(n[i]);
	            }
	        }

	        // Print zeros, followed by positives and negatives
	        for (int zero : zeros) {
	            System.out.print(zero + " ");
	        }
	        for (int positive : positives) {
	            System.out.print(positive + " ");
	        }
	        for (int negative : negatives) {
	            System.out.print(negative + " ");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void printOnlyZeroValuesInArray() {
		try {
			int n[] = { -98, 343, 23, 8, 6, 1, 67, 0, 45, 3, 656, 0, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };
			int temp = 0;
			for (int i = 0; i < n.length; i++) {
				if (n[i] == 0) {
					n[temp++] = n[i];
				}
			}
			
			for (int i = 0; i < n.length; i++) {
				if (n[i] > 0) {
					n[temp++] = n[i];
				}
			}
			
			for (int i = 0; i < n.length; i++) {
				if (n[i] < 0) {
					n[temp++] = n[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(n[j] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printOnlyPositiveValuesInArray() {
		try {
			int n[] = { -98, 343, 23, 8, 6, 1, 67, 45, 3, 656, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };
			int temp = 0;
			for (int i = 0; i < n.length; i++) {
				if (n[i] > 0) {
					n[temp++] = n[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(n[j] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printOnlyNegativeValuesInArray() {
		try {
			int n[] = { -98, 343, 23, 8, 6, 1, 67, 45, 3, 656, 7, 8654, 0, 54, 64, 323, -5, -2, -32, -567 };
			int temp = 0;
			for (int i = 0; i < n.length; i++) {
				if (n[i] < 0) {
					n[temp++] = n[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(n[j] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void MixedArrayDemo() {
		try {
			// Creating an array of Object to hold different types of data
			Object[] mixedArray = { 123, "Hello", 45.67, 'A', true, 89L, 456, "World", 78.90, 'B', false, 12L, 789,
					"Java", 12.34, 'C', true, 34L, "Test", 3.14, 'D', 999, false, "String", 'E' };

			// Iterate through the array and print each element based on its type
			for (Object element : mixedArray) {
				if (element instanceof Integer) {
					System.out.println("Integer: " + element);
				} else if (element instanceof String) {
					System.out.println("String: " + element);
				} else if (element instanceof Double) {
					System.out.println("Double: " + element);
				} else if (element instanceof Character) {
					System.out.println("Character: " + element);
				} else if (element instanceof Boolean) {
					System.out.println("Boolean: " + element);
				} else if (element instanceof Long) {
					System.out.println("Long: " + element);
				} else {
					System.out.println("Unknown type: " + element);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		printOnlyZeroValuesInArray();
		//printOnlyPositiveValuesInArray(); // 343 23 8 6 1 67 45 3 656 7 8654 54 64 323
		// MixedArrayDemo();
		// printOnlyNegativeValuesInArray(); // -98 -5 -2 -32 -567
		// printOnlyZeroValuesInArray(); // 0 0 0

	}

}
