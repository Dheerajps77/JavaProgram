package com.JavaProgramExample;

public class IfStringIsNumberOrString {
	
	public static void main(String[] args) {

		String string = "slkfk";
		String number = "33245";

		boolean bool = isNumeric(string);

		if (bool) {
			System.out.println("String is string");
		} else {
			System.out.println("String is number");
		}

	}
	
	public static boolean isNumeric(String str) {
		
		char c[]=str.toCharArray();
		int totalLength=c.length;
		boolean flag=false;
		for(int i=0;i<totalLength;i++)
		{			
			if(Character.isAlphabetic(c[i]))
			{
				flag=true;
			}			
		}
		
		return flag;
	}


}
