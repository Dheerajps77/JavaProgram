package March2025;

public class ReverseOnlyWordsInString {

	public static void main(String[] args) {
		reverseWordAndKeepSpecialInTheirPlace();
	}

	public static void reverseOnlyWordNotOrder() {
		try {
			String str = "My name is dheeraj pratap Singh";
			String[] strArr = str.split(" ");

			for (int i = 0; i < strArr.length; i++) {
				char[] charArr = strArr[i].toCharArray();

				for (int j = charArr.length - 1; j >= 0; j--) {
					System.out.print(charArr[j]); // yM eman si jareehd patarp hgniS
				}
				System.out.print(" ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void reverseWordAndKeepSpecialInTheirPlace() {
		try {
			String str = "as&^hg@$vb";
			System.out.println("Original Word : " + str);
			char[] arr = str.toCharArray();

			for (int i = 0, j = arr.length - 1; i < j;) {
				// If left character is not a letter
				if (!((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z'))) {
					i++;
				}
				// If right character is not a letter
				else if (!((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'Z'))) {
					j--;
				}
				// Both characters are letters: swap them
				else {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					j--;
				}
			}

			// Reconstruct the result string manually
			String result = "";
			for (int k = 0; k < arr.length; k++) {
				result += arr[k];
			}

			System.out.println("Reversed Word except special: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	Output below :
	Original Word : as&^hg@$vb
	Reversed Word except special: bv&^gh@$sa
	*/ 
}
