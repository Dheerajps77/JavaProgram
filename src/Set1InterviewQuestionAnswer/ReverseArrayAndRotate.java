package Set1InterviewQuestionAnswer;

public class ReverseArrayAndRotate {

	public static void main(String[] args) {
		
		rotateRightArray();
		System.out.println("\n====================================");
		rotateLeftArray();
	}

	// Rotate the array to the right
	public static void rotateRightArray() {
		try {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			int rotateByRight = 2;
			int n = arr.length;
			int[] rotatedArray = new int[n];

			// Print the rotated array
			System.out.println("Orignal Arrays:");
			for (int num : arr) {
				System.out.print(num + " ");
			}
			
			// Copy the last rotateByRight elements to the beginning
			int temp = 0;
			for (int i = n - rotateByRight; i < n; i++) {
				rotatedArray[temp++] = arr[i];
			}

			// Copy the rest of the elements to the new array
			for (int i = 0; i < n - rotateByRight; i++) {
				rotatedArray[temp++] = arr[i];
			}

			// Print the rotated array
			System.out.println("\nRight Rotated Array:");
			for (int num : rotatedArray) {
				System.out.print(num + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Rotate the array to the left
	public static void rotateLeftArray() {
		try {
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			int rotateByLeft = 2;
			int n = arr.length;
			int[] rotatedArray = new int[n];

			// Print the rotated array
			System.out.println("\nOrignal Arrays:");
			for (int num : arr) {
				System.out.print(num + " ");
			}
			
			// Copy elements starting from rotateByLeft to the end
			int temp = 0;
			for (int i = rotateByLeft; i < n; i++) {
				rotatedArray[temp++] = arr[i];
			}

			// Copy the first rotateByLeft elements
			for (int i = 0; i < rotateByLeft; i++) {
				rotatedArray[temp++] = arr[i];
			}

			// Print the rotated array
			System.out.println("\nLeft Rotated Array:");
			for (int num : rotatedArray) {
				System.out.print(num + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Reverse the array using a for loop
	private static void reverseUsingForLoop() {
		try {
			System.out.println("\n\nReversing Array (For Loop):");
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			int start = 0, end = arr.length - 1, temp;

			for (; start < end; start++, end--) {
				temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
			}

			// Print the reversed array
			for (int num : arr) {
				System.out.print(num + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Reverse the array using a while loop
	public static void reverseArrayUsingWhile() {
		try {
			System.out.println("\n\nReversing Array (While Loop):");
			int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
			int start = 0, end = arr.length - 1, temp;

			while (start < end) {
				temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				start++;
				end--;
			}

			// Print the reversed array
			for (int num : arr) {
				System.out.print(num + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Calculate the sum of the primary and secondary diagonals of a matrix
    public static void sumDiagonals() {
        try {
            int[][] matrix = {
                {19, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            int primaryDiagonalSum = 0;
            int secondaryDiagonalSum = 0;

            // Loop through the matrix to sum diagonal elements
            for (int i = 0; i < matrix.length; i++) {
                // Primary diagonal (i, i)
                primaryDiagonalSum += matrix[i][i];

                // Secondary diagonal (i, matrix.length - i - 1)
                secondaryDiagonalSum += matrix[i][matrix.length - i - 1];
            }

            System.out.println("Sum of Primary Diagonal: " + primaryDiagonalSum);
            System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Reverse the first half of the array
    public static void ReverseFirstHalf() {
        try {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};

            int start = 0;
            int end = arr.length / 2 - 1;
            int temp;

            while (start < end) {
                temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }

            // Print the modified array
            for (int num : arr) {
                System.out.print(num + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Reverse the second half of the array
    public static void ReverseSecondHalf() {
        try {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};

            int start = arr.length / 2;
            int end = arr.length - 1;
            int temp;

            while (start < end) {
                temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }

            // Print the modified array
            for (int num : arr) {
                System.out.print(num + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

