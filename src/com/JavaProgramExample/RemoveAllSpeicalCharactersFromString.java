package com.JavaProgramExample;

public class RemoveAllSpeicalCharactersFromString {
	
	
	public static void removeSpecialCharacters(String string)
	{
		try {
			
			String str=string.replaceAll("[^a-zA-Z0-9+\\s]", "");
			System.out.println(str);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		String string="This is used to _*&^*^*^%^&%&%&$$^%%^^&**()remove )*(*)(the special characters &(&(*&*(&from String";
		removeSpecialCharacters(string);
	}
	
	
	/*
	 * Output: 
	 * This is used to remove the special characters from String
	 */


}
