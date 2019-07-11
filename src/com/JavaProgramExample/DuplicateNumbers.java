package com.JavaProgramExample;

public class DuplicateNumbers {
	
	public static void main(String[] args) {
		
		CheckDuplicateString();
	}

	public static void CheckDuplicateNumber()
	{
		try
		{
			int g[]={4,4,5,7,8,7,54,3,2,3,3,5,6,6};						
			int c=0;
			int temp=0;
			for(int i=0;i<g.length;i++)
			{
				for(int j=i+1;j<g.length;j++)
				{
					if((g[i]==g[j]) && ((i!=j)))
					{
						temp++;
						System.out.println(g[j]);
					}
					
				}				
			}
			System.out.println("Number of duplicated value is : "+temp);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void CheckDuplicateString()
	{
		try {
			
			String[] strings= {"Hello", "Hi", "Bye", "Hello"};
			
			for(int i=0;i<strings.length;i++)
			{
				for(int j=i+1;i<strings.length;j++)
				{
					if(strings[i].equals(strings[j]))
					{
						System.out.println(strings[i]);
					}
				}
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
