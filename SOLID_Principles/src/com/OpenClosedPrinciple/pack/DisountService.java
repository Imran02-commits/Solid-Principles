package com.OpenClosedPrinciple.pack;

public class DisountService {
	
	public double calculateDisount(DiscountStrategy strategy)
	{
		return strategy.getDiscount();
	}

}
