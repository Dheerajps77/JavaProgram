package Aug2024;

public class HighestAndSecondHighestInArray {

	public static void highestAndSecondHighest() {
		int n[] = { 343, 23, 24, 6, 1, 67, 45, 34, 656, 7, 8654, 23, 933, 54, 64, 323, 25 };
		int highest = n[0];
		int lowest = n[0];
		for (int i = 0; i < n.length; i++) {
			if (highest > n[i]) {
				highest = n[i];
			} else if (lowest < n[i]) {
				lowest = n[i];
			}
		}

		System.out.println(highest);
		System.out.println(lowest);
	}

	public static void secondHighest() {

		int n[] = { 343, 23, 24, 6, 1, 67, 45, 34, 656, 7, 8654, 23, 933, 54, 64, 323, 25 };
		int temp = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] > n[j]) {
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
			System.out.println(n[i]);
		}

		System.out.println("==================================");
		System.out.println(n[n.length - 2]);
	}

	public static void main(String[] args) {

		secondHighest();

	}

}