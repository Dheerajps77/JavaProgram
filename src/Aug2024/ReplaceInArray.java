package Aug2024;

public class ReplaceInArray {

	public static void replaceInArrays() {
		try {

			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6 };
			int replaceableNum = 3;
			int toBeReplaceByNum = 100;

			for (int i = 0; i < num.length; i++) {
				if (num[i] == replaceableNum) { // 34 6 75 467 75 100 5 6 7 8 9 6 100 2 4 6
					num[i] = toBeReplaceByNum;
				}
			}

			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void replaceInArraysWhichBasisOnFirstDigit() {
		try {

			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };
			int addWithThatNumber = 100;

			for (int i = 0; i < num.length; i++) {

				String charArray = String.valueOf(num[i]);

				if (charArray.charAt(0) == '4') { // 34 6 75 567 75 3 5 6 7 8 9 6 3 2 104 6 576 144 142
					num[i] = num[i] + addWithThatNumber;
				}

			}

			for (int j = 0; j < num.length; j++) {
				System.out.print(num[j] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printOnlyBasisOnFirstDigit() {
		try {
			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };

			for (int i = 0; i < num.length; i++) {
				char[] charArr = String.valueOf(num[i]).toCharArray();

				if (charArr[0] == '7') // 75 75 7
				{
					System.out.print(num[i] + " ");

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printOnBasisOfIndex() {
		try {
			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };

			for (int i = 0; i < num.length; i++) {
				if (num[i] != 6) // 34 75 467 75 3 5 7 8 9 3 2 4 476 44 42
				{
					System.out.print(num[i] + " ");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printNumbernBasisOfIndex() {
		try {
			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };
			int n = 42;
			int temp = 0;
			for (int i = 0; i < num.length; i++) {
				if (num[i] == n) {
					for (int j = 0; j < n; j++) {
						System.out.print(n + " ");
						temp++;
					}
				}
			}
			System.out.println("\n" + temp);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void replaceOnIndexBasis() {
		try {
			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };
			int index = 3;
			int numToBeReplace = 200;
			for (int i = 0; i < num.length; i++) {
				if (i == index) {
					num[i] = numToBeReplace;
				}
			}

			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		replaceOnIndexBasis();
	}

}
