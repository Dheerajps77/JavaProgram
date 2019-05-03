package com.JavaProgramExample;

public class ReverseString {
	
	public static void main(String[] args) {
		
		int number=9876543;
		//CheckReverseNumber(number);
		CheckReverseString();
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
	
	public static void CheckReverseString()
	{
		try
		{
			String str="The Avengers Endgame movie";
			char[] c=str.toCharArray();
			int countOfChar=c.length;
			String rev="";
			System.out.println("Before reversing string values : ");
			System.out.println(str);
			for(int i=countOfChar-1;i>0;i--)
			{
				rev=rev+c[i];
			}
			System.out.println("After reversing string values : ");
			System.out.println(rev);
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}
}
