package SomeMoreJavaProgram;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveSpecificCharFromWords {
	
	
	public static void removeCharFromWordsWithoutInBuiltFunctions(String str, char whichCharNeedToRemove, char whichCharNeedToRemove1)
	{
		char cd=' ';
		try {
			char []c=str.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]==whichCharNeedToRemove || c[i]==whichCharNeedToRemove1)
				{
					c[i]=cd;
				}
				System.out.print(c[i]);
			}			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void removeCharFromWords(String str, String c)
	{
		try {
			
			String str1=str.replaceAll(c, "");
			System.out.println(str1);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void removeCharsFromString()
	{
		try {
			
			System.out.println("Enter the strings : ");
			Scanner sc=new Scanner(System.in);
			String enterString=sc.nextLine();
			
			System.out.println("Enter words to be removed : ");
			Scanner sc1=new Scanner(System.in);
			String enterCharToBeRemove=sc1.nextLine();
			
			
			StringBuilder sb=new StringBuilder(enterString);
			System.out.println(sb.toString());
			HashMap<Character, Integer> table=new HashMap<Character, Integer>();
			
			for(int i=0;i<enterCharToBeRemove.length();i++)
			{
				table.put(enterCharToBeRemove.charAt(i), 1);
			}
			int p=0;
			for(int j=0;j<enterString.length();j++)
			{
				if(table.containsKey(enterString.charAt(j)))
				{
					
					if(p==0)
					{
						sb.deleteCharAt(j);
					}
					else
					{
						sb.deleteCharAt(j-p);
					}
					p++;
				}
			}
			System.out.println(sb);
			
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
	
		String str="Hello guys !!! How are you ?? ";
		String str1="H";
		char c1= 'H';
		char c2= 'a';
		//removeCharFromWordsWithoutInBuiltFunctions(str, c1, c2);
		//removeCharFromWords(str,str1);
		removeCharsFromString();
	}

}
