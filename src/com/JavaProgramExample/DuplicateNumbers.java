package com.JavaProgramExample;

public class DuplicateNumbers {
	
	public static void main(String[] args) {
		
		CheckDuplicateNumber();
	}

	public static void CheckDuplicateNumber()
	{
		try
		{
			int g[]={4,4,5,7,8,7,54,3,2,3,3,5,6}, temp=0;						
			int c=0;
			for(int i=0;i<g.length-1;i++)
			{
				for(int j=i+1;j<g.length;j++)
				{
					if((g[i]==g[j]) && ((i!=j)))
					{
						System.out.println(g[j]);
					}
					
				}				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
