package Program30June;

import java.util.HashMap;

public class CalculateTotalNumberOfVowelPresent {
	
	public static void totalNumberOfVowel(String wordsToBeCheckAsVowel, String str)
	{				
		try {
			char[]c=str.toCharArray();
			char[]c1=wordsToBeCheckAsVowel.toCharArray();
			
			HashMap<Character, Integer> hashMap=new HashMap<Character, Integer>();
			for(int i=0;i<c1.length;i++)
			{
				hashMap.put(c1[i], 1);
			}
			int temp=0;
			for(int j=0;j<c.length;j++)
			{
				if(hashMap.containsKey(c[j]))
				{
					System.out.println(c[j] +" are vowel words");
					temp++;
				}
			}
			System.out.println();
			System.out.println("Total vowel words are : " +temp);
		} catch (Exception e) {
			throw e;
		}
/***
 OutPut : 
a are vowel words
e are vowel words
i are vowel words
u are vowel words

Total vowel words are : 4
*/
	}
	
	public static void Method2ToCalculateTotalVowelWords(String wordsToBeCheckAsVowel)
	{	
		try {
			char[]c=wordsToBeCheckAsVowel.toCharArray();			
			int temp=0;
			for(int i=0;i<c.length;i++)
			{
				if((c[i]=='a') || (c[i]=='e') || (c[i]=='i') || (c[i]=='o') || (c[i]=='u'))
				{
					temp++;
				}
			}
			System.out.println("Number of vowels in words are : ");
			System.out.println(temp++);
		} catch (Exception e) {
			throw e;
		}
		/***
		 * OutPut:
		 * Number of vowels in words are : 
		 * 7
		 */
	}
	public static void main(String[] args) {
		String name="Dheerauj Pratap Singh";
		String str="aeiou";
		totalNumberOfVowel(name, str);
		Method2ToCalculateTotalVowelWords(name);
	}

}
