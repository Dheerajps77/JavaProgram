package com.JavaProgramExample;

public class NumberOfWordsInStrings {

	public static void numberOfWords(String str) {
		try {
			String str1 = "";
			int tmp = 1, word = 0;
			int totalCount = str.length() - 1;

			for (int i = 0; i < totalCount; i++)

				if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
					tmp++;
				}
			System.out.print("number of words found : " + tmp);
		}

		catch (Exception e) {
			throw e;
		}
	}

	public static void replaceParticularWordInString(String str) {
		String str1 = "";
		try {
			str1 = str.replace("noob", "Pro");
			System.out.println(str1);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void replaceParticularWordInStringWithoutReplaceFunctions(String str, String from, String to) {
		String str1 = "";
		int i = 0;
		try {
			String[] arr = str.split(from);
			StringBuilder output = new StringBuilder();
			for (; i < arr.length - 1; i++)
				output.append(arr[i]).append(to);
			output.append(arr[i]);
			if (str.substring(str.lastIndexOf(" ")).equalsIgnoreCase(" " + from))
				output.append(to);
			System.out.println(output.toString());
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		String str = "I am noob in PUBG and noob cant play PUBG";
		 numberOfWords(str);
		// replaceParticularWordInString(str);
		//replaceParticularWordInStringWithoutReplaceFunctions(str, "PUBG", "Pro");
	}
}
