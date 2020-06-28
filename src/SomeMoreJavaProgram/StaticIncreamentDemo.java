package SomeMoreJavaProgram;

public class StaticIncreamentDemo {
	
	static int i=15;
	public static void main(String[] args) {
		//int i=7;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		
		int n=++i;
		int n2=i;
		int n3=i++;
		System.out.println(n+n2+n3);
		

		// 15 16 17 18+18+17=53
	}

}
