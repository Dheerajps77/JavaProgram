package March2025;

public class FindUniqueRemoveDuplicateFindDuplicateElements {

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
	
	public static void printUnqiueIntValue() {
		try {
			int[] arrayOfNum = { 3, 5, 2, 2, 4, 5, 6, 3, 24, 5, 2, 3, 5, 6, 7, 54, 35, 77, 8, 467, 88, 533, 6754, 2244,
					533, 3, 4 };
			int temp = 0;
			int length = arrayOfNum.length;
			int[] nonDup = new int[length];
			for (int i = 0; i < length; i++) {
				boolean flag = false;
				for (int j = 0; j < length; j++) {
					if (i != j && arrayOfNum[i] == arrayOfNum[j]) {
						flag = true;
						break;
					}
				}

				if (!flag) {
					nonDup[temp++] = arrayOfNum[i];
				}
			}

			// Print only the filled unique numbers without trailing comma
	        for (int i = 0; i < temp; i++) {
	            System.out.print(nonDup[i]);
	            if (i < temp - 1) {
	                System.out.print(", ");
	            }
	        }

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		printUnqiueIntValue();
	}
}
