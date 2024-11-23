package InterviewQuestionAnswer;

import java.util.HashSet;
import java.util.Set;

public class ConvertIntoNumbersAndRemoveDuplicacyAndSort {

	public static void sortAndRemoveDuplicatesNumber() {
		try {
			int num = 792019433;

			char[] charArray = String.valueOf(num).toCharArray();
			Set<Integer> set = new HashSet<Integer>();
			int arrayNum[] = new int[charArray.length];
			int temp = 0, temp1 = 0;
			for (int i = 0; i < charArray.length; i++) {
				arrayNum[temp++] = charArray[i] - '0';
			}

			for (int k = 0; k < arrayNum.length; k++) {
				if (set.add(arrayNum[k]) != false) {
					// --> To get non-duplicate values
					arrayNum[temp1++] = arrayNum[k];
				}
				else
				{
					// --> To get duplicate values
					// arrayNum[temp1++] = arrayNum[k];
				}

			}

			for (int j = 0; j < temp1; j++) {
				System.out.println(arrayNum[j]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		sortAndRemoveDuplicatesNumber();
	}

}
