package March2025;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateElementsUsingMap {
	
	// ANSI escape codes for console highlighting
    public static final String RESET = "\u001B[0m";
    public static final String GREEN_BOLD = "\u001B[1;32m";
    public static final String RED_BOLD = "\u001B[1;31m";
    public static final String YELLOW_BOLD = "\u001B[1;33m";
    public static final String BLUE_BOLD = "\u001B[1;34m";
    
	public static void main(String[] args) {
		findDuplicateWordInString();
	}

	public static void findDuplicateNumberInArray() {
		try {
			int[] arrayOfNum = { 3, 5, 2, 2, 4, 5, 6, 3, 24, 5, 2, 3, 5, 6, 7, 54, 35, 77, 8, 467, 88, 533, 6754, 2244,
					533, 3, 4, 101, 101};

			Map<Integer, Integer> maps = new HashMap<>();

			for (int num : arrayOfNum) {
				if (maps.get(num) != null) {
					maps.put(num, maps.get(num) + 1);
				} else {
					maps.put(num, 1);
				}
			}
			
			System.out.println("Below are the Duplicate Values");
			for(Map.Entry<Integer, Integer> valuesToBeCheck : maps.entrySet())
			{
				if(valuesToBeCheck.getValue()>1)
				{
					System.out.print(valuesToBeCheck.getKey()+" ");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findDuplicateWordInString() {
		try {
			String str = "Hi, How are you ? you must be straving. So I have done arrangment for you. "
					+ "You need t come in this way. I will take care you. Please be noted that I am your host "
					+ "for todays programe. The programe contaning lots of things. You will be amazed after "
					+ "learning this.";
			String newString = "";
			char[] charArr = str.toCharArray();
			Map<String, Integer> maps = new HashMap<>();
			StringBuilder builder = new StringBuilder();
			
			for (int i = 0; i < charArr.length; i++) {
				if ((charArr[i] >= 'A' && charArr[i] < 'Z') || (charArr[i] >= 'a' && charArr[i] <= 'z')
						|| (charArr[i] == ' ')) {
					newString = newString + charArr[i]; // Can be use StringBuilder instead
					// 
				}
			}
			System.out.println(BLUE_BOLD + "Original String below : - " + RESET + GREEN_BOLD + newString.toLowerCase() + RESET );
			String[] splitedString = newString.split(" ");

			for (String forString : splitedString) {
				if (forString.equals(" ")) // or if(forString.trim().isEmpty()) continue ;
					continue;
				if (maps.get(forString) != null) {
					maps.put(forString, maps.get(forString) + 1);
				} else {
					maps.put(forString, 1);
				}
			}

			System.out.println(YELLOW_BOLD + "Words which occured more than 1 time at below :- " + RESET);
			for (Map.Entry<String, Integer> values : maps.entrySet()) {
				if (values.getValue() > 1) {
					System.out.println(values.getKey() + " : " + values.getValue());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void findDuplicateWordInStringUsingStringBuilder() {
	    try {
	        String str = "Hi, How are you ? you must be straving. So I have done arrangment for you. "
	                + "You need t come in this way. I will take care you. Please be noted that I am your host "
	                + "for todays programe. The programe contaning lots of things. You will be amazed after "
	                + "learning this.";

	        StringBuilder newString = new StringBuilder();
	        char[] charArr = str.toCharArray();
	        Map<String, Integer> maps = new HashMap<>();

	        for (int i = 0; i < charArr.length; i++) {
	            if ((charArr[i] >= 'A' && charArr[i] < 'Z') || (charArr[i] >= 'a' && charArr[i] <= 'z')
	                    || (charArr[i] == ' ')) {
	                newString.append(charArr[i]);
	            }
	        }

	        System.out.println("Original String below :- " + newString.toString().toLowerCase());
	        String[] splitedString = newString.toString().toLowerCase().split(" ");

	        for (String forString : splitedString) {
	            if (forString.equals(" "))
	                continue;
	            if (maps.get(forString) != null) {
	                maps.put(forString, maps.get(forString) + 1);
	            } else {
	                maps.put(forString, 1);
	            }
	        }

	        System.out.println("Words which occured more than 1 time :-");
	        for (Map.Entry<String, Integer> values : maps.entrySet()) {
	            if (values.getValue() > 1) {
	                System.out.println(values.getKey() + " : " + values.getValue());
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public static void findDuplicateElementInCharacter() {
		try {
			String str = "dheeraj pratap singh";
			System.out.println("Original Value  :: " + str);
			char[] charArr = str.toCharArray();
			Map<Character, Integer> maps = new HashMap<>();

			for (Character ValuesToBeCheck : charArr) {
				if (ValuesToBeCheck == ' ')
					continue;
				if (maps.get(ValuesToBeCheck) != null) { /* maps.containsKey(valuesToBeCheck) */
					maps.put(ValuesToBeCheck, maps.get(ValuesToBeCheck) + 1);
				} else {
					maps.put(ValuesToBeCheck, 1);
				}
			}

			System.out.println("Below are the duplicate character");

			for (Map.Entry<Character, Integer> values1 : maps.entrySet()) {
				if (values1.getValue() > 1) {
					System.out.print(values1.getKey() + " ");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
