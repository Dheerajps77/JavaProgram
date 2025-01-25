package Jan2025;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		removeConsecutiveDuplicateIntegers();
		removeConsecutiveDuplicateStrings();
		removeConsecutiveDuplicateCharacters();
		removeConsecutiveDuplicateFloats();
	}

	public static void removeConsecutiveDuplicateIntegers() {
		try {
			int[] numbers = { 3, 3, 53, 45, 45, 6, 34, 34, 23, 52, 52, 5, 2, 2, 7 };
			System.out.print("Unique Integers: ");
			System.out.print(numbers[0] + " "); // Print the first element
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i] != numbers[i - 1]) { //3 53 45 6 34 23 52 5 2 7
					System.out.print(numbers[i] + " ");
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeConsecutiveDuplicateStrings() {
		try {
			String[] words = { "apple", "apple", "banana", "orange", "orange", "grape", "grape" };
			System.out.print("Unique Strings: ");
			System.out.print(words[0] + " "); // Print the first element
			for (int i = 1; i < words.length; i++) {
				if (!words[i].equals(words[i - 1])) { //apple banana orange grape 
					System.out.print(words[i] + " ");
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeConsecutiveDuplicateCharacters() {
		try {
			char[] characters = { 'a', 'a', 'b', 'c', 'c', 'd', 'd', 'e' };
			System.out.print("Unique Characters: ");
			System.out.print(characters[0] + " "); // Print the first element
			for (int i = 1; i < characters.length; i++) {
				if (characters[i] != characters[i - 1]) { //a b c d e
					System.out.print(characters[i] + " ");
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void removeConsecutiveDuplicateFloats() {
		try {
			float[] floats = { 1.1f, 1.1f, 2.2f, 3.3f, 3.3f, 4.4f, 4.4f };
			System.out.print("Unique Floats: ");
			System.out.print(floats[0] + " "); // Print the first element
			for (int i = 1; i < floats.length; i++) {
				if (floats[i] != floats[i - 1]) { // 1.1 2.2 3.3 4.4 
					System.out.print(floats[i] + " ");
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
