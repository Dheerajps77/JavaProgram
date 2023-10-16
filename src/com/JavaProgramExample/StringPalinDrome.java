package com.JavaProgramExample;

public class StringPalinDrome {

	
	public static void main(String[] args) {
		
		CheckIfStringPalinDrome();
	}
	
	public static void CheckIfStringPalinDrome()
	{
		try
		{
			String ab="tatat";
			String temp=ab;
			String g="";
			int totalLength=ab.length();
			char ac=0;
			
			for(int i=totalLength-1;i>=0;i--)
			{
				g=g+ab.charAt(i);											
			}
			System.out.print("Reverse of string value is " + g);
			System.out.println();
			if(g.equalsIgnoreCase(temp))
			{
				System.out.println("String " + ab + " is palindrome");
			}
			else
			{
				System.out.println("String " + ab + " is  not palindrome");
			}

		}
		catch (Exception e) {
				e.printStackTrace();
		}
	}
}
