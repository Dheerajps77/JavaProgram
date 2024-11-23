package com.JavaProgramExample;

public class ReplaceInString {

	public static void charReplaceInString() {
		StringBuilder sb = new StringBuilder();
		try {

			String str = "Hello guysell";
			char[] c = str.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if (c[i] == 'l') {
					sb.append('g');
				} else {
					sb.append(c[i]);
				}
			}
			System.out.println(sb.toString());

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void wordReplaceInString() {
	    StringBuilder sb = new StringBuilder();
	    try {
	        String str = "Hello guys Hello world Hello";
	        String wordToReplace = "Hello";
	        String replacementWord = "Hi";

	        String[] words = str.split(" "); // Split string by spaces

	        // Iterate over each word
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].equals(wordToReplace)) {
	                sb.append(replacementWord);
	            } else {
	                sb.append(words[i]);
	            }
	            // Append a space if it's not the last word
	            if (i < words.length - 1) {
	                sb.append(" ");
	            }
	        }

	        System.out.println(sb.toString());

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	public static void wordReplaceInStringWithoutInBuiltFunctions() {
	    try {
	        String str = "Hello guys Hello world Hello";
	        String wordToReplace = "Hello";
	        String replacementWord = "Hi";
	        String result = "";

	        String[] words = str.split(" "); // Split the string by spaces

	        // Iterate over each word
	        for (int i = 0; i < words.length; i++) {
	            // Replace the target word
	            if (words[i].equals(wordToReplace)) {
	                result = result + replacementWord;
	            } else {
	            	result = result + words[i];
	            }
	            // Add space after every word except the last one
	            if (i < words.length - 1) {
	                result += " ";
	            }
	        }

	        System.out.println(result);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void charReplaceInStringWithoutInBuiltFunctions() {
	    try {
	    	String str = "Hello guysell";
	        char charToReplace = 'l';
	        char replacementchar = 'g';
	        char []replacementWord = str.toCharArray();
	        String result = "";

	        // Iterate over each word
	        for (int i = 0; i < replacementWord.length; i++) {
	            // Replace the target word
	            if (replacementWord[i] == charToReplace) {
	                result = result + replacementchar;
	            } else {
	            	result = result + replacementWord[i];
	            }
	            // Add space after every word except the last one
	            if (i < replacementWord.length - 1) {
	                result += "";
	            }
	        }

	        System.out.println(result);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void replaceCharAfterRemovingUnWantedChar()
	{
		try {
			
			String str = "Hello guysell9384gg29834ggg *(*(*&*&*&gg";			
			char [] charArray=str.toCharArray();
			int temp=0;
			System.out.println(charArray.length);
			for(int i=0;i<charArray.length;i++)
			{
				if((charArray[i]>='a' && charArray[i]<='z')
						||(charArray[i]>='A' && charArray[i]<='Z'))
				{
					charArray[temp++]=charArray[i];
				}
			}
			
			for(int j=0;j<temp;j++)
			{
				System.out.print(charArray[j]);
			}
			
			 System.out.println("\nFiltered length: " + temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		replaceCharAfterRemovingUnWantedChar();

	}

}
