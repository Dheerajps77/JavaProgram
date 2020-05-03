package SomeMoreJavaProgram;

import java.util.Scanner;

public class ToFndLeapYear {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your nnumber");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%400==0 || n%4==0)
		{
			System.out.println("number is leap year : " + n);
		}
		else
		{
			System.out.println("number is not leap year : " + n);
		}
	}

}
