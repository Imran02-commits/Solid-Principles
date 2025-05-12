package com.SingleResponsiblePrinciple.pack;

public class SRP_Class {

	public static void main(String[] args) 
	{
		
		System.out.println("======SRP=====");
		UserService us = new UserService();
		us.userService("Imran","123789");
		
		EmailService es = new EmailService();
		es.emailService("shaikimran1955131@gmail.com","Welcome!");
		

	}

}
