package Aug2024;

public class EvenBasisOnWhiteSpaceBetween2Strings {

	public static void EvenOddof2Strings() {
		try {

			String str = "Mer cer M e t                   t            l";
			String str1 = "Mer cer met            tl";
			int actualValue = 0, temp = 0, actualValue1 = 0, temp1 = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					actualValue = actualValue + temp++;
				}
			}

			for (int i = 0; i < str1.length(); i++) {
				if (str.charAt(i) == ' ') {
					actualValue1 = actualValue1 + temp1++;
				}
			}

			int newNumber = 0;
			newNumber = temp - temp1;
			System.out.println("Actual Number " + newNumber);
			if (newNumber % 2 == 0) {
				System.out.println("Even" + newNumber);
			} else {
				System.out.println("Odd" + newNumber);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		EvenOddof2Strings();
	}

}
