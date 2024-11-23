package Sep_Java_Programs;

public class ReverseOrderOfStringValues {

	public static void reverseOrderOfStringValues() {
		try {

			String str = "Hello everyone. I am new one here. Please help me to know the projects";

			String[] arrayStr = str.split(" ");

			System.out.println("Before reverse order of String");
			for (int i = 0; i < arrayStr.length; i++) {
				System.out.println(arrayStr[i]);
			}
			System.out.println("After reverse order of String");

			for (int i = arrayStr.length - 1; i > 0; i--) {
				System.out.println(arrayStr[i]);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		reverseOrderOfStringValues();

	}

}
