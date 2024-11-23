package Aug2024;

public class CharTypeChecker {

	public static void checkCharTypes(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isDigit(c)) {
				System.out.println(c + " is a digit.");
			} else if (Character.isLetter(c)) {
				System.out.println(c + " is a letter.");
			} else if (Character.isWhitespace(c)) {
				System.out.println("Whitespace detected.");
			} else {
				System.out.println(c + " is neither a digit, letter, nor whitespace.");
			}
		}
	}
	
	
	public static void checkCharTypesUsingLoop(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (isDigit(c)) {
                System.out.println(c + " is a digit.");
            } else if (isLetter(c)) {
                System.out.println(c + " is a letter.");
            } else if (isWhitespace(c)) {
                System.out.println("Whitespace detected.");
            } else {
                System.out.println(c + " is neither a digit, letter, nor whitespace.");
            }
        }
    }
	
	 public static boolean isDigit(char c) {
	        return c >= '0' && c <= '9';
	    }

	    public static boolean isLetter(char c) {
	        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
	    }

	    public static boolean isWhitespace(char c) {
	        return c == ' ' || c == '\t' || c == '\n' || c == '\r';
	    }

	public static void main(String[] args) {
		String input = "Hello World! 123\n\t";
		//checkCharTypes(input);
		checkCharTypesUsingLoop(input);
	}
}
