package April2025;

public class SwapExampleWithoutUsingThirdVariable {

	public static void swapWords() {
		try {
			String str = "my name is dheeraj";

	        String[] words = str.split(" ");

	        int i = 0; // first word
	        int j = words.length - 1; // last word

	        System.out.println("Before swap: " + String.join(" ", words));

	        // Swapping without third variable
	        words[i] = words[i] + words[j];               // mydheeraj
	        words[j] = words[i].substring(0, words[i].length() - words[j].length()); // "my"
	        words[i] = words[i].substring(words[j].length()); // "dheeraj"

	        System.out.println("After swap: " + String.join(" ", words));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void swapInt() {
		try {
			int a = 9912;
			int b = 4832;

			System.out.println("Before swap: a = " + a + ", b = " + b);

			// Swapping without third variable
			a = a + b; // a = 5 + 10 = 15
			b = a - b; // b = 15 - 10 = 5
			a = a - b; // a = 15 - 5 = 10

			System.out.println("After swap: a = " + a + ", b = " + b);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		swapWords();
	}
}
