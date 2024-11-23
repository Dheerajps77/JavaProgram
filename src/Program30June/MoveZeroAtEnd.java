package Program30June;

public class MoveZeroAtEnd {

	public static void moveZeroAtEnd() {
		try {

			int[] arr = { 0, 45, 3, 4, 0, 0, 24, 0, 4, 0 };
			int count = 0;
			for (int i = 0; i < arr.length; i++)
				if (arr[i] != 0)
					arr[count++] = arr[i]; // here count is
											// incremented

			// Now all non-zero elements have been shifted to
			// front and 'count' is set as index of first 0.
			// Make all elements 0 from count to end.
			while (count < arr.length)
				arr[count++] = 0;

			System.out.println("Array after pushing zeros to the back: ");
			for (int i = 0; i < arr.length; i++)
				System.out.print(arr[i] + " ");
		}

		catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		moveZeroAtEnd();
	}

}
