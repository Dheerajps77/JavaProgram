package Jan2025;

public class printCountOfCharOptimized {
	
	
	public static void printCountOfCharOptimizedValue() {
	    try {
	        String src = "f4m3b5i2l9b1";  // Example with 100+ string values
	        char[] char1 = src.toCharArray();

	        int repeatedCount = 0;
	        char newChar = '\0';
	        StringBuilder sb = new StringBuilder();

	        for (int i = 0; i < char1.length; i++) {
	            if ((char1[i] >= 'a' && char1[i] <= 'z') || (char1[i] >= 'A' && char1[i] <= 'Z')) {
	                if (repeatedCount > 0 && newChar != '\0') {
	                    sb.append(String.valueOf(newChar).repeat(repeatedCount)).append("\n");
	                    repeatedCount = 0;
	                }
	                newChar = char1[i];
	            } else if (char1[i] >= '0' && char1[i] <= '9') {
	                repeatedCount = repeatedCount * 10 + (char1[i] - '0'); // Handle multi-digit numbers
	            }
	        }

	        // Append last character sequence if needed
	        if (repeatedCount > 0 && newChar != '\0') {
	            sb.append(String.valueOf(newChar).repeat(repeatedCount)).append("\n");
	        }

	        System.out.print(sb.toString()); // Print final result in one go

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	public static void main(String[] args) {
		
		printCountOfCharOptimizedValue();	
		
	}

}
