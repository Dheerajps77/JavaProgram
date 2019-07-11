package com.JavaProgramExample;

public class PrintStar {
	
	
	public static void main(String[] args) {
		PrintLeftAngleTriangle();
	}

	public static void PrintLeftAngleTriangle()
	{
		
		
		/*
		 
		*
       **
      ***
     ****
    *****
   ******
  *******
 ********
*********
		
		*/
		try
		{
			int n=10;
			
			for(int i=1;i<n;i++)
			{
				for(int j=n-1;j>i;j--)
				{
					System.out.print(" ");
				}
				
				for(int k=1;k<i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void PrintRightFunnelStart()
	{
		/*
987654321
98765432
9876543
987654
98765
9876
987
98
9

		
*********
********
*******
******
*****
****
***
**
*
		*/
		
		
		
		int n=10;
		try
		{
			for(int i=1;i<n;i++)
			{
				for(int j=n-1;j>=i;j--)
				{
					System.out.print("*");
					//System.out.print(j);
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void PrintRightAngleTriangle()
	{
		/*

		Below method is used to print *
	*
	**
	***
	****
	*****
	******
	*******
	********
	*********

	1
	12
	123
	1234
	12345
	123456
	1234567
	12345678


	*/
		try
		{
			int n=10;
			for(int i=1;i<n;i++)
			{
				for(int j=1;j<i;j++)
				{
					//System.out.print("*");
					System.out.print(j);
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
