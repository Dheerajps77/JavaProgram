package com.JavaProgramExample;

public class FirstDuplicateNumber {
	
	public static void main(String[] args) {
	
		CheckFirstDuplicateNumber();
	}
	
	public static void CheckFirstDuplicateNumber()
	{
		try
		{
			int g[]={4,4,5,7,8,7,54,3,2,3,3,5,6}, temp=0;
			int counOfNumber=g.length;			
			for(int i=0;i<counOfNumber-1;i++)
			{
				for(int j=i+1;j<counOfNumber;j++)
				{					
					if(g[i]==g[j] &&(i!=j))
					{
						System.out.println("First Duplicate number is : "+ g[i]);
						temp=temp+1;
						break;
					}
				}
				
				if(temp>0)
				{
					break;
				}			
			}			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
