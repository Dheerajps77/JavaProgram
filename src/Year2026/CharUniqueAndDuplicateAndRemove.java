package Year2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CharUniqueAndDuplicateAndRemove {
	
	public static void findUnique()
	{
		try {
			
			String str="dheeraj";
			char[] charr=str.toLowerCase().toCharArray();
			
			for(int i=0;i<charr.length;i++)
			{
				int count=0;
				for(int j=0;j<charr.length;j++)
				{
					if(charr[i]==charr[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.print(charr[i] + " "); //d h r a j 
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void findDups()
	{
		try {
			
			String str="dheeraj";
			char[] charr=str.toLowerCase().toCharArray();
			
			for(int i=0;i<charr.length;i++)
			{
				boolean flag=false;
				for(int k=0;k<i;k++)
				{
					if(charr[k]==charr[i])
					{
						flag=true;
						break;
					}
				}
				
				if(flag) continue;
				
				int count=0;
				for(int j=0;j<charr.length;j++)
				{
					if(charr[i]==charr[j])
					{
						count++;
					}
				}
				
				if(count>1)
				{
					System.out.print(charr[i] + " "); // e 
				}
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void removeDups()
	{
		try {
			
			String str="Dheerajj";
			char[] charArr=str.toLowerCase().toCharArray();
			HashMap<Character, Boolean> maps=new HashMap<Character, Boolean>();
			List<Character> lists=new ArrayList<Character>();
			for(char charAr : charArr)
			{
				if(maps.get(charAr)==null)
				{
					maps.put(charAr, true);
					lists.add(charAr);
				}
			}
			
			for(char c: lists)
			{
				System.out.print(c);
			}
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		removeDups();
	}

}
