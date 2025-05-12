package com.OpenClosedPrinciple.pack;

public class OCR_Class {

	public static void main(String[] args) 
	{
		
		System.out.println("=====OCP=====");
		
		DisountService ds = new DisountService();
		RegularDiscount rd = new RegularDiscount();
		FestiveDiscount fd = new FestiveDiscount();
		
		System.out.println("Festive Disount : "+ds.calculateDisount(fd));
		System.out.println("Regular Disount : "+ds.calculateDisount(rd));
		
	}

}
