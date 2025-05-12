package com.LisvokSubstitutePrinciple.pack;

public class LSP_Class {
	
	public static void main(String[] args) 
	{
		
		System.out.println("=====LSP=====");
		FlyingBird sparrow = new Sparrow();
		
		Bird ostrich = new Ostrich();
		
		sparrow.fly();
		sparrow.eat();
		
		ostrich.eat();
		
	}

}
