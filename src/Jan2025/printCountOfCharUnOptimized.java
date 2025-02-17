package Jan2025;

public class printCountOfCharUnOptimized {
	
	public static void printRepeatedChar() {
		String str = "ddddddmmmmmmaalloiiieeeeenmm";
		StringBuilder builder = new StringBuilder();
		int temp = 1;
		char c[] = str.toCharArray();
		try {
			for (int i = 0; i < c.length - 1; i++) {
				if (c[i] == c[i + 1]) {
					temp++;
				} else {
					builder.append(c[i]).append(temp);
					temp = 1;
				}
			}
			builder.append(c[c.length - 1]).append(temp);

			System.out.println(builder.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printCountOfChar() {
		try {
			String src = "f4m3b5i2l9b1";

			char[] char1 = src.toCharArray();
			int repeatedCount = 0;
			char newChar = '\0';
			for (int i = 0; i < char1.length; i++) {
				if ((char1[i] >= 'a' && char1[i] <= 'z') || (char1[i] >= 'A' && char1[i] <= 'Z')) {
					if (repeatedCount > 0 && newChar != '\0') {
						for (int j = 0; j < repeatedCount; j++) {
							System.out.print(newChar);
						}
						System.out.println();
						repeatedCount = 0;
					}
					newChar = char1[i];
				} else if (char1[i] >= '0' && char1[i] <= '9') {
					int value = repeatedCount * 10;
					int newInt = char1[i] - '0';
					repeatedCount = value + newInt;
				}
			}

			if (repeatedCount > 0 && newChar != '\0') {
				for (int j = 0; j < repeatedCount; j++) {
					System.out.print(newChar);
				}
				System.out.println();
			}

		} catch (Exception e) {
			throw e;
		}
	}
	
	public static void main(String[] args) {
		printRepeatedChar();
	}

}
