package Feb2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateAndPrint2ndHighestNumber {
	
	
	

	public static void printHighNumberAfterRemovedTheDuplicateNumberMethod2() {
		try {
			int[] number = { 34, 56, 76, 22, 34, 2, 5, 7, 9, 2, 65, 322, 45, 34, 78, 98, 54, 54, 1, 1, 4, 4 };
			int j = 0;
			for (int i = 0; i < number.length; i++) {
				if (number[i] != number[i + 1]) {
					number[j++] = number[i];
					number[j++] = number[number.length - 1];
				}
			}

			for (int b = 0; b < j; b++) {
				System.out.println(number[b]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	
	public static void removeDuplicateArraysUsingSet() {
		try {
			int[] number = { 34, 56, 76, 22, 34, 2, 5, 7, 9, 2, 65, 322, 45, 34, 78, 98, 54, 54, 1, 1, 4, 4 };
			Set<Integer> newArray = new HashSet<Integer>();

			for (int i = 0; i < number.length; i++) {
				newArray.add(number[i]);
			}
			int temp = 0;
			int[] newArr = new int[newArray.size()];

			for (int arrG : newArray) {
				newArr[temp++] = arrG;
			}
			System.out.println("Below are the unique values");
			for (int j = 0; j < newArr.length; j++) {
				System.out.println(newArr[j]);
			}
			
			System.out.println("After sorting ::: ");
			int temp1=0;
			for(int c=0;c<newArr.length;c++)
			{
				for(int d=c+1;d<newArr.length;d++)
				{
					if(newArr[c]>newArr[d])
					{
						temp1=newArr[c];
						newArr[c]=newArr[d];
						newArr[d]=temp1;
					}					
				}
				System.out.println(newArr[c]);
			}
			System.out.println("2nd Highest number is " + newArr[newArr.length-2]);

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void printHighNumberAfterRemovedTheDuplicateNumberMethod1() {
		try {

			int[] number = { 34, 56, 76, 22, 34, 2, 5, 7, 9, 2, 65, 322, 45, 34, 78, 98, 54, 54, 1, 1, 4, 4 };
			ArrayList<Integer> nonDuplicateNumber = new ArrayList<Integer>();
			ArrayList<Integer> duplicateNumber = new ArrayList<Integer>();

			Set<Integer> newSet = new HashSet<Integer>();
			for (int k = 0; k < number.length; k++) {
				if (newSet.add(number[k]) != false) {
					nonDuplicateNumber.add(number[k]);
				} else {
					duplicateNumber.add(number[k]);
				}
			}

			System.out.println("Below are the unique numbers");
			for (int l = 0; l < nonDuplicateNumber.size(); l++) {
				System.out.println(nonDuplicateNumber.get(l));
			}

			System.out.println("Below are the duplicate numbers");
			for (int a = 0; a < duplicateNumber.size(); a++) {
				System.out.println(duplicateNumber.get(a));
			}

			System.out.println("Unique values are");
			int[] nonDuplicateNumbersArray = new int[nonDuplicateNumber.size()];
			int index = 0;
			for (int num : nonDuplicateNumber) {
				nonDuplicateNumbersArray[index++] = num;
			}

			for (int n = 0; n < nonDuplicateNumbersArray.length; n++) {
				System.out.println(nonDuplicateNumbersArray[n]);
			}

		} catch (Exception e) {
			throw e;
		} finally {
			// Java finally block is a block used to execute important code such as closing
			// the connection, etc
			// Java finally block is always executed whether an exception is handled or not.
			// Therefore, it contains all the necessary statements that need to be printed
			// regardless of the exception occurs or not.
			System.out.println("Java finally block is always executed whether an exception is handled or not. "
					+ "Therefore, it contains all the necessary statements that need to be printed regardless "
					+ "of the exception occurs or not.");
		}
	}

	public static void main(String[] args) {
		removeDuplicateArraysUsingSet();
	}

}
