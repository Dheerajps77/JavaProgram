package Jan2025;

public class RemoveDuplicates {

	public static void main(String[] args) {
		removeDuplicateIntegers();
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
