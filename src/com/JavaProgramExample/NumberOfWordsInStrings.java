package com.JavaProgramExample;

public class NumberOfWordsInStrings {

	public static void numberOfWords(String str) {
		try {			
			int tmp = 1;
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
	
	public static void numberOfWordsInStatement(String str) {
		try {
			int n=str.length();
			System.out.println(n);
		}

		catch (Exception e) {
			throw e;
		}
	}
	
	public static void numberOfWordInStatement(String str) {
		try {
					String[]st=str.split(" ");
					int temp=0;
					for(int i=0;i<st.length;i++)
					{
						++temp;
					}
					System.out.println(temp);
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
	
	
	
	public static void replaceWordsInString()
	{
		try {
			
			String originalWord="This is car and i want this car";			
			char[]c=originalWord.toCharArray();
			String[] stringValue;
			String updatedStringValue="";
			
			for(int i=0;i<originalWord.length();i++)
			{
				stringValue=originalWord.split(" ");
				if(stringValue[i].contains("car"))
				{
					stringValue[i]="bus";					
				}
				updatedStringValue=updatedStringValue+stringValue[i];
			}
			System.out.println(updatedStringValue);
			
		} catch (Exception e) {
			throw e;
		}
	}

	public static void replaceParticularWordInStringWithoutReplaceFunctions(String str, String from, String to) {		
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
	
	// THis is best possible solution for word replace in Strings
	public static void replaceParticularWordInStringWithoutReplaceFunctions1(String str, String from, String to) {		
		int i = 0;
		try {
			String[] arr = str.split(from);
			StringBuilder output = new StringBuilder();
			for (; i < arr.length - 1; i++)
				output.append(arr[i]).append(to);
			output.append(arr[i]);			
				output.append(to);
			System.out.println(output.toString());
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		String str = "I am noob in PUBG and noob cant play PUBG PUBG";
		//numberOfWords(str);
		numberOfWordInStatement(str);
		// replaceParticularWordInString(str);
		//replaceParticularWordInStringWithoutReplaceFunctions1(str, "PUBG", "Pro");
		//replaceWordsInString();
	}
}
