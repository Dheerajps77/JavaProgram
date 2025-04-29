package April2025;

import java.io.IOException;

public class InterviewQuestionForNABInAccenture {

	public static void sumOfLowestValueInArray() {
		try {
			int[] arr = { 34, 55, 22, 15 };

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}

			int num = arr[0];

			char[] charArr = String.valueOf(num).toCharArray();
			int[] arr1 = new int[charArr.length];
			int temp = 0;
			int sum = 0;
			for (int h = 0; h < arr1.length; h++) {
				arr1[temp++] = charArr[h] - '0';
			}

			for (int f = 0; f < arr1.length; f++) {
				sum = sum + arr1[f];
			}

			System.out.println("Sum of lowest value using for loop : " + sum);

			int sum1 = 0;
			while (num != 0) {
				int digit = num % 10;
				sum1 = sum1 + digit;
				num = num / 10;
			}

			System.out.println("Sum of lowest value using while loop : " + sum1);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		sumOfLowestValueInArray();
	}

}
