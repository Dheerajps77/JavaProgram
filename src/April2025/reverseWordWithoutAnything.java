package April2025;

public class reverseWordWithoutAnything {
	public static String reverseWords(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        // Convert to character array manually
        char[] chars = new char[str.length()];
        int i = 0;
        while (i < str.length()) {
            chars[i] = str.charAt(i);
            i++;
        }

        // Reverse full string
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        // Reverse each word
        int s = 0;
        int e = 0;
        while (e <= chars.length) {
            if (e == chars.length || chars[e] == ' ') {
                int left = s;
                int right = e - 1;
                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                s = e + 1;
            }
            e++;
        }

        // Create final String manually
        String result = "";
        i = 0;
        while (i < chars.length) {
            result = result + chars[i];
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I love Java")); // Java love I
        System.out.println(reverseWords("Today is Monday")); // Monday is Today
    }
}
