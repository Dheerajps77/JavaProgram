package Aug2024;

public class CaseConverter {

    public static String toLowerCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }

    public static String toUpperCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }

    public static String toggleCase(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "Hello World!";
        System.out.println("Original: " + original);
        System.out.println("To Lower Case: " + toLowerCase(original));
        System.out.println("To Upper Case: " + toUpperCase(original));
        System.out.println("Toggle Case: " + toggleCase(original));
    }
}