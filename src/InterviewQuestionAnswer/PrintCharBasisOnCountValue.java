package InterviewQuestionAnswer;

public class PrintCharBasisOnCountValue {
	
	
	public static void printOtherThanChars()
	{
		try {
			
			String str = "DakeVKGm14nDBH8493maaerf(*@#*(*$#Njdodskdo#)@(#)(@392382nKlkldsk";
			
			char[] charArray=str.toCharArray();
			
			for(int i=0;i<charArray.length;i++)
			{
				if(!(charArray[i]>='a' && charArray[i]<='z')
						&&(!(charArray[i]>='A' && charArray[i]<='Z'))
						&&(!(charArray[i]>='0' && charArray[i]<='9')))
				{ 
					System.out.print(charArray[i]); // (*@#*(*$##)@(#)(@
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printRepeatedChar() {
		String str = "ddddddmmmmmmaalloiiieeeeenmm";
		StringBuilder builder = new StringBuilder();
		int temp = 1;
		char c[] = str.toCharArray();
		try {
			for (int i = 0; i < c.length - 1; i++) {
				if (c[i] == c[i + 1]) {
					temp++;
				} else {
					builder.append(c[i]).append(temp);
					temp = 1;
				}
			}
			builder.append(c[c.length - 1]).append(temp);

			System.out.println(builder.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printCountOfChar() {
		try {
			String src = "f4m3b5i2l9b1";

			char[] char1 = src.toCharArray();
			int repeatedCount = 0;
			char newChar = '\0';
			for (int i = 0; i < char1.length; i++) {
				if ((char1[i] >= 'a' && char1[i] <= 'z') || (char1[i] >= 'A' && char1[i] <= 'Z')) {
					if (repeatedCount > 0 && newChar != '\0') {
						for (int j = 0; j < repeatedCount; j++) {
							System.out.print(newChar);
						}
						System.out.println();
						repeatedCount = 0;
					}
					newChar = char1[i];
				} else if (char1[i] >= '0' && char1[i] <= '9') {
					int value = repeatedCount * 10;
					int newInt = char1[i] - '0';
					repeatedCount = value + newInt;
				}
			}

			if (repeatedCount > 0 && newChar != '\0') {
				for (int j = 0; j < repeatedCount; j++) {
					System.out.print(newChar);
				}
				System.out.println();
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void sperateDataType() {
		try {

			String str = "DakeVKGm14nDBH8493maaerf";
			StringBuilder builder = new StringBuilder();
			StringBuilder builder1 = new StringBuilder();
			StringBuilder builder2 = new StringBuilder();
			char[] c = str.toCharArray();

			for (int i = 0; i < c.length; i++) {
				if (c[i] >= 'A' && c[i] <= 'Z') {
					builder.append(c[i]);
				} else if (c[i] >= 'a' && c[i] <= 'z') {
					builder1.append(c[i]);
				} else if (c[i] >= '0' && c[i] <= '9') {
					builder2.append(c[i]);
				}
			}

			System.out.println(builder.toString());
			System.out.println(builder1.toString());
			System.out.println(builder2.toString());
		} catch (Exception e) {
			throw e;
		}
	}

	public static void printNumberBasisOnFirstNumber() {
		try {

			int[] arr = { 12, 1, 134, 75, 167, 123, 11, 64, 190, 90, 2543, 3567, 22, 245, 235 };
			char valueChar = '1';
			for (int i = 0; i < arr.length; i++) {
				char[] c1 = String.valueOf(arr[i]).toCharArray();
				// char firstChar = String.valueOf(arr[i]).charAt(0); // Get the first character
				if (c1[0] == valueChar) {
					System.out.println(arr[i]);
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void findLargestCommonSubstring() {
		int maxLength = 0;
		String longestSubstring = "";
		String str1 = "manojabc";
		String str2 = "xyzmanojabcmanoj";

		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j <= str1.length(); j++) {
				// Extract substring
				String subStr = str1.substring(i, j);
				// Check if it exists in str2
				if (str2.contains(subStr) && subStr.length() > maxLength) {
					maxLength = subStr.length();
					longestSubstring = subStr;
				}
			}
		}

		System.out.println(
				"The largest substring of string1 that is also a substring of string2 is: " + longestSubstring);
	}

	public static void swampNumberWithoutThird() {
		try {

			int num = 20;
			int num1 = 40;

			System.out.println("Before Swamp");
			System.out.println("Num - " + num);
			System.out.println("Num1 - " + num1);

			num1 = num1 - num;
			num = num + num1;

			System.out.println("After Swamp");
			System.out.println("Num - " + num);
			System.out.println("Num1 - " + num1);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void swampNumberWithoutThirdGenericFunctions(int num, int num1) {

		try {
			System.out.println("Before Swamp");
			System.out.println("Num - " + num);
			System.out.println("Num1 - " + num1);

			num1 = num1 - num;
			num = num + num1;
			num1 = num - num1;

			System.out.println("After Swamp");
			System.out.println("Num - " + num);
			System.out.println("Num1 - " + num1);

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		printOtherThanChars();
	}
}