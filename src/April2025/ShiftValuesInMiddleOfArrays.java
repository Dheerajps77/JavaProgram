package April2025;

public class ShiftValuesInMiddleOfArrays {

	public static void main(String[] args) {
		shiftNegativesToMiddle();
	}

	public static void shiftZerosToMiddle() {
		int[] arr = { 1, 0, -3, 4, 0, 5, -6, 0, 2 };
		int[] result = new int[arr.length];
		int left = 0;
		int right = arr.length - 1;

		System.out.print("Original arrays number : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		// First add non-zero elements: negatives to left, positives to right
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (arr[i] < 0) {
					result[left++] = arr[i];
				} else {
					result[right--] = arr[i];
				}
			}
		}

		// Fill zeros in the remaining middle positions
		while (left <= right) {
			result[left++] = 0;
		}

		System.out.print("\nZeros shifted to middle: ");
		for (int val : result) {
			System.out.print(val + " "); // -3 -6 0 0 0 2 5 4 1
		}
	}

	public static void shiftZerosToMiddleUsingAnotherWay() {
		int[] arr = { 1, 0, -3, 4, 0, 5, -6, 0, 2 };
		int[] result = new int[arr.length];
		int temp = 0;

		System.out.print("Original arrays number : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		// First add non-zero elements: negatives to left, positives to right
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				result[temp++] = arr[i];
			}
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
				result[temp++] = arr[j];
			}
		}

		// First add non-zero elements: negatives to left, positives to right
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] > 0 && arr[k] != 0) {
				result[temp++] = arr[k];
			}
		}

		System.out.print("\nZeros shifted to middle using different approach: ");
		for (int h=0;h<temp;h++) {
			System.out.print(result[h] + " "); // -3 -6 0 0 0 2 5 4 1
		}
	}
	
	public static void shiftNegativesToMiddle() {
	    int[] arr = {1, -2, 3, -4, 0, 5, -6, 7, 0};
	    int[] result = new int[arr.length];
	    int left = 0;
	    int right = arr.length - 1;

	    // Place positives and zeros on sides
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] >= 0) {
	            result[left++] = arr[i];
	        }
	    }

	    for (int i = arr.length - 1; i >= 0; i--) {
	        if (arr[i] > 0 || arr[i] == 0) {
	            result[right--] = arr[i];
	        }
	    }

	    // Fill negatives in middle
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < 0 && left <= right) { 
	            result[left++] = arr[i];
	        }
	    }

	    System.out.print("Negatives shifted to middle: ");
	    for (int val : result) {
	        System.out.print(val + " "); // 1 3 0 1 3 0 5 7 0
	    }
	}

	public static void shiftPositivesToMiddle() {
	    int[] arr = {1, -2, 3, -4, 0, 5, -6, 7, 0};
	    int[] result = new int[arr.length];
	    int left = 0;
	    int right = arr.length - 1;

	    // Step 1: Fill non-positive (negatives and zeros) on both sides
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] <= 0) {
	            result[left++] = arr[i];
	        }
	    }

	    for (int i = arr.length - 1; i >= 0; i--) {
	        if (arr[i] <= 0) {
	            result[right--] = arr[i];
	        }
	    }

	    // Step 2: Fill positives in the middle
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > 0 && left <= right) {
	            result[left++] = arr[i];
	        }
	    }

	    System.out.print("Positives shifted to middle: ");
	    for (int val : result) {
	        System.out.print(val + " ");
	    }
	}


}
