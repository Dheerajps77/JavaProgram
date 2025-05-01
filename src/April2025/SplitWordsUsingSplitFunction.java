package April2025;

public class SplitWordsUsingSplitFunction {
/*


[^a-zA-Z] → Matches any non-alphabetic character (e.g., @, #, €, etc.).
+ → Means "one or more" of the preceding pattern(Like Special Character).
	 
*/
	
	public static void splitWordsUsingSplitFunction() {
	    String input = "Java@Automation#Expert€In/Selenium.%This";
	    System.out.println("Original: " + input);

	    // Split at all non-alphabetic characters
	    String[] words = input.split("[^a-zA-Z]+");

	    System.out.print("Extracted words: ");
	    for (String word : words) {
	        if (!word.isEmpty()) {
	            System.out.print(word + " ");
	        }
	    }
	}

	
	
	public static void main(String[] args) {
		splitWordsUsingSplitFunction();
	}

}
