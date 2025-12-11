package April2025;

public class ShiftingInArrays {

	public static void main(String[] args) {
		shiftZerosToLeft();
	}

	public static void shiftZerosToRight() {
		try {

			int[] arr = { 0, -1, 3, 0, -2, 4, 0, 5, -6 };
			int temp = 0;

			System.out.print("Original arrays number : ");
			for (int a : arr) {
				System.out.print(a + " ");
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					arr[temp++] = arr[i];
				}
			}

			while (temp < arr.length) {
				arr[temp++] = 0;
			}

			System.out.print("\nZero moved to Right : "); // -1 3 -2 4 5 -6 0 0 0
			for (int k = 0; k < temp; k++) {
				System.out.print(arr[k] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void shiftZerosToLeft() {
		try {

			int[] arr = { 0, -1, 3, 0, -2, 4, 0, 5, -6 };
			int temp = arr.length - 1;

			System.out.print("Original arrays number : ");
			for (int a : arr) {
				System.out.print(a + " ");
			}
			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] != 0) {
					arr[temp] = arr[i];
					temp--;
				}
			}

			for (int i = temp; i >= 0; i--) {
				arr[i] = 0;
			}

			System.out.print("\nZero moved to left : "); // 0 0 0 -1 3 -2 4 5 -6
			for (int k : arr) {
				System.out.print(k + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void shiftZerosToLeftWithAnotherWay() {
		try {
			int[] arr = { 0, -1, 3, 0, -2, 4, 0, 5, -6 };
			int[] result = new int[arr.length];
			int temp = 0;

			System.out.print("Original arrays number: ");
			for (int a : arr) {
				System.out.print(a + " ");
			}

			// Add zeros first
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					result[temp++] = 0;
				}
			}

			// Then add non-zero elements
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != 0) {
					result[temp++] = arr[j];
				}
			}

			System.out.print("\nZero moved to left using Another Way: "); // 0 0 0 -1 3 -2 4 5 -6
			for (int k : result) {
				System.out.print(k + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
