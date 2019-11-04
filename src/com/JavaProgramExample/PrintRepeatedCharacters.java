package com.JavaProgramExample;

public class PrintRepeatedCharacters {
	
	public static void printrepeatedCharacters()
	{
		try {
			
			String str="Hello Huys Deww D";
			int temp=0;
			char[]c=str.toCharArray();
			int totalCount=c.length;
			System.out.print("Repeated char are :-->");
			for(int i=0;i<totalCount;i++)
			{
				for(int j=i+1;j<totalCount;j++)
				{
					if((c[i]==c[j]) && (i!=j) &&(c[i]!=' ') &&(c[j]!=' '))
					{
						temp++;
						System.out.print(c[j]);
						
					}
				}
				
			}
			System.out.println();
			System.out.println("Number of repeated characters are : "+temp);
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		printrepeatedCharacters();
		
	}
	
	/* OutPut are :-
	Repeated char are :-->HelDw
	Number of repeated characters are : 5 
	 */

}
