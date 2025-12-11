package July2025;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorFunctions {

	
	public static void failFast()
	{
		List<String> list = new ArrayList<>();
		list.add("A"); list.add("B");

		for (String s : list) {
		    list.add("C");  // Causes ConcurrentModificationException
		}
	}
	
	public static void failSafe()
	{
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("A"); list.add("B");

		for (String s : list) {
		    list.add("C");  // No exception thrown
		}
	}
	public static void iteratorList() {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		Iterator<String> iterator = fruits.iterator();

		System.out.println("Iterating List using Iterator:");
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}
	}

	public static void iteratorMap() {
		HashMap<String, Integer> sutds = new HashMap<String, Integer>();
		sutds.put("Dheeraj Singh", 23324);
		sutds.put("Rahul Singh", 694);
		sutds.put("Rakul Preet", 94022);
		sutds.put("Pooja Singh", 210302);
		sutds.put("Neha Singh", 930243);
		sutds.put("Anant Singh", 2954);
		sutds.put("Kanchan Singh", 95483);
		
		
		Set<Entry<String, Integer>> setOfEntry=sutds.entrySet();
		Iterator<Entry<String, Integer>> iterator = setOfEntry.iterator();
		
		// or Iterator<Map.Entry<String, Integer>> iterator = sutds.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		iteratorMap();
	}
}
