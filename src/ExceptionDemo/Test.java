package ExceptionDemo;

public class Test extends Exception{
	
	public static void main(String[] args) {
						
		try {
			double sum=1/0;
			System.out.println(sum);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
