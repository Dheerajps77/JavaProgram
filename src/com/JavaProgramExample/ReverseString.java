package com.JavaProgramExample;

public class ReverseString {
	
	public static void main(String[] args) {
		
		int number=9876543;
		CheckReverseNumber(number);
	}

	public static void CheckReverseNumber(int n)
	{
		try
		{
			int temp=0,reminder;
			
			while(n>0)
			{
			reminder=n%10;
			n=n/10;
			temp=temp*10+reminder;
			}
			System.out.println(temp);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
