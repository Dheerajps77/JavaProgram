package Aug2024;

public class printSpecialCharBasisOnNumber {

	// The pattern repeats every 3 characters: +, -, -
	public static void printSpecialChar() {
		try {
			for (int i = 0; i < 5; i++) {
				if (i % 3 == 0) {
					System.out.print("+"); // +--+-
				} else {
					System.out.print("-");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		printSpecialChar();
	}

}
