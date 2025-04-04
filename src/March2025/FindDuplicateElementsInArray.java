package March2025;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
		checkDuplicateValueInString();

	}
	
	public static void checkDuplicateValueInString() {
		try {

			String str = "Dheeraj Pratap Singhd";
			System.out.println("Original Values : " + str);
			char[] charArr = str.toLowerCase().toCharArray();
			char[] duplicates = new char[charArr.length];
			int temp = 0;
			for (int i = 0; i < charArr.length; i++) {
				if (charArr[i] == ' ') continue; // Ignore spaces
                boolean isDuplicate = false;
				for (int j = i + 1; j < charArr.length; j++) {
					if (charArr[i] == charArr[j]) {
						isDuplicate=true;
						break;
					}
				}
				
				// Ensure we add only once
                boolean alreadyAdded = false;
                for (int k = 0; k < temp; k++) {
                    if (duplicates[k] == charArr[i]) {
                        alreadyAdded = true;
                        break;
                    }
                }
                
                if (isDuplicate && !alreadyAdded) {
                    duplicates[temp++] = charArr[i];
                }
			}
			System.out.print("Duplicate Values : ");
            for (int g = 0; g < temp; g++) {
                System.out.print(duplicates[g]); //dherap
            }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		public static void findDuplicateNumbersInArray() {
	        try {
	            int[] n = { 1, 3, 5, 3, 7, 1, 9, 5, 7, 10, 11, 12 };
	            int[] dup = new int[n.length];
	            int temp = 0;

	            for (int i = 0; i < n.length; i++) {
	                boolean isDuplicate = false;

	                for (int j = i + 1; j < n.length; j++) {
	                    if (n[i] == n[j]) {
	                        isDuplicate = true;
	                        break; // Stop checking once found
	                    }
	                }

	                // Ensure it's not already stored in dup[]
	                boolean alreadyAdded = false;
	                for (int k = 0; k < temp; k++) {
	                    if (dup[k] == n[i]) {
	                        alreadyAdded = true;
	                        break;
	                    }
	                }

	                if (isDuplicate && !alreadyAdded) {
	                    dup[temp++] = n[i]; // Store only if not already added
	                }
	            }

	            System.out.print("Duplicate Numbers: ");
	            for (int h = 0; h < temp; h++) {
	                System.out.print(dup[h] + " ");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
