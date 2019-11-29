package com.JavaProgramExample;

public class CountOfObjectCreated {

	static int countOfObjectCreated = 0;

	
	{
		countOfObjectCreated = countOfObjectCreated + 1;
	}

	CountOfObjectCreated() {

	}

	CountOfObjectCreated(int n) {

	}

	CountOfObjectCreated(String str) {

	}

	CountOfObjectCreated(String str, String st1) {

	}

	public static void main(String[] args) {

		CountOfObjectCreated obj = new CountOfObjectCreated();
		CountOfObjectCreated obj1 = new CountOfObjectCreated(3);
		CountOfObjectCreated obj2 = new CountOfObjectCreated("Hello");
		CountOfObjectCreated obj3 = new CountOfObjectCreated("Hello", "Dear");
		System.out.println(CountOfObjectCreated.countOfObjectCreated);
	}
/*
OUtPut :
4

 */
}
