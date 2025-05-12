package com.OpenClosedPrinciple.pack;

public class FestiveDiscount implements DiscountStrategy{
	
	public double getDiscount()
	{
		
		System.out.println("20% is the festive discount");
		return 20;
	}

}
