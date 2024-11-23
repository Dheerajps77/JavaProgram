package InterviewQuestionAnswer;

public class MatrixOperations {

    public static void main(String[] args) {
        // Define two 3x3 matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Perform matrix addition
        int[][] additionResult = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition Result:");
        printMatrix(additionResult);

        // Perform matrix subtraction
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        System.out.println("Matrix Subtraction Result:");
        printMatrix(subtractionResult);

        // Perform matrix multiplication
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrix Multiplication Result:");
        printMatrix(multiplicationResult);
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Incompatible matrices for multiplication");
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    public static boolean checkRowsEquality()
    {
    	// Sample matrix (3x3)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {5, 7, 9}
        };
        
		int rows = matrix.length;
		int cols = matrix[0].length;

		// Ensure the matrix has at least 3 rows and columns
		if (rows < 3 || cols < 1) {
			return false;
		}

		// Check if the sum of the first two rows equals the third row
		for (int j = 0; j < cols; j++) {
			int sumOfFirstTwoRows = matrix[0][j] + matrix[1][j];
			if (sumOfFirstTwoRows != matrix[2][j]) {
				return false; // Return false if any column does not satisfy the condition
			}
		}
		return true; // Return true if all columns satisfy the condition
	}
}
