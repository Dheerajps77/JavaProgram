package SomeMoreJavaProgram;

public class CountOfCharInString {
	
	public static void printNumberOfCharInString()
	{
		try {
			String str="This is Show";
			int totalCountOfChar=0;
			char[]c=str.toLowerCase().toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]!=' ')
				{
					totalCountOfChar++;
				}
			}
			System.out.println("Total number of char are : "+totalCountOfChar);
		} catch (Exception e) {
			throw e;
		}
		/*
		 * OutPut :
		 * Total number of char are : 10
		 */
	}
	public static void printDuplicateChar()
	{
		try {
			String str="Hello guys. Myself is Dheeraj";
			int repeatedCharCount=0;
			int temp=1;
			char[]c=str.toLowerCase().toCharArray();			
			for(int i=0;i<c.length;i++)
			{
				for(int j=i+1;j<c.length;j++)
				{
					if((c[i]==c[j])&&(c[i]!=' ')&&(c[j]!=' '))
					{
						System.out.print(c[j]);
					}
				}			
			}
			//System.out.println("Number of Repeated char are : " + repeatedCharCount);
			
		} catch (Exception e) {
			throw e;
		}
	}
	public static void printSpecificCharInString(char enterChar)
	{
		try {
			
			String name="Dheeraj";
			//char v=name.charAt(4);
			
			char[] d=name.toCharArray();
			int totCount=d.length;
			for(int i=0;i<totCount;i++)
			{
				if(d[i]==enterChar)
				{
					System.out.println(d[i]);
					break;
				}
			}
			//System.out.println(v);
		} catch (Exception e) {
			throw e;
		}
	}
	public static void countRepeatedCharacters(char characterName, String name) {
		try {

			char[] d = name.toLowerCase().toCharArray();
			int totalCount = d.length;
			int temp=0;
			for (int i = 0; i < totalCount; i++) {
				
				if(d[i]==characterName)
				{
					temp++;					
				}
			}
			System.out.println("Number of " +characterName+ " character repeated " + temp);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		//printDuplicateChar();
		String str = "Dheeraj Pratap Singh";
		char c = 'e';
		char specificChar='r';
		//countRepeatedCharacters(c, str);
		printSpecificCharInString(specificChar);
		//System.out.println(search + " occur " + count + "Times.");
	}

}
