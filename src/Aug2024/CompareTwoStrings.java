package Aug2024;

public class CompareTwoStrings {
	
	public static void compareStrings() {
	    try {
	        String actualString = "GET, POST, HEAD, OPTIONS";
	        String[] actualArr = actualString.split(", ");  // Splitting actualString into an array
	        
	        String expectedString = "GET, HEAD, M";
	        String[] expectedArr = expectedString.split(", ");  // Splitting expectedString into an array
	        
	        boolean matchFound = true;
	        
	        // Loop through each value in expectedArr and check if it's in actualArr using for loop
	        for (int i = 0; i < expectedArr.length; i++) {
	            boolean isFound = false;
	            
	            // Inner loop to check each expected value against actual values
	            for (int j = 0; j < actualArr.length; j++) {
	                if (expectedArr[i].equals(actualArr[j])) {
	                    isFound = true;
	                    break;  // Break if a match is found
	                }
	            }
	            
	            if (!isFound) {
	                matchFound = false;
	                System.out.println("Expected value '" + expectedArr[i] + "' not found in actual string.");
	            }
	        }
	        
	        // Print the result after all checks
	        if (matchFound) {
	            System.out.println("All expected values were found in the actual string.");
	        } else {
	            System.out.println("Some expected values were not found in the actual string.");
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	public static void main(String[] args) {
		compareStrings();
	}

}
