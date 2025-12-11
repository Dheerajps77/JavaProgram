package Jan2025;

public class MergeStringsAlternately {
	
	
	public static void main(String[] args) {
		mergeAlternatelyStringsWhenLengthIsNotEqual();
	}
	
	public static void mergeAlternatelyStringsWhenLengthIsNotEqual()
	{
		try {
			String word1 = "abc";
	        String word2 = "pqr123";

	        StringBuilder builder = new StringBuilder();
	        int maxLength = Math.max(word1.length(), word2.length());

	        // Loop through both strings up to the maximum length
	        for (int i = 0; i < maxLength; i++) {
	            if (i < word1.length()) {
	                builder.append(word1.charAt(i));
	            }
	            if (i < word2.length()) {
	                builder.append(word2.charAt(i));
	            }
	        }

	        System.out.println(builder.toString()); // Output: apbqcr123

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
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
