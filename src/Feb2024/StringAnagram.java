package Feb2024;

public class StringAnagram {

	static String stringValue1 = "listen";
	static String stringValue2 = "silent";
	static char temp = ' ';

	public static boolean stringAnagram() {
		boolean flag = true;
		try {

			if (stringValue1.length() != stringValue2.length()) {
				return false;
			}

			char[] charValue1 = stringValue1.toLowerCase().toCharArray();
			char[] charValue2 = stringValue2.toLowerCase().toCharArray();
			// System.out.println("First String sorting " );
			for (int i = 0; i < charValue1.length; i++) {
				for (int j = i + 1; j < charValue1.length; j++) {
					if (charValue1[i] > charValue1[j]) {
						temp = charValue1[i];
						charValue1[i] = charValue1[j];
						charValue1[j] = temp;
					}
				}
				System.out.print(charValue1[i]);
			}
			System.out.println();
			// System.out.println("Second String sorting " );

			for (int i = 0; i < charValue2.length; i++) {
				for (int j = i + 1; j < charValue2.length; j++) {
					if (charValue2[i] > charValue2[j]) {
						temp = charValue2[i];
						charValue2[i] = charValue2[j];
						charValue2[j] = temp;
					}
				}
				System.out.print(charValue2[i]);
				flag = true;
			}
			System.out.println();
			return flag;
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		boolean flag1 = stringAnagram();
		System.out.println(flag1);
	}

}
