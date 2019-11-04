package com.JavaProgramExample;

public class PrintSingleWord {
	
	public static void printSingleWordFromString()
	{
		try {
			
			String str="Dheeraj Pratap Singh";
			int temp=0;
			char c=str.charAt(11);
			//System.out.println(c); //OutPut : t
			
			char[]c1=str.toCharArray();
			int totalcount=c1.length;
			for(int i=0;i<totalcount;i++)
			{
				if(c1[i] =='e')
				{
					temp++;
				}
			}
			System.out.println("number of repeated char : "+ temp);
			
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		
		printSingleWordFromString();
	}
	
	/*
	 OutPut are :-
	 number of repeated char : 2
	 * 
	 */

}
