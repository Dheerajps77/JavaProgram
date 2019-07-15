package com.JavaProgramExample;

// Enumerations serve the purpose of representing a group of named constants in a programming language. 
// Enum declaration can be done outside a Class or inside a Class but not inside a Method.
enum Scotch
{
	Lagavulin, Laphroaig, Glenmorangie, Bruichladdich, Glenfiddich, RoyalBrackla
}

class Enum {

	public static void main(String[] args) {
				
		Scotch obj=Scotch.Glenmorangie;
		System.out.println(obj);
		
		System.out.println("Iterating enum value using values method");
		for(Scotch scotch: Scotch.values())
		{
			System.out.println(scotch);
		}
		
		//Output :
		
		/*
		Glenmorangie
		Iterating enum value using values method
		Lagavulin
		Laphroaig
		Glenmorangie
		Bruichladdich
		Glenfiddich
		RoyalBrackla
		*/
		
	}
}
