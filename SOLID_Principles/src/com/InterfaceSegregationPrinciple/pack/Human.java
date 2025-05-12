package com.InterfaceSegregationPrinciple.pack;

public class Human implements Workable,Eatable{
	
	public void work()
	{
		System.out.println("Human Can Work....");
	}
	
	public void eat()
	{
		System.out.println("Human Can Eat....");
	}

}
