package Aug2024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctValue {

	public static void distinctInteger() {
        try {
            int num[] = {34, 53, 34, 56, 65, 54, 2, 3, 2, 3, 4, 4, 5, 5, 76, 76, 76, 80, 80, 89, 80};
            Map<Integer, Integer> maps = new HashMap<>();

            for (int n : num) {
                if (maps.get(n) != null) {
                    maps.put(n, maps.get(n) + 1);
                } else {
                    maps.put(n, 1);
                }
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
                if (maps.get(n) != null) {
                    maps.put(n, maps.get(n) + 1);
                } else {
                    maps.put(n, 1);
                }
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
                if (maps.get(n) != null) {
                    maps.put(n, maps.get(n) + 1);
                } else {
                    maps.put(n, 1);
                }
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
                if (maps.get(ch) != null) {
                    maps.put(ch, maps.get(ch) + 1);
                } else {
                    maps.put(ch, 1);
                }
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

            String newString[] = str.toLowerCase().split(" ");

            Map<String, Integer> maps = new HashMap<>();

            for (String word : newString) {
                if (maps.get(word) != null) {
                    maps.put(word, maps.get(word) + 1);
                } else {
                    maps.put(word, 1);
                }
            }

            for (Entry<String, Integer> entry : maps.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
	public static void printOnlyChar()
	{
		try {
			String str="Co2*&*&(()()ngnizen3843t";
			
			char[] charArr=str.toCharArray();
			for(int i=0;i<charArr.length;i++)
			{
				if((charArr[i]>='a' && charArr[i]<='z')
						||(charArr[i]>='A' && charArr[i]<='Z'))
				{
					System.out.print(charArr[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void StringAnagram() {
		try {
			String a = "silent";
			String b = "entsil";
			
			String str="cts";
			String str3=new String("cts");
			
			System.out.println(str==str3);
			System.out.println(str.equalsIgnoreCase(str3));
			
			char aChar[] = a.toCharArray();
			char bChar[] = b.toCharArray();
			char temp = ' ', temp1 = ' ';
			for (int i = 0; i < aChar.length; i++) {
				for (int j = i + 1; j < aChar.length; j++) {
					if (aChar[i] > aChar[j]) {
						temp = aChar[i];
						aChar[i] = aChar[j];
						aChar[j] = temp;
					}
				}
			}

			for (int k = 0; k < bChar.length; k++) {
				for (int g = k + 1; g < bChar.length; g++) {
					if (bChar[k] > bChar[g]) {
						temp1 = bChar[k];
						bChar[k] = bChar[g];
						bChar[g] = temp1;
					}
				}
			}
			
			String str1=new String(aChar);
			String str2=new String(bChar);
			
			if(str1.equalsIgnoreCase(str2))
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("String is not anagram");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		printOnlyChar();
	}

}
