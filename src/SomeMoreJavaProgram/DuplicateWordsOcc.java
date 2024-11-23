package SomeMoreJavaProgram;

import java.util.HashSet;

public class DuplicateWordsOcc {
	int i, j, k;

	public static char firstRepeating(char str[]) {
		
		char c1 = 0;
		try {			
			HashSet<Character> h=new HashSet<>();
			for(int i=0;i<str.length-1;i++)
			{
				c1=str[i];
				
				if(h.contains(c1))
				{
					return c1;
				}
				else
				{
					h.add(c1);
				}
			}
		} catch (Exception e) {
			
		}
		return c1;
	}
	
	public static void printRepeatedChar()
	{
		try {
			String s1 = "Dheeraj Pratap Singh";
			char[]c1=s1.toCharArray();
			int i, j;
			int count = 0;		
			for (i = 0; i < s1.length(); i++) {
				for (j = i + 1; j < s1.length(); j++) {
					if (c1[i] == c1[j] && (i!=j)) {
						System.out.print(c1[j]);
						count++;
						break;
					}
				}
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String args[]) {
		DuplicateWordsOcc ob1 = new DuplicateWordsOcc();	
		String str="Dheeraj PrataP Singh";
		char[] c=str.toCharArray();
		char g=firstRepeating(c);
		System.out.print("Repeated char : "+g);
		
		
	}

}
