package InterviewQuestionAnswer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class ConvertListsIntoMaps {
	
	
	public static int getRandomNumber()
	{
		Random random=new Random();
		return random.nextInt(10000) + 1;
	}
	
	public static void listsToMapWithoutUniqueKeys()
	{
		try {
			
			Map<Integer, String> maps=new HashMap<Integer, String>();
			
			List<String> lists=new ArrayList<String>();
			Collections.addAll(lists, "Whether", "Books", "Environment", "Banks", "Trees");
			
			for(int i=0;i<lists.size();i++)
			{
				maps.put(i, lists.get(i));
			}
			
			Set<Entry<Integer, String>> entryofMaps=maps.entrySet();
			
			for(Map.Entry<Integer, String> values : entryofMaps)
			{
				System.out.println(values.getKey() + " = "  + values.getValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void listsToMapWithUniqueKeys()
	{
		try {
			
			Map<Integer, String> maps=new HashMap<Integer, String>();
			
			List<String> lists=new ArrayList<String>();
			Collections.addAll(lists, "Whether", "Books", "Environment", "Banks", "Trees");
			
			for(int i=0;i<lists.size();i++)
			{
				maps.put(getRandomNumber(), lists.get(i));
			}
			
			Set<Entry<Integer, String>> entryofMaps=maps.entrySet();
			
			for(Map.Entry<Integer, String> values : entryofMaps)
			{
				System.out.println(values.getKey() + " = "  + values.getValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		listsToMapWithUniqueKeys();
	}

}
