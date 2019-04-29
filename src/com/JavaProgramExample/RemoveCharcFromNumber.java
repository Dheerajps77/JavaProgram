package com.JavaProgramExample;

public class RemoveCharcFromNumber {
	
	
	public static void main(String[] args) {
		
		String str="786sa90as";
		CheckCharInNumbers(str);
	}
	
	public static void CheckCharInNumbers(String str)
	{
		System.out.println("The actual value of string with number is "+ str);
		StringBuffer sb=new StringBuffer(str);
		
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)<48 || sb.charAt(i)>57)
			{
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println("Actual number after removed number from string is :"+sb.toString());
	}
	
}
