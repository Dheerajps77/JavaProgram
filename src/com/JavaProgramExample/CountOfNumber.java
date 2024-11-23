package com.JavaProgramExample;

public class CountOfNumber {

	
	public static void main(String[] args) {
		
		int n=14324;
		int rem;
		int rev=0;
		int temp=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10 +rem;
			n=n/10;
			temp++;
		}
		
		System.out.println("Reverse Number : "+rev);
		System.out.println("Total digit present in number are : "+temp);
	}
	
	/***
	   OutPut Below : 
	    
	    Reverse Number : 42341
		Total digit present in number are : 5

	 */
}
