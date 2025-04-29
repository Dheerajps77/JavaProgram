package April2025;

public class MaximumLengthInBinaryNumber {
	
/*
Binary is a number system that uses only two digits: 0 and 1.
It's called base-2, whereas the decimal system we usually use is base-10 (digits 0 to 9).
Each binary digit (or bit) represents a power of 2.

Example:
Let’s convert 13 into binary:

13 / 2 = 6 remainder 1
6 / 2 = 3 remainder 0
3 / 2 = 1 remainder 1
1 / 2 = 0 remainder 1

Now read the remainders bottom to top: 1101
*/
	public static int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean counting = false;

        while (N > 0) {
            int remainder = N % 2; // Get last digit in binary manually

            if (remainder == 1) {
                if (counting) {
                    if (currentGap > maxGap) {
                        maxGap = currentGap;
                    }
                }
                counting = true; // Start counting after first 1
                currentGap = 0;   // Reset current gap after each 1
            } else {
                if (counting) {
                    currentGap++; // Increase gap only after we started counting
                }
            }

            N = N / 2; // Move to next binary digit
        }

        return maxGap;
    }

    public static void main(String[] args) {
        System.out.println("Binary Gap of 1041: " + MaximumLengthInBinaryNumber.solution(1041)); // Output: 5
        System.out.println("Binary Gap of 32: " + MaximumLengthInBinaryNumber.solution(32));     // Output: 0
        System.out.println("Binary Gap of 529: " + MaximumLengthInBinaryNumber.solution(529));   // Output: 4
        System.out.println("Binary Gap of 15: " + MaximumLengthInBinaryNumber.solution(15));     // Output: 0
    }

}
