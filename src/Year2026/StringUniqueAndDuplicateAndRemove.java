package Year2026;

import java.util.ArrayList;
import java.util.HashMap;

public class StringUniqueAndDuplicateAndRemove {

	public static void findUniques() {
		try {

			String values = "Hi hi there . I am here to make friend . Will you be my friend ?"
					+ "I will be very nice to you .";
			char[] charArr = values.toLowerCase().toCharArray();

			StringBuilder builder = new StringBuilder();

			for (int h = 0; h < charArr.length; h++) {
				if ((charArr[h] >= 'A' && charArr[h] <= 'Z') || (charArr[h] >= 'a' && charArr[h] <= 'z')
						|| charArr[h] == ' ') {
					builder.append(charArr[h]);
				}
			}

			String newFreshString = builder.toString();
			String[] strArr = newFreshString.split(" ");
			//System.out.println(builder);
			for (int i = 0; i < strArr.length; i++) {
				int count = 0;
				for (int j = 0; j < strArr.length; j++) {
					if (strArr[i].equals(strArr[j])) {
						count++;
					}
				}
				if (count == 1) {
					System.out.print(strArr[i] + " "); //there am here make my very nice 
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void findUniquesInStringArray()
	{
		try {
			
			String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape", "zinc"};
			
			for(int i=0;i<arr.length;i++)
			{
				int count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[i].equals(arr[j]))
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.print(arr[i] + " "); //orange grape zinc 
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
	}

	
	public static void findDups()
	{
		try {
			
			String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape", "zinc", "zinc"};
			
			for(int i=0;i<arr.length;i++)
			{
				boolean flag=false;
				for(int k=0;k<i;k++)
				{
					if(arr[i].equals(arr[k]))
					{
						flag=true;
						break;
					}
				}
				
				if(flag) continue;
				
				int count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j].equals(arr[i]))
					{
						count++;
					}
				}
				if(count>1)
				{
					System.out.print(arr[i]+ " "); //apple banana zinc 
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void removeDups()
	{
		String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape", "zinc", "zinc"};
		HashMap<String, Boolean> maps=new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		try {
			
			for(String arr1: arr)
			{
				if(maps.get(arr1)==null)
				{
					maps.put(arr1, true);
					list.add(arr1);
				}				
			}
			
		for(int j=0;j<list.size();j++)
		{
			System.out.print(list.get(j)+ " "); // apple banana orange grape zinc 
		}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	
	public static void main(String[] args) {
		findDups();
	}

}
