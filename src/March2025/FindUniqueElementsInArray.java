package March2025;

public class FindUniqueElementsInArray {

	public static void main(String[] args) {
		// printUnqiueCharValue();
		// removeDuplicateValueInString();
		 test();
		// printUnqiueStringValue();
	}

	
	public static void test() {
		String str = "I am new in this world I will be new to some other world";
		String[] strArr = str.split(" ");
		String[] newStrArr = new String[strArr.length];
		int temp = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals(" "))
				continue;

			boolean uniqueFlag = false;
			for (int j = 0; j < strArr.length; j++) {
				if (i != j && strArr[i].equalsIgnoreCase(strArr[j])) {
					uniqueFlag = true;
					break;
				}
			}

			if (!uniqueFlag) {
				newStrArr[temp++] = strArr[i];
			}			
		}
		
		for (int k = 0; k < temp; k++) {
			System.out.print(newStrArr[k] + " "); // am in this will be to some other 
		}
	}
	
	public static void checkUniqueValueInString() {
		try {

			String str = "Dheeraj Pratap Singhd";
			System.out.println("Original Values : " + str);
			char[] charArr = str.toLowerCase().toCharArray();
			char[] unique = new char[charArr.length];
			int temp = 0;
			for (int i = 0; i < charArr.length; i++) {
				boolean flag = false;
				for (int j = 0; j < charArr.length; j++) {
					if (i != j && charArr[i] == charArr[j]) {
						flag = true;
						break;
					}
				}

				if (!flag) {
					unique[temp++] = charArr[i];
				}
			}
			System.out.print("Unique Values : ");
			for (int g = 0; g < temp; g++) {
				System.out.print(unique[g]); // jtsing
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void printUnqiueCharValue() {
		String str = "Geeksforgeekszyx "; // Geeksforg
		char[] charArr = str.toLowerCase().toCharArray();
		int length = charArr.length;

		char[] nonDupValue = new char[length];
		int temp = 0;

		for (int i = 0; i < length; i++) {
			boolean isRepeated = false;

			for (int j = 0; j < length; j++) {
				if (i != j && charArr[i] == charArr[j]) {
					isRepeated = true; // Mark as repeated
					break;
				}
			}

			if (!isRepeated) {
				nonDupValue[temp++] = charArr[i]; // Store only unique characters
			}
		}

		// Print only valid unique characters
		for (int k = 0; k < temp; k++) {
			System.out.print(nonDupValue[k]);
		}
	}
	
	public static void printUnqiueStringValue() {
		try {
			String[] arrayOfString = { "Hello", "Dheeraj", "Hello", "Hi", "Bye", "Dheeraj", "Where", "How", "When",
					"How", "When", "Hello"};
			int temp = 0;
			int length = arrayOfString.length;
			String[] nonDupOfString = new String[length];
			for (int i = 0; i < length; i++) {
				boolean flag = false;
				for (int j = 0; j < length; j++) {
					if (i!=j&&arrayOfString[i].equals(arrayOfString[j])) {
						flag = true;
						break;
					}
				}

				if (!flag) {
					nonDupOfString[temp++] = arrayOfString[i];
				}
			}

			for (int g = 0; g < temp; g++) {
				if (g < nonDupOfString.length - 1) {
					System.out.print(nonDupOfString[g] + " ");
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void printUnqiueIntValue() {
		try {
			int[] arrayOfNum = { 3, 5, 2, 2, 4, 5, 6, 3, 24, 5, 2, 3, 5, 6, 7, 54, 35, 77, 8, 467, 88, 533, 6754, 2244,
					533, 3, 4 };
			int temp = 0;
			int length = arrayOfNum.length;
			int[] nonDup = new int[length];
			for (int i = 0; i < length; i++) {
				boolean flag = false;
				for (int j = 0; j < length; j++) {
					if (i != j && arrayOfNum[i] == arrayOfNum[j]) {
						flag = true;
						break;
					}
				}

				if (!flag) {
					nonDup[temp++] = arrayOfNum[i];
				}
			}

			for (int g = 0; g < temp; g++) {
				if (g < nonDup.length - 1) {
					System.out.print(nonDup[g] + ",");
				} else {
					System.out.print(nonDup[g] + "");
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

}
