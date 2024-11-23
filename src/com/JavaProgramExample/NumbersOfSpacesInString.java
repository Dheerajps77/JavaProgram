package com.JavaProgramExample;

public class NumbersOfSpacesInString {

	static void CalculateNumberOfSpacesInString(String string) {
		
		try {
						
			int temp=0;
			for(int i=0;i<string.length();i++)
			{
				String c1=string.substring(i, i+1);
				if(c1.equals(" "))
				{
					temp++;
				}
			}
			System.out.println("number of spaces are present in string are : " + temp);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	/*
	 * Output :
	 * number of spaces are present in string are : 6
	 */

	public static void main(String[] args) {

		String string = "Hello !!! I am Simple cute string.";
		CalculateNumberOfSpacesInString(string);

	}

}
