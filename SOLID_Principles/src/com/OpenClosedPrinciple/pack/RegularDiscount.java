package com.OpenClosedPrinciple.pack;

public class RegularDiscount implements DiscountStrategy 
{
	public double getDiscount()
	{
		System.out.println("10% is regular discount");
		return 10;
	}

	

}
