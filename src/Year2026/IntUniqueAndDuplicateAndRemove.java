package Year2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntUniqueAndDuplicateAndRemove {

	public static void findUniqueInt() {
		int[] arr = { 101, 4, 65, 5, 13, 5, 7, 8, 8, 6, 4, 3, 3, 4, 6, 7, 8, 989, 9, 6, 4 };
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(arr[i]+ " "); //101 65 13 989 9 
			}
		}
	}
	
	public static void findDupsInt()
	{
		int[] arr = { 101, 989, 101, 4, 65, 5, 13, 5, 7, 8, 8, 6, 4, 3, 3, 4, 6, 7, 8, 989, 9, 6, 4 };
		try {
			
			for(int i=0;i<arr.length;i++)
			{
				boolean flag=false;
				for(int k =0;k<i;k++)
				{
					if(arr[i]==arr[k])
					{
						flag=true;
						break;
					}
				}
				
				if(flag)
				continue;
				
				int count=0;
				for(int j=0;j<arr.length;j++)
				{
					if(arr[j]==arr[i])
					{
						count++;
					}
				}
				if(count>1)
				{
					System.out.print(arr[i]+ " "); //101 989 4 5 7 8 6 3 
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void removeDupsInt() {
		int[] arr = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 6, 1, 7, 8, 9 };
		HashMap<Integer, Boolean> maps = new HashMap<Integer, Boolean>();
		List<Integer> lists = new ArrayList<Integer>();
		try {

			for (int num : arr) {
				if (maps.get(num) == null) {
					maps.put(num, true);
					lists.add(num);
				}
			}

			for (int num1 : lists) {
				System.out.print(num1 + " "); //2 3 4 6 1 7 8 9 
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		removeDupsInt();
	}

}
