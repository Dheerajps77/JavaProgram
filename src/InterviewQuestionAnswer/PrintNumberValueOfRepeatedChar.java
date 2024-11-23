package InterviewQuestionAnswer;

public class PrintNumberValueOfRepeatedChar {

	public static void printNumberValueOfRepeatedChar() {
		String string = "AAAABBBEEEEEEDDDKLLLL";
		char[] charArray = string.toCharArray();
		int temp = 1;
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				temp++;
			} else {
				System.out.print(charArray[i] + "" + temp);
				temp = 1;
			}
		}

		System.out.print(charArray[charArray.length - 1] + "" + temp);
	}

	public static void printRepeatCharCountWithRepeatedNumber() {
		try {
			String string = "A4B3E4r3";
			char[] charArray = string.toCharArray();
			int repeatedCount = 0;
			char newCharrArray = '\0';
			for (int i = 0; i < charArray.length; i++) {
				if ((charArray[i] >= 'A' && charArray[i] <= 'Z') || (charArray[i] >= 'a' && charArray[i] <= 'z')) {
					if (repeatedCount > 0 && newCharrArray != '\0') {
						for (int j = 0; j < repeatedCount; j++) {
							System.out.print(newCharrArray);
						}
					}
					newCharrArray = charArray[i];
					repeatedCount = 0;
				} else if (charArray[i] >= '0' && charArray[i] <= '9') {
					int value = repeatedCount * 10;
					int charValue = charArray[i] - '0';
					repeatedCount = value + charValue;
				}
			}

			if (repeatedCount > 0 && newCharrArray != '\0') {
				for (int j = 0; j < repeatedCount; j++) {
					System.out.print(newCharrArray);
				}
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		printNumberValueOfRepeatedChar(); // Output : A4B3E6D3K1L4
		// printRepeatCharCountWithRepeatedNumber(); //Output : AAAABBBEEEErrr
	}

}
