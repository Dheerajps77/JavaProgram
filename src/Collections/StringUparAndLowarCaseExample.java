package Collections;

public class StringUparAndLowarCaseExample {
	
	
	public static void anagram()
	{
		String str1="dheeraj";
		String str2="jareehd";
		String str3="";
		try {
			
			char[] c1=str1.toCharArray();
			char[] c2=str2.toCharArray();
			
			if(c1.length==c2.length)
			{
				for(int i=str1.length()-1;i>=0;i--)
				{
					char c=str1.charAt(i);
					str3=str3+c;					
				}
				
				if(str3.equals(str2))
				{
					System.out.println(str1 + " and " +str2+ " is anagram");
				}
				else
				{
					System.out.println(str1 + " and " +str2+ " is not anagram");
				}
			}			
			else
			{
				System.out.println("Length dont match of both the string. Hence cannot make anagram");
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void functionToMakeLowerToUparAndUparToLower()
	{
		String str1="DHeeRAj";
		try {
			System.out.println(str1);
			for(int i=0;i<str1.length();i++)
			{
				if(Character.isUpperCase(str1.charAt(i)))
				{					      
					System.out.print(Character.toLowerCase(str1.charAt(i)));					     
				}
				else if(Character.isLowerCase(str1.charAt(i)))
				{
					System.out.print(Character.toUpperCase(str1.charAt(i)));
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
		/***
		 * OutPut:
		 *  DHeeRAj
			dhEEraJ
		 */
	}
	
	public static void main(String[] args) {		
		anagram();
				
	}
}
