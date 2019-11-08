package SomeMoreJavaProgram;

import java.util.ArrayList;

public class AddCharcUsingArrayList {

	public static void addCharMethod(String[] charArray) {
		ArrayList<String> arrayList = new ArrayList<String>();
		try {
			int totalNumberOfChar = charArray.length;
			for (int i = 0; i < totalNumberOfChar; i++) {
				arrayList.add(charArray[i]);
			}

			int totalSizeOfAddedChar = arrayList.size();
			String str = "";
			for (int j = 0; j < totalSizeOfAddedChar; j++) {
				if (j != totalSizeOfAddedChar - 1) {
					System.out.print(arrayList.get(j) + "+" + str);
				} else {
					System.out.print(arrayList.get(j));
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		String[] str = { "a", "f", "e", "r", "a" };
		addCharMethod(str);
	}
	/*
	 * OutPut: a+f+e+r+a
	 */

}
