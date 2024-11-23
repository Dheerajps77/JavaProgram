package July2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConvertIntoNumberAndThenSort {

	public static void sortNumber() {
		try {

			String str = "488354938492210843";

			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			ArrayList<Integer> noDuplicate = new ArrayList<Integer>();
			Set<Integer> integers = new HashSet<Integer>();

			int temp = 0;

			// Convert each word into char
			char[] c = str.toCharArray();

			// Add all value into ArrayList
			for (int i = 0; i < c.length; i++) {
				int num = c[i] - '0';
				arrayList.add(num);
			}

			// Add size of added array list
			int[] arrNum = new int[arrayList.size()];

			// Push Array list value into array
			for (int ndd : arrayList) {
				arrNum[temp++] = ndd;
			}

			// Filter the non-duplicate values using Set interface
			for (int i = 0; i < arrNum.length; i++) {
				if (integers.add(arrNum[i]) != false) {
					noDuplicate.add(arrNum[i]);
				}
			}

			// Create empty array to store only non-duplicate values
			int temp1 = 0;
			int[] nonDuplicateArr = new int[noDuplicate.size()];
			for (int bdd : noDuplicate) {
				nonDuplicateArr[temp1++] = bdd;
			}

			// Print the non-duplicate values from array
			for (int i = 0; i < nonDuplicateArr.length; i++) {
				System.out.print(nonDuplicateArr[i]);
			}

			System.out.println();

			int temp3 = 0;
			for (int i = 0; i < nonDuplicateArr.length; i++) {
				for (int j = i + 1; j < nonDuplicateArr.length; j++) {
					if (nonDuplicateArr[i] > nonDuplicateArr[j]) {
						temp3 = nonDuplicateArr[i];
						nonDuplicateArr[i] = nonDuplicateArr[j];
						nonDuplicateArr[j] = temp3;
					}
				}

				System.out.print(nonDuplicateArr[i]);
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

	public static void main(String[] args) {
		sortNumber();
	}
}
