package Collections;

interface Test {
	void Method1();
}

class AnonymousClass {

	public static void main(String[] args) {

		Test22 test = new Test22() {

			@Override
			public void Method1() {

				System.out.println("I am in method 1...");
			}
		};
		
		test.Method1();

	}
}
