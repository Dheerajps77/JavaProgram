package Sept;

import java.util.ArrayList;
import java.util.Iterator;

public class charCount {
	
	public static void getDuplicateCountOfCharUserSpecific()
	{
		String name="Dheeraj Pratap Singh wedding with Neha Singh";
		int temp=0;
		try {
			
		char[] duChar=name.toCharArray();
		
		for(int i=0;i<duChar.length;i++)
		{
			if(duChar[i]=='h')
			{
				System.out.println(duChar[i] + " repeated ");
				
				temp++;
			}
		}
		System.out.println(temp);
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void getDuplicateCountOfChar() {
		ArrayList<Character> arrayList=new ArrayList<Character>();
		String name = "Dheeraj Pratap Singh wedding with Neha Singh";
		int temp = 0;
		try {

			char[] duChar = name.toCharArray();

			for (int i = 0; i < duChar.length; i++) {
				for (int j = i + 1; j < duChar.length; j++) {
					if ((duChar[i] == duChar[j]) && (i!=j)) {
						arrayList.add(duChar[i]);
						temp++;
					}
				}				
			}
			System.out.println("Number of duplicate values are : "+ temp);
			
			Iterator<Character> iterator=arrayList.iterator();
			while(iterator.hasNext())
			{
				char c= iterator.next();
				System.out.print(c + " ");
			}
			
			//System.out.println(temp);

		} catch (Exception e) {
			throw e;
		}

	}
	
	
	public static void main(String[] args) {
		
		getDuplicateCountOfChar();
	}

}
