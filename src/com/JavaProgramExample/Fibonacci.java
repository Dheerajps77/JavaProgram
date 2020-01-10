package com.JavaProgramExample;

public class Fibonacci {
	
	public static void printFibonacci()
	{
		try {
			
			int a=0;
			int b=1;
			int c=0;
			for(int i=0;i<10;i++)
			{	
				c=a+b;
				a=b;
				b=c;
				
				System.out.println(c);
			}
			
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		printFibonacci();
	}

}
