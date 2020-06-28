package SomeMoreJavaProgram;

import java.util.Random;

public class RandomNumber {
	
	
	static Random random;
	public static void RandomNumberMethod()
	{
		try {
			random=new Random();
			
			int randomNumber =random.nextInt();
			System.out.println(randomNumber);
			
			if(randomNumber <0)
			{
				System.out.println("Number is negative");
			}
			else
			{
				System.out.println("Number is positive");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void RandomNumberMethod1()
	{
		int min=500;
		int max=10000000;
		random=new Random();
		try {						
			for(int i=0;i<10;i++)
			{
				//int number=(int)(Math.random()*(max-min+1)+min);
				int number=(int)(Math.random()*(max+min));
				System.out.println(number);
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void RandomString(int n1)
	{
		String string="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder sb=new StringBuilder();
		try {
			for(int i=0;i<n1;i++)
			{
				int n=(int)(string.length() * Math.random());
				sb.append(string.charAt(n));
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void printOddReverseString()
	{
		String str="Dheeraj Pratap Singh";
		String revString="";
		try {
						
			for(int i=str.length()-1;i>=0;i--)
			{
				if(i%2==0)
				{
				revString=revString+str.charAt(i);
				}
			}
			System.out.println(revString);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void calculateThePowerOfNumber()
	{
		int powerOfNumber=4;
		int number=3;
		int temp=1;
		for(int i=1;i<=powerOfNumber;i++)
		{
			temp=number*temp;
		}
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		//RandomString(20);
		//printOddReverseString();
		calculateThePowerOfNumber();
	}

}
