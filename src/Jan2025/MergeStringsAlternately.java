package Jan2025;

public class MergeStringsAlternately {
	
	
	public static void main(String[] args) {
		mergeAlternatelyStrings();
	}

	public static void mergeAlternatelyStrings()
	{
		try {
			
			String word1="abc";
			String word2="pqr";
			
			char[] word1CharArray=word1.toCharArray();
			char[] word2CharArray=word2.toCharArray();
			int lengthOfTwoCharArray=word1CharArray.length + word2CharArray.length;
			char[] mergeCharArray=new char[lengthOfTwoCharArray];
			int temp=0;
			StringBuilder builder =new StringBuilder();
			for(int i=0;i<word2CharArray.length;i++)
			{
				mergeCharArray[temp++] = word1CharArray[i];
				mergeCharArray[temp++] = word2CharArray[i];
				//builder.append(word1CharArray[i]).append(word2CharArray[i]);
			}
			
			String str=new String(mergeCharArray);
			//System.out.println(builder.toString()); //apbqcr
			System.out.println(str); //apbqcr
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
