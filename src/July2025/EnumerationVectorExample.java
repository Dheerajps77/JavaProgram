package July2025;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationVectorExample {

	public static void enumeratorList() {
		Vector<String> names = new Vector<>();
		names.add("John");
		names.add("Doe");
		names.add("Smith");

		Enumeration<String> enumeration = names.elements();

		System.out.println("Iterating Vector using Enumeration:");
		while (enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			System.out.println(name);
		}
	}

	public static void enumeratorHashtable() {
		Hashtable<String, String> capitals = new Hashtable<>();
		capitals.put("India", "New Delhi");
		capitals.put("USA", "Washington");
		capitals.put("UK", "London");

		Enumeration<String> keys = capitals.keys();

		System.out.println("Iterating Hashtable using Enumeration:");
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = capitals.get(key);
			System.out.println(key + " -> " + value);
		}
	}

	public static void main(String[] args) {
		enumeratorList();
		enumeratorHashtable();
	}
}
