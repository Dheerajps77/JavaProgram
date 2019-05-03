package com.JavaProgramExample;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		CheckReverseNumber();
		
	}
	
	public static void CheckReverseNumber()
	{
		try
		{
			int num=12345654;
			int revNum=0;
			
			System.out.println("Before reversing number values : ");
			System.out.println(num);
			
			while(num!=0)
			{
				int rem=num%10;
				num=num/10;
				revNum=revNum*10+rem;
			}
			System.out.println("After reversing number values : ");
			System.out.println(revNum);					
		}
		catch (Exception e) {

			e.printStackTrace();
		}
	}

}
