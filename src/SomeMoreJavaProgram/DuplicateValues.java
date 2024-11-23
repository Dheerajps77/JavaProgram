package SomeMoreJavaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValues {
	public static void findCountOfDuplicateNumber(int[] n) {
		try {
			Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			for (int i = 0; i < n.length; i++) {

				if (hashMap.get(n[i]) != null) {
					hashMap.put(n[i], hashMap.get(n[i]) + 1);
				} else {
					hashMap.put(n[i], 1);
				}
			}

			Set<Entry<Integer, Integer>> values = hashMap.entrySet();

			Iterator<Entry<Integer, Integer>> iteratValue = values.iterator();

			while (iteratValue.hasNext()) {
				Entry<Integer, Integer> entery = iteratValue.next();

				Integer key = entery.getKey();
				Integer value = entery.getValue();
				System.out.println(key + " : repeated count is : " + value);

			}
		} catch (Exception e) {
			throw e;
		}
		
		/***
		 * OutPut Below :
		 * 1 : repeated count is : 2
		   2 : repeated count is : 1
		   3 : repeated count is : 3
		   5 : repeated count is : 2
		   7 : repeated count is : 1
		 */
	}
	
	public static void duplicateValueCountForString(String[] s)
	{
		try {
			
			Map<String, Integer> map=new HashMap<String, Integer>();
			
			for(int i=0;i<s.length;i++)
			{
				if(map.get(s[i])!=null)
				{
					map.put(s[i], map.get(s[i])+1);
				}
				else
				{
					map.put(s[i], 1);
				}
			}
			
			
			Set<Entry<String, Integer>>setValue=map.entrySet();
			Iterator<Entry<String, Integer>>iterate=setValue.iterator();
			while(iterate.hasNext())
			{
				Entry<String, Integer> setValueOfIterator=iterate.next();
				System.out.println(setValueOfIterator.getKey() + " : repeated count is : " +setValueOfIterator.getValue());
			}
			
		} catch (Exception e) {
			throw e;
		}
		
		/***
		 * OutPut Below :
		 * Lost : repeated count is : 1
		   Hi : repeated count is : 1
		   No : repeated count is : 2
		   Hello : repeated count is : 2
		   Bye : repeated count is : 1
		 */
	}

	public static void main(String[] args) {
		int[] n = { 3, 5, 3, 7, 2, 3, 5, 1 , 1};
		String[] str={"Hello", "Hi", "No", "Hello", "Bye", "No", "Lost"};
		findCountOfDuplicateNumber(n);
		//duplicateValueCountForString(str);

	}
}
