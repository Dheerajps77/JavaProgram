package Jan2025;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ReverseToggleString {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		reverseStringToggle();
		System.out.println();
		String password = "mypasswordkklll";

		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] hash = md.digest(password.getBytes());

		// Convert to Base64 format
		String encodedHash = Base64.getEncoder().encodeToString(hash);
		System.out.println("Hashed Password (MD5 Base64): " + encodedHash);
	}

	public static void reverseStringWithoutToggle() {
		try {
			String str = "my name is khan";
			char[] charArr = str.toCharArray();

			for (int i = charArr.length - 1; i >= 0; i--) {
				System.out.print(charArr[i]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void reverseStringToggle() {
		try {
			String str = "m56754334y na466me is kh9765an";
			String[] newString = str.split(" ");

			for (int i = 0; i < newString.length; i++) {
				char[] charArr = newString[i].toCharArray();
				for (int j = charArr.length - 1; j >= 0; j--) {
					System.out.print(charArr[j]);
				}
				System.out.print(" ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
