package com.JavaProgramExample;

public class CovariantReturnType {

	public CovariantReturnType Test1() {
		try {
			System.out.println("Hello...");
		} catch (Exception e) {
			throw e;
		}
		return this;
	}
}

class Go extends CovariantReturnType {
	public Go Test1() {
		System.out.println("Hi.....");
	return this;
	}
	


	public static void main(String[] args) {
		CovariantReturnType objGo = new Go();
		objGo.Test1();
	}
}
