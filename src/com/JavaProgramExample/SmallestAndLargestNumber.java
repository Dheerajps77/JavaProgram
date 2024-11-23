package com.JavaProgramExample;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {

		CheckSmallestAndLargestNumber1();

	}

	public static void CheckFibnoacciNumber() {
		try {
			int i = 0;
			int j = 1;

			for (int a = 0; a < 10; a++) {
				System.out.println(i);
				int k = i + j;
				i = j;
				j = k;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void CheckSmallestAndLargestNumber1() {
		try {

			int[] n = { 45, 2, 4462, 4, 5, 77, 8, 6, 112, 23, 3, 56, 78 };
			int highestValue = 0;			
			for (int i = 0; i < n.length; i++) {
				if (n[i] > highestValue) {
					highestValue = n[i];
				}				
			}
			int lowestValue=n[0];
			for (int i = 0; i < n.length; i++) {				
					if (lowestValue>n[i]) {
						lowestValue = n[i];
					}				
			}

			System.out.println("Highest value is : " + highestValue);
			System.out.println("Lowest value is : " + lowestValue);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void CheckSmallestAndLargestNumber() {
		try {
			int n[] = { 4, 3, 8, 676, 10, 43, 7, 45, 67, 9, 2 };
			int smallest = n[0];
			int largest = n[0];

			for (int i = 0; i < n.length; i++) {
				if (n[i] < smallest) {
					smallest = n[i];
				}
				if (n[i] > largest) {
					largest = n[i];
				}
			}
			System.out.println("Smallest number is : " + smallest);
			System.out.println("Largest number is : " + largest);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
