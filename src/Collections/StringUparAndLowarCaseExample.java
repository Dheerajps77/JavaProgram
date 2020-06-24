package Collections;

public class StringUparAndLowarCaseExample {
	
	public static void main(String[] args) {
	
		String s1="DHeeRAj";
		char c;
		System.out.println(s1);
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isUpperCase(s1.charAt(i)))
			{				
			System.out.print(Character.toLowerCase(s1.charAt(i)));
				
			}
			else
			{				
				System.out.print(Character.toUpperCase(s1.charAt(i)));
			}
		}
				
	}
	
	/***
	 * OutPut:
	 *  DHeeRAj
		dhEEraJ
	 */

}
