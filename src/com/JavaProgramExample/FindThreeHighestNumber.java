package com.JavaProgramExample;

public class FindThreeHighestNumber {
	
	
	public static void main(String[] args) {
		
		int[] arrayOfNu= {34,22,1,45,666,4,3,12,678,333,555};		
		int totalCount=arrayOfNu.length;
		int temp=0;
		for(int i=0;i<totalCount;i++)
		{
			for(int j=i+1;j<totalCount;j++)
			{
				if(arrayOfNu[j]<arrayOfNu[i])
				{				
					temp=arrayOfNu[j];
					arrayOfNu[j]=arrayOfNu[i];
					arrayOfNu[i]=temp;
				}
			}
			System.out.println(arrayOfNu[i]);						
		}
		System.out.println("Highest three numbers are : " + arrayOfNu[totalCount-1] + " " + arrayOfNu[totalCount-2] + " " + arrayOfNu[totalCount-3]);
		System.out.println("Lowest three numbers are : "+ arrayOfNu[0] + " " + arrayOfNu[1] + " " + arrayOfNu[2]);
	}
	
/***
* Below are the OutPut : 
1
3
4
12
22
34
45
333
555
666
678
Highest three numbers are : 678 666 555
Lowest three numbers are : 1 3 4
*/

}
