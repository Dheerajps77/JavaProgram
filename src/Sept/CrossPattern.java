package Sept;

public class CrossPattern {

	public static void printCrossPattern() {
		try {

			for (int i = 0; i < 6; i++) {
	            int j = 6 - 1 - i;
	            for (int k = 0; k < 6; k++) {
	                if (k == i || k == j)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println("");
	        }
	    
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		printCrossPattern();
	}

}
