package InterviewQuestionAnswer;

public class StarPattern {

	public static void printStarLeftPattern() {
		try {

			int n = 10;
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * Output Like below
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 ******** 
		 */
	}

	public static void printStarRightPattern() {
		try {

			int n = 10;
			for (int i = 1; i < n; i++) {
				for (int j = n; j > i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k < i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * Output Like below
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 ******** 
		 */
	}

	public static void pyramidPattern() {
		try {

			int n = 10;
			for (int i = 1; i < n; i++) {
				for (int j = n; j > i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k < i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * Output Like below
		* 
       * * 
      * * * 
     * * * * 
    * * * * * 
   * * * * * * 
  * * * * * * * 
 * * * * * * * * 
		 */
	}
	
	public static void pattern1()
	{
		try {
			int n=10;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(" ");
				}
				for(int k=n;k>i;k--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		pattern1();
	}
}
