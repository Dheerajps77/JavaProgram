package March2025;

import java.util.HashMap;
import java.util.Map;

public class ChangeConsoleOutputFontAndColour {

	// Reset
	public static final String RESET = "\u001B[0m";

	// Regular Colors
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";

	// Bold
	public static final String BLACK_BOLD = "\u001B[1;30m";
	public static final String RED_BOLD = "\u001B[1;31m";
	public static final String GREEN_BOLD = "\u001B[1;32m";
	public static final String YELLOW_BOLD = "\u001B[1;33m";
	public static final String BLUE_BOLD = "\u001B[1;34m";
	public static final String PURPLE_BOLD = "\u001B[1;35m";
	public static final String CYAN_BOLD = "\u001B[1;36m";
	public static final String WHITE_BOLD = "\u001B[1;37m";

	// Underline
	public static final String BLACK_UNDERLINED = "\u001B[4;30m";
	public static final String RED_UNDERLINED = "\u001B[4;31m";
	public static final String GREEN_UNDERLINED = "\u001B[4;32m";
	public static final String YELLOW_UNDERLINED = "\u001B[4;33m";
	public static final String BLUE_UNDERLINED = "\u001B[4;34m";
	public static final String PURPLE_UNDERLINED = "\u001B[4;35m";
	public static final String CYAN_UNDERLINED = "\u001B[4;36m";
	public static final String WHITE_UNDERLINED = "\u001B[4;37m";

	// Backgrounds
	public static final String BLACK_BACKGROUND = "\u001B[40m";
	public static final String RED_BACKGROUND = "\u001B[41m";
	public static final String GREEN_BACKGROUND = "\u001B[42m";
	public static final String YELLOW_BACKGROUND = "\u001B[43m";
	public static final String BLUE_BACKGROUND = "\u001B[44m";
	public static final String PURPLE_BACKGROUND = "\u001B[45m";
	public static final String CYAN_BACKGROUND = "\u001B[46m";
	public static final String WHITE_BACKGROUND = "\u001B[47m";

	// High Intensity
	public static final String BLACK_BRIGHT = "\u001B[90m";
	public static final String RED_BRIGHT = "\u001B[91m";
	public static final String GREEN_BRIGHT = "\u001B[92m";
	public static final String YELLOW_BRIGHT = "\u001B[93m";
	public static final String BLUE_BRIGHT = "\u001B[94m";
	public static final String PURPLE_BRIGHT = "\u001B[95m";
	public static final String CYAN_BRIGHT = "\u001B[96m";
	public static final String WHITE_BRIGHT = "\u001B[97m";

	// Bold High Intensity
	public static final String BLACK_BOLD_BRIGHT = "\u001B[1;90m";
	public static final String RED_BOLD_BRIGHT = "\u001B[1;91m";
	public static final String GREEN_BOLD_BRIGHT = "\u001B[1;92m";
	public static final String YELLOW_BOLD_BRIGHT = "\u001B[1;93m";
	public static final String BLUE_BOLD_BRIGHT = "\u001B[1;94m";
	public static final String PURPLE_BOLD_BRIGHT = "\u001B[1;95m";
	public static final String CYAN_BOLD_BRIGHT = "\u001B[1;96m";
	public static final String WHITE_BOLD_BRIGHT = "\u001B[1;97m";

	// High Intensity backgrounds
	public static final String BLACK_BACKGROUND_BRIGHT = "\u001B[0;100m";
	public static final String RED_BACKGROUND_BRIGHT = "\u001B[0;101m";
	public static final String GREEN_BACKGROUND_BRIGHT = "\u001B[0;102m";
	public static final String YELLOW_BACKGROUND_BRIGHT = "\u001B[0;103m";
	public static final String BLUE_BACKGROUND_BRIGHT = "\u001B[0;104m";
	public static final String PURPLE_BACKGROUND_BRIGHT = "\u001B[0;105m";
	public static final String CYAN_BACKGROUND_BRIGHT = "\u001B[0;106m";
	public static final String WHITE_BACKGROUND_BRIGHT = "\u001B[0;107m";


    public static void main(String[] args) {
        String str = "Hi, How are you ? you must be straving. So I have done arrangment for you. "
                + "You need t come in this way. I will take care you. Please be noted that I am your host "
                + "for todays programe. The programe contaning lots of things. You will be amazed after "
                + "learning this.";

        // Step 1: Clean up string using StringBuilder
        StringBuilder cleaned = new StringBuilder();
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ') {
                cleaned.append(c);
            }
        }

        // Step 2: Split cleaned string into words
        String[] words = cleaned.toString().toLowerCase().split(" ");

        // Step 3: Count frequency using HashMap
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (word.trim().equals("")) continue;
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Step 4: Find max and min occurrences
        String maxKey = "";
        int maxCount = 0;

        String minKey = "";
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxKey = word;
            }

            if (count < minCount) {
                minCount = count;
                minKey = word;
            }
        }

        // Step 5: Print all repeated words
        System.out.println(YELLOW_BOLD + "\nRepeated Words:" + RESET);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        }

        // Step 6: Print highlights
        System.out.println(GREEN_BOLD + "\nMax Occurrence: " + maxKey + " (Count: " + maxCount + ")" + RESET);
        System.out.println(RED_BOLD + "Min Occurrence: " + minKey + " (Count: " + minCount + ")" + RESET);
    }
}
