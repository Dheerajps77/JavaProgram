package InterviewQuestionAnswer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapsIntoList {
	
	
	/*
	 Insertion Order Means : the order in which you are adding elements to the data structure
	
	 Lists maintain insertion order: ArrayList, LinkedList, Vector, Stack
	 
	 Sets :
	 	Maintain insertion order: LinkedHashSet
	 	Do not maintain insertion order: HashSet, TreeSet
	 
	 Maps :
	 	Maintain insertion order: LinkedHashMap
	 	Do not maintain insertion order: HashMap, TreeMap
	 */
	
	
	public static void searchValueOnBasisOfKey()
	{
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {
			map.put(34, "QA");
			map.put(12, "Senior Consultant");
			map.put(42, "QA Manager");
			map.put(52, "QA Lead");
			map.put(77, "Junior QA");
			map.put(90, "Senior QA Automation");
			
			int key=102;
			boolean keyFound = false;  // To track if the key is found
			Set<Entry<Integer, String>> iterate=map.entrySet();
			
			for(Map.Entry<Integer, String> values : iterate)
			{
				if(key==values.getKey())
				{
					keyFound = true;  // Key is found
	                break;  // Exit loop once the key is found
				}
			}
			
			// If the key is not found, print this message
	        if (!keyFound) {
	            System.out.println("No value for key: " + key);
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void convertMapToListAndPerformIndexBaseOperation() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {

			map.put(34, "QA");
			map.put(12, "Senior Consultant");
			map.put(42, "QA Manager");
			map.put(52, "QA Lead");
			map.put(77, "Junior QA");
			map.put(90, "Senior QA Automation");

			  // Printing original map entries
            System.out.println("Original map entries:");
			Set<Entry<Integer, String>> setofEntry = map.entrySet();

			for (Map.Entry<Integer, String> values : setofEntry) {

				System.out.println(values.getKey() + " : " + values.getValue());
			}

			// Print sorted list entries
            System.out.println("Sorted list entries:");
			List<Map.Entry<Integer, String>> listOfMaps = new ArrayList<>(map.entrySet());

			listOfMaps.sort(Map.Entry.comparingByKey());

			/// List<E> newList=new ArrayList<E>();
			for (Map.Entry<Integer, String> listOfValue : listOfMaps) {
				System.out.println(listOfValue.getKey() + " : " + listOfValue.getValue());
			}
			
			System.out.println("===================================================");
			 // Index-based search operation
            int searchIndex = 1; // Example index to search
            
            if(searchIndex>0 && searchIndex<listOfMaps.size())
            {
            	Entry<Integer, String> entry= listOfMaps.get(1);
            	System.out.println("Index based of operation : "+entry.getKey() + "  : " + entry.getValue());
            	
            }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void convertMapToList() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		try {

			map.put(34, "QA");
			map.put(12, "Senior Consultant");
			map.put(42, "QA Manager");
			map.put(52, "QA Lead");
			map.put(77, "Junior QA");
			map.put(90, "Senior QA Automation");


			  // Printing original map entries
          System.out.println("Original map entries:");
			Set<Entry<Integer, String>> setofEntry = map.entrySet();

			for (Map.Entry<Integer, String> values : setofEntry) {

				System.out.println(values.getKey() + " : " + values.getValue());
			}

			// Print sorted list entries
            System.out.println("Sorted list entries:");
			List<Map.Entry<Integer, String>> listOfMaps = new ArrayList<>(map.entrySet());

			listOfMaps.sort(Map.Entry.comparingByValue());

			/// List<E> newList=new ArrayList<E>();
			for (Map.Entry<Integer, String> listOfValue : listOfMaps) {
				System.out.println(listOfValue.getKey() + " : " + listOfValue.getValue());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		convertMapToList();

	}
}
