package com.JavaProgramExample;

public class CovariantReturnType {

	public void Test1() {
		try {
			System.out.println("Hello...");
		} catch (Exception e) {
			throw e;
		}
	}
}

class Go extends CovariantReturnType {
	public void Test1() {
		System.out.println("Hi.....");
	}
}

class mainClass {
	public static void main(String[] args) {
		CovariantReturnType objGo = new Go();
		objGo.Test1();
	}
}
