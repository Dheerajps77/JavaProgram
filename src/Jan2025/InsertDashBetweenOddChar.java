package Jan2025;

public class InsertDashBetweenOddChar {

	public static String DashInsert(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			result.append(str.charAt(i));

			if (i < str.length() - 1) {
				char currentChar = str.charAt(i);
				char nextChar = str.charAt(i + 1);

				if (isOdd(currentChar) && isOdd(nextChar)) {
					result.append('-');
				}
			}
		}

		return result.toString();
	}

	public static boolean isOdd(char c) {
		return c == '1' || c == '3' || c == '5' || c == '7' || c == '9';
	}

	public static void main(String[] args) {
		String str = "454793";
		String result = DashInsert(str);
		System.out.println("Result: " + result);
	}

}
