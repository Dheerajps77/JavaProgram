package March2025;

public class RemoveSpecificValues {

	public static void main(String[] args) {
		removeDuplicatesAndSort();
	}
	
	public static void removeSpecificWordInStringArray()
	{
		try {
			
			String str="Hi Everyone !!! I am new to this company and want to explore more. So please get time for me.";
			
			String[] strArr=str.split(" ");
			String wordToBeRemove="this";
			
			for(int i=0;i<strArr.length;i++)
			{
				if(!wordToBeRemove.equalsIgnoreCase(strArr[i]))
				{
					System.out.print(strArr[i] + " ");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeSpecificValueInString() {
		try {
			String str = "Dheeraj Pratap Singh";
			char charToBeRemove = 'p';
			char[] charArr = str.toLowerCase().toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				if (charToBeRemove != charArr[i]) {
					System.out.print(charArr[i]); // dheeraj rata singh			
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeSpecificValueInNumberArray() {
		try {

			int n[] = { 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66 };
			int numToBeRemove = 66;
			for (int i = 0; i < n.length; i++) {
				if (numToBeRemove != n[i]) {
					System.out.print(n[i] + " "); // 5 6 7 8 9 11 22 33 44 55 
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void removeUnwantedCharExceptAlphaBets()
	{
		try {
			String str="Hi Everyone !!! I am new to this company and want to explore more. So please get time for me.";
			char[] charArr=str.toCharArray();
			
			for(int i=0;i<charArr.length;i++)
			{
				if((charArr[i] >='A' && charArr[i] <='Z') || (charArr[i] >='a' && charArr[i]<='z') || (charArr[i] == ' '))
				{
					System.out.print(charArr[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void removeDuplicatesAndFindUniqueOnly()
	{
		try {
			
			int n[] = { 3, 5, 3, 4, 6, 7, 6, 4, 3, 45, 7, 8, 6, 4, 3, 4, 56, 7, 8, 6, 4, 3, 4, 6789 };
			int uniq[]=new int[n.length];
			int temp=0;
			for(int i=0;i<n.length;i++)
			{
				boolean flag=false;
				for(int j=0;j<n.length;j++)
				{
					if(i!=j &&n[i]==n[j]) // duplicate found
					{
						flag=true;
						break;
					}
				}
				
				if(!flag) //It Will add non-duplicates
				{
					uniq[temp++]=n[i];
				}
			}
			
			for(int k=0;k<temp;k++)
			{
				System.out.print(uniq[k] + " ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void removeDuplicatesAndSort()
	{
		try {
			
			int n[] = { 3, 5, 3, 4, 6, 7, 6, 4, 3, 45, 7, 8, 6, 4, 3, 4, 56, 7, 8, 6, 4, 3, 4, 6789 };
			int uniq[]=new int[n.length];
			int temp=0;
			for(int i=0;i<n.length;i++)
			{
				boolean flag=false;
				for(int j=0;j<temp;j++)
				{
					if(uniq[j]==n[i])
					{
						flag=true;
						break;
					}
				}
				
				if(!flag) //It Will add non-duplicates
				{
					uniq[temp++]=n[i];
				}
			}
			int temp1=0;
			for(int k=0;k<temp;k++)
			{
				for(int g=k+1;g<temp;g++)
				{
					if(uniq[k]>uniq[g]) {
						temp1=uniq[k];
						uniq[k]=uniq[g];
						uniq[g]=temp1;
					}
				}
			}
			
			for(int h=0;h<temp;h++)
			{
				System.out.print(uniq[h] + " "); // 3 4 5 6 7 8 45 56 6789 
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
 
