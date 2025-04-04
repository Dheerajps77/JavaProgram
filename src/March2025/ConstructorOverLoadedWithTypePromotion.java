package March2025;

public class ConstructorOverLoadedWithTypePromotion {

	ConstructorOverLoadedWithTypePromotion(int a, int b) {
		System.out.println("INT with INT a = " + a + " b = " + b);
	}

	ConstructorOverLoadedWithTypePromotion(int a, float b) {
		System.out.println("INT with float a = " + a + " b = " + b);
	}

	ConstructorOverLoadedWithTypePromotion(float a, float b) {
		System.out.println("FLOAT with float a = " + a + " b = " + b);
	}

	ConstructorOverLoadedWithTypePromotion(short a, short b) {
		System.out.println("SHORT with SHORT a = " + a + " b = " + b);
	}

	ConstructorOverLoadedWithTypePromotion(char a, char b) {
		System.out.println("SHORT with SHORT a = " + a + " b = " + b);
	}

	ConstructorOverLoadedWithTypePromotion(double a, double b) {
		System.out.println("DOUBLE with DOUBLE a = " + a + " b = " + b);
	}

	// byte -> short --> char --> int --> float --> double

	public static void main(String args[]) {
		byte a = 10;
		byte b = 15;
		ConstructorOverLoadedWithTypePromotion test = new ConstructorOverLoadedWithTypePromotion(a, b);
	}
}
