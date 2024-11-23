package com.JavaProgramExample;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class JavaProgram {

	public static void main(String[] args) {
		PrintStart();
	}
	
	public static void PrintStart()
	{
		int n=8;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");				
			}
			System.out.println();
		}		
		
	}
	
	
	
	
	public static void func()
	{
		int[] g={23,56,4,32,12,78};
		
		int totalLength=g.length;
		int temp=0;
		
		for(int i=0;i<totalLength;i++)
		{
			for(int j=i+1;j<totalLength;j++)
			{
				if(g[i]>g[j])
				{
					temp=g[i];
					g[i]=g[j];
					g[j]=temp;					
					
				}				
			}
			System.out.println(g[i]);
		}
	}

	public static void SplitFucntion() {
		String line = "I am a java developer";
		String[] words = line.split(" ");
		String[] twoWords = line.split(" ", 2);
		System.out.println("String split with delimiter: " + Arrays.toString(words));
		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";
		String[] numbers = wordsWithNumbers.split("\\|");
		System.out.println("String split with special character: " + Arrays.toString(numbers));
	}

	public static void HashMapFunction() {

		String s = "Hi", s1 = "Guys";
		HashMap<Integer, String> d = new HashMap<Integer, String>();
		d.put(1, s);
		d.put(2, s1);
		System.out.println("\nHashMap object output :\n\n" + d);
	}
	
	public static void factorialNumber()
	{
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;			
		}
		System.out.println(fact);
	}
	public static void ReverseNumber()
	{
		int num=123456;
		
		int reverseNumber=0;
		
		while(num!=0)
		{
			int reminder=num%10;
			reverseNumber=reverseNumber*10+reminder;
			num=num/10;
		}
		
		System.out.println(reverseNumber);
	}
	
	public static void UserInputNumberReverse()
	{
		int num, reverseNumber=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number : ");
		num=sc.nextInt();		
		System.out.println("Number before reverse : "+num);
		
		while(num!=0)
		{
			int reminder=num%10;
			reverseNumber=reverseNumber*10+reminder;
			num=num/10;
		}
		System.out.println("Number after reverse : "+reverseNumber);
	}
	
	public static void ReverseString()
	{
		String str="My name is John";
		char[] c=str.toCharArray();
		String revString="";
		int length=c.length;
		
		for(int i=length-1;i>0;i--) {
			
			revString=revString+c[i];		
		}
		System.out.println(revString);
	}

	public static void FibonacciSeries()
	{
		int i=0;
		int j=1;
		
		
		for(int l=0;l<10;l++)
		{
			System.out.println(i);
			int k=i+j;
			i=j;
			j=k;
		}
	}
}
