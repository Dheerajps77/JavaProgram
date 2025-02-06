package Aug2024;

public class ReplaceOnlyFirstAndLastInArray {

	public static void main(String[] args) {
		replaceFirstWithLastDigitsUsingSwap();
	}

	public static void replaceFirstWithLastDigitsUsingDifferentArray() {
		try {

			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };
			int[] newArr = new int[num.length];
			int temp = 0;
			int firstDigit = num[0];
			int lastDigit = num[num.length - 1];

			for (int i = 0; i < num.length; i++) {
				if (i == 0) {
					num[i] = lastDigit;
					newArr[temp++] = num[i];
				} else if (i == num.length - 1) {
					num[i] = firstDigit;
					newArr[temp++] = num[i];
				} else {
					newArr[temp++] = num[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(newArr[j] + " "); // 42 6 75 467 75 3 5 6 7 8 9 6 3 2 4 6 476 44 34
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		String str = "Co2*&*&(()()ngnizen3843t";
		String result = str.replaceAll("[^a-zA-Z]", ""); // Congnizent
		System.out.println("\n" + result);
	}

	public static void replaceFirstWithLastDigitsWithoutUsingDifferentArray() {
		try {

			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };
			int temp = 0;
			int firstDigit = num[0];
			int lastDigit = num[num.length - 1];

			for (int i = 0; i < num.length; i++) {
				if (i == 0) {
					num[i] = lastDigit;
					num[temp++] = num[i];
				} else if (i == num.length - 1) {
					num[i] = firstDigit;
					num[temp++] = num[i];
				} else {
					num[temp++] = num[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(num[j] + " "); // 42 6 75 467 75 3 5 6 7 8 9 6 3 2 4 6 476 44 34
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void replaceFirstWithLastDigitsUsingSwap() {
		try {

			int[] num = { 34, 6, 75, 467, 75, 3, 5, 6, 7, 8, 9, 6, 3, 2, 4, 6, 476, 44, 42 };
			int temp = 0;
			int firstDigit = num[0];
			int lastDigit = num[num.length - 1];

			num[0] = lastDigit;
			num[num.length - 1] = firstDigit;

			for (int i = 0; i < num.length; i++) {
				if (i == 0) {
					num[i] = lastDigit;
					num[temp++] = num[i];
				} else if (i == num.length - 1) {
					num[i] = firstDigit;
					num[temp++] = num[i];
				} else {
					num[temp++] = num[i];
				}
			}

			for (int j = 0; j < temp; j++) {
				System.out.print(num[j] + " "); // 42 6 75 467 75 3 5 6 7 8 9 6 3 2 4 6 476 44 34
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
