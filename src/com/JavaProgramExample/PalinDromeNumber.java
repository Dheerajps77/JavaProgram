package com.JavaProgramExample;

public class PalinDromeNumber {
	
public static void main(String[] args) {
		
		int number=141;
		CheckPalinDromeNumber(number);
	}

	public static void CheckPalinDromeNumber(int n)
	{
		try
		{
			int temp=0,reminder;
			int p=n;
			
			while(n>0)
			{
			reminder=n%10;
			n=n/10;
			temp=temp*10+reminder;
			}
			System.out.println("Reverse number is : "+temp);
			
			if(p==temp)
			{
				System.out.println("This is palindrome number : "+temp);
			}
			else				
			{
				System.out.println("This is not palindrome number : "+temp);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
