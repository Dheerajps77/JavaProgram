package com.JavaProgramExample;

import java.util.ArrayList;

public class RemoveCharcFromNumber {
	
	
	public static void main(String[] args) {
		
		String str="786sa90as";
		//CheckCharInNumbers(str);
		//printCharOnly();
		countWordsInString();
	}
	
	public static void countWordsInString()
	{
		String words="Hello I am new to Java";		
		int temp=1;
		for(int i=0;i<words.length()-1;i++)
		{
			String str=words.substring(i, i+1);
			if(words.charAt(i)== ' ' && words.charAt(i+1)!=' ')
			{
				temp++;
			}
		}
				System.out.println(temp);
	}
	
	public static void printOnlySepcificWordInString()
	{
		String words="Hello I am new to Java. Please teach me Java. So that i can master in Java";		
		String []newString;
				
		newString=words.split(" ");
		for(String str1 : newString)
		{
			System.out.println(str1);
		}
		
		/*int temp=0;
		for(int i=0;i<words.length();i++)
		{
			if(words.charAt(i)>31 && words.charAt(i)<33)
			{
				temp++;	
				str.add(i);
				System.out.println(words.toCharArray());
			}
		}
		System.out.println(temp);*/
	}
	public static void printCharOnly()
	{
		String str="helloguys345345wassup32434@!@#@";				
		
		int totalCOunt=str.length();
		for(int i=0;i<totalCOunt;i++)
		{
			if(str.charAt(i)>96 && str.charAt(i)<123)
			{
				System.out.print(str.charAt(i));
			}
		}
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
