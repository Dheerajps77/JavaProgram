package Program30June;

public class NumberSwapWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		
		int n=20;
		int n1=10;
		
		System.out.println("Before Swapping : First Approach");
		System.out.println("n value is : "+n);
		System.out.println("n1 value is : "+ n1);
		//First Approach
		n=n-n1; // 10
		n1=n1+n1; //20
		
		System.out.println("After Swapping");
		System.out.println("n value is : "+n);
		System.out.println("n1 value is : "+ n1);
		
		
		//Second Approach
		int n2=20;
		int n3=40;
		System.out.println("Before Swapping : Second Approach");
		System.out.println("n3 value is : "+n3);
		System.out.println("n2 value is : "+ n2);
		n3=n3-n2; //20
		n2=n2+n3; //40
		System.out.println("After Swapping");
		System.out.println("n3 value is : "+n3);
		System.out.println("n2 value is : "+ n2);
	/**
Output :
Before Swapping : First Approach
n value is : 20
n1 value is : 10
After Swapping
n value is : 10
n1 value is : 20
Before Swapping : Second Approach
n3 value is : 40
n2 value is : 20
After Swapping
n3 value is : 20
n2 value is : 40	
	 */
	}

}
