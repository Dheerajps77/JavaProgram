package March2025;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		int[] arr = { 35, 64, 3, 5, 56, 7, 8, 8, 9, 8, 6, 4, 3 }; //35 64 3 5 56 7 8 9 6 4 
		int[] arr1 = new int[arr.length];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < temp; j++) {
				if (arr1[j] == arr[i]) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				arr1[temp++] = arr[i];
			}
		}

		for (int k = 0; k < temp; k++) {
			System.out.print(arr1[k] + " ");
		}
	}
	public static void removeDuplicateValueInString() {
		try {

			String str = "Dheeraj Pratap Singh";
			System.out.println("Original Value : " + str);
			char[] charArr = str.toCharArray();

			char[] uniqueEle = new char[charArr.length];
			int temp = 0;
			for (int i = 0; i < charArr.length; i++) {
				boolean flag = false;
				for (int j = 0; j < temp; j++) {
					if (uniqueEle[j] == charArr[i]) {
						flag = true;
						break;
					}
				}

				if (!flag) {
					uniqueEle[temp++] = charArr[i];
				}
			}

			System.out.print("Below are duplicate Values : ");

			for (int h = 0; h < temp; h++) {
				System.out.print(uniqueEle[h]); // Dheraj PtpSing
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void removeDuplicateCharacters() {
		try {
			char[] characters = { 'a', 'b', 'a', 'c', 'b', 'd', 'e', 'a' };
			char[] uniqueArr = new char[characters.length];
			int temp = 0;

			for (int i = 0; i < characters.length; i++) {
				boolean isDuplicate = false;

				for (int j = 0; j < temp; j++) {
					if (characters[i] == uniqueArr[j]) {
						isDuplicate = true;
						break;
					}
				}

				if (!isDuplicate) {
					uniqueArr[temp++] = characters[i];
				}
			}

			System.out.print("Unique characters: ");
			for (int g = 0; g < temp; g++) {
				System.out.print(uniqueArr[g] + " ");
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeDuplicateIntegers() {
		try {

			int[] numbers = { 3, 3, 53, 45, 6, 6, 34, 23, 52, 52, 5, 2, 3, 6, 7, 53 };
			int[] uniqueArr = new int[numbers.length];
			int temp = 0;
			for (int i = 0; i < numbers.length; i++) {
				boolean isDuplicate = false;
				for (int j = 0; j < temp; j++) {
					if (numbers[i] == uniqueArr[j]) {
						isDuplicate = true;
						break;
					}
				}

				if (!isDuplicate) {
					uniqueArr[temp++] = numbers[i];
				}
			}

			for (int g = 0; g < temp; g++) {
				System.out.print(uniqueArr[g] + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeDuplicateStrings() {
		try {
			String[] words = { "apple", "banana", "apple", "orange", "banana", "grape" };
			String[] uniqueArr = new String[words.length];
			int temp = 0;

			for (int i = 0; i < words.length; i++) {
				boolean isDuplicate = false;

				for (int j = 0; j < temp; j++) {
					if (words[i].equals(uniqueArr[j])) {
						isDuplicate = true;
						break;
					}
				}

				if (!isDuplicate) {
					uniqueArr[temp++] = words[i];
				}
			}

			System.out.print("Unique strings: ");
			for (int g = 0; g < temp; g++) {
				System.out.print(uniqueArr[g] + " ");
			}
			System.out.println();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeDuplicateFloats() {
		try {
			float[] floats = { 1.1f, 2.2f, 3.3f, 2.2f, 1.1f, 4.4f };
			float[] uniqueArr = new float[floats.length];
			int temp = 0;

			for (int i = 0; i < floats.length; i++) {
				boolean isDuplicate = false;

				for (int j = 0; j < temp; j++) {
					if (floats[i] == uniqueArr[j]) {
						isDuplicate = true;
						break;
					}
				}

				if (!isDuplicate) {
					uniqueArr[temp++] = floats[i];
				}
			}

			System.out.print("Unique floats: ");
			for (int g = 0; g < temp; g++) {
				System.out.print(uniqueArr[g] + " ");
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
