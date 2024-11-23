package com.JavaProgramExample;

public class DuplicateString {

	public static void main(String[] args) {
		
		CheckDuplicateString();
	}
	
	public static void CheckDuplicateString()
	{
		try
		{
			String str[]= {"Hello", "Hi", "Hello", "name", "Dheeraj", "name", "Dheeraj"};						
			int c=0;
			for(int i=0;i<str.length;i++)
			{
				for(int j=i+1;j<str.length;j++)
				{
					if((str[i]==str[j]) && ((i!=j)))
					{
						System.out.println(str[j]);
					}
					
				}				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
