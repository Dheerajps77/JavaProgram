package Aug2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DistinctValuesUsingWithGetOrDefault {
	
	
	public static void distinctInteger() {
        try {
            int num[] = {34, 53, 34, 56, 65, 54, 2, 3, 2, 3, 4, 4, 5, 5, 76, 76, 76, 80, 80, 89, 80};
            Map<Integer, Integer> maps = new HashMap<>();

            for (int n : num) {
                maps.put(n, maps.getOrDefault(n, 0) + 1);
            }

            for (Entry<Integer, Integer> entry : maps.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void distinctDouble() {
        try {
            double num[] = {1.1, 2.2, 1.1, 3.3, 3.3, 3.3};
            Map<Double, Integer> maps = new HashMap<>();

            for (double n : num) {
                maps.put(n, maps.getOrDefault(n, 0) + 1);
            }

            for (Entry<Double, Integer> entry : maps.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void distinctFloat() {
        try {
            float num[] = {1.2f, 2.3f, 1.2f, 1.2f, 2.3f, 3.4f};
            Map<Float, Integer> maps = new HashMap<>();

            for (float n : num) {
                maps.put(n, maps.getOrDefault(n, 0) + 1);
            }

            for (Entry<Float, Integer> entry : maps.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void distinctCharacter() {
        try {
            String str = "hello world";
            Map<Character, Integer> maps = new HashMap<>();

            for (char ch : str.toCharArray()) {
                maps.put(ch, maps.getOrDefault(ch, 0) + 1);
            }

            for (Entry<Character, Integer> entry : maps.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void distinctString() {
        try {
            String str = "I know , I know , I've heard it before. "
                    + "The cat sat on the mat, the mat that was soft and warm. "
                    + "She shouted , 'No , no , no!' as she ran away. "
                    + "He kept saying , 'Please , please , I need your help. "
                    + "The rain, rain , go away , come again another day.";

            String newString[] = str.toLowerCase().split("[\\W]+");

            Map<String, Integer> maps = new HashMap<>();

            for (String word : newString) {
                if (!word.isEmpty()) {
                    maps.put(word, maps.getOrDefault(word, 0) + 1);
                }
            }

            for (Entry<String, Integer> entry : maps.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        distinctInteger();
        distinctDouble();
        distinctFloat();
        distinctCharacter();
        distinctString();
    }

}
