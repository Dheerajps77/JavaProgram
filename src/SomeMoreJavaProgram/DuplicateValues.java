package com.spinny.qa.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValues {
	
	
	
	static int[] n = { 3, 5, 3, 7, 2, 3, 5, 1 };
	public static void main(String[] args) {

		

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
				System.out.println(key + " : " + value);

			}
			System.out.println("===========================================");
			
			for(int i=0;i<n.length;i++)
			{
				for(int j=i+1;j<n.length;j++)
				{
					if(n[i]==n[j])
					{
						System.out.println("Duplicate Value : "+n[j]);
					}
						
				}
			}
		}

}
